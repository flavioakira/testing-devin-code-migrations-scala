package subdomains.domainA
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations, SubdomainOp, Input}
import org.apache.spark.sql.DataFrame

object SparkOpInstance5 extends SubdomainOp {
  val randomValue: Int = 2753 // Hardcoded random value

  override def name: String = "SparkOpInstance5"
  override def inputs: Set[Input] = Set(Input(SparkOpInstance4.name)) // Reference to SparkOpInstance4 as an input using object name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Using randomValue from SparkOpInstance4 as instructed
    val _ = SparkOpInstance4.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
