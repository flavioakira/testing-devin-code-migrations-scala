package legacy

import platform.common_classes.{SparkOp, SubdomainOp}

object DAG {
  val ops: Set[SparkOp] = Set(
    // legacy.SparkOpInstance1, // Removed reference to SparkOpInstance1 as it has been migrated to a new submodule
    // legacy.SparkOpInstance2, // Removed reference to SparkOpInstance2 as it has been migrated to a new submodule
    // SparkOpInstance3, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance4, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance5, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance6, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance7, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance10, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance11, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance8, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance12, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance13, // Now extends SubdomainOp, not included in SparkOp set
    // SparkOpInstance9, // Now extends SubdomainOp, not included in SparkOp set
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
    SparkOpInstance4, // Adapted to extend SubdomainOp
    SparkOpInstance5, // Adapted to extend SubdomainOp
    SparkOpInstance6, // Adapted to extend SubdomainOp
    SparkOpInstance7, // Adapted to extend SubdomainOp
    SparkOpInstance10, // Adapted to extend SubdomainOp
    SparkOpInstance11, // Adapted to extend SubdomainOp
    SparkOpInstance8,  // Adapted to extend SubdomainOp
    SparkOpInstance12, // Adapted to extend SubdomainOp
    SparkOpInstance13, // Moved from ops to subdomainOps as it now extends SubdomainOp
    SparkOpInstance9   // Moved from ops to subdomainOps as it now extends SubdomainOp
  )
}
