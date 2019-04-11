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

import static com.assissoft.canif.simcalc.utils.FuncoesHelper.calculaAntecipacao_2;

/**
 * Created by Marcos on 05/10/2016.
 */
public class Antecipacao_2Fragment extends Fragment {

    private SimcalcFragmentComunicator fs;
    private View view;
    private EditText valor_da_parcela;
    private EditText taxa_de_juros;
    private EditText parcelas_a_vencer;
    private EditText valor_atual;
    private EditText valor_do_desconto;
    private final TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //after text changed
            calculaAntecipacao_2(taxa_de_juros.getText().toString(), parcelas_a_vencer.getText().toString(), valor_da_parcela.getText().toString(), valor_atual, valor_do_desconto);
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
        view = inflater.inflate(R.layout.simcalc_antecipacao_2, container, false);

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
        valor_da_parcela = view.findViewById(R.id.et_valor_da_parcela);
        taxa_de_juros = view.findViewById(R.id.et_taxa_de_juros);
        parcelas_a_vencer = view.findViewById(R.id.et_parcelas_a_vencer);
        valor_atual = view.findViewById(R.id.et_valor_atual);
        valor_do_desconto = view.findViewById(R.id.et_valor_do_desconto);

        valor_da_parcela.addTextChangedListener(textWatcher);
        taxa_de_juros.addTextChangedListener(textWatcher);
        parcelas_a_vencer.addTextChangedListener(textWatcher);

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