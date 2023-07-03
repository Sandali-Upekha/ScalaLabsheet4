import scala.io.StdIn.readLine
object Q3 {
  def toUpper(letter: String): Unit = {
    print("Output : " + letter.toUpperCase())
  }
  def toLower(letter: String): Unit = {
    print("Output : " + letter.toLowerCase())
  }
  def formatNames (name:String) : Unit = {
    var i=0
    print ("\nMethods \n 1. Upper case \n 2. Lower case")
    print("\n\nEnter Method : ")
    var method = readLine().toInt
      if (method==1){
        toUpper(name)
      }
      else if (method==2) {
        toLower(name)
      }
    }
  def main(args: Array[String]): Unit = {
    print ("Enter string : ")
    val str = readLine()
    //val n = str.length()
    formatNames(str)
  }

}
