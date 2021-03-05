package main

object EjercicioSeis extends App {


  def sumaAcumulada[A](xs: Seq[A])(implicit num: Numeric[A]): Seq[A] = {
    xs.tail.scanLeft(xs.head)(num.plus)
  }

  val miLista = List(1,2,3)

  println(sumaAcumulada(miLista))


}