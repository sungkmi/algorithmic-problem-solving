package dev.sungkm.aps.ch2

object Problem2:

  def count(original: Int, medium: Int, small: Int): Int =
    original + 7 * (medium + small)

  def findCases(original: Int, target: Int): Seq[(Int, Int, Int)] =
    for
      medium <- 0 to (target - original) / 7
      small <- 0 to (target - original) / 7
      if count(original, medium, small) == target
    yield (medium, small, (original + medium * 8 + small * 8))
