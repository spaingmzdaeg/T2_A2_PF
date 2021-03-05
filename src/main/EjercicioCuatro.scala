package main

object EjercicioCuatro extends App {
  def ingresarPalabras(n:Int):List[String] = {
    List.fill(n)(scala.io.StdIn.readLine())
  }

  def eliminarPalabras(lista:List[String],lista2:List[String]):List[String] = {
    val elementosNoDeseados = lista2.toSet
    lista.filterNot(elementosNoDeseados)
  }

  // PRUEBA

  println("Cuantas palabras va ingresar Lista[1]?")
  val cantidad = scala.io.StdIn.readInt()
  println(s"Por favor ingrece $cantidad palabras....")
  val miLista = ingresarPalabras(cantidad)
  println(miLista)
  println("Cuantas palabras va ingresar Lista[2]?")
  val cantidad2 = scala.io.StdIn.readInt()
  println(s"Por favor ingrece $cantidad2 palabras....")
  val miLista2 = ingresarPalabras(cantidad2)
  println(miLista2)


  println("Lista Resultante:"+eliminarPalabras(miLista,miLista2))


}
