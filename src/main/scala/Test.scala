/**
  * Created by bastian on 18.09.2017.
  */
object Test {

  def main(args: Array[String]): Unit = {
    println(stringfunct())

    println(stringfunct1("Hello Markus"))
    println(concat())
    //ich kommentiere hier mal wild rum

  }

  def stringfunct() :String={
  val str ="Hello World. "
  return str
  }


  def stringfunct1(neuerName:String) :String={
    return neuerName+"!"
  }



  def vamf(): Int={

    val a = 5
    val b = 37
    var c = a + b
    return c

  }

  def concat() :String={
    val str2= stringfunct() + "I'm feelin fine!"
    return str2
  }

}
