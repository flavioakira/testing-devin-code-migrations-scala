package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.SparkOp
import org.apache.spark.sql.DataFrame
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations
import platform.common_classes.Metadata
import platform.common_classes.RunConfigurations

object SparkOpInstance17 extends SparkOp {
  override def name: String = "SparkOpInstance17"
  override def inputs: Set[String] = Set("input1", "input2")
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}