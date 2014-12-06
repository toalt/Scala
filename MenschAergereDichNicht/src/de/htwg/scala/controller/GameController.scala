package de.htwg.scala.controller

import de.htwg.scala.model.Meeple
import de.htwg.scala.util.Dice
import de.htwg.scala.model.Player
import de.htwg.scala.model.PlayBoard

/**
 * @author Fabian
 */
class GameController {
  
  private val dice = Dice
  private val playerArray = new Array[Player](4)
  private var board:PlayBoard = null
  private var currentPlayer:Int = 1
  private var currentRound:Int = 0
  private var playerAmount:Int = 4
  private var isRolled:Boolean = false
  private var gameIsStarted = false
  
  
  def startGame(playerNames:Array[Player]) {
    for (position <- 0 until playerArray.size) {
      val player = new Player(position, playerNames(position).name)
      playerArray(position) = player
    }
    board = new PlayBoard(playerArray)
    currentRound = 1
    playerAmount = playerArray.size
    gameIsStarted = true
    
  }
  
  def stopGame {
    
  }
  
  private def nextMove {
    val result = dice.getNumber()
    
  }
  
  def roll:Int = {
    dice.getNumber()
  }
  
  private def checkFieldsAfterMove {
    //ALgo
  }
  
  def moveMeeple(meeple:Meeple) {
    
  }
  
  private def removeMeeple(meeple:Meeple) {
    
  }
}