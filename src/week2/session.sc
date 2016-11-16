object session{

  //XXX Version 1
  //Simple way of defining f with 3 parameters
  //def sum(f: Int => Int, a: Int, b:Int): Int =
  //  if(a > b) 0
  //  else f(a) + sum(f, a + 1, b)

  //XXX Version 2
  // Using return function
  // Sum is now a function that returns another function.
  // The returned function sumF applies the given function parameter f
  // and sums the results.
  //def sum(f: Int => Int): (Int, Int) => Int = {
  //  def sumF(a: Int, b: Int): Int =
  //    if(a > b) 0
  //    else f(a) + sumF(a+1, b)
  //  sumF
  //}

  //XXX Version 3
  // multiple Parameter Lists
  def sum(f: Int => Int)(a: Int, b: Int): Int ={
    if (a > b) 0 else f(a) + sum(f)(a+1,b)
  }


  def id(x: Int):Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if(x == 0) 1 else fact(x-1)

  def sumId(a: Int, b: Int) = sum(x=>x)(a,b)
  def sumcube(a: Int, b: Int) = sum(x=>x*x*x)(a, b)


  def tsum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else loop(a+1, acc + f(a))
    }
    loop(a,0)
  }


}