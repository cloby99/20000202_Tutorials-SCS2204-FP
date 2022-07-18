object Question_04 extends App{

  var coverPrice:Double = 24.95
  var shipCost1:Int = 3
  var shipCostAdd:Double = 0.75
  var copies:Int = 60

  def discount(coverPrice:Double):Double = coverPrice*0.4
  def totCoverPrice(copies:Int):Double = copies*(coverPrice - discount(coverPrice))
  def shipPrice(shipCost1:Int, shipCostAdd:Double):Double = shipCost1 + (shipCostAdd*(copies-50))

  def wholesaleCost():Double = totCoverPrice(copies) + shipPrice(shipCost1,shipCostAdd)

  println("Total wholesale cost for 60 copies: Rs." + wholesaleCost())

}
