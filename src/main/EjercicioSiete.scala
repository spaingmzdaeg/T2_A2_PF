package main

object EjercicioSiete extends App{

  def obtenerPalindromas(lista:List[String]):Unit = {
    for (x <- lista){
      if (x.equals(x.reverse)){
        print(x + ", ")
      }
    }
  }

  println("\n\t\t *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* PALABRAS PALÍNDROMAS *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*")

  val listaPalabras = List("RADAR", "ORO", "RAJAR", "RALLAR", "SALAS", "SOMOS", "ANA", "OSO", "ATARDECER", "SUEÑO", "UNIR", "SORPRESA", "LLUVIA")

  println("\nLista de Palabras: \n" + listaPalabras)

  println("-----> Palabras que son palíndromas: ")

obtenerPalindromas(listaPalabras)


}
