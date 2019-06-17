package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.Ubicacion_Geografica_Punto
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R

class InformacionAmbulancia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.informacion_ambulancia)

        //Botones
        val botonregresar = findViewById<Button>(R.id.A2Regresar2)
        botonregresar.setOnClickListener{
            val intent= Intent(this,MenuAmbulancias::class.java)
            startActivity(intent)
        }
        val botonAgregar = findViewById<Button>(R.id.A2Actualizar)
        botonAgregar.setOnClickListener{
            val txtcode = findViewById<EditText>(R.id.A2Codigo)
            val txtcalle = findViewById<EditText>(R.id.A2Calle)
            val txtcarrera = findViewById<EditText>(R.id.A2Carrera)

            try {
                val code = txtcode.text.toString().toInt()
                val calle = txtcalle.text.toString().toInt()
                val carrera = txtcarrera.text.toString().toInt()

                SistemaDeUrgencias.ActualizarUbicacionAmbulancia(code, Ubicacion_Geografica_Punto(calle,carrera))
            }
            catch(e: Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
