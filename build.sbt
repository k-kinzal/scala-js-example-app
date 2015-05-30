// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-encoding", "UTF-8", "-feature", "-unchecked", "-deprecation")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
