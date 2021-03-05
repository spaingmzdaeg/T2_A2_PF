package main

object EjercicioDos extends App {

  def ingresarPalabras(n:Int):List[String] = {
    List.fill(n)(scala.io.StdIn.readLine())
  }

  def remplazarPalabras(lista:List[String],palabraARemplazar:String,palabraNueva:String):List[String] = {
    val index = lista.indexWhere(_.equals(palabraARemplazar))
    lista.updated(index,palabraNueva)
  }

  // PRUEBA

  println("Cuantas palabras va ingresar?")
  val cantidad = scala.io.StdIn.readInt()
  println(s"Por favor ingrece $cantidad palabras....")
  val miLista = ingresarPalabras(cantidad)
  println(miLista)
  println("Por favor Ingrese palabra a remplazar......")
  val palabra = scala.io.StdIn.readLine()
  println("Por favor Ingrese palabra nueva......")
  val palabraNueva = scala.io.StdIn.readLine()
  println(remplazarPalabras(miLista,palabra,palabraNueva))






}
