package de.htwg.scala.model

import de.htwg.scala.util.FieldTypeEnum
import de.htwg.scala.traits.StartField
import de.htwg.scala.util.MeepleColorEnum

object model {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(209); 
  println("Welcome to the Scala worksheet");$skip(32); 
  val hField = new HomeField(1);System.out.println("""hField  : de.htwg.scala.model.HomeField = """ + $show(hField ));$skip(18); val res$0 = 
  hField.position;System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
  hField.fieldType;System.out.println("""res1: de.htwg.scala.util.FieldTypeEnum.Value = """ + $show(res$1));$skip(33); 

  val gField = new GoalField(2);System.out.println("""gField  : de.htwg.scala.model.GoalField = """ + $show(gField ));$skip(18); val res$2 = 
  gField.position;System.out.println("""res2: Int = """ + $show(res$2));$skip(19); val res$3 = 
  gField.fieldType;System.out.println("""res3: de.htwg.scala.util.FieldTypeEnum.Value = """ + $show(res$3));$skip(37); 

  val sField = new StandardField(1);System.out.println("""sField  : de.htwg.scala.model.StandardField = """ + $show(sField ));$skip(18); val res$4 = 
  sField.position;System.out.println("""res4: Int = """ + $show(res$4));$skip(19); val res$5 = 
  sField.fieldType;System.out.println("""res5: de.htwg.scala.util.FieldTypeEnum.Value = """ + $show(res$5));$skip(59); 

  val a = new StandardField(1, FieldTypeEnum.START_FIELD);System.out.println("""a  : de.htwg.scala.model.StandardField = """ + $show(a ));$skip(13); val res$6 = 
  a.position;System.out.println("""res6: Int = """ + $show(res$6));$skip(14); val res$7 = 
  a.fieldType

  class PlayBoardL {
    val standardFields = new Array[StandardField](40)
    val goalFields = collection.mutable.Map[MeepleColorEnum.Value, GoalField]()
    val homeFields = collection.mutable.Map[MeepleColorEnum.Value, HomeField]()

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
      
      playerMeeple
      			/*
      for (row <- 0 until size; column <- 0 until size) {
        cells(row)(column) = new Cell(row, column)
      }*/
    }

    def buildFields() {

    }

    def setField(field: Field) {

    }

    def createMeeples() {

    }

    def moveMeeple(meeple: Meeple) {

    }

  };System.out.println("""res7: de.htwg.scala.util.FieldTypeEnum.Value = """ + $show(res$7));$skip(1541); 



	 val newBoard:PlayBoardL = new PlayBoardL();System.out.println("""newBoard  : de.htwg.scala.model.model.PlayBoardL = """ + $show(newBoard ));$skip(22); 
	newBoard.initBoard()}


  
}
