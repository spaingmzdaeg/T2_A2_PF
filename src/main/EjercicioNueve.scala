package main

object EjercicioNueve extends App {

  def esPrimo(i :Int) : Boolean = {
         if (i <= 1)
             false
         else if (i == 2)
             true
         else
           !(2 to (i-1)).exists(x => i % x == 0)
       }

  def obtenerNumerosPrimos(lista:List[Int]):List[Int] = {
    lista.filter(x => esPrimo(x))
  }

  def factorial(n:Int):Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  def obtenerFactoriales(lista:List[Int]):List[Int] = {
    lista.map(x => factorial(x))
  }

  def obtenerPromedioySumatoria(lista:List[Int]):Int = {
    lista.sum / lista.length
  }

  val miLista = List(1,2,3,4,5,6,7,8,9,10)
  println(obtenerNumerosPrimos(miLista))
  println(obtenerFactoriales(miLista))
  println(obtenerPromedioySumatoria(miLista))


}
