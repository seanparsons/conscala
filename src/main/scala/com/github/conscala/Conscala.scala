package com.github.conscala

import jline.ConsoleReader


object Conscala extends App {
  val conscala = new Conscala()
  var keepRunning: Boolean = true
  while (keepRunning) {
    keepRunning = conscala.processLine()
  }
}

case class Conscala() {
  val consoleReader = new ConsoleReader()

  def writeOutLine(text: String): Unit = {
    consoleReader.printString(text)
    consoleReader.printNewline()
  }

  def outputValue(value: Any): Unit = {
    writeOutLine("%s = %s".format(value.asInstanceOf[AnyRef].getClass(), value))
  }

  def processLine(): Boolean = {
    println(consoleReader.readLine("%> "))
    val item = List(1, 3, 9)
    outputValue(item)
    return false
  }
}