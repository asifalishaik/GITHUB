package com.vanguard.jdbc_conn

import org.apache.spark._
import org.apache.spark.sql._

object oracle_connection {
  def main(args: Array[String]){
    
    val conf = new SparkConf().setAppName("Connect Jdbc").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val df1 = sqlContext.read.format("jdbc").option("url", "jdbc:oracle:thin:user/password@ldapstring").option("dbtable", "(SELECT * FROM SIEBEL.S_ASSET)abc").load()
    df1.registerTempTable("interactions")
    val tcp_interactions = sqlContext.sql("""SELECT * FROM interactions LIMIT 1""")
    tcp_interactions.show()
  }
  
}