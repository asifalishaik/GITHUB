package com.vanguard.jdbc_conn
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import com.beust.jcommander._

object rdbms_conn {
//  val inst: db_conn = new db_conn()
//  inst.conn_str(1234,"123")
  object Args{
    @Parameter(names = Array("--driver", "-d"), required = true, description = "The driver class name.")
    var driverClassName = "oracle.jdbc.OracleDriver"
    @Parameter(names = Array("--sql", "-s"), required = true, description = "SQL Query or table name.")
    var sql = ""
    @Parameter(names = Array("--url", "-u"), required = true, description = "connection string URL.")
    var url = ""
    @Parameter(names = Array("--conf", "-c"), required = false, description = "connf string.")
    var conf = ""
    @Parameter(names = Array("--driver-class-path", "-dcp"), required = false, description = "driver class string.")
    var dcp = ""
    @Parameter(names = Array("--jars", "-j"), required = false, description = "Jars.")
    var jars = ""
  }
  
  def main(args: Array[String]): Unit = {
    println("args:" + args.mkString(","))
    new JCommander(Args, args.toArray:_*)
    println(Args.driverClassName)
    println(Args.sql)
    println(Args.url)
    
    val conf = new SparkConf().setAppName("Connect RDBMS").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    
    val df1 = sqlContext.read
    .format("jdbc")
    .option("url", Args.url)
    .option("dbtable", Args.sql)
    .option("driver", Args.driverClassName)
    .load()
    df1.registerTempTable("rdbms_table")
    val tcp_interactions = sqlContext.sql("""SELECT * FROM rdbms_table LIMIT 1""")
    tcp_interactions.show()
  }
}