package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Hospitales

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.MenuPrincipal
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias.AgregarAmbulancia

class MenuHospital : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_hospital)

        //BOTONES
        val botonregresar = findViewById<Button>(R.id.REGRESOB)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
        }


        val botonAgregarHospital: Button = findViewById<Button>(R.id.B1)
        botonAgregarHospital.setOnClickListener {
            val intent= Intent(this, AgregarHospital::class.java)
            startActivity(intent)
        }

        val botonListaHospital: Button = findViewById<Button>(R.id.B2)
        botonListaHospital.setOnClickListener {
            val intent= Intent(this, ListaHospitales::class.java)
            startActivity(intent)
        }

        val botonInformaiHospital: Button = findViewById<Button>(R.id.B3)
        botonInformaiHospital.setOnClickListener {
            val intent= Intent(this, InfoHospital::class.java)
            startActivity(intent)
        }

        val botonListPaci: Button = findViewById<Button>(R.id.B8)
        botonListPaci.setOnClickListener {
            val intent= Intent(this, ListaPacientes::class.java)
            startActivity(intent)
        }
    }
}
