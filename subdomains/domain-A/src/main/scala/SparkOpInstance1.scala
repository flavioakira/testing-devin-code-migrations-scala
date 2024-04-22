package subdomains.domainA

import org.apache.spark.sql.SparkSession
import platform.common_classes.{Metadata, RunConfigurations, SubdomainOp, Input}
import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkOpInstance1 extends SubdomainOp {
  val randomValue: Int = 7345 // Hardcoded random value

  override def name: String = "SparkOpInstance1"
  override def inputs: Set[Input] = Set() // No inputs, making it a root
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // This instance does not use a randomValue from another instance
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    // Mock implementation for metadata
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    // Mock implementation for runConfigurations
    new RunConfigurations()
  }
}
