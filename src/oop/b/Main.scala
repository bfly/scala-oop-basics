package oop.b

/**
  * Created by macbook on 12/30/16.
  */
object Main extends App {
  val containerA = new Container
  val containerB = new Container(5)
  val containerC = new Container(5, 3)
  val containerD = new Container(5, 3, 2)

  println(containerA.getValues)
  println(containerB.getValues)
  println(containerC.getValues)
  println(containerD.getValues)
}
