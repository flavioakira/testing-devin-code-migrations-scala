package legacy
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import platform.common_classes.{SubdomainOp, Metadata, RunConfigurations, Input}

object SparkOpInstance14 extends SubdomainOp {
  val randomValue: Int = 4621 // Hardcoded random value

  override def name: String = "dataset/spark-op-instance-14"
  override def inputs: Set[Input] = Set() // Updated to comply with SubdomainOp trait
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Note: Direct reference to SparkOpInstance13 removed due to submodule isolation rules
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
}
