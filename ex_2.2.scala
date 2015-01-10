object Ex_2_2 {

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    if (as.length == 1) return true
    else ordered(as(0), as(1)) && isSorted(as.tail, ordered) 
  }

  // def main(args: Array[String]): Unit =  {
  //   var trivial = Array(1)
  //   println(isSorted(trivial, (x: Int, y: Int) => x < y))
  //   val sorted = Array(1, 2, 3, 4)
  //   println(isSorted(sorted, (x: Int, y: Int) => x < y))
  //   val not_reverse_sorted = Array(1, 2, 3, 4)
  //   println(isSorted(not_reverse_sorted, (x: Int, y: Int) => x > y))
  //   val unsorted = Array(1, 2, 0, 4)
  //   println(isSorted(unsorted, (x: Int, y: Int) => x < y))
  // }
}

