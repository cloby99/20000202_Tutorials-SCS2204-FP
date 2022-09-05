object Question01 extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "

  def encrypt(character:Char, shift:Int, alphabet:String):Char = alphabet((alphabet.indexOf(character.toUpper) + shift)%alphabet.size)
  def decrypt(character:Char, shift:Int, alphabet:String):Char =  alphabet((alphabet.indexOf(character.toUpper) - shift + alphabet.size)%alphabet.size)

  val cipher = (method:(Char, Int, String) => Char, message:String, shift:Int, alphabet:String) => message.map(method(_, shift, alphabet))

  printf("Shift by: ")
  val numOfShifts = scala.io.StdIn.readInt ()

  printf("Message to encrypt: ")
  val message =scala.io.StdIn.readLine()

  val encryptedMessage = cipher(encrypt, message, numOfShifts, alphabet)
  val decryptedMessage = cipher(decrypt, encryptedMessage, numOfShifts, alphabet)

  printf("Encrypted message is: %s\n",encryptedMessage)
  printf("Decrypted message is: %s\n",decryptedMessage)


}