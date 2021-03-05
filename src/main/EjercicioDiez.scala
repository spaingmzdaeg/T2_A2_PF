package main

object EjercicioDiez extends App {


  def listarElementosPorOcurrencia[A](list1:List[A]):Map[A, Int] = {
    list1.groupBy(el => el).map(e => (e._1, e._2.length))
  }

  println(listarElementosPorOcurrencia(List(1,1,1,2,2,3,6,4,4,6,1,6,2)))
  println(listarElementosPorOcurrencia(List("Red", "Green", "White", "Black", "Red", "Green", "Black")))
}
