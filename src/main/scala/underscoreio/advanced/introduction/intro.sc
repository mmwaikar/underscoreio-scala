package underscoreio.advanced.introduction

import underscoreio.advanced.introduction._
import underscoreio.advanced.introduction.PrintableInstances._

object intro {
  println("Welcome to the Scala worksheet")
  val cat = Cat("Sonia", 10, "black")
  Printable.print(cat)
}