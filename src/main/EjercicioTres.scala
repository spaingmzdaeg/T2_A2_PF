package main

object EjercicioTres extends App{

  def ingresarPalabras(n:Int):List[String] = {
    List.fill(n)(scala.io.StdIn.readLine())
  }

  def eliminarPalabras(lista:List[String],palabraAEliminar:String):List[String] = {
    lista.filterNot(x => x.equalsIgnoreCase(palabraAEliminar))
  }

  // PRUEBA

  println("Cuantas palabras va ingresar?")
  val cantidad = scala.io.StdIn.readInt()
  println(s"Por favor ingrece $cantidad palabras....")
  val miLista = ingresarPalabras(cantidad)
  println(miLista)
  println("Por favor Ingrese palabra a eliminar......")
  val palabra = scala.io.StdIn.readLine()
  println(eliminarPalabras(miLista,palabra))


}
