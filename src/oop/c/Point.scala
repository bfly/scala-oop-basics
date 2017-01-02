package oop.c

import Math._

/**
  * Created by macbook on 12/30/16.
  */
case class Point(x: Int, y: Int)

object Point {

  def calculateDistance(p1: Point, p2: Point): Double = {
    sqrt( pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2) )
  }

  def apply(): Point = Point(0, 0)
}
