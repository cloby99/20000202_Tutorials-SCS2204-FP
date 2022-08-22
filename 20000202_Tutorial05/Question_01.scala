object Question_01 extends App{

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

  println(prime(5))
  println(prime(8))

}
