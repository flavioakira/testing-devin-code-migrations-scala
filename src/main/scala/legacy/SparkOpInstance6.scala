package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations}
import org.apache.spark.sql.{DataFrame, SparkSession}
import nu.data.infra.api.subdomain.v1.{AutoInput, Input, SubdomainOp, Namespace}
import common_etl.RunParamsForOps
import common_etl.operator.SparkOpVisibility
import common_etl.metapod.{Attribute, MetapodAttribute}
import nu.data.infra.api.subdomain.v1.DatasetSharing

object SparkOpInstance6 extends SubdomainOp {
  val randomValue: Int = 4629 // Hardcoded random value

  override def subdomainOpName: String = "spark-op-instance-6"
  override def inputs: Set[Input] = Set(AutoInput(SparkOpInstance5.subdomainOpName)) // Reference to SparkOpInstance5 as an input using object name
  override def definition(datasets: Map[String, DataFrame], runParams: RunParamsForOps): DataFrame = {
    // Using randomValue from SparkOpInstance5 as instructed
    val _ = SparkOpInstance5.randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    new RunConfigurations()
  }
  override def namespace: Namespace = Namespace.Legacy
  override def visibility: SparkOpVisibility = SparkOpVisibility.AllDomains
  override def sharing: DatasetSharing = DatasetSharing.Private
}
