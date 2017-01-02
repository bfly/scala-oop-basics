package oop.c

import Point._

/**
  * Created by macbook on 12/30/16.
  */
object Main extends App {

  val p1 = Point()
  val p2 = Point(3, 4)

  println(calculateDistance(p1, p2))

  val p1Update = p1.copy(y = 1)

  println(calculateDistance(p1Update, p2))

  println(p1 == p2)
  println(p2 == p2)
  println(p2 == Point(3, 4))

}
