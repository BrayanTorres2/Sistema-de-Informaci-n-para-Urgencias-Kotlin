package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Hospitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias.MenuAmbulancias

class InfoHospital : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_hospital)

        val botonregresar = findViewById<Button>(R.id.BB4REGRESAR)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuHospital::class.java)
            startActivity(intent)
        }

        val botonAgregar = findViewById<Button>(R.id.BB4BUSCAR)
        botonAgregar.setOnClickListener {
            val txtcode = findViewById<EditText>(R.id.BB4CODIGOHOSPITAL)
            try {
                val code = txtcode.text.toString().toInt()
                var a=SistemaDeUrgencias.VerificarHospitalzinho(code)
                if (a!=null){
                    Toast.makeText(this,"Hospital: ${a.darnombre()} // Codigo:${a.darcodigo()} // Tipos a manejar: ${a.dartipo1()} , ${a.dartipo2()}", Toast.LENGTH_LONG).show()
                }
            }
            catch(e: Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
