package udemy.fausto.com.homes_6

class Family (val name: String, var numMembers: Int = 2) {
    var home: Home = Home("miCasa")

    override fun toString(): String {
        return "Esta es la casa de la famiia $name"
    }



}