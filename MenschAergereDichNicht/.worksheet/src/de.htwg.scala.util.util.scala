package de.htwg.scala.util

import java.util.Random
import de.htwg.scala.model.Player

object util {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(145); 
  println("Welcome to the Scala worksheet");$skip(19); val res$0 = 
  Dice.getNumber();System.out.println("""res0: Int = """ + $show(res$0));$skip(42); 
  

  
  val a = new Player(1, "Fabian");System.out.println("""a  : de.htwg.scala.model.Player = """ + $show(a ));$skip(9); val res$1 = 
  a.name;System.out.println("""res1: String = """ + $show(res$1));$skip(7); val res$2 = 
  a.id;System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
  a.color;System.out.println("""res3: de.htwg.scala.util.MeepleColorEnum.Value = """ + $show(res$3))}
  
                  
  
  
}
