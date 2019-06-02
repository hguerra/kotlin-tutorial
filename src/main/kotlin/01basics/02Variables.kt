package `01basics`

////////////////////////////////////////////////////////////////////
// Variables and Values
// Constants are called value and are declared using the keyword val
val three = 3
// This is as simple as declaring a variable, the difference, of course, is that to declare a variable you use the keyword var
var number = 2

////////////////////////////////////////////////////////////////////
// Types
val four: Int = 3

// Usual Types
val char: Char = 'H'
val str: String = "Heitor"
val trueOrFalse: Boolean = true

// Natural Numbers Types
val bitWidth8: Byte = 8
val bitWidth16: Short = 16
val bitWidth32: Int = 32
val bitWidth64: Long = 64

val longLiteral = 64L
val largeNumber = 1_000_000_000

// Real Number Types
val realBitWidth32: Float = 1.0f
val realBitWidth64: Double = 1.0

var myDouble = 1.0

// Visibility Modifiers
// https://kotlinlang.org/docs/reference/visibility-modifiers.html

// Package -> "top-level"
// Functions, properties and classes, objects and interfaces can be declared on the "top-level", i.e. directly inside a package
// -If you do not specify any visibility modifier, public is used by default, which means that your declarations will be visible everywhere;
// -If you mark a declaration private, it will only be visible inside the file containing the declaration;
// -If you mark it internal, it is visible everywhere in the same module;
// -protected is not available for top-level declarations.

// Classes and Interfaces
// -private means visible inside this class only (including all its members);
// -protected — same as private + visible in subclasses too;
// -internal — any client inside this module who sees the declaring class sees its internal members;
// -public — any client who sees the declaring class sees its public members.
// NOTE for Java users: outer class does not see private members of its inner classes in Kotlin.

fun main() {
    number = 1
    myDouble = 2 + 3.0

    println(three)
    println(number)
    println(myDouble)
}
