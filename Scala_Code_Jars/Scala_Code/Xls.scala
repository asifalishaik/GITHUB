package com.vanguard.jdbc_conn
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import com.databricks.spark.xml
object Xls {
  def main(args: Array[String]){
    
    val conf = new SparkConf().setAppName("Connect Jdbc").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read.format("com.databricks.spark.xml").option("rootTag", "book")
    .load(args(0))
    
    val selected_data = df.select("author", "@id")
    selected_data.show()
    
  }
}