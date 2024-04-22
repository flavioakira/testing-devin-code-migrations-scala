package subdomains.domainA

import org.apache.spark.sql.SparkSession
import platform.common_classes.{Metadata, RunConfigurations, SubdomainOp, Input}
import org.apache.spark.sql.DataFrame

object SparkOpInstance3 extends SubdomainOp {
  val randomValue: Int = 6243 // Hardcoded random value

  override def name: String = "SparkOpInstance3"
  override def inputs: Set[Input] = Set(Input(SparkOpInstance2.name)) // Reference to SparkOpInstance2 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance2 as instructed
    val _ = SparkOpInstance2.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
