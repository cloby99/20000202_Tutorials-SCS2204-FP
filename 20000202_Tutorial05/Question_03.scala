object Question_03 extends App{

  def sum(num:Int):Int={

    if(num==0)
      0
    else
      num+sum(num-1)

  }

  print("Enter a Number : ")
  var x=scala.io.StdIn.readInt()

  println(sum(x))

}
