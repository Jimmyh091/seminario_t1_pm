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

/*Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números
naturales*/
fun ej9(){

}

/*Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.*/
fun ej10(){

}

/*Ejercicio 11. Crea una función que determine si dos números son primos relativos.*/
fun ej11(){

}

/*Ejercicio 12. Crea una función que determine si un número dado es capicúa*/
fun ej12(){

}

/*Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet
devuelva su correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos
de clase e id.*/
fun ej13(){

}

/*Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’*/
fun ej14(){

}

/*Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
que determine si los elementos, uno a uno, de ambos arrays son iguales*/
fun ej15(){

}

/*Ejercicio 16: Crea una función que calcule el producto de todos los elementos en
una lista de números.*/
fun ej16(){

}

/*Ejercicio 17: Crea una función que dada una lista de números, devuelva una nueva
lista con solo los números pares.*/
fun ej17(){

}

/*Ejercicio 18: Crea una función que determine si un número es primo.*/
fun ej18(){

}

/*Ejercicio 19: Crea una función que, dada una cadena de texto, elimine todas las
vocales de la cadena.*/
fun ej19(){

}

/*Ejercicio 20: Crea una función que calcule el factorial de un número.*/
fun ej20(){

}

/*Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en
"aloh".*/
fun ej21(){

}

/*Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
sus divisores propios positivos es igual al número), o False en caso contrario.*/
fun ej22(){

}

/*Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
número Armstrong porque 1^3 + 5^3 + 3^3 = 153.*/
fun ej23(){

}

/*Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
(una lista de listas).*/
fun ej24(){

}

/*Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
bidimensional (una lista de listas).*/
fun ej25(){

}

/*Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.*/
fun ej26(){

}

/*Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.*/
fun ej27(){

}

/*Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
caracteres alfabéticos (letras) y espacios en blanco.*/
fun ej28(){

}

/*Ejercicio 29: Crea una función que determine si una cadena de texto es un
anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
pero en un orden diferente.*/
fun ej29(){

}

/*Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
número triangular (puede representarse como un triángulo equilátero de puntos), o
False en caso contrario.*/
fun ej30(){

}


// SUBIR NOTA //

/*Ejercicio 31: Duplicar Elementos en una Lista
Escribe una función que tome una lista de números y utilice la función map para
duplicar cada número en la lista. La función debe devolver una nueva lista con
todos los números duplicados.*/
fun ej31(){

}

/*Ejercicio 32: Crear un Diccionario a partir de Listas
Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
cree un diccionario utilizando mapOf para combinar las listas en un diccionario
clave-valor. La función debe devolver el diccionario resultante.*/
fun ej32(){

}

/*Ejercicio 33: Crea un programa se encargue de transformar un número decimal a
binario sin utilizar funciones propias del lenguaje que lo hagan directamente.*/
fun ej33(){

}

/*Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre
él).*/
fun ej34(){

}

/*Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
- La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
- "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a
menor.
- No se pueden utilizar funciones propias del lenguaje que lo resuelvan
automáticamente.*/
fun ej35(){

}