package de.hwtg.scala.swingGUI

import swing._

class ViewClass extends Frame{

  title = "Mensch Ärgere Dich Nicht !"
  
  val panel = new FlowPanel()
  val button1 = new Button("Click me !")
  val button2 = new Button("Reset")
  val label = new Label()
  
  panel.contents += button1
  panel.contents += button2
  panel.contents  += label
  
  contents = panel
 
  visible = true
  
}