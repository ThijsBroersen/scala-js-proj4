enablePlugins(ScalaJSPlugin)

name := "Scala.js Proj4js"

normalizedName := "scalajs-proj4js"

organization := "nl.thijsbroersen"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-P:scalajs:sjsDefinedByDefault")

crossScalaVersions := Seq("2.11.12", "2.12.7")

