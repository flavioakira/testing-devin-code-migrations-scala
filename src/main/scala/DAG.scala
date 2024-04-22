import platform.common_classes.SubdomainOp
import subdomains.domainA.SparkOpInstance1
import subdomains.domainA.SparkOpInstance2
import subdomains.domainA.SparkOpInstance3
import subdomains.domainA.SparkOpInstance4
import subdomains.domainA.SparkOpInstance5
import subdomains.domainA.SparkOpInstance6
import subdomains.domainA.SparkOpInstance7
import subdomains.domainA.SparkOpInstance8

object DAG {
  val ops: Set[SubdomainOp] = Set(
    SparkOpInstance1,
    SparkOpInstance2,
    SparkOpInstance3,
    SparkOpInstance4,
    SparkOpInstance5,
    SparkOpInstance6,
    SparkOpInstance7,
    SparkOpInstance8
    // Remaining instances will be added once they are translated and moved to their respective domain packages
  )
}
