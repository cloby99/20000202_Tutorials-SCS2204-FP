object Question_01 extends App{
  val rNum1 = new RationalNum(1,2)
  val rNum2 = new RationalNum(4,5)
  println(rNum1.neg)
  val r = rNum1.add(rNum2)
  println(r)
}

class RationalNum(n:Int, d:Int) {
  require(denominator > 0, "Denominator must be greater than 0")
  def numerator = n
  def denominator = d

  def add(r:RationalNum) = new RationalNum(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)
  def neg = new RationalNum(-this.numerator, this.denominator)
  override def toString(): String = numerator + "/" + denominator
}