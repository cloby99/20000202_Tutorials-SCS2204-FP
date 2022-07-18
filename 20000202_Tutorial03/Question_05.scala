object Question_05 extends App{

  var easyPace:Int = 8
  var tempoPace:Int = 7

  def easyPaceTime(easyPace:Int):Double = (2+2)*easyPace
  def tempoPaceTime(tempoPace:Int):Double = 3*tempoPace

  def totTime():Double = (easyPaceTime(easyPace)+tempoPaceTime(tempoPace))

  println("Total running time: " + totTime() + " minutes")

}
