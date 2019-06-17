package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Accidentados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias.MenuAmbulancias

class DarDeAlta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dar_de_alta)

        val botonregresar = findViewById<Button>(R.id.C3RETURNING)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuAccidente::class.java)
            startActivity(intent)
        }
        val botonAgregar = findViewById<Button>(R.id.C3ALTA)
        botonAgregar.setOnClickListener{
            val txtcalle = findViewById<EditText>(R.id.C3Codigo)
            val txtcarrera = findViewById<EditText>(R.id.C3PACIENTE)

            try {
                val code = txtcalle.text.toString().toInt()
                val Paciente = txtcarrera.text.toString().toUpperCase()

                if(Paciente.isEmpty()){
                    throw Exception("Aja eche y lo que esta vacio?")
                }
                else{
                    SistemaDeUrgencias.DarDeAltaUnAccidentado(code,Paciente)
                }
            }
            catch(e: Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
            }

        }


    }
}
