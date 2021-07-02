package example

object Playground extends Greeting with App {
  println(greeting)

  val curry1 = testCurry1("test")("test2")
  val curry2 = testCurry2("test")("test2")

  println(curry1)
  println(curry2)

  def testCurry1(input: String): String => String = { input2 =>
    s"${input} and ${input2}"
  }

  def testCurry2(input: String)(input2: String): String = {
    s"${input} and ${input2}"
  }

}

trait Greeting {
  lazy val greeting: String = "hello"
}
