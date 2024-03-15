package dev.sungkm.aps.ch2

class Problem2Test extends munit.FunSuite:

  test("count 1 medium 1 small"):
    assertEquals(Problem2.count(11, 1, 1), 25)

  test("findCases"):
    Problem2.findCases(11, 102).foreach:
      case (_, _, sum) =>
        assertEquals(sum, 115)
