package udemy.fausto.com.homes_6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // create appliances
        val puertas: Appliance = Appliance("puertas", 4)
        val ventanas: Appliance = Appliance("ventanas", 8)
        val lavadora: Appliance = Appliance("lavadoras", 1)
        val camas: Appliance = Appliance("camas", 6)

        // create Home and add appliances
        val miCasaMadrid = Home("casaMadrid", "roja")

        miCasaMadrid.appliances.add(puertas)
        miCasaMadrid.appliances.add(ventanas)
        miCasaMadrid.appliances.add(lavadora)
        miCasaMadrid.appliances.add(camas)


        //create family and give it a home
        val familiaCheca = Family("Checa", 4)
        familiaCheca.home = miCasaMadrid


        // some prints
        println("------->")
        println(familiaCheca)
        println(familiaCheca.home)







    }
}
