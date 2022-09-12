object Question_04 extends App {

  val acc1= new BankAcc("Jenny",1000501,10500.00)
  val acc2= new BankAcc("Anne",1000423,5700.00)
  val acc3= new BankAcc("Pietro",1000101,1890.00)
  val acc4= new BankAcc("Monica",1000903,-3000.00)

  var bank:List[BankAcc]=List(acc1,acc2,acc3,acc4)

  val negBalance = bank.filter(a=>a.balance<0)
  val totBalance = bank.map((a)=>(a.balance)).reduce((a,b)=>(a+b))
  val interest = (b:List[BankAcc])=>b.map((a) => (a.ID,a.accNumber,if(a.balance>0)  (a.balance+(a.balance*0.5)) else (a.balance+(a.balance*0.1)) ))

  print("Accounts with negative balance: ")
  println(negBalance)
  print("\nSum of all account balances: ")
  println(totBalance)
  print("\nFinal balances with interest: ")
  println(interest(bank))

}

class BankAcc(id:String,n:Int,b:Double){

  var ID:String=id
  var accNumber:Int =n
  var balance:Double =b

  override def toString = "["+ID+":"+accNumber+":"+balance+"]"


}