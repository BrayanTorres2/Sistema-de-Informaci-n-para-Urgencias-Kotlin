package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Accidentados

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.MenuPrincipal
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias.AgregarAmbulancia

class MenuAccidente : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_accidente)

        //BOTONES

        val botonregresar = findViewById<Button>(R.id.REGRESARC1MENU)
        botonregresar.setOnClickListener{
            val intent= Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
        }


        val botonInformarAccidente: Button = findViewById<Button>(R.id.C1)
        botonInformarAccidente.setOnClickListener {
            val intent= Intent(this, AgregarAccidente::class.java)
            startActivity(intent)
        }

        val botonLlevarAccidentado: Button = findViewById<Button>(R.id.C2)
        botonLlevarAccidentado.setOnClickListener {
            val intent= Intent(this, LlevarAccidentado::class.java)
            startActivity(intent)
        }

        val botonDARAccidentado: Button = findViewById<Button>(R.id.C3)
        botonDARAccidentado.setOnClickListener {
            val intent= Intent(this, DarDeAlta::class.java)
            startActivity(intent)
        }
    }
}
