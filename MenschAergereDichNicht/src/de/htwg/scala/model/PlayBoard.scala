package de.htwg.scala.model

import scala.collection.mutable
import scala.collection.mutable.ArraySeq
import de.htwg.scala.util.MeepleColorEnum
import de.htwg.scala.util.FieldTypeEnum

class PlayBoard(player:Array[Player]) {
    private val standardFields = new Array[StandardField](40)
    private val goalFields = collection.mutable.Map[MeepleColorEnum.Value, GoalField]()
    private val homeFields = collection.mutable.Map[MeepleColorEnum.Value, HomeField]()

    val playerMeeple = collection.mutable.Map[Player, Meeple]()

    def initBoard() {
      // Initialize Standardfields and StartFields
      for (position <- 0 until standardFields.size) {
        var field:StandardField = null
        if(position == 0 || position == 10|| position == 20|| position == 30) {
          field = new StandardField(position, FieldTypeEnum.START_FIELD)
        }
        else {
          field = new StandardField(position)
        }
        standardFields(position) = field
      }
      
      
      for (position <- 0 until MeepleColorEnum.maxId) {
        // Initialize GoalFields
        new GoalField(position, FieldTypeEnum.GOAL_FIELD)
        goalFields += (MeepleColorEnum(position) -> new GoalField(position, FieldTypeEnum.GOAL_FIELD))

        // Initialize Homefields
        new HomeField(position, FieldTypeEnum.HOME_FIELD)
        goalFields += (MeepleColorEnum(position) -> new GoalField(position, FieldTypeEnum.HOME_FIELD))

      }
      
      for (number <- 0 until player.size) {
        var meeple:Meeple = new Meeple(number, player(number), homeFields(player(number).color))
        playerMeeple += (player(number) -> meeple)
      }
      
      
            /*
      for (row <- 0 until size; column <- 0 until size) {
        cells(row)(column) = new Cell(row, column)
      }*/
    }

    private def buildFields() {

    }

    def setField(field: Field) {

    }

    def createMeeples() {

    }

    def moveMeeple(meeple: Meeple) {

    }

}