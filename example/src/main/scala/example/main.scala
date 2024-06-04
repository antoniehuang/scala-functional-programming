package example

import example.Lists

@main def run(): Unit = {
  println("Hello World!")
  println(Lists.sum(List(1,2,3,4,5)))
  println(Lists.max(List(1,2,3,4,5)))
}