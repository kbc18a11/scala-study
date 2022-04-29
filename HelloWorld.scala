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

object HelloWorld {
  def loopFrom0To9(): Unit = {
    var i = 0
    while (i < 10) {
      println(i)
      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Point3D(10, 20, 30)
    println(p.x) // 10
    println(p.y) // 20
    println(p.z) // 30
  }
}
