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
  private var playerArray:Array[Player] = null
  private var board:PlayBoard = null
  private var currentRound:Int = 0
  private var playerAmount:Int = 4
  private var isRolled:Boolean = false
  var gameIsStarted = false
  var currentPlayer:Int = 1
  
  def startGame(playerNames:Array[Player]) {
    playerArray = playerNames
    /*for (position <- 0 until playerArray.size) {
      val player = new Player(position, playerNames(position).name)
      playerArray(position) = player
    }*/
    board = new PlayBoard(playerArray)
    currentRound = 1
    playerAmount = playerArray.size
    gameIsStarted = true
    board.initBoard()
  }
  
  def stopGame {
    gameIsStarted = false
  }
  
  def checkMoveable(player:Int):Boolean = {
    // TODO Prüfen ob man eine figur vom Spieler bewegen kann
    true
  }
  
  private def nextMove {
    
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
  
  def getMeeple() {
    
  }
  
  def isOnHomeField(player: Player): Boolean = {
  //  board.
    board.checkHomeFields(player)
    true
  }
  
}