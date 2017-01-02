package oop.b

/**
  * Created by macbook on 12/30/16.
  */
class Container(length: Int, width: Int, height: Int) {

    require(length > 0, "Length must be a positive number.")
    require(width > 0,  "Width must be a positive number.")
    require(height > 0, "Height must be a positive number.")
    def this() = this(5, 3, 2)
    def this(l: Int) = this(l, 3, 2)
    def this(l: Int, w: Int) = this(l, w, 2)

    def getLength() = length
    def getWidth() = width
    def getHeight() = height
    def getVolume() = length * width * height

    def getValues() = "length: " + length + "; width: " + width + "; heigth: " + height + "; volumn: " + getVolume
}
