package example

object Main extends App {
  val call: String = "playground"

  println(s"Call is set to: $call")

  call match {
    case "playground" => Playground
  }
}
