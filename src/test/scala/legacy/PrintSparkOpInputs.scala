package legacy

object PrintSparkOpInputs extends App {
  val ops = DAG.ops

  ops.foreach { op =>
    println(s"SparkOp name: ${op.name}")
    println("Inputs:")
    op.inputs.foreach(input => println(s" - $input"))
  }
}
