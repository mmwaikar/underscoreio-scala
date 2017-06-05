package underscoreio.advanced.introduction

import underscoreio.advanced.introduction._

object PrintableInstances {
  implicit val stringPrintable = new Printable[String] {
    def format(a: String): String = a
  }

  implicit val intPrintable = new Printable[Int] {
    def format(a: Int): String = a.toString
  }

  implicit val catPrintable = new Printable[Cat] {
    def format(a: Cat): String = s"${a.name} is a ${a.age} year-old ${a.color} cat."
  }
}
