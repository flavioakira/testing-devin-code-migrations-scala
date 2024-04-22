package subdomains.domainA
import org.apache.spark.sql.SparkSession

import platform.common_classes.{SubdomainOp, Input}
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance9 extends SubdomainOp {
  val randomValue: Int = 4821 // Hardcoded random value

  override def name: String = "nu-br/dataset/spark-op-instance-9"
  override def inputs: Set[Input] = Set(Input(SparkOpInstance8.name)) // Reference to SparkOpInstance8 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance8 as instructed
    val _ = SparkOpInstance8.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
