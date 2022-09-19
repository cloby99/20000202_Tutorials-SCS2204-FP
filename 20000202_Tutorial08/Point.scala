case class Point(var x: Int, var y: Int) {
  def add(m:Point) = new Point(this.x + m.x, this.y + m.y)

  def move(x:Int, y:Int):Unit = {
    this.x = this.x + x
    this.y = this.y + y
  }

  def distance(m:Point) : Double = {
    var xDistance:Int = this.x - m.x
    var yDistance:Int = this.y - m.y
    var Distance: Int = xDistance*xDistance + yDistance*yDistance
    scala.math.sqrt(Distance)
  }

  def invert() :Unit = {
    var temp = this.x
    this.x = this.y
    this.y = temp
  }

}

object Point extends App {

  var m = Point(3,6)
  var n = Point(1,11)

  println
  println("a)" + m.add(n))

  m.move(x = 1, y = -1)
  println("b)" + m)

  var d = m.distance(n)
  println("c)" + d)

  m.invert()
  println("d)" +m)
}