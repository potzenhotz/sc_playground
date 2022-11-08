package example

object Main extends App {
  //val call: String = "playground"
  val call: String = "typeclassexample"

  println(s"Call is set to: $call")

  call match {
    case "playground"       => Playground
    case "typeclassexample" => TypeClassExample
  }
}
