package de.htwg.scala.model

import de.htwg.scala.util.FieldTypeEnum

abstract class Field(val position: Int, var fieldType: FieldTypeEnum.Value) {

  var taken: Boolean = false
}