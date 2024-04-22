import org.apache.spark.sql.{DataFrame, SparkSession}

trait SparkOp {
  def query(spark: SparkSession): DataFrame
}

class SparkOpInstance21 extends SparkOp {
  override def query(spark: SparkSession): DataFrame = {
    // For demonstration purposes, we are using hardcoded values.
    // In a real-world scenario, this should call the translation API to get the translations.
    val sentences = Seq(
      ("Carro", "Portuguese-Spanish", "Coche"),
      ("Motor", "Portuguese-Spanish", "Motor"),
      ("Velocidade", "Portuguese-Spanish", "Velocidad"),
      ("Viagem", "Portuguese-Spanish", "Viaje"),
      ("Conduzir", "Portuguese-Spanish", "Conducir")
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
