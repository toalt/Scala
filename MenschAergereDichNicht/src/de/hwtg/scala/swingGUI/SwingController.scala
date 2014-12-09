package de.hwtg.scala.swingGUI

import scala.swing.event._

class SwingController {

  val view = new ViewClass
  val model = new SwingModel
  
  setData()
  
  view.listenTo(view.button1,view.button2 )
  view.reactions += {
    case ButtonClicked(view.button1) => model.noClicks += 1
    							setData()
    case ButtonClicked(view.button2) => model.noClicks  = 0
    							setData()
  }
  
  def setData() : Unit = {
    view.label.text = model.noClicks.toString
  } 
  
}