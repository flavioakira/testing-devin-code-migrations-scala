package subdomains.domainA

import org.apache.spark.sql.SparkSession
import platform.common_classes.{Metadata, RunConfigurations, SubdomainOp, Input}
import org.apache.spark.sql.DataFrame

object SparkOpInstance4 extends SubdomainOp {
  val randomValue: Int = 3921 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-4"
  override def inputs: Set[Input] = Set(Input(SparkOpInstance3.name)) // Reference to SparkOpInstance3 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance3 as instructed
    val _ = SparkOpInstance3.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
