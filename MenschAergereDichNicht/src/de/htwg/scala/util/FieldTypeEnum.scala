package de.htwg.scala.util

object FieldTypeEnum extends Enumeration {
    type Type = Value
    val STANDARD, GOAL_FIELD, START_FIELD, HOME_FIELD = Value
}