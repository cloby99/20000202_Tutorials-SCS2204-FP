import scala.util.control.Breaks._

object Question_02 extends App{

  def GCD(num1:Int, num2:Int):Int = {

    num2 match{
      case 0 => num1
      case x if(x>num1) => GCD(x,num1)
      case x => GCD(x,num1%x)
    }
  }

  def prime(pNum:Int, i:Int = 2):Boolean = i match{  //i = default parameter
    case x if(x==pNum) => true
    case x if GCD(pNum,x)>1 => false
    case x => prime(pNum,i+1)
  }

  def printSeq(n:Int,i:Int){
    if(n==i) {
      break
    }

    if(prime(i,2)){
      println(i)
    }

    printSeq(n,i+1)

  }
  print("Enter a Number : ")
  var n=scala.io.StdIn.readInt()

  printSeq(n,2)

}
