package com.progracionavanzada.ean.sistemadeinformacinparaurgencias.Vista.Ambulancias

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.MenuPrincipal
import com.progracionavanzada.ean.sistemadeinformacinparaurgencias.R

class MenuAmbulancias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_ambulancias)

        //BOTONES
        val botonregresar = findViewById<Button>(R.id.REGRESOA1)
        botonregresar.setOnClickListener{
            val intent= Intent(this,MenuPrincipal::class.java)
            startActivity(intent)
        }


        val botonAgregarAmbulancia: Button = findViewById<Button>(R.id.A1)
        botonAgregarAmbulancia.setOnClickListener {
            val intent= Intent(this,AgregarAmbulancia::class.java)
            startActivity(intent)
        }

        val InfoAmbulancia: Button = findViewById<Button>(R.id.A2)
        InfoAmbulancia.setOnClickListener {
            val intent= Intent(this,InformacionAmbulancia::class.java)
            startActivity(intent)
        }

        val ListaAmbulancia: Button = findViewById<Button>(R.id.A3)
        ListaAmbulancia.setOnClickListener {
            val intent= Intent(this,ListaAmbulancias::class.java)
            startActivity(intent)
        }

        val AmbulanciasLibrez: Button = findViewById<Button>(R.id.A4)
        AmbulanciasLibrez.setOnClickListener {
            val intent= Intent(this,AmbulanciasLibres::class.java)
            startActivity(intent)
        }

        val AmbulanciasOcu: Button = findViewById<Button>(R.id.A5)
        AmbulanciasOcu.setOnClickListener {
            val intent= Intent(this,AmbulanciasOcupadas::class.java)
            startActivity(intent)
        }
    }
}
