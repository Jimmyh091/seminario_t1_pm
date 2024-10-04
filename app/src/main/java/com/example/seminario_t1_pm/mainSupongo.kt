package com.example.seminario_t1_pm

fun main(){
    println(ej1(intArrayOf(4,5,6,39,3,4)))
    println(ej2(intArrayOf(10, 10, 10)))
    println(ej3(9.0))
    println(ej4("manuel"))
    println(ej5("acacaca", 'c'))
    println(ej6("abcdfabcdfabcdfabcdf", "abc"))
}

/*Ejercicio 1. Crea una función que obtenga el número máximo de una lista de
    números*/
fun ej1(lista: IntArray) : Int{

    var num = lista[0]

    lista.forEach {
        if (it > num) num = it
    }

    return num
}

/*Ejercicio 2. Crea una función que obtenga la sumatoria de una lista de números*/
fun ej2(lista: IntArray) : Int{
    var res = 0

    for (it in 0 until lista.size){
        res += lista[it]
    }

    return res
}

/*Ejercicio 3. Crea una función que dada una distancia en millas calcule su
correspondiente en kms*/
fun ej3(millas: Double) : Double {
    return millas * 1.60934
}

/*Ejercicio 4. Crea una función que determine si una cadena de texto es un
palíndromo*/
fun ej4(palabra: String) : Boolean{

    val palabraAux = palabra.reversed()

    return palabra == palabraAux
}

/*Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un
texto.*/
fun ej5(texto: String, letra: Char) : Int{

    var veces = 0

    for (it in 0 until texto.length){
        if (texto.get(it) == letra) veces++
    }

    return veces
}

/*Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en
un texto.*/
fun ej6(texto: String, textoBuscado: String) : Int{
    var veces = 0

    for (it in 0 until texto.length){

        if (texto.get(it) == textoBuscado.get(0)){

            var contador = 0
            var igual = true

            for (it2 in it until textoBuscado.length){
                contador = it2

                if (texto.get(it2) != textoBuscado.get(it2 - it)){
                    igual = false
                }
                println("iterador: $it2")
            }

            println("longitud: ${textoBuscado.length}")
            if (contador == textoBuscado.length - 1 && igual) veces++
        }
    }

    return veces
}