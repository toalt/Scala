package de.hwtg.scala.swingGUI

import swing._
import scala.swing.Swing.LineBorder
import javax.swing.ImageIcon


object PrototypGUI extends Frame {

	def main(args: Array[String]) {
  
	title = "Mensch Ärgere Dich Nicht !"
	contents = new BorderPanel {
	  add(gridPanel, BorderPanel.Position.West)
	}
	  
	def gridPanel = new GridPanel(11,11) {
	  val dimension = new Dimension(662,662)
	  preferredSize = dimension
	  minimumSize = dimension
	  maximumSize = dimension
	  contents+=greenButton;contents+=greenButton;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=standardField;contents+=standardField;contents+=standardField;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=yellowButton;contents+=yellowButton;contents+=greenButton
	  contents+=greenButton;contents+=backgroundLabel;contents+=backgroundLabel;contents+=standardField
	  contents+=yellowHomeField;contents+=standardField;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=yellowButton;contents+=yellowButton;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=standardField;contents+=yellowHomeField
	  contents+=standardField;contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=standardField;contents+=yellowHomeField;contents+=standardField
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=standardField;contents+=standardField;contents+=standardField;contents+=standardField
	  contents+=standardField;contents+=yellowHomeField;contents+=standardField;contents+=standardField
	  contents+=standardField;contents+=standardField;contents+=standardField;contents+=standardField
	  contents+=greenHomeField;contents+=greenHomeField;contents+=greenHomeField;contents+=greenHomeField
	  contents+=backgroundLabel;contents+=blueHomeField;contents+=blueHomeField;contents+=blueHomeField
	  contents+=blueHomeField;contents+=standardField;contents+=standardField;contents+=standardField
	  contents+=standardField;contents+=standardField;contents+=standardField;contents+=redHomeField
	  contents+=standardField;contents+=standardField;contents+=standardField;contents+=standardField
	  contents+=standardField;contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=standardField;contents+=redHomeField;contents+=standardField
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=standardField;contents+=redHomeField;contents+=standardField;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=backgroundLabel;contents+=redButton
	  contents+=redButton;contents+=backgroundLabel;contents+=backgroundLabel;contents+=standardField
	  contents+=redHomeField;contents+=standardField;contents+=backgroundLabel;contents+=backgroundLabel
	  contents+=blueButton;contents+=blueButton;contents+=redButton;contents+=redButton;contents+=backgroundLabel
	  contents+=backgroundLabel;contents+=standardField;contents+=standardField;contents+=standardField
	  contents+=backgroundLabel;contents+=backgroundLabel;contents+=blueButton;contents+=blueButton
	  border = LineBorder(java.awt.Color.BLACK, 2)
	}
	
	menuBar = new MenuBar {
	  contents += new Menu("Spiel") {
		  contents += new MenuItem(Action("Neues Spiel") {  }) //controller.reset
		  contents += new MenuItem(Action("Spiel beenden") { System.exit(0) })
	  }
	  contents += new Menu("Info") {
	      contents+= new MenuItem(Action("Über") {  })  //controller.showInfo
	  }
	}
	
	def backgroundLabel = new Label {
	  icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\background.png")
	}
	
	def standardField = new Label {
	  icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\standardFeld.png")
	}
	
	def greenButton = new Button {
		icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\gruenesFeld.png")
	    val dimension = new Dimension(60,60)
	    preferredSize = dimension
	    minimumSize = dimension
	    maximumSize = dimension
	    border = null
	}
	
	def yellowButton = new Button {
		icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\gelbesFeld.png")
	    val dimension = new Dimension(60,60)
	    preferredSize = dimension
	    minimumSize = dimension
	    maximumSize = dimension
	    border = null
	}
	
	def redButton = new Button {
		icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\rotesFeld.png")
	    val dimension = new Dimension(60,60)
	    preferredSize = dimension
	    minimumSize = dimension
	    maximumSize = dimension
	    border = null
	}
	
	def blueButton = new Button {
		icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\blauesFeld.png")
	    val dimension = new Dimension(60,60)
	    preferredSize = dimension
	    minimumSize = dimension
	    maximumSize = dimension
	    border = null
	}
	
	def yellowHomeField = new Label {
	  icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\gelbZiel.png")
	}
	
	def greenHomeField = new Label {
	  icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\gruenZiel.png")
	}
	
	def blueHomeField = new Label {
	  icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\blauZiel.png")
	}
	
	def redHomeField = new Label {
	  icon = new ImageIcon("C:\\Users\\Tobias\\git\\Scala\\MenschAergereDichNicht\\src\\img\\rotZiel.png")
	}
	
	  visible = true
	}
}