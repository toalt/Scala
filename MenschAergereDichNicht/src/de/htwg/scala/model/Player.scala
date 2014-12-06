package de.htwg.scala.model

import de.htwg.scala.util.MeepleColorEnum

class Player(val id: Int, val name: String) 
{
  var color = MeepleColorEnum.BLUE
  id match {
    case 1 => color = MeepleColorEnum.BLUE
    case 2 => color = MeepleColorEnum.GREEN
    case 3 => color = MeepleColorEnum.RED
    case 4 => color = MeepleColorEnum.YELLOW
    case _ => 
  }
  
  
}