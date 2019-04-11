package com.assissoft.canif.simcalc.model;

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

import java.util.Locale;

/**
 * Created by Marcos on 03/10/2016.
 */
public class DefSimcalc {

    //Usado nos cálculos financeiros
    public static final String ANTECIPACAO = (Locale.getDefault().getLanguage().equals("en") ? "Anticipation" : "Antecipação");
    public static final String EMPRESTIMO = (Locale.getDefault().getLanguage().equals("en") ? "Loan" : "Empréstimo");
    public static final String FINANCIAMENTO = (Locale.getDefault().getLanguage().equals("en") ? "Property acquisition" : "Aquisição de Imóvel");
    public static final String AQUISICAO = (Locale.getDefault().getLanguage().equals("en") ? "Vehicle acquisition" : "Aquisição de Veículo");
    public static final String APLICACAO = (Locale.getDefault().getLanguage().equals("en") ? "Application" : "Aplicação");
    public static final String COMPRA = (Locale.getDefault().getLanguage().equals("en") ? "Purchase in one lump sum" : "Comprar à vista");
    public static final String RENDA = (Locale.getDefault().getLanguage().equals("en") ? "Living Income" : "Viver de Renda");
    public static final String DINHEIRO = (Locale.getDefault().getLanguage().equals("en") ? "Save Money" : "Juntar Dinheiro");

    public static final String LISTA = "Simcalc";

    public static final String ANTECIPACAO_1 = Antecipacao_1Fragment.class.getName();
    public static final String ANTECIPACAO_2 = Antecipacao_2Fragment.class.getName();
    public static final String EMPRESTIMO_1 = Emprestimo_1Fragment.class.getName();
    public static final String EMPRESTIMO_2 = Emprestimo_2Fragment.class.getName();
    public static final String EMPRESTIMO_3 = Emprestimo_3Fragment.class.getName();
    public static final String EMPRESTIMO_4 = Emprestimo_4Fragment.class.getName();
    public static final String FINANCIAMENTO_1 = Financiamento_1Fragment.class.getName();
    public static final String FINANCIAMENTO_2 = Financiamento_2Fragment.class.getName();
    public static final String FINANCIAMENTO_3 = Financiamento_3Fragment.class.getName();
    public static final String FINANCIAMENTO_4 = Financiamento_4Fragment.class.getName();
    public static final String FINANCIAMENTO_VEICULO = Financiamento_VeiculoFragment.class.getName();
    public static final String FINANCIAMENTO_VEICULO_P = Financiamento_Veiculo_PFragment.class.getName();
    public static final String APLICACAO_1 = Aplicacao_1Fragment.class.getName();
    public static final String APLICACAO_2 = Aplicacao_2Fragment.class.getName();
    public static final String APLICACAO_3 = Aplicacao_3Fragment.class.getName();
    public static final String APLICACAO_4 = Aplicacao_4Fragment.class.getName();
    public static final String COMPRA_1 = Compra_1Fragment.class.getName();
    public static final String COMPRA_2 = Compra_2Fragment.class.getName();
    public static final String COMPRA_3 = Compra_3Fragment.class.getName();
    public static final String COMPRA_4 = Compra_4Fragment.class.getName();
    public static final String RENDA_1 = Renda_1Fragment.class.getName();
    public static final String RENDA_2 = Renda_2Fragment.class.getName();
    public static final String RENDA_3 = Renda_3Fragment.class.getName();
    public static final String DINHEIRO_1 = Dinheiro_1Fragment.class.getName();
    public static final String DINHEIRO_2 = Dinheiro_2Fragment.class.getName();
    public static final String DINHEIRO_3 = Dinheiro_3Fragment.class.getName();
    public static final String DINHEIRO_4 = Dinheiro_4Fragment.class.getName();

}
