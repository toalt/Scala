package de.htwg.scala.model

import scala.annotation.migration

import de.htwg.scala.util.FieldTypeEnum
import de.htwg.scala.util.MeepleColorEnum

class PlayBoard(player: Array[Player]) {
  private val standardFields = new Array[StandardField](39)
  private val goalFields = collection.mutable.Map[MeepleColorEnum.Value, GoalField]()
  private val homeFields = collection.mutable.Map[MeepleColorEnum.Value, HomeField]()

  val playerMeeple = collection.mutable.Map[Player, Meeple]()

  def initBoard() {

    buildFields()

    //TODO besser machen
    for (number <- 0 until player.size) {
      for (i <- 0 until 4) {
        var meeple: Meeple = new Meeple(number + i, player(number), homeFields(player(number).color))
        playerMeeple += (player(number) -> meeple)
      }

    }

  }

  private def buildFields() {
    // Initialize Standardfields and StartFields
    for (position <- 0 until standardFields.size) {
      var field: StandardField = null
      if (position == 0 || position == 10 || position == 20 || position == 30) {
        field = new StandardField(position, FieldTypeEnum.START_FIELD)
      } else {
        field = new StandardField(position)
      }
      standardFields(position) = field
    }

    for (position <- 0 until MeepleColorEnum.maxId) {
      for (position <- 0 until 4) {
        // Initialize GoalFields
        //new GoalField(position, FieldTypeEnum.GOAL_FIELD)
        goalFields += (MeepleColorEnum(position) -> new GoalField(position, FieldTypeEnum.GOAL_FIELD))

        // Initialize Homefields
        //new HomeField(position, FieldTypeEnum.HOME_FIELD)
        homeFields += (MeepleColorEnum(position) -> new HomeField(position, FieldTypeEnum.HOME_FIELD))
      }
    }

  }

  def setField(field: Field) {

  }

  def createMeeples() {

  }

  def moveMeeple(meeple: Meeple) {

  }

  private def getMeeples(player: Player): Array[Meeple] = {
    playerMeeple.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + playerMeeple(i))
    }

    return new Array[Meeple](4)
  }

  def checkHomeFields(player: Player): Array[Meeple] = {
    var meeples: Array[Meeple] = getMeeples(player)
    var homeMeeples: Array[Meeple] = new Array[Meeple](4)
    for (position <- 0 until meeples.size) {
      var m: Meeple = meeples(position)
      if (m.currentField.fieldType == FieldTypeEnum.HOME_FIELD) {
        // TODO besser/kompakter schreiben  mit filter oder so
        homeMeeples(position) = m
      }
    }
    return homeMeeples
  }

}