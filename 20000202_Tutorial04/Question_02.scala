object Question_02 extends App{

  println("Enter an Integer number: ");
  var pattern = scala.io.StdIn.readInt()

  def patternMatching(pattern:Int):String = pattern match {
    case x if(pattern <= 0) => "Negative/Zero"
    case x if(pattern%2 == 0) => "Even Number"
    case _ => "Odd Number"
  }

  println("The pattern you have entered is: " + patternMatching(pattern));
}
