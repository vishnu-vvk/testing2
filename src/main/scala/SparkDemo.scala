import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.dsl.expressions.{DslExpression, StringToAttributeConversionHelper}
import org.apache.spark.sql.functions.when

object SparkDemo {
  def main(args: Array[String]): Unit = {
    println("Hello")

    val spark = SparkSession.builder.appName("HelloSpark").config("spark.master","local").getOrCreate()
    val sc = SparkContext.getOrCreate()

    var cnt =0

//    def wordMap(line: String): String={
//
//    }

    val file = sc.textFile("C:\\Users\\SA033\\Desktop\\Redo Log Details.txt")

//    val words = file.map(line => line.split(" "))
//    println(words.collect.toList)

    val words = file.flatMap(line => line.split(" "))
//    println(words.collect())

    val wordKey = words.map(word => (word,1))

    val counts = wordKey.reduceByKey(_+_)

    println(counts.collect)

  }

}
