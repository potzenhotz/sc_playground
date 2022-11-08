package example

sealed trait Json

final case class JsonObject(get: Map[String, Json]) extends Json
final case class JsonString(get: String) extends Json
final case class JsonNumber(get: String) extends Json

final case class Person(name: String, email: String)

trait JsonWriter[A] {
  def write(value: A): Json
}

object JsonWriterInstances {
  implicit val stringWriter: JsonWriter[String] =
    new JsonWriter[String] {
      def write(value: String): Json =
        JsonString(value)
    }
  implicit val personWriter: JsonWriter[Person] =
    new JsonWriter[Person] {
      def write(value: Person): Json =
        JsonObject(
          Map(
            "name" -> JsonString(value.name),
            "email" -> JsonString(value.email)
          )
        )
    }
}

object Json {
  def toJson[A](value: A)(implicit writer: JsonWriter[A]): Json =
    writer.write(value)
}

object TypeClassExample {
  import JsonWriterInstances._
  println(Json.toJson(Person("Manfred", "manni@gmail.com")))
}
