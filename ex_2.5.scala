object Ex_2_5 {

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }

  def main(args: Array[String]): Unit = {
    val f = (x: Double) => math.Pi / 2 - x
    val cos1 = f andThen math.sin
    val cos2 = compose(math.sin, f)
    println(cos1(10))
    println(cos2(10))
  }
}
