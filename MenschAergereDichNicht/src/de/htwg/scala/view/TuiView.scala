package de.htwg.scala.view

import de.htwg.scala.controller.GameController
import de.htwg.scala.model.Player
import scala.io.Source._
import de.htwg.scala.model.Player

/**
 * @author Fabian
 */
class TuiView(controller: GameController) {

  val playboardFile: String = fromFile("resources/playboard.txt").mkString
  var actualField: String = playboardFile
  var state: String = "Init"
  var players: Array[Player] = null

  def showIntro() {
    println("Mensch ärgere dich nicht!")
    println("Version 1.0")
    println("Fabian Binder und Tobias Alt")
    println("HTWG-Konstanz")
    println("")
  }

  def showMenu() {
    println("N - Neues Spiel")
    println("O - Optionen")
    println("B - Beenden")
    state = "menu"

  }

  def showExplanation() {
    printf("() = Normales Feld; ")
    printf("{} = Heim Feld; ")
    printf("<> = Ziel Feld; ")
    println("[] = Start Feld")
  }

  def showGameCommands() {
    println("")
    println("W - Würfeln")
    if (controller.checkMoveable(controller.currentPlayer)) println("M - Spielfigur bewegen")
    println("H - Hilfe")
    println("B - Beenden")
  }

  def showGameField() {
    println(playboardFile)
    state = "inGame"
  }

  private def readNames(): Array[Player] = {
    println("Anzahl Spieler:")
    val amount = readLine()
    //TODO Fehlerbehandlung, abfangen falscher eingaben
    val nameArray: Array[Player] = new Array[Player](amount.toInt)
    for (position: Int <- 0 until nameArray.size) {
      println("Player " + String.valueOf(position + 1) + " bitte Namen eingeben")
      val name = readLine
      val p: Player = new Player(position, name)
      nameArray(position) = p
    }
    nameArray
  }

  def readCommandMenu(command: String): Boolean = {
    var continue = true
    command match {
      case "B" => {
        continue = false
        controller.stopGame
      }
      case "N" => {

        players = readNames()
        controller.startGame(players)
        showGameField()
        showExplanation()
        showGameCommands()
        continue = false
      }
      case "O" => //TODO Optionen
      case _ => {
        continue = true
      }
    }
    println("Aktueller Spieler: " + controller.currentPlayer)
    continue

  }

  def readCommandGame(command: String): Boolean = {
    var continue = true
    command match {
      case "W" => {
        var nextValue = controller.roll
        showDicing(nextValue)

        if (controller.checkMoveable(controller.currentPlayer)) {
          if (controller.isOnHomeField(players(controller.currentPlayer))) {
            var i: Int = 1
            //rekursiv
            def roller(): Boolean = {

              if (i.equals(3)) {
                return false //drittes mal würfeln
              }
              if (nextValue.equals(6)) {
                return true
              }
              i += 1
              nextValue = controller.roll
              showDicing(nextValue)
              return roller()
            }

            if (roller) {
              println("Du kannst auf das Startfeld!")
              //TODO NExt... 
              //controller.moveMeeple(toField)
            }

            controller.nextMove
            showGameField()
          }

        } else {
          println("Spieler " + controller.currentPlayer + " kann keine Figur bewegen")
        }
        showGameCommands()
        println("Aktueller Spieler: " + controller.currentPlayer)
      }
      case "M" => {
        if (controller.checkMoveable(controller.currentPlayer)) {

        }
      }
      case "H" => {
        showExplanation()
        showGameCommands()
      }
      case "B" => {
        continue = false
        controller.stopGame
      }
      case _ => {}
    }
    continue
  }

  def showDicing(nextValue: Int) = {
    println("Würfeln..")
    Thread.sleep(1000)
    println(nextValue)
    println("Bitte mit Eingabe bestätigen")
    readLine()
  }

  def refresh() {
    for (i <- 0 until 40) {

    }
  }

  def publishMeeple() {

  }

  private def writeOutput() {

  }
}