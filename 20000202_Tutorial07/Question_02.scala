object Question_02 extends App{
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  val rNum = x-y-z

  println(rNum)
}

class Rational(n:Int, d:Int) {
  require(denominator > 0, "Denominator must be greater than 0")
  def numerator = n
  def denominator = d
  def neg = new Rational(-this.numerator, this.denominator)
  def add(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator, this.denominator*r.denominator)
  def -(r:Rational) = this.add(r.neg)

  override def toString(): String = numerator + "/" + denominator

}
