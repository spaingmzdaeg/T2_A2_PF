package main

object EjercicioUno extends App {

  def ingresarPalabras(n:Int):List[String] = {
    List.fill(n)(scala.io.StdIn.readLine())
  }

  def contarPalabras(lista:List[String],palabra:String):Int = {
   lista.count(x => {x.equals(palabra)})
  }

  // PRUEBA

  println("Cuantas palabras va ingresar?")
  val cantidad = scala.io.StdIn.readInt()
  println(s"Por favor ingrece $cantidad palabras....")
  val miLista = ingresarPalabras(cantidad)
  println(miLista)
  println("Por favor Ingrese palabra a buscar......")
  val palabra = scala.io.StdIn.readLine()

 println(s"La palabra $palabra se encuentra ["+contarPalabras(miLista,palabra)+"] veces en la lista.")




}
