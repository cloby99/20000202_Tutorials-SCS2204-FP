object Question_05 extends App{

  def evenAddition(num:Int):Int={
    if(num%2==0){
      if(num==0)
        0
      else
        num+evenAddition(num-1)
    }
    else{
      evenAddition(num-1)
    }

  }



  print("Enter a Number : ")
  var n=scala.io.StdIn.readInt()

  println(evenAddition(n))

}
