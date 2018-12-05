package nl.thijsbroersen.proj4js

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait Proj4 extends js.Any {

}

@js.native
@JSGlobal("proj4")
object Proj4 extends js.Any {
  def apply(name: String): Proj4 = js.native
  def defs(name: String): Proj4 = js.native
  def defs(name: String, projection: String): Unit = js.native
  def defs(name: String, projection: Proj4): Unit = js.native
  def defs(projections: Array[Array[String]]): Unit = js.native
}