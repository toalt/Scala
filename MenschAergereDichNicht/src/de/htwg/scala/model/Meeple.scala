package de.htwg.scala.model

import de.htwg.scala.util.FieldTypeEnum

/**
 * @author Fabian
 *
 *
 */
class Meeple(val id: Int, var player: Player, private var currentField: Field) {
  def isFieldType(_fieldType: FieldTypeEnum.Value): Boolean = currentField.fieldType == _fieldType
  def setField(fieldPlayer: Player, field: Field) = {
    if (player.equals(fieldPlayer)) {
      currentField = field
    }
  }
  /* TODO! Setter und getter anders machen - im Scala style*/
  def getField(fieldPlayer: Player) = {
    if (fieldPlayer.id == player.id) {
      currentField
    }
    null
  }
}