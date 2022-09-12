object Question_03 extends App{

  val acc1= new BankAccount("Jenny",1000501,10500.00)
  val acc2= new BankAccount("Anne",1000423,5700.00)

  acc1.transfer(acc2,3700.00)
  println("Balances After money transfer")
  println(acc1)
  println(acc2)

}

class BankAccount(id:String,n:Int,b:Double){

  var ID:String=id
  var accountNumber:Int =n
  var balance:Double =b

  def withdraw(n:Double){
    this.balance=this.balance-n
  }

  def deposit(n:Double){
    this.balance=this.balance+n
  }

  def transfer(acc:BankAccount,n:Double)={
    this.withdraw(n)
    acc.deposit(n)
  }

  override def toString = "["+ID+":"+accountNumber+":"+balance+"]"


}