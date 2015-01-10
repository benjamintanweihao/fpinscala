object MyModule {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc1: Int, acc2: Int): Int = 
      if (n == 0) acc1
      else go(n-1, acc2, acc1+acc2)
    go(n, 0, 1)
  }

  def main(args: Array[String]): Unit =  {
    println(factorial(10))
  }
}
