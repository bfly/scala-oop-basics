package oop.d

/**
  * Created by macbook on 12/30/16.
  */
trait Civilization {

  val numberOfSettlers: Int = 1
  val name: String
  val leader: String

  def uniqueAbility() : Unit
  def greetings(civilization: Civilization): String = {
    s"Hello, ${civilization.leader}! Glad to meet you ${civilization.name}"
  }

}

trait GoldColony {
  def getGoods(): Unit = println("Gold...")
}

trait SpiceColony {
  def getSpices(): Unit = println("Spices...")
}

case class America(name: String, leader: String) extends Civilization {

  override def uniqueAbility(): Unit = println("Founding Fathers.  Lowers the time it takes to gain government bonuses.")
}

class England extends Civilization with GoldColony {
  override val name: String = "England"
  override val leader: String = "Queen Victoria"

  override def uniqueAbility(): Unit = {
    println("British Museum.  Gives more slots to museums for artifacts and makes them produce more archaeologists.")
  }
}