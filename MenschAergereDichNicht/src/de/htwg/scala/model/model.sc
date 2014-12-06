package de.htwg.scala.model

import de.htwg.scala.util.FieldTypeEnum
import de.htwg.scala.traits.StartField
import de.htwg.scala.util.MeepleColorEnum

object model {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val hField = new HomeField(1)                   //> hField  : de.htwg.scala.model.HomeField = de.htwg.scala.model.HomeField@7f63
                                                  //| 425a
  hField.position                                 //> res0: Int = 1
  hField.fieldType                                //> res1: de.htwg.scala.util.FieldTypeEnum.Value = HOME_FIELD

  val gField = new GoalField(2)                   //> gField  : de.htwg.scala.model.GoalField = de.htwg.scala.model.GoalField@6ea1
                                                  //| 2c19
  gField.position                                 //> res2: Int = 2
  gField.fieldType                                //> res3: de.htwg.scala.util.FieldTypeEnum.Value = GOAL_FIELD

  val sField = new StandardField(1)               //> sField  : de.htwg.scala.model.StandardField = de.htwg.scala.model.StandardFi
                                                  //| eld@6a024a67
  sField.position                                 //> res4: Int = 1
  sField.fieldType                                //> res5: de.htwg.scala.util.FieldTypeEnum.Value = STANDARD

  val a = new StandardField(1, FieldTypeEnum.START_FIELD)
                                                  //> a  : de.htwg.scala.model.StandardField = de.htwg.scala.model.StandardField@7
                                                  //| 921b0a2
  a.position                                      //> res6: Int = 1
  a.fieldType                                     //> res7: de.htwg.scala.util.FieldTypeEnum.Value = START_FIELD

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

  }



	 val newBoard:PlayBoardL = new PlayBoardL()
                                                  //> newBoard  : de.htwg.scala.model.model.PlayBoardL = de.htwg.scala.model.mode
                                                  //| l$$anonfun$main$1$PlayBoardL$1@174d20a
	newBoard.initBoard()


  
}