object Question_03 extends App{

  var radius:Int = 5
  val Pi = 3.14

  def sphereVolume(radius:Int, Pi:Double):Double = 4*(Pi*radius*radius*radius)/3

  println("Volume of a sphere with radius 5 = "+ sphereVolume(radius, Pi))

}