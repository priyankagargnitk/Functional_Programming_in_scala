package funsets

object Main extends App {
  import FunSets._
  printSet((i : Int) => i > 0)
  println(contains(singletonSet(1), 1))
}
