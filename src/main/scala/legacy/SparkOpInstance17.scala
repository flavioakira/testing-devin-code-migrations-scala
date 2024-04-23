package legacy
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import platform.common_classes.{SparkOp, Metadata, RunConfigurations}

object SparkOpInstance17 extends SparkOp {
  val randomValue: Int = 1987 // Hardcoded random value

  override def name: String = "nu-br/dataset/spark-op-instance-17"
  override def inputs: Set[String] = Set("dataset/spark-op-instance-16") // Updated to comply with SubdomainOp trait
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = new Metadata()
  override def runConfigurations: RunConfigurations = new RunConfigurations()
}
