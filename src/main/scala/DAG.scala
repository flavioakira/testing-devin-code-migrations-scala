package legacy

import platform.common_classes.{SparkOp, SubdomainOp}

object DAG {
  val ops: Set[SparkOp] = Set(
    // legacy.SparkOpInstance1, // Removed reference to SparkOpInstance1 as it has been migrated to a new submodule
    // legacy.SparkOpInstance2, // Removed reference to SparkOpInstance2 as it has been migrated to a new submodule
    // SparkOpInstance3, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance4, // Now extends SubdomainOp, not included in SparkOp set
    SparkOpInstance5,
    SparkOpInstance6,
    SparkOpInstance7,
    SparkOpInstance8,
    SparkOpInstance9,
    SparkOpInstance10,
    SparkOpInstance11,
    SparkOpInstance12,
    SparkOpInstance13,
    SparkOpInstance14,
    SparkOpInstance15,
    SparkOpInstance16,
    SparkOpInstance17,
    SparkOpInstance18,
    SparkOpInstance19,
    SparkOpInstance20
  )

  val subdomainOps: Set[SubdomainOp] = Set(
    // Include instances of SubdomainOp here
    SparkOpInstance3, // Adapted to extend SubdomainOp
    SparkOpInstance4  // Adapted to extend SubdomainOp
  )
}
