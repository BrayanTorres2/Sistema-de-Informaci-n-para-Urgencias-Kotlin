package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R

class ListaAmbulancias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_ambulancias)

        val lv=findViewById<ListView>(R.id.LISTAAMBULANCIAS)
        val arregloAmbulancias = SistemaDeUrgencias.arrayAmbu()
        val adaptCuentas = ArrayAdapter(this,android.R.layout.simple_list_item_1,
                arregloAmbulancias)
        lv.adapter= adaptCuentas
    }
}
