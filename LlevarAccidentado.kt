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

class LlevarAccidentado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.llevar_accidentado)

        //BOTONES
        val botonregresar = findViewById<Button>(R.id.C2REGREZO)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuAccidente::class.java)
            startActivity(intent)
        }
        val botonAgregar = findViewById<Button>(R.id.C2Agregar)
        botonAgregar.setOnClickListener{
            val txtcode = findViewById<EditText>(R.id.C2Codigo)

            try {
                val code = txtcode.text.toString().toInt()
                val yimmichara=SistemaDeUrgencias.decodigoaAmbu(code)
                val theo=SistemaDeUrgencias.BuscarHospitalparaAmbulancia(yimmichara!!)
                if(theo!=null) {
                    SistemaDeUrgencias.LlegadaAmbulanciaAHospital(yimmichara)
                    Toast.makeText(this, "Hospital ${theo.darnombre()} con el codigo ${theo.darcodigo()}", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"No hay hospitales mopri", Toast.LENGTH_SHORT).show()
                }
            }
            catch (e:Exception){
                //Mostrar el mensaje de error
                Toast.makeText(this,e.message, Toast.LENGTH_LONG).show()
            }
        }
    }
}
