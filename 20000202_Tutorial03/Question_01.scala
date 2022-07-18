object Question_01 extends App{

  var radius:Int = 5
  var Pi = 3.14

  def areaOfDisk(radius:Int, Pi:Double):Double = Pi*radius*radius

  println("Area of a disk with radius 5 = "+ areaOfDisk(radius,Pi))

}
