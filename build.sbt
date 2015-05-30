// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)