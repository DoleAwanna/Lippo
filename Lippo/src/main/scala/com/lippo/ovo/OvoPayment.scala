package com.lippo.ovo
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object OvoPayment {
  
  
  
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("Lippo-ovo")
    val sc = new SparkContext(sparkConf)
  }
}