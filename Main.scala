import scala.io.StdIn.readLine
object Main {

    def Interest(n: Double): Unit = {
      var interest = 0.0
      if (n > 2000000) {
        interest = (6.5 * n)
      }
      else if (n > 200000) {
        interest = 3.5 * n
      }
      else if (n > 20000) {
        interest = 4 * n
      }
      else {
        interest = 2 * n
      }
      print("Amount of interest: " + interest + " Rupees")
    }

  def main(args: Array[String]): Unit = {
    print("Enter deposit amount: ")
    val m = readLine().toDouble
    Interest(m)
  }
}