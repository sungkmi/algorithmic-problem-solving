package dev.sungkm.aps.ch2

object Problem1:

  val memo: collection.mutable.Map[(Int, Int), Int] =
    collection.mutable.Map.empty

  def solve(x: Int, y: Int): Int =
    if x < y then solve(y, x)
    else if x <= 1 then 0
    else if y <= 1 then x - 1
    else if memo.contains((x, y)) then memo((x, y))
    else
      val divX = (1 to x - 1)
        .map: i =>
          solve(i, y) + solve(x - i, y)
        .min
      val divY = (1 to y - 1)
        .map: j =>
          solve(x, j) + solve(x, y - j)
        .min
      val ans = 1 + (divX min divY)
      memo += ((x, y)) -> ans
//      println(s"===> Solving ($x, $y): $ans")
//      println(s"=====> Div X: $divX")
//      println(s"=====> Div Y: $divY")
      ans
