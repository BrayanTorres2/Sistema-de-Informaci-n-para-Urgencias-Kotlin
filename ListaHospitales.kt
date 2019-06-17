package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Hospitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R

class ListaHospitales : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_hospitales)

        val lv=findViewById<ListView>(R.id.LISTAHOSPITALES)
        val arreglohosp = SistemaDeUrgencias.arrayHospi()
        val adaptCuentas = ArrayAdapter(this,android.R.layout.simple_list_item_1,
                arreglohosp)
        lv.adapter= adaptCuentas
    }
}
