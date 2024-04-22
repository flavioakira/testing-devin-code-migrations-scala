import org.apache.spark.sql.{DataFrame, SparkSession}

trait SparkOp {
  def query(spark: SparkSession): DataFrame
}

class SparkOpInstance22 extends SparkOp {
  override def query(spark: SparkSession): DataFrame = {
    // For demonstration purposes, we are using hardcoded values.
    // In a real-world scenario, this should call the translation API to get the translations.
    val sentences = Seq(
      ("Brot", "German-Italian", "Pane"),
      ("Käse", "German-Italian", "Formaggio"),
      ("Wurst", "German-Italian", "Salsiccia"),
      ("Apfel", "German-Italian", "Mela"),
      ("Kuchen", "German-Italian", "Torta")
    )

    val schema = List(
      "Original_Sentence",
      "Language_Pair",
      "Translated_Sentence"
    )

    val rdd = spark.sparkContext.parallelize(sentences)
    val df = spark.createDataFrame(rdd).toDF(schema: _*)

    df
  }
}
