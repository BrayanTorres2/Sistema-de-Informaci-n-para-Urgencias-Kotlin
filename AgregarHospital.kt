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

class AgregarHospital : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agregar_hospital)

        //BOTONES
        val botonregresar = findViewById<Button>(R.id.B1REGUESAR1)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuHospital::class.java)
            startActivity(intent)
        }
        val botonAgregar = findViewById<Button>(R.id.B1Guardar1)
        botonAgregar.setOnClickListener{
            val txtcode = findViewById<EditText>(R.id.B1Codigo)
            val txtcalle = findViewById<EditText>(R.id.B1Calle)
            val txtcarrera = findViewById<EditText>(R.id.B1Carrera)
            val txtNombre = findViewById<EditText>(R.id.B1Nombre)
            val txtT1 = findViewById<EditText>(R.id.B1Tipo1)
            val txtT2 = findViewById<EditText>(R.id.B1Tipo2)

            try {
                val code = txtcode.text.toString().toInt()
                val calle = txtcalle.text.toString().toInt()
                val carrera = txtcarrera.text.toString().toInt()
                val nom = txtNombre.text.toString().toUpperCase()
                val T1 = txtT1.text.toString().toUpperCase()
                val T2 = txtT2.text.toString().toUpperCase()

                if (nom.isEmpty()||T1.isEmpty()||T2.isEmpty()){
                    throw Exception("Aja eche y lo que esta vacio?")
                }
                else{
                    SistemaDeUrgencias.AgregarHospital(nom,code,calle,carrera,T1,T2)
                }
            }
            catch(e: Exception){
                Toast.makeText(this,e.message, Toast.LENGTH_SHORT).show()
            }

        }

    }


}
