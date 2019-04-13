package com.assissoft.canif.simcalc.ui

import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import android.widget.EditText
import com.assissoft.canif.R
import com.assissoft.canif.simcalc.utils.FuncoesHelper
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import java.util.*

/**
 * Created by Marcos on 05/10/2016.
 */
class Antecipacao1Fragment : Fragment(), DatePickerDialog.OnDateSetListener, DialogInterface.OnCancelListener {

    private var myview: View? = null
    private var valorareceber: EditText? = null
    private var taxadejuros: EditText? = null
    private var valoratual: EditText? = null
    private var valordodesconto: EditText? = null
    private var tvVencimento: EditText? = null
    private var tvDiaDoPagamento: EditText? = null
    private var anov: Int = 0
    private var mesv: Int = 0
    private var diav: Int = 0
    private var anop: Int = 0
    private var mesp: Int = 0
    private var diap: Int = 0
    private var calendarVencimento: Calendar? = null
    private var calendarPagamento: Calendar? = null
    private val textWatcher = object : TextWatcher {

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            //Calcula o valor atual
            if (obtemNumeroMeses() >= 0)
                FuncoesHelper.calculaAntecipacao_1(taxadejuros!!.text.toString(), obtemNumeroMeses().toString(), valorareceber!!.text.toString(), valoratual, valordodesconto)
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

        }

        override fun afterTextChanged(s: Editable) {

        }
    }
    private var fs: SimcalcFragmentComunicator? = null
    private var colecao: Array<String>? = null
    private var btVencimentoPressed = false
    private var btPagamentoPressed = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        myview = inflater.inflate(R.layout.simcalc_antecipacao_1, container, false)

        // call the method setHasOptionsMenu, to have access to the menu from your fragment
        setHasOptionsMenu(true)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fs = activity as SimcalcFragmentComunicator?

        colecao = activity!!.resources.getStringArray(R.array.calculos_titulo)
        val titulo = colecao!![fs!!.simcalC_VIGENTE_ID]

        //Atualiza título da Action Bar
        fs!!.atualizaTitulo(titulo)

        //Não Exibe o botão flutante
        fs!!.ocultaBotaoFlutuanteSimcalc()

        //Faz o link das views de texto com as variáveis
        valorareceber = myview!!.findViewById(R.id.et_valor_a_receber)
        taxadejuros = myview!!.findViewById(R.id.et_taxa_de_juros)
        valoratual = myview!!.findViewById(R.id.et_valor_atual)
        valordodesconto = myview!!.findViewById(R.id.et_valor_do_desconto)
        tvVencimento = myview!!.findViewById(R.id.et_vencimento_parcela)
        tvDiaDoPagamento = myview!!.findViewById(R.id.et_dia_pagamento)

        valorareceber!!.addTextChangedListener(textWatcher)
        taxadejuros!!.addTextChangedListener(textWatcher)

        tvVencimento!!.setOnClickListener { obtemVencimento() }

        tvDiaDoPagamento!!.setOnClickListener { obtemDiaPagamento() }

    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        menu!!.findItem(R.id.action_search).isVisible = false
        if (menu.findItem(R.id.search_menu) != null && menu.findItem(R.id.search_menu).isVisible)
            menu.removeItem(R.id.search_menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onDestroy() {
        super.onDestroy()

        fs = this.activity as SimcalcFragmentComunicator?

        colecao = this.activity!!.resources.getStringArray(R.array.calculos_titulo)
        val titulo = colecao!![fs!!.simcalC_VIGENTE_ID]

        //Atualiza título da Action Bar
        fs!!.atualizaTitulo(titulo)

        //Exibe o botão flutante
        fs!!.ocultaBotaoFlutuanteSimcalc()

    }

    private fun obtemVencimento() {
        initCalendarDataVenc()
        val calendar = Calendar.getInstance()
        calendar.set(anov, mesv, diav)

        btVencimentoPressed = true // A data do vencimento foi acionada

        val datePickerDialogVencimento = DatePickerDialog.newInstance(
                this,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        )

        val dataAtual = Calendar.getInstance()
        dataAtual.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH)

        datePickerDialogVencimento.minDate = dataAtual
        datePickerDialogVencimento.setOnCancelListener(this)
        datePickerDialogVencimento.show(activity!!.fragmentManager, "datePickerDialogVencimento")
    }

    private fun obtemDiaPagamento() {
        initCalendarDataPgto()
        val calendar = Calendar.getInstance()
        calendar.set(anop, mesp, diap)

        btPagamentoPressed = true // A data do pagamento foi acionada

        val datePickerDialogPagamento = DatePickerDialog.newInstance(
                this,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
        )

        datePickerDialogPagamento.minDate = calendar
        datePickerDialogPagamento.setOnCancelListener(this)
        datePickerDialogPagamento.show(activity!!.fragmentManager, "datePickerDialogPagamento")
    }

    private fun initCalendarDataVenc() {
        if (anov == 0) {
            val c = Calendar.getInstance()
            anov = c.get(Calendar.YEAR)
            mesv = c.get(Calendar.MONTH)
            diav = c.get(Calendar.DAY_OF_MONTH)
        }
    }

    private fun initCalendarDataPgto() {
        val c = Calendar.getInstance()
        anop = c.get(Calendar.YEAR)
        mesp = c.get(Calendar.MONTH)
        diap = c.get(Calendar.DAY_OF_MONTH)
    }

    override fun onCancel(dialogInterface: DialogInterface) {

    }

    override fun onDateSet(view: DatePickerDialog, year: Int, monthOfYear: Int, dayOfMonth: Int) {

        if (btVencimentoPressed) {
            calendarVencimento = Calendar.getInstance()
            calendarVencimento!!.set(year, monthOfYear, dayOfMonth)

            tvVencimento!!.setText((if (dayOfMonth < 10) "0$dayOfMonth" else dayOfMonth).toString() + "/" + (if (monthOfYear + 1 < 10) "0" + (monthOfYear + 1) else monthOfYear + 1) + "/" + year)

            if (obtemNumeroMeses() >= 0)
                FuncoesHelper.calculaAntecipacao_1(taxadejuros!!.text.toString(), obtemNumeroMeses().toString(), valorareceber!!.text.toString(), valoratual, valordodesconto)

            btVencimentoPressed = false

            //Armazena sempre a última data selecionada
            anov = year
            mesv = monthOfYear
            diav = dayOfMonth
        }

        if (btPagamentoPressed) {
            calendarPagamento = Calendar.getInstance()
            calendarPagamento!!.set(year, monthOfYear, dayOfMonth)

            tvDiaDoPagamento!!.setText((if (dayOfMonth < 10) "0$dayOfMonth" else dayOfMonth).toString() + "/" + (if (monthOfYear + 1 < 10) "0" + (monthOfYear + 1) else monthOfYear + 1) + "/" + year)

            if (obtemNumeroMeses() >= 0)
                FuncoesHelper.calculaAntecipacao_1(taxadejuros!!.text.toString(), obtemNumeroMeses().toString(), valorareceber!!.text.toString(), valoratual, valordodesconto)

            btPagamentoPressed = false

            //Armazena sempre a última data selecionada
            anop = year
            mesp = monthOfYear
            diap = dayOfMonth
        }
    }

    private fun obtemNumeroMeses(): Int {
        var dayCount = 0f

        if (tvVencimento!!.text.toString().isNotEmpty() && tvDiaDoPagamento!!.text.toString().isNotEmpty()) {
            val diff = calendarVencimento!!.timeInMillis - calendarPagamento!!.timeInMillis
            dayCount = diff.toFloat() / (24 * 60 * 60 * 1000)
        }

        return dayCount.toInt()
    }
}