package udemy.fausto.com.homes_6

class Appliance (val name: String, var number: Int){

    override fun toString(): String {
        return "Hay $number $name(s)"
    }
}