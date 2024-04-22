import munit.FunSuite
import legacy._
import platform.common_classes.SparkOp
import DAG.ops

class DAGConfigurationSpec extends FunSuite {
  test("DAG should have no cycles") {
    val visited = scala.collection.mutable.Set[String]()
    val recStack = scala.collection.mutable.Set[String]()

    def isCyclic(op: SparkOp): Boolean = {
      println(s"Checking for cycles at: ${op.name}")
      if (recStack.contains(op.name)) return true
      if (visited.contains(op.name)) return false

      visited.add(op.name)
      recStack.add(op.name)

      val result = op.inputs.exists { input =>
        ops.exists(_.name == input) && isCyclic(ops.find(_.name == input).get)
      }
      recStack.remove(op.name)
      result
    }

    val hasCycles = ops.exists(isCyclic)
    assert(!hasCycles, "The DAG contains cycles")
  }

  test("SparkOp inputs must exist in the DAG") {
    val opNames = ops.map(_.name).toSet
    val inputsExist = ops.forall { op =>
      op.inputs.forall { inputName =>
        val exists = opNames.contains(inputName)
        if (!exists) println(s"Missing input: $inputName for SparkOp: ${op.name}")
        exists
      }
    }

    assert(inputsExist, "All SparkOp inputs must exist in the DAG")
  }
}
