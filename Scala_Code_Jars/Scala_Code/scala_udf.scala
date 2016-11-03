package com.vanguard.jdbc_conn
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import com.databricks.spark.xml
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.api.java.UDF1

object scala_udf  {
  //def main(args: Array[String]){
    val udfScoreToCategory = (score: Int) => {
      score match {
        case t if t >= 80 => "A"
        case t if t >= 60 => "B"
        case t if t >= 35 => "C"
        case _ => "D"  
      }
    }
  //}
  
}