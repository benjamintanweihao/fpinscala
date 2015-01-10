object Ex_2_3 {

  // Take in a function, and return the curried version
  def curry[A,B,C](f: (A,B) => C): A => B => C = {
    a => b => f(a,b)
  }
}


