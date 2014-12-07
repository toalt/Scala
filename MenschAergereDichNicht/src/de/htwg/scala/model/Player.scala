package de.htwg.scala.model

import de.htwg.scala.util.MeepleColorEnum

class Player(val id: Int, val name: String) {
  var color = MeepleColorEnum.BLUE
  var startField: Int = 0
  id match {
    case 1 => {
      color = MeepleColorEnum.BLUE
      startField = 0
    }
    case 2 => {
      color = MeepleColorEnum.GREEN
      startField = 10
    }
    case 3 => {
      color = MeepleColorEnum.RED
      startField = 30
    }
    case 4 => {
      color = MeepleColorEnum.YELLOW
      startField = 40
    }
    case _ =>
  }

}