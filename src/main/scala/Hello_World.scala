object Hello_World extends App {
  println("Hello, world")
  val i: Int = 1
  val result = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "not 1 or 2"
  }
  println(result)
}
