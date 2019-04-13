package com.assissoft.canif

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.assissoft.canif.simcalc.ui.SimcalcFragmentComunicator

/**
 * Created by Marcos on 13/09/2016.
 */
class SimcalcFragmentCanif : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.simcalc_root_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Inicializa a Interdace de comunição entre fragments
        val fs = activity as SimcalcFragmentComunicator?

        //Chama o fragment do calculo selecionado
        fs!!.chamaSimcalcListFragment()

    }


}