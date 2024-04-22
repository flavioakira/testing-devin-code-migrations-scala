package legacy
import org.apache.spark.sql.SparkSession

import platform.common_classes.{Metadata, RunConfigurations}
import org.apache.spark.sql.{DataFrame, SparkSession}
import nu.data.infra.api.subdomain.v1.{AutoInput, Input, SubdomainOp, Namespace}
import common_etl.RunParamsForOps
import common_etl.operator.SparkOpVisibility
import common_etl.metapod.{Attribute, MetapodAttribute}
import nu.data.infra.api.subdomain.v1.DatasetSharing

object SparkOpInstance3 extends SubdomainOp {
  val randomValue: Int = 6243 // Hardcoded random value

  override def subdomainOpName: String = "SparkOpInstance3"
  override def inputs: Set[Input] = Set(AutoInput(SparkOpInstance2.subdomainOpName)) // Reference to SparkOpInstance2 as an input using object name
  override def definition(datasets: Map[String, DataFrame], runParams: RunParamsForOps): DataFrame = {
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
  override def namespace: Namespace = Namespace.Core
  override def visibility: SparkOpVisibility = SparkOpVisibility.AllDomains
  override def sharing: DatasetSharing = DatasetSharing.Private
}
