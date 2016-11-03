package com.vanguard.jdbc_conn
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.SaveMode
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions._
import com.beust.jcommander._
//object db_conn {
//class db_conn {
//  def conn_str( num : Any , driver: String){
//    println(num);
//    println(driver);
//  }
//}
//  object db_conn1 {
//  def main(args: Array[String]): Unit = {
//   
//    val inst: db_conn = new db_conn()
//    inst.conn_str(1234,"123")
//    inst.conn_str(12,"123")
//  }
//}
object Args {
  @Parameter(names = Array("--driver1", "-d1"), required = true, description = "The driver class name.") //var driverClassName = "oracle.jdbc.OracleDriver"
  var driverClassName1 = ""
  @Parameter(names = Array("--sql1", "-s1"), required = true, description = "SQL Query or table name.")
  var sql1 = ""
  @Parameter(names = Array("--url1", "-u1"), required = true, description = "connection string URL.")
  var url1 = ""
  

  @Parameter(names = Array("--driver2", "-d2"), required = true, description = "The driver class name.") //var driverClassName = "oracle.jdbc.OracleDriver"
  var driverClassName2 = ""
  @Parameter(names = Array("--sql2", "-s2"), required = true, description = "SQL Query or table name.")
  var sql2 = ""
  @Parameter(names = Array("--url2", "-u2"), required = true, description = "connection string URL.")
  var url2 = ""
  
  @Parameter(names = Array("--conf", "-c"), required = false, description = "connf string.")
  var conf = ""
  @Parameter(names = Array("--driver-class-path", "-dcp"), required = false, description = "driver class string.")
  var dcp = ""
  @Parameter(names = Array("--jars", "-j"), required = false, description = "Jars.")
  var jars = ""
  @Parameter(names = Array("--join_query", "-jq"), required = false, description = "Jars.")
  var jq = ""
  @Parameter(names = Array("--save_path", "-sp"), required = false, description = "Jars.")
  var sp = ""
}

object db_conn {
  def main(args: Array[String]): Unit = {

    println("args:" + args.mkString(","))
    new JCommander(Args, args.toArray: _*)
    println(Args.driverClassName1)
    println(Args.sql1)
    println(Args.url1)

    //val conf = new SparkConf().setAppName("Connect RDBMS").setMaster("yarn-client")
    val conf = new SparkConf().setAppName("Connect RDBMS").setMaster("yarn-client")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._

    val df1 = sqlContext.read
      .format("jdbc")
      .option("url", Args.url1)
      .option("dbtable", Args.sql1)
      .option("driver", Args.driverClassName1)
      .load()

    val df2 = sqlContext.read
      .format("jdbc")
      .option("url", Args.url2)
      .option("dbtable", Args.sql2)
      .option("driver", Args.driverClassName2)
      .load()

    df1.registerTempTable("table1")
    df2.registerTempTable("table2")

    val join_result = sqlContext.sql(Args.jq)

    //join_result.write.format("com.databricks.spark.avro").save("hdfs://nameservice1/work/dmr/data/people_avro")
    join_result.write.format("com.databricks.spark.avro").mode(SaveMode.Overwrite).save(Args.sp)

  }
}