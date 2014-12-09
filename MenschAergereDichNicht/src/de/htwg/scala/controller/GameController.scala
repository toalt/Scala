package de.htwg.scala.controller

import de.htwg.scala.model.Meeple
import de.htwg.scala.util.Dice
import de.htwg.scala.model.Player
import de.htwg.scala.model.PlayBoard
import de.htwg.scala.model.Meeple
import de.htwg.scala.model.Field

/**
 * @author Fabian
 */
class GameController {

  private val dice = Dice
  private var playerArray: Array[Player] = null
  private var board: PlayBoard = null
  private var currentRound: Int = 0
  private var playerAmount: Int = 4
  private var isRolled: Boolean = false
  var gameIsStarted = false
  var currentPlayer: Int = 0
  var currentChoosedMeeple: Meeple = null

  def startGame(playerNames: Array[Player]) {
    playerArray = playerNames
    board = new PlayBoard(playerArray)
    currentRound = 1
    playerAmount = playerArray.size
    gameIsStarted = true
    board.initBoard()
    println("currentplayer: " + currentPlayer)
    println("playerArray.size: " + playerArray.size)
    currentChoosedMeeple = board.checkHomeFields(playerArray(currentPlayer))(0) //Erste Figur zuweisen im Homefeld
    println("currentChoosedMeeple " + currentChoosedMeeple)
    currentPlayer = 0
  }

  def stopGame {
    gameIsStarted = false
  }

  def checkMoveable(player: Int): Boolean = {
    // TODO Prüfen ob man eine figur vom Spieler bewegen kann
    true
  }

  def nextMove {
    // TODO alle Current Values aendern, currentRound, usw
    currentRound += 1
    if (currentPlayer == 3) {
      currentPlayer = 1
    } else {
      currentPlayer += 1
    }

  }

  def roll: Int = {
    dice.getNumber()
  }

  private def checkFieldsAfterMove {
    //ALgo
  }

  def moveMeeple(toField: Field) {
    board.moveMeeple(playerArray(currentPlayer), currentChoosedMeeple, toField)
  }

  // TODO reicht moveMeeple() aus?
  private def removeMeeple(meeple: Meeple) {

  }
  //markiert das nächste Meeple
  def chooseMeeple(meeple: Meeple) {
    currentChoosedMeeple = meeple
  }

  def getMeeple(player: Player): Array[Meeple] = {
    if (player.equals(null)) return new Array[Meeple](0)
    return board.getMeeples(player)
  }

  def checkIsStartFieldFree(player: Player): Boolean = {
    true
  }
  
  def isOnHomeField(player: Player): Boolean = {
    if (player.equals(null)) false
    if (board.checkHomeFields(player).isEmpty) false
    true
  }

}