package com.progracionavanzada.ean.sistemadeinformacinparaurgencias

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Accidentados.MenuAccidente
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias.MenuAmbulancias
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Hospitales.MenuHospital

class MenuPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_principal)


        //BOTONES
        val botonMenuAmbulancia: Button = findViewById<Button>(R.id.M2)
        botonMenuAmbulancia.setOnClickListener {
            val intent= Intent(this,MenuAmbulancias::class.java)
            startActivity(intent)
        }

        val botonMenuHospital: Button = findViewById<Button>(R.id.M3)
        botonMenuHospital.setOnClickListener {
            val intent= Intent(this,MenuHospital::class.java)
            startActivity(intent)
        }

        val botonMenuAccidentes: Button = findViewById<Button>(R.id.M1)
        botonMenuAccidentes.setOnClickListener {
            val intent= Intent(this,MenuAccidente::class.java)
            startActivity(intent)
        }
    }
}
