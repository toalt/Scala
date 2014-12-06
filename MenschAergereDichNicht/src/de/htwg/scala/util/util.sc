package de.htwg.scala.util

import java.util.Random
import de.htwg.scala.model.Player

object util {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Dice.getNumber()                                //> res0: Int = 5
  

  
  val a = new Player(1, "Fabian")                 //> a  : de.htwg.scala.model.Player = de.htwg.scala.model.Player@340f438e
  a.name                                          //> res1: String = Fabian
  a.id                                            //> res2: Int = 1
  a.color                                         //> res3: de.htwg.scala.util.MeepleColorEnum.Value = BLUE
  
                  
  
  
}