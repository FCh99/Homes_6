package udemy.fausto.com.homes_6

class Home (val name: String, var colorFachada: String = "Blanca") {

    var appliances = ArrayList<Appliance>()

    override fun toString(): String {
        return """
           home name: $name
            home color: $colorFachada
            home appliances: $appliances
        """
    }



}