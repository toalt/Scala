package de.htwg.scala.util

import scala.util.Random

object Dice {

  def getNumber():Int = new Random().nextInt(6)

}