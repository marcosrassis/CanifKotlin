package com.assissoft.canif.simcalc.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.assissoft.canif.R;

import static com.assissoft.canif.simcalc.utils.FuncoesHelper.calculaCompra_4;

/**
 * Created by Marcos on 11/10/2016.
 */
public class Compra_4Fragment extends Fragment {

    private SimcalcFragmentComunicator fs;
    private View view;
    private EditText deposito_inicial;
    private EditText deposito_mensal;
    private EditText taxa_de_juros;
    private EditText periodo;
    private EditText valor_do_bem;
    private final TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //after text changed
            calculaCompra_4(deposito_mensal.getText().toString(), taxa_de_juros.getText().toString(), periodo.getText().toString(), valor_do_bem.getText().toString(), deposito_inicial);
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private String[] colecao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.simcalc_compra, container, false);

        // call the method setHasOptionsMenu, to have access to the menu from your fragment
        setHasOptionsMenu(true);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        fs = (SimcalcFragmentComunicator) getActivity();

        colecao = getActivity().getResources().getStringArray(R.array.calculos_titulo);
        String titulo = colecao[fs.getSIMCALC_VIGENTE_ID()];

        //Atualiza título da Action Bar
        fs.atualizaTitulo(titulo);

        //Não Exibe o botão flutante
        fs.ocultaBotaoFlutuanteSimcalc();

        //Faz o link das views de texto com as variáveis
        deposito_inicial = view.findViewById(R.id.et_deposito_inicial);
        deposito_mensal = view.findViewById(R.id.et_deposito_mensal);
        taxa_de_juros = view.findViewById(R.id.et_taxa_de_juros);
        periodo = view.findViewById(R.id.et_periodo);
        valor_do_bem = view.findViewById(R.id.et_valor_do_bem);

        deposito_mensal.addTextChangedListener(textWatcher);
        taxa_de_juros.addTextChangedListener(textWatcher);
        periodo.addTextChangedListener(textWatcher);
        valor_do_bem.addTextChangedListener(textWatcher);

        //Campos não editáveis
        deposito_inicial.setEnabled(false);

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.findItem(R.id.action_search).setVisible(false);
        if (menu.findItem(R.id.search_menu) != null && menu.findItem(R.id.search_menu).isVisible())
            menu.removeItem(R.id.search_menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        fs = (SimcalcFragmentComunicator) getActivity();

        colecao = getActivity().getResources().getStringArray(R.array.calculos_titulo);
        String titulo = colecao[fs.getSIMCALC_VIGENTE_ID()];

        //Atualiza título da Action Bar
        fs.atualizaTitulo(titulo);

        //Exibe o botão flutante
        fs.ocultaBotaoFlutuanteSimcalc();

    }

}