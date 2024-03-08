package dev.sungkm.aps.ch2

class Problem1Test extends munit.FunSuite:

  test("case 1 by 1"):
    assertEquals(Problem1.solve(1, 1), 0)

  test("case 2 by 1"):
    assertEquals(Problem1.solve(2, 1), 1)

  test("case 2 by 2"):
    assertEquals(Problem1.solve(2, 2), 3)

  test("case 4 by 3"):
    assertEquals(Problem1.solve(4, 3), 11)
