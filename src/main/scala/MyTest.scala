import scala.Console.in
import scala.annotation.tailrec
import scala.collection.mutable

object MyTest {

  def convertStr(s: String): String={
    var splitted = s.toCharArray

    var mapped = splitted.map(x=>(x,1))

    println(splitted(0))
    s
  }


  def main(args: Array[String]): Unit = {
//    var s = "abcd"
//    s= s.substring(0,1)+s
//    println(s)

    println(convertStr("aabbccdd"))

  }

}
