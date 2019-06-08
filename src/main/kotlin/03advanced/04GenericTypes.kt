package `03advanced`

inline fun <reified T> Iterable<*>.filterIsInstance() = filter { it is T }

fun main() {
    ///////////////////////////////////////////////////////////////////////////////////////////////
    // How to Define Generic Types in Kotlin
    class Generic<T>(t: T) {
        var value = t
    }

    val generic = Generic<Int>(5)

    fun <T : Number> double(value: T): Double {
        return value.toDouble() * 2.0
    }

    println(double(5))

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Variance
    // relacionamento entre classe e subclasse
    // voce pode ler elementos de um subtipo, mas nao pode adicionar
    fun add(list: MutableList<Number>) {
        list.add(33)
    }

    val doubles: MutableList<Double> = mutableListOf(5.5, 4.2)
    val ints: MutableList<Int> = mutableListOf(5, 4)
    val numbers: MutableList<Number> = mutableListOf(3, 2.3)

    //add(doubles) // this is an error
    //add(ints) // this is an error
    add(numbers) // this works fine

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Covariance
    // preserva o subtipo ao inves da superclass
    /*
    Uma classe genérica é covariante se for uma classe genérica para a
    qual é verdade que se A é uma subclasse de B, então Generic <A> é
    uma subclasse de Generic <B>. Isso quer dizer que o subtipo é preservado.
    */
    abstract class Covariant<out T> {
        abstract fun create(): T
    }

    open class Animal

    class Group<out T : Animal> {
        fun feed(animals: Group<Animal>) {}
        //fun sell(animal: T) {}
        fun sell(animal: Animal) {}
    }

    class Cat : Animal() {
        fun feedCats(cats: Group<Cat>) {
            cats.feed(cats)
        }
    }

    // producer: Produzir o resultado do tipo T
    // Para conseguir isso usando o Kotlin, precisamos usar a palavra-chave out no tipo genérico.
    // Isso significa que podemos atribuir esta referência a qualquer um dos seus supertipos.
    // O valor out só pode ser produzido pela classe fornecida, mas não consumido:
    class ParameterizedProducer<out T>(private val value: T) {
        fun get(): T {
            return value
        }
    }

    val parameterizedProducer = ParameterizedProducer("string")
    val ref1: ParameterizedProducer<Any> = parameterizedProducer // supertipo

    // Se o tipo T na classe ParamaterizedProducer não for o tipo out, a instrução fornecida produzirá um erro do compilador.
    println(ref1 is ParameterizedProducer<Any>)

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // contravariance
    /*
    Uma classe genérica é contravariante se for uma classe genérica para a qual
    é verdade que se A é uma subclasse de B, então Generic <B> é uma subclasse
    de Generic <A>. Isso quer dizer que o subtipo é invertido.
    */
    class Pack <in T : Animal> {
        fun sell(animal: T) {

        }
    }

    class Dog : Animal()

    fun sellDog(dog: Dog) : Pack<Dog> {
        return Pack<Animal>();
    }

    // Às vezes, temos uma situação oposta, o que significa que temos uma referência do tipo T
    // e queremos poder atribuí-la ao subtipo de T.
    //Podemos usar a palavra-chave in no tipo genérico se quisermos atribuí-la à referência de seu subtipo.
    // A palavra-chave in pode ser usada apenas no tipo de parâmetro que é consumido, não produzido:
    class ParameterizedConsumer<in T> {
        fun toString(value: T): String {
            return value.toString()
        }
    }

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val ref2: ParameterizedConsumer<Double> = parameterizedConsumer // subtipo
    // Se o tipo T no ParameterizedCounsumer não for o tipo in, a instrução fornecida produzirá um erro do compilador.
    println(ref2 is ParameterizedConsumer<Double>)

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // reified
    // A regra de eliminação de tipos é verdadeira em geral, mas há um caso em que podemos
    // evitar essa limitação: Funções inline. Os parâmetros de tipo de funções inline podem
    // ser reificados, portanto, podemos nos referir a esses parâmetros de tipo em tempo de execução.
    // inline fun <reified T> Iterable<*>.filterIsInstance() = filter { it is T }
    val set = setOf("1984", 2, 3, "Brave new world", 11)
    // a funcao altera o tipo de Any para Int
    println(set.filterIsInstance<Int>())
}