package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Hospitales

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R

class ListaPacientes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_pacientes)

        val botonAgregar = findViewById<Button>(R.id.FIANLBUTTONOF)
        botonAgregar.setOnClickListener {
            val txtcode = findViewById<EditText>(R.id.FIALTEXT)
            try {
                val code = txtcode.text.toString().toInt()
                val x=SistemaDeUrgencias.ending(code)
                if(!x.isEmpty()){
                    val lv=findViewById<ListView>(R.id.FINALISTOFPACIENTS)
                    val adaptCuentas = ArrayAdapter(this,android.R.layout.simple_list_item_1,
                            x)
                    lv.adapter= adaptCuentas
                }
            }
            catch(e: Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
            }
        }


    }
}
