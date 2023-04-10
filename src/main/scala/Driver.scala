import scala.io.StdIn.readLine

import org.apache.spark.SparkContext;
import org.apache.spark.SparkConf;
import org.apache.spark.rdd.RDD;

object Driver {


    def main(args: Array[String]): Unit = {

        val conf: SparkConf = new SparkConf()
          .setAppName("Heart Failure")
          .setMaster("local");

        val sc: SparkContext = new SparkContext(conf);

        val rdd: RDD[String] = sc.textFile("resources/heart.csv");

        println(rdd.getClass);

        println("Collected CSV file")


        println("\n\n\n");


    }
}
