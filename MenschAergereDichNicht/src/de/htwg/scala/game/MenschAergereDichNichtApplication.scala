package de.htwg.scala.game

import de.htwg.scala.controller.GameController
import de.htwg.scala.view.TuiView

object MenschAergereDichNichtApplication extends App {
    val controller:GameController = new GameController
    val tui = new TuiView(controller)
    
    tui.showIntro()
    tui.showMenu()
    while(tui.readCommandMenu((readLine()))){tui.showMenu()}
    if(tui.state == "inGame") {
      while(tui.readCommandGame((readLine()))){}
    }
}