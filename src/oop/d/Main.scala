package oop.d

/**
  * Created by macbook on 12/30/16.
  */
object Main extends App {

  val america = America( name = "America", leader = "Theodore Roosevelt")
  val england = new England with SpiceColony

  println(america.greetings(england))
  println(england.greetings(america))

  england.getGoods()
  england.getSpices()

}
