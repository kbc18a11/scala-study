class Point(val x: Int, val y: Int) {
  def +(p: Point): Point = {
    new Point(x + p.x, y + p.y)
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}

class Adder {
  def add(x: Int)(y: Int): Int = x + y
}

class Point3D(val x: Int, val y: Int, val z: Int) {}

class Person(name: String, age: Int, private val weight: Int)

object Person {
  def printWeight(): Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
}

object HelloWorld {
  def loopFrom0To9(): Unit = {
    var i = 0
    while (i < 10) {
      println(i)
      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    val add = new Function2[Int, Int, Int] {
      def apply(x: Int, y: Int): Int = x + y
    }
// add: AnyRef with (Int, Int) => Int = <function2>

    add.apply(100, 200)
// res0: Int = 300

    add(100, 200)
// res1: Int = 300
  }
}
