object session{
  def sum(f: Int => Int, a: Int, b:Int): Int =
    if(a > b) 0
    else f(a) + sum(f, a + 1, b)

  def id(x: Int):Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if(x == 0) 1 else fact(x-1)

  def sumId(a: Int, b: Int) = sum(x=>x, a,b)
  def sumcube(a: Int, b: Int) = sum(x=>x*x*x, a, b)


  def tsum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else loop(a+1, acc + f(a))
    }
    loop(a,0)
  }


}