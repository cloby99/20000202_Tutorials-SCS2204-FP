object Question_01 extends App{

  println("Enter the amount of money you have deposited: Rs.");
  var deposit = scala.io.StdIn.readDouble()

  def interest(deposit:Double):Double = deposit match{
    case x if(x>0 && x<=20000) => x*.02
    case x if(x>20000 && x<=200000) => x*.04
    case x if(x>200000 && x<=2000000) => x*.035
    case x if(x>2000000) => x*.065
  }

  println("Interest Per Year: Rs." + interest(deposit));
}
