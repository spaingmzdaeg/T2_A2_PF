package main

object EjercicioCinco extends App {
  println("\n\t\t *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* LISTADO DE PALABRAS *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*")

  val listaPalabras1 = List("MEXICO", "BRASIL", "USA", "POLONIA", "URUGUAY", "PARAGUAY", "COLOMBIA", "ECUADOR", "CHILE", "ARGENTINA")

  val listaPalabras2 = List("COLOMBIA", "MEXICO", "ESCOCIA", "IRLANDA", "USA", "SUIZA", "ESPANA", "SERBIA", "BOSNIA", "TOGO",
    "CROACIA", "RUSIA", "ALBANIA", "CAMERUN", "NORUEGA", "INGLATERRA")

  println("\nLista de Palabras 1: \n" + listaPalabras1)

  println("\nLista de Palabras 2: \n" + listaPalabras2)

  //--------------------------------------------------------------------------------------------------

  println("\n\n Intersección de Palabras de las Listas")

  println("-----> INTERSECCIÓN:")

  val listaInterseccion = listaPalabras1.intersect(listaPalabras2)

  println(listaInterseccion)

  // -------------------------------------------------------------------------------------------------

  println("\n\n Palabras que aparecen en la primera lista, pero no en la segunda lista: ")

  println("-----> Palabras Lista 1:")

  val listPalabras1 = listaPalabras1.diff(listaPalabras2)

  println(listPalabras1)

  // -------------------------------------------------------------------------------------------------

  println("\n\n Palabras que aparecen en la segunda lista, pero no en la primera lista: ")

  println("-----> Palabras Lista 2:")

  val listPalabras2 = listaPalabras2.diff(listaPalabras1)

  println(listPalabras2)

  // -------------------------------------------------------------------------------------------------

  println("\n\n Unión de palabras de las listas: ")

  println("-----> UNIÓN:")

  val listaUnion = listaPalabras1.union(listaPalabras2)

  println(listaUnion)

}

