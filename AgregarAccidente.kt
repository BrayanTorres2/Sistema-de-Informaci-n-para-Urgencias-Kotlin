package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Accidentados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.Accidentado
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.SistemaDeUrgencias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Mundo.Ubicacion_Geografica_Punto
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Hospitales.MenuHospital

class AgregarAccidente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agregar_accidente)

        //BOTONES
        val botonregresar = findViewById<Button>(R.id.C1Return)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuAccidente::class.java)
            startActivity(intent)
        }
        val botonAgregar = findViewById<Button>(R.id.C1Informar)
        botonAgregar.setOnClickListener {
            val txtNombreACC = findViewById<EditText>(R.id.C1Naccident)
            val txtcalle = findViewById<EditText>(R.id.C1Calle)
            val txtcarrera = findViewById<EditText>(R.id.C1Carrera)
            val txtNombre = findViewById<EditText>(R.id.C1Nombre)
            try {
                val nomACC = txtNombreACC.text.toString().toUpperCase()
                val calle = txtcalle.text.toString().toInt()
                val carrera = txtcarrera.text.toString().toInt()
                val nom = txtNombre.text.toString().toUpperCase()

                if(nomACC.isEmpty()||nom.isEmpty()){
                    throw Exception("Aja eche y lo que esta vacio?")
                }
                else{

                    var accidentado=Accidentado(nom,nomACC, Ubicacion_Geografica_Punto(calle,carrera))
                    var AmbulanciaAsignada=SistemaDeUrgencias.OcurriounAccidente(accidentado)
                    if (AmbulanciaAsignada!=null) {
                        SistemaDeUrgencias.AsignarAccidentado(accidentado, AmbulanciaAsignada)
                        Toast.makeText(this, "El accidentado esta siendo transportado en la Ambulancia: ${AmbulanciaAsignada.darcodigo()} ", Toast.LENGTH_LONG).show()
                    }
                    else{
                        Toast.makeText(this,"No hay ambulancias", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            catch(e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
