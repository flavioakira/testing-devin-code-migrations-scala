import org.apache.spark.sql.{DataFrame, SparkSession}

trait SparkOp {
  def query(spark: SparkSession): DataFrame
}

class SparkOpInstance23 extends SparkOp {
  override def query(spark: SparkSession): DataFrame = {
    // For demonstration purposes, we are using hardcoded values.
    // In a real-world scenario, this should call the translation API to get the translations.
    val sentences = Seq(
      ("Music", "English-French", "Musique"),
      ("Melody", "English-French", "Mélodie"),
      ("Rhythm", "English-French", "Rythme"),
      ("Harmony", "English-French", "Harmonie"),
      ("Note", "English-French", "Note")
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
