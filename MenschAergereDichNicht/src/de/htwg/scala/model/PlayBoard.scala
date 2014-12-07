package de.htwg.scala.model

import scala.annotation.migration

import de.htwg.scala.util.FieldTypeEnum
import de.htwg.scala.util.MeepleColorEnum

class PlayBoard(player: Array[Player]) {
  private val standardFields = new Array[StandardField](40)
  private val goalFields = collection.mutable.Map[MeepleColorEnum.Value, Array[Field]]()
  private val homeFields = collection.mutable.Map[MeepleColorEnum.Value, Array[Field]]()

  val playerMeeple = collection.mutable.Map[Player, Meeple]()

  def initBoard() {

    buildFields()

    //TODO besser machen
    for (numberPlayer <- 0 until player.size) {
      for (numberMeeple <- 0 until 4) {
        var meeple: Meeple = new Meeple(player(numberPlayer).id, player(numberPlayer), homeFields(player(numberPlayer).color)(numberMeeple))
        playerMeeple += (player(numberPlayer) -> meeple)
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

    for (i <- 0 until MeepleColorEnum.maxId) {
      val gfArray = new Array[Field](4)
      val hfArray = new Array[Field](4)
      for (j <- 0 until 4) {
        // Initialize GoalFields
        val gf = new GoalField(i+j, FieldTypeEnum.GOAL_FIELD)
        gfArray(j) = gf
        // Initialize Homefields
        val hf = new HomeField(i+j, FieldTypeEnum.HOME_FIELD)
        hf.taken = true
        hfArray(j) = hf
      }
      goalFields += (MeepleColorEnum(i) -> gfArray)
      homeFields += (MeepleColorEnum(i) -> hfArray)
    }

  }

  def setField(newField: Field): Boolean = {
    /*if (newField.equals(null)) return false
    newField.fieldType match {
      case FieldTypeEnum.HOME_FIELD =>
      case FieldTypeEnum.GOAL_FIELD=>
      case FieldTypeEnum.STANDARD =>
    }*/
    true
  }

  def createMeeples() {

  }

  def moveMeeple(player: Player, meeple: Meeple, toField: Field) {
    // TODO NEXT: 
    var oldField: Field = meeple.getField(player)
    oldField.taken = false
    toField.taken = true
    
    oldField.fieldType match {
      case FieldTypeEnum.HOME_FIELD => {
        homeFields(player.color)(oldField.position) = oldField
      }
      case FieldTypeEnum.GOAL_FIELD => {
        goalFields(player.color)(oldField.position) = oldField
      }

    }
    meeple.setField(player, toField)

    //var ms: Array[Meeple] = playerMeeple(player)
    //println(playerMeeple)

  }

  def getMeeples(player: Player): Array[Meeple] = {
    val meeples = new Array[Meeple](4)
    var index: Int = 0
    playerMeeple.keys.foreach { i =>
      //println("Key: " + i)
      meeples(index) = playerMeeple(i)
      index += 1
    }

    return meeples
  }

  // TODO muss das in den Controller?
  def checkHomeFields(player: Player): Array[Meeple] = {
    var meeples: Array[Meeple] = getMeeples(player)
    var homeMeeples: Array[Meeple] = new Array[Meeple](4)
    for (position <- 0 until meeples.size) {
      var m: Meeple = meeples(position)
      if (m.isFieldType(FieldTypeEnum.HOME_FIELD)) {
        // TODO besser/kompakter schreiben  mit filter oder so
        homeMeeples(position) = m
      }
    }
    return homeMeeples
  }

  def checkStartFieldIsTaken(color: MeepleColorEnum.Value): Boolean = {

    true
  }

}