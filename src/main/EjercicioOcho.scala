package main

object EjercicioOcho extends App {
  def esCapicuo(x: Int): Boolean = {
    var n = x
    if (n < 0) return false
    var div = 1
    while ( {
      n / div >= 10
    }) div *= 10
    while ( {
      n != 0
    }) {
      val l = n / div
      val r = n % 10
      if (l != r) return false
      n = (n % div) / 10
      div /= 100
    }
    true
  }

  def obtenerCapicuas(lista:List[Int]):List[Int] = {
    lista.filter(x => esCapicuo(x))
  }

  val miLista = List(1,44,234,12,30003,2442,100,88,20202)
  println(obtenerCapicuas(miLista))

}
