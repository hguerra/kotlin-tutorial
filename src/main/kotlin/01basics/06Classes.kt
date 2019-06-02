package `01basics`

// Classes are essentially custom types: a group of variables and methods united in a coherent structure
// There is no keyword new in Kotlin, so to instantiate an object you just call a constructor of the object
class Info {
    var description = "A great idea"

    var name: String = ""
        get() = "***$field***"
        set(value) {
            field = value.toUpperCase()
        }
}

// You can automatically define a property with a parameter of a primary constructor simply putting the keywords val or var in front of the parameter.
class Person(var name: String, var age: Int) {
    init {
        println("1) My name is $name $age")
    }

    init {
        name = "Nemo"
        println("2) My name is $name $age")
    }

    constructor(name: String) : this(name, 0) {
        this.name = name.toUpperCase()
    }
}

open class Base {
    open val text = "`01basics`.Base"

    open fun shout() {
        println("`01basics`.Base shout")
    }

    fun internal() {}
}

class Derived: Base {
    constructor(p: Int): super() {

    }
}

class Derived2(p: Int) : Base() {
    override val text = "derived2"

    override fun shout() {
        println("`01basics`.Derived shout")
        super.shout()
    }
//    override fun internal() {}
}

fun main() {
    val info = Info()
    println(info.description)
    info.description = "A mediocre idea"
    println(info.description)

    info.name = "heitor"
    println(info.name)

    val p = Person("Heitor", 24)
    val p2 = Person("Fabiana")

    val derived2 = Derived2(2)
    derived2.shout()
}
