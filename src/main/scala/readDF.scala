import org.apache.spark.sql.SparkSession

object readDF {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("readData").config("spark.master","local").getOrCreate()

    val sample = spark.read.format("text")
  }

}
