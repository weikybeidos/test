/**
  * Created by bastian on 18.09.2017.
  */
object Test {

  def main(args: Array[String]): Unit = {
    println(stringfunct())
    println(stringfunct1("Hello Markus"))
  }

  def stringfunct() :String={
  val str ="Hello World"
  return str
  }

  def stringfunct1(neuerName:String) :String={
    return neuerName+"!"
  }


}
