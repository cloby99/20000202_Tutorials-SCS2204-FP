object Question_03{

  def toUpper(stringPattern:String):String = stringPattern.toUpperCase()
  def toLower(stringPattern:String):String = stringPattern.toLowerCase()

  def formatNames(name:String)(x:Int*)(func:String => String):String = {
    if(x.isEmpty){
      return func(name)
    }
    var temp = ""
    var i = 0
    while(i<name.length()){
      if(x.contains(i)) temp = temp + func(name.charAt(i).toString)
      else temp = temp + name.charAt(i).toString
      i = i+1
    }
    temp
  }

  def main(args: Array[String]):Unit = {
      println(formatNames("Benny")()(toUpper))
      println(formatNames("Niroshan")(1)(toUpper))
      println(formatNames("Saman")()(toLower))
      println(formatNames("Kumara")(5)(toUpper))
  }

}

