import scala.util.control.Breaks._
object Question_06 extends App{

  def Fibonacci(num:Int):Int={

    if(num<=1)
      num
    else
      Fibonacci(num-1)+Fibonacci(num-2)

  }

  def printFibonacci(n:Int,i:Int){

    if(n==i)
      break
    else
      println(Fibonacci(i))
    printFibonacci(n,i+1)

  }

  print("Enter a Number : ")

  var n=scala.io.StdIn.readInt()

  printFibonacci(n,0)

}
