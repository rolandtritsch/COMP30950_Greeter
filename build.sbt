// *** DO NOT ADD DEPENDENCIES TO THIS FILE ****

val scala3Version = "3.7.2" // Change this if needs be

lazy val root = project
  .in(file("."))
  .settings(
    name := "initialProject",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % "test"
  )