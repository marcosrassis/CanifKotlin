package com.assissoft.canif.simcalc.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.assissoft.canif.R;
import com.assissoft.canif.simcalc.model.DefSimcalc;
import com.assissoft.canif.simcalc.ui.Antecipacao_1Fragment;
import com.assissoft.canif.simcalc.ui.Antecipacao_2Fragment;
import com.assissoft.canif.simcalc.ui.Aplicacao_1Fragment;
import com.assissoft.canif.simcalc.ui.Aplicacao_2Fragment;
import com.assissoft.canif.simcalc.ui.Aplicacao_3Fragment;
import com.assissoft.canif.simcalc.ui.Aplicacao_4Fragment;
import com.assissoft.canif.simcalc.ui.Compra_1Fragment;
import com.assissoft.canif.simcalc.ui.Compra_2Fragment;
import com.assissoft.canif.simcalc.ui.Compra_3Fragment;
import com.assissoft.canif.simcalc.ui.Compra_4Fragment;
import com.assissoft.canif.simcalc.ui.Dinheiro_1Fragment;
import com.assissoft.canif.simcalc.ui.Dinheiro_2Fragment;
import com.assissoft.canif.simcalc.ui.Dinheiro_3Fragment;
import com.assissoft.canif.simcalc.ui.Dinheiro_4Fragment;
import com.assissoft.canif.simcalc.ui.Emprestimo_1Fragment;
import com.assissoft.canif.simcalc.ui.Emprestimo_2Fragment;
import com.assissoft.canif.simcalc.ui.Emprestimo_3Fragment;
import com.assissoft.canif.simcalc.ui.Emprestimo_4Fragment;
import com.assissoft.canif.simcalc.ui.Financiamento_1Fragment;
import com.assissoft.canif.simcalc.ui.Financiamento_2Fragment;
import com.assissoft.canif.simcalc.ui.Financiamento_3Fragment;
import com.assissoft.canif.simcalc.ui.Financiamento_4Fragment;
import com.assissoft.canif.simcalc.ui.Financiamento_VeiculoFragment;
import com.assissoft.canif.simcalc.ui.Financiamento_Veiculo_PFragment;
import com.assissoft.canif.simcalc.ui.Renda_1Fragment;
import com.assissoft.canif.simcalc.ui.Renda_2Fragment;
import com.assissoft.canif.simcalc.ui.Renda_3Fragment;

/**
 * Created by Marcos on 01/02/2017.
 */
public class OpenFragmentCalculo {

    private Fragment fragment = null;

    public void openFragment(FragmentManager manager, String TAG) {

        if (Antecipacao_1Fragment.class.getName().equals(TAG))
            fragment = new Antecipacao_1Fragment();

        if (Antecipacao_2Fragment.class.getName().equals(TAG))
            fragment = new Antecipacao_2Fragment();

        if (Emprestimo_1Fragment.class.getName().equals(TAG))
            fragment = new Emprestimo_1Fragment();

        if (Emprestimo_2Fragment.class.getName().equals(TAG))
            fragment = new Emprestimo_2Fragment();

        if (Emprestimo_3Fragment.class.getName().equals(TAG))
            fragment = new Emprestimo_3Fragment();

        if (Emprestimo_4Fragment.class.getName().equals(TAG))
            fragment = new Emprestimo_4Fragment();

        if (Financiamento_1Fragment.class.getName().equals(TAG))
            fragment = new Financiamento_1Fragment();

        if (Financiamento_2Fragment.class.getName().equals(TAG))
            fragment = new Financiamento_2Fragment();

        if (Financiamento_3Fragment.class.getName().equals(TAG))
            fragment = new Financiamento_3Fragment();

        if (Financiamento_4Fragment.class.getName().equals(TAG))
            fragment = new Financiamento_4Fragment();

        if (Financiamento_VeiculoFragment.class.getName().equals(TAG))
            fragment = new Financiamento_VeiculoFragment();

        if (Financiamento_Veiculo_PFragment.class.getName().equals(TAG))
            fragment = new Financiamento_Veiculo_PFragment();

        if (Aplicacao_1Fragment.class.getName().equals(TAG))
            fragment = new Aplicacao_1Fragment();

        if (Aplicacao_2Fragment.class.getName().equals(TAG))
            fragment = new Aplicacao_2Fragment();

        if (Aplicacao_3Fragment.class.getName().equals(TAG))
            fragment = new Aplicacao_3Fragment();

        if (Aplicacao_4Fragment.class.getName().equals(TAG))
            fragment = new Aplicacao_4Fragment();

        if (Compra_1Fragment.class.getName().equals(TAG))
            fragment = new Compra_1Fragment();

        if (Compra_2Fragment.class.getName().equals(TAG))
            fragment = new Compra_2Fragment();

        if (Compra_3Fragment.class.getName().equals(TAG))
            fragment = new Compra_3Fragment();

        if (Compra_4Fragment.class.getName().equals(TAG))
            fragment = new Compra_4Fragment();

        if (Renda_1Fragment.class.getName().equals(TAG))
            fragment = new Renda_1Fragment();

        if (Renda_2Fragment.class.getName().equals(TAG))
            fragment = new Renda_2Fragment();

        if (Renda_3Fragment.class.getName().equals(TAG))
            fragment = new Renda_3Fragment();

        if (Dinheiro_1Fragment.class.getName().equals(TAG))
            fragment = new Dinheiro_1Fragment();

        if (Dinheiro_2Fragment.class.getName().equals(TAG))
            fragment = new Dinheiro_2Fragment();

        if (Dinheiro_3Fragment.class.getName().equals(TAG))
            fragment = new Dinheiro_3Fragment();

        if (Dinheiro_4Fragment.class.getName().equals(TAG))
            fragment = new Dinheiro_4Fragment();


        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.simcalc_container, fragment, TAG);
        ft.addToBackStack(DefSimcalc.LISTA);
        ft.commit();

    }

}
