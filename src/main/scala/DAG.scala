import platform.common_classes.SubdomainOp

object DAG {
  val ops: Set[SubdomainOp] = Set(
    subdomains.domainA.SparkOpInstance1,
    subdomains.domainA.SparkOpInstance2,
    subdomains.domainA.SparkOpInstance3,
    subdomains.domainA.SparkOpInstance4,
    subdomains.domainA.SparkOpInstance5,
    subdomains.domainA.SparkOpInstance6,
    subdomains.domainA.SparkOpInstance7,
    subdomains.domainA.SparkOpInstance8
    // Remaining instances will be added once they are translated and moved to their respective domain packages
  )
}
