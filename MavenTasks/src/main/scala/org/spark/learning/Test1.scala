package org.spark.learning

import org.apache.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j

object Test1 {
  def main(args:Array[String]){
    
    //Logger.getLogger("org").setLevel(Level.ERROR)
    
    val conf = new SparkConf().setAppName("Test1SparkApp").setMaster("local[*]")
    val sc = new SparkContext(conf)
    //val rl = sc.range(1,2)
    //rl.collect.foreach(println)
    println("Hello World")
    sc.stop()    
  }
}