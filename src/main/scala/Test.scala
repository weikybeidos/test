/**
  * Created by bastian on 18.09.2017.
  */
object Test {

  def main(args: Array[String]): Unit = {
    println(stringfunct())
    println(concat())
    //ich kommentiere hier mal wild rum
  }

  def stringfunct() :String={
  val str ="Hello World. "
  return str
  }
  def concat() :String={
    val str2= stringfunct() + "I'm feelin fine!"
    return str2
  }
}
