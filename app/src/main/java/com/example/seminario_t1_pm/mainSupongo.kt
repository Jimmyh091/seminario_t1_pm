package com.example.seminario_t1_pm

fun main(){

    ordenarEjercicios( 1,  ej1(intArrayOf(4,5,6,39,3,4)))
    ordenarEjercicios( 2,  ej2(intArrayOf(10, 10, 10)))
    ordenarEjercicios( 3,  ej3(9.0))
    ordenarEjercicios( 4,  ej4("manuel"))
    ordenarEjercicios( 5,  ej5("acacaca", 'c'))
    ordenarEjercicios( 6,  ej6("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", "abcde"))
    ordenarEjercicios( 7,  ej7("El pan, del latin panis, es un alimento basico de la dieta humana que se suele preparar mediante el horneado de una masa, elaborada fundamentalmente con harina de cereal, agua y sal. La mezcla, en la mayoria de las ocasiones, suele contener levaduras para que se fermente la masa y sea mas esponjosa y tierna."))
    ordenarEjercicios( 8,  ej8(245))
    ordenarEjercicios( 9,  ej9(84, 70))
    ordenarEjercicios( 10, ej10(11))
    ordenarEjercicios( 11, ej11(20, 20))
    ordenarEjercicios( 12, ej12(47574))
    ordenarEjercicios( 13, ej13("div.clasePrueba#idprefijado"))
    ordenarEjercicios( 14, ej14(6))
    ordenarEjercicios( 15, ej15(intArrayOf(2,3,5,7,2), intArrayOf(2,7,5,5,2) ))
    ordenarEjercicios( 16, ej16(intArrayOf(2,3,5,7,2)))
    ordenarEjercicios( 17, ej17(intArrayOf(2,3,4,6,78,6,54,4,54,6,787,8,8,7,65,5,4,3) ))
    ordenarEjercicios( 18, ej18(877))
    ordenarEjercicios( 19, ej19("El pan, del latin panis, es un alimento basico de la dieta humana que se suele preparar mediante el horneado de una masa, elaborada fundamentalmente con harina de cereal, agua y sal. La mezcla, en la mayoria de las ocasiones, suele contener levaduras para que se fermente la masa y sea mas esponjosa y tierna."))
    ordenarEjercicios( 20, ej20(5))
    ordenarEjercicios( 21, ej21("nahuel"))
    ordenarEjercicios( 22, ej22(28))
    ordenarEjercicios( 23, ej23(8085))
    ordenarEjercicios( 24, ej24( arrayOf( intArrayOf(3,45,6,87,6,45,3,4,6,7), intArrayOf(3,45,6,87,6,45,3,4,6,7), intArrayOf(3,45,6,87,6,45,3,4,6,7) ) ))
    ordenarEjercicios( 25, ej25( arrayOf( arrayOf(3,45,6,87,6,45,3,4,6,7), arrayOf(3,45,6,87,6,45,3,4,6,7), arrayOf(3,45,6,87,6,45,3,4,6,7) ) ))
    ordenarEjercicios( 26, ej26( listOf("saljdf", "asdfawe", "as", "asdfawe", "a", "holo", "asdfawe", "AFJKSHD", "encefalografia", "jarbhaesbf") ))
    ordenarEjercicios( 27, ej27( listOf("saljdf", "asdfawe", "as", "asdfawe", "a", "holo", "asdfawe", "AFJKSHD", "encefalografia", "jarbhaesbf") ))
    ordenarEjercicios( 28, ej28("asfjlakj wfkj s askAHF KUWKajsb FHJ KAf h kh f "))
    ordenarEjercicios( 29, ej29("twelve plus one", "eleven plus two"))
    ordenarEjercicios( 30, ej30(6))
    /*
    ordenarEjercicios( 31, )
    ordenarEjercicios( 32, )
    ordenarEjercicios( 33, )
    ordenarEjercicios( 34, )
    ordenarEjercicios( 35, )
    */
}

fun <T> ordenarEjercicios (numero: Int, res: T){
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
fun ej9(num1: Int, num2: Int) : String{

    val numMax: Int

    if  (num1 >= num2) numMax = num1
    else numMax = num2

    var mcd = 0
    for (it in 1 .. numMax / 2){

        if (num1 % it == 0 && num2 % it == 0){
            mcd = it
        }
    }

    var resultado : String

    if  (mcd == 1) resultado = "No existe el MCD de $num1 y $num2 porque es 1"
    else resultado = "El MCD de $num1 y $num2 es $mcd"

    return resultado
}

/*Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci.*/
fun ej10(veces: Int) : String{

    // podria hacer esto mismo con otra variable pero me ha apetecido fumar mucho

    var resFibo = 0
    var num1 = 0
    var num2 = 1

    for (it in 2 .. veces){

        resFibo = num1 + num2

        num1 = num2
        num2 = resFibo

    }

    var resultado = "El termino numero $veces de la serie Fibonacci es $resFibo"
    return resultado
}

/*Ejercicio 11. Crea una función que determine si dos números son primos relativos.*/
fun ej11(num1: Int, num2: Int) : String{

    val numMax: Int

    if  (num1 >= num2) numMax = num1
    else numMax = num2

    var mcd = 0
    for (it in 1 .. numMax / 2){

        if (num1 % it == 0 && num2 % it == 0){
            mcd = it
        }
    }

    var resultado = "Los numeros $num1 y $num2 "

    if (mcd != 1){
        resultado += "no "
    }

    resultado += "son primos relativos"

    return resultado
}

/*Ejercicio 12. Crea una función que determine si un número dado es capicúa*/
fun ej12(num: Int) : String{

    val numAux = "" + num
    val numReversed = numAux.reversed()

    var booleano = numAux.equals(numReversed)

    var resultado = "El numero $num "
    if (!booleano) resultado += "no "
    resultado += "es capicuo"

    return resultado
}

/*Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet
devuelva su correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos
de clase e id.*/
fun ej13(linea: String) : String {

    var nombre = ""
    var emmetClass = ""
    var emmetId = ""

    var nombreEncontrado = false
    var puntoEncontrado = false
    var almohadillaEncontrada = false


    for (it in 0 until linea.length){

        if (linea.get(it) != '.' && !nombreEncontrado){

            nombre += linea.get(it)

        }else{

            nombreEncontrado = true

            if (linea.get(it) != '#' && !puntoEncontrado){

                if (linea.get(it) != '.'){
                    emmetClass += linea.get(it)
                }
            }else{

                puntoEncontrado = true

                if (linea.get(it) != '#'){
                    emmetId += linea.get(it)
                }else{
                    almohadillaEncontrada = true
                }

            }
        }
    }

    var lineaHTML = "<$nombre"

    if (puntoEncontrado){
        lineaHTML += " class=\"$emmetClass\""
    }
    if (almohadillaEncontrada){
        lineaHTML += " id=\"$emmetId\""
    }

    lineaHTML += "></$nombre>"

    var resultado = "Linea Emmet: $linea\nLinea HTML: $lineaHTML"

    return resultado

}

/*Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’*/
fun ej14(veces: Int) : String{

    var piramide = ""

    for (it in 1 until veces){
        for (it2 in 1 .. it){
            piramide += it
        }
        piramide += "\n"
    }

    var resultado = "Piramide de $veces pisos:\n\n$piramide"
    return resultado
}

/*Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
que determine si los elementos, uno a uno, de ambos arrays son iguales*/
fun ej15(lista1: IntArray, lista2: IntArray) : String{

    val listaBool = BooleanArray(lista1.size)

    for (it in 0 until lista1.size){
        listaBool.set(it, lista1.get(it) == lista2.get(it))
    }

    var resultado = "Lista 1: ${lista1.get(0)}"

    for (it in 1 until lista1.size){
        resultado += ", ${lista1.get(it)}"
    }

    resultado += "\nLista 2: ${lista2.get(0)}"

    for (it in 1 until lista2.size){
        resultado += ", ${lista2.get(it)}"
    }

    resultado += "\nLista B: "

    if (listaBool.get(0)) resultado += "T"
    else resultado += "F"

    for (it in 1 until listaBool.size){

        if (listaBool.get(it)) resultado += ", T"
        else resultado += ", F"
    }

    return resultado
}

/*Ejercicio 16: Crea una función que calcule el producto de todos los elementos en
una lista de números.*/
fun ej16(lista: IntArray) : String{
    var res = lista.get(0)

    for (it in 1 until lista.size){
        res *= lista.get(it)
    }

    var resultado = "El producto de ${lista.get(0)}"

    for (it in 1 until lista.size){
        resultado += ", ${lista.get(it)}"
    }

    resultado += " es $res"

    return resultado
}

/*Ejercicio 17: Crea una función que dada una lista de números, devuelva una nueva
lista con solo los números pares.*/
fun ej17(lista: IntArray) : String{
    val listaRes = mutableListOf<Int>()

    lista.forEach { if (it % 2 == 0) listaRes.add(it) }

    var resultado = "Lista inicial:\n${lista.get(0)}"
    lista.forEach{ resultado += ", $it" }

    resultado += "\n\nLista de pares:\n${listaRes.get(0)}"
    listaRes.forEach(){ resultado += ", $it" }

    return resultado
}

/*Ejercicio 18: Crea una función que determine si un número es primo.*/
fun ej18(num: Int) : String{
    val mitad = num/2

    var esPrimo = true
    for (it in 2 .. mitad){
        if (num % it == 0){
            esPrimo = false
            break
        }
    }

    var resultado = "El numero $num "

    if (!esPrimo) resultado += "no "

    resultado += "es primo"
    return resultado
}

/*Ejercicio 19: Crea una función que, dada una cadena de texto, elimine todas las
vocales de la cadena.*/
fun ej19(texto: String) : String{
    var res = texto.replace("[aAeEiIoOuU]".toRegex(),"")

    var resultado = "Texto original:\n$texto\n\nTexto sin vocales:\n$res"
    return resultado
}

/*Ejercicio 20: Crea una función que calcule el factorial de un número.*/
fun ej20(num: Int) : String{
    var res = 1

    for (it in 1 .. num){
        res *= it
    }

    var resultado = "El factorial de $num es $res"
    return resultado
}

/*Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en
"aloh".*/
fun ej21(texto: String) : String{
    val res = texto.reversed()

    var resultado = "Texto original: $texto\nTexto en reversa: $res"
    return resultado
}

/*Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
sus divisores propios positivos es igual al número), o False en caso contrario.*/
fun ej22(num: Int) : String{
    var sumDiv = 0

    val mitad = num / 2
    for (it in 1 .. mitad){
        if (num % it == 0) sumDiv += it
    }

    val res = num == sumDiv

    var resultado = "El numero $num "

    if (!res) resultado += "no "

    resultado += "es un numero perfecto"
    return resultado
}

/*Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
número Armstrong porque 1^3 + 5^3 + 3^3 = 153.*/
fun ej23(num: Int) : String{

    var numStr = "" + num
    val numLength = numStr.length

    var res = 0.0
    var divisor = 1

    var listaNum = IntArray(numLength)
    for (it in 0 until numLength){

        var resAux = (num % (divisor * 10)) / divisor

        listaNum[it] = resAux
        divisor *= 10
    }

    for (it in 0 until numLength){
        var a : Double = listaNum. get(it).toDouble()
        var b : Double = numLength.toDouble()

        res += Math.pow(a, b)
    }

    var esAmstrong = num.toDouble() == res

    var resultado = "El numero $num "

    if (!esAmstrong) resultado += "no "

    resultado += "es un numero Amstrong"
    return resultado
}

/*Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
(una lista de listas).*/
fun ej24(matriz: Array<IntArray>) : String{

    var res = matriz.get(0).get(0)

    for (it in 0 until matriz.size){
        for (it2 in matriz.get(it)){

            if (it2 > res){
                res = it2
            }
        }
    }

    var resultado = "El numero mas grande de la matriz es $res"
    return resultado
}

/*Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
bidimensional (una lista de listas).*/
fun ej25(matriz: Array<Array<Int>>): String{

    var res = matriz.get(0).get(0)

    for (it in 0 until matriz.size){
        for (it2 in matriz.get(it)){
            if (res > it2) res = it2
        }
    }

    var resultado = "El numero mas pequeno de la matriz es $res"
    return resultado
}

/*Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la palabra más larga.*/
fun ej26(lista: List<String>): String{
    var res = lista.get(0)

    for (it in lista){
        if (it.length > res.length) res = it
    }

    var resultado = "La palabra con mas letras es $res"
    return resultado
}

/*Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la palabra más corta.*/
fun ej27(lista: List<String>): String{
    var res = lista.get(0)

    for (it in lista){
        if (it.length < res.length) res = it
    }

    var resultado = "La palabra con menos letras es $res"
    return resultado
}

/*Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
caracteres alfabéticos (letras) y espacios en blanco.*/
fun ej28(texto: String) : String{

    var todoIgual = true

    for (it in texto){
        if ((it < 'A' || it > 'z') || (it != ' ')){
            todoIgual = false
            break
        }
    }

    var resultado = "La cadena de texto "

    if (!todoIgual) resultado += "no "

    resultado += "son todo letras y espacios"

    return resultado
}

/*Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
caracteres alfabéticos (letras) o espacios en blanco.*/
fun ej28PeroSoyTontoYLoHiceMal(texto: String) : String{
    var caracter = texto.get(0)
    var esLetra = if (caracter == ' ') false else true

    var todoIgual = true

    for (it in texto){
        if (esLetra){
            if (it < 'A' || it > 'z'){
                todoIgual = false
                break
            }
        }else{
            if (it != caracter){
                todoIgual = false
                break
            }
        }
    }

    var resultado = "La cadena de texto "

    if (!todoIgual){
        resultado += "no contiene los mismos caracteres"
    }else{
        resultado += "contiene todo "
        if (esLetra) resultado += "letras"
        else resultado += "espacios"
    }

    return resultado
}

/*Ejercicio 29: Crea una función que determine si una cadena de texto es un
anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
pero en un orden diferente.*/
fun ej29(linea1: String, linea2: String) : String{
    var mismasLetras = true

    val lineaAux1 = linea1.lowercase().replace(" ", "")
    val lineaAux2 = linea2.lowercase().replace(" ", "")

    for (it in lineaAux1){
        for (it2 in lineaAux2){
            if (it == it2){
                mismasLetras = true
                break
            } else {
                mismasLetras = false
            }
        }

        if (!mismasLetras) break
    }

    var resultado = "\"$linea1\" y \"$linea2\" "

    if (!mismasLetras) resultado += "no "

    resultado += "son anagramas"
    return resultado
}

/*Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
número triangular (puede representarse como un triángulo equilátero de puntos), o
False en caso contrario.*/
fun ej30(num: Int) : String{

    var triangulo = 0
    var n = 1

    do {
        triangulo = (n * (n + 1)) / 2
        n++
    }while (num > triangulo)

    var resultado = "El numero $num "

    if (triangulo != num) resultado += "no "

    resultado += "es un numero tringular"
    return resultado
}


// SUBIR NOTA //

/*Ejercicio 31: Duplicar Elementos en una Lista
Escribe una función que tome una lista de números y utilice la función map para
duplicar cada número en la lista. La función debe devolver una nueva lista con
todos los números duplicados.*/
fun ej31(lista: List<Int>){
    lista.map { elto ->
    }
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