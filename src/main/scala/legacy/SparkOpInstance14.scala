package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.SparkOp
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance14 extends SparkOp {
  val randomValue: Int = 4621 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-14"
  override def inputs: Set[String] = Set("dataset/spark-op-instance-13") // Replaced reference to SparkOpInstance13 with hardcoded name
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Removed usage of SparkOpInstance13.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
