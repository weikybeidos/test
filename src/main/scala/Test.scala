/**
  * Created by bastian on 18.09.2017.
  */
object Test {
  def main(args: Array[String]): Unit = {
    println("Hello World")
var sum=0
    for (num <- 1 to 100 if num < 10)
    {
      println(num)
      sum =sum + num

    }
    println("sum"+sum)
  }

}
