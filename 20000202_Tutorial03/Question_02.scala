object Question_02 extends App{

  var celTemp:Int = 35

  def convertTemp(celTemp:Int):Double = (celTemp*1.8) + 32

  println("35C temperature into Fahrenheit = "+ convertTemp(celTemp) + "F")

}
