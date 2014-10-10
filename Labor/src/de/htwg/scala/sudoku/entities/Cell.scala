package de.htwg.scala.sudoku.entities

class Cell (row:Int,column:Int){
	var value = 0
	var given = false
	
	def mkString="("+ row +", "+ column + ") = " + value
	def :=(v:Int) = value=v
	override  def toString= value.toString.replace('0',' ')
	def ==(v:Int) =  if (value == v) true else false
	def isSet =  value!=0
	def x = row
	def y = column
}