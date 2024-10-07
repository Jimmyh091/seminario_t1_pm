package com.example.seminario_t1_pm

fun main(){

    ordenarEjercicios( ej1(intArrayOf(4,5,6,39,3,4)), 1)
    ordenarEjercicios( ej2(intArrayOf(10, 10, 10)), 2)
    ordenarEjercicios( ej3(9.0), 3)
    ordenarEjercicios( ej4("manuel"), 4)
    ordenarEjercicios( ej5("acacaca", 'c'), 5)
    ordenarEjercicios( ej6("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", "abcde") ,6)
    ordenarEjercicios( ej7("El pan, del latin panis, es un alimento basico de la dieta humana que se suele preparar mediante el horneado de una masa, elaborada fundamentalmente con harina de cereal, agua y sal. La mezcla, en la mayoria de las ocasiones, suele contener levaduras para que se fermente la masa y sea mas esponjosa y tierna."),7)
    ordenarEjercicios(ej8(245) ,8)
    /*
    ordenarEjercicios( ,9)
    ordenarEjercicios( ,10)
    ordenarEjercicios( ,11)
    ordenarEjercicios( ,12)
    ordenarEjercicios( ,13)
    ordenarEjercicios( ,14)
    ordenarEjercicios( ,15)
    ordenarEjercicios( ,16)
    ordenarEjercicios( ,17)
    ordenarEjercicios( ,18)
    ordenarEjercicios( ,19)
    ordenarEjercicios( ,20)
    ordenarEjercicios( ,21)
    ordenarEjercicios( ,22)
    ordenarEjercicios( ,23)
    ordenarEjercicios( ,24)
    ordenarEjercicios( ,25)
    ordenarEjercicios( ,26)
    ordenarEjercicios( ,27)
    ordenarEjercicios( ,28)
    ordenarEjercicios( ,29)
    ordenarEjercicios( ,30)
    ordenarEjercicios( ,31)
    ordenarEjercicios( ,32)
    ordenarEjercicios( ,33)
    ordenarEjercicios( ,34)
    ordenarEjercicios( ,35)
    ordenarEjercicios( ,36)
    */
}

fun <T> ordenarEjercicios (res: T, numero: Int){
    println("\nEjercicio $numero:" +
            "\n$res\n")
}

/*Ejercicio 1. Crea una función que obtenga el número máximo de una lista de
    números*/
fun ej1(lista: IntArray) : String{

    var num = lista[0]

    lista.forEach {
        if (it > num) num = it
    }

    var resultado = "Numero maximo: $num"
    return resultado
}

/*Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números*/
fun ej2(lista: IntArray) : String{
    var res = 0

    for (it in 0 until lista.size){
        res += lista[it]
    }

    var resultado = "Sumatoria de la lista: $res"
    return resultado
}

/*Ejercicio 3. Crea una función que dada una distancia en millas calcule su
correspondiente en kms*/
fun ej3(millas: Double) : String {

    var kilometros = millas * 1.60934

    var resultado = "$millas en millas es $kilometros en kilometros"
    return resultado
}

/*Ejercicio 4. Crea una función que determine si una cadena de texto es un
palíndromo*/
fun ej4(palabra: String) : String{

    val palabraAux = palabra.reversed()


    var resultado = "$palabra "

    if (palabra != palabraAux) resultado += "no "

    resultado += "es palindromo"

    return resultado
}

/*Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un
texto.*/
fun ej5(texto: String, letra: Char) : String{

    var veces = 0

    for (it in 0 until texto.length){
        if (texto.get(it) == letra) veces++
    }

    var resultado = "Veces que aparece '$letra': $veces"
    return resultado
}

/*Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en
un texto.*/
fun ej6(texto: String, textoBuscado: String) : String{
    var veces = 0

    for (it in 0 until texto.length){

        if (texto.get(it) == textoBuscado.get(0)){

            var linea: String = ""
            for (it2 in it until it + textoBuscado.length){
                linea += texto.get(it2)
            }
            if (linea.equals(textoBuscado)) veces++
        }
    }

    var resultado = "Veces que aparece \"$textoBuscado\": $veces"
    return resultado
}

/*Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
palabra de un texto */
fun ej7(texto: String) : String {

    var palabras = texto.split(' ').toMutableList()

    for (it in 0 until palabras.size){
        var resultado : String = palabras[it].get(0).uppercaseChar().toString()

        for (it2 in 1 until palabras[it].length){
            resultado += palabras[it].get(it2)
        }

        palabras[it] = resultado
    }

    var textoFinal = ""
    for (it in 0 until palabras.size){
        textoFinal += palabras[it] + " "
    }

    var resultado = "Texto con la 1era en mayuscula:\n$textoFinal"
    return resultado
}

/*Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo:
sumaDigitos(245) = 2 + 4 + 5 = 11*/
fun ej8(num: Int) : String {

    var numLength = "" + num
    var listaNum = IntArray(numLength.length)

    var divisor = 1
    for (it in 0 until listaNum.size){

        var resAux = (num % (divisor * 10)) / divisor

        listaNum[it] = resAux
        divisor *= 10
    }

    var suma = 0

    for (it in 0 until listaNum.size){
        suma += listaNum[it]
    }

    var resultado = "Suma de los digitos: $suma"
    return resultado
}