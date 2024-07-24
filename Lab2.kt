// Lab 2
// Ejercicio 1
fun calcularPromedio(numeros: List<Int>): Double {
    return numeros.reduce{acc, num -> acc + num}.toDouble() / numeros.size
}

// Ejercicio 2
val enteros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
val impares = enteros.filter { it % 2 != 0 }

// Ejercicio 3
fun isPalindrome(cadena: String): Boolean {
    return cadena == cadena.reversed()
}

// Ejercicio 4
val nombres = listOf("Alicia", "Juan", "Pedro", "María")
val saludos = nombres.map { "¡Hola, $it!" }

// Ejercicio 5
fun performOperation(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

// Ejercicio 6
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapeo(persona: Person): Student {
    return Student(persona.name, persona.age, persona.gender, persona.hashCode().toString()) // Suponiendo un ID de estudiante
}

val personas = listOf(Person("Juan", 20, "Masculino"), Person("María", 22, "Femenino"))
val estudiantes = personas.map { mapeo(it) }

// Prueba de cada inciso
fun main () {
    println(calcularPromedio(enteros))

    println(impares)

    println(isPalindrome("reconocer"))
    println(isPalindrome("palindromo"))

    saludos.forEach { println(it) }

    println(performOperation(5, 3) { a, b -> a + b })

    estudiantes.forEach { println("El Estudiante ${it.name} tiene ${it.age} años") }
}