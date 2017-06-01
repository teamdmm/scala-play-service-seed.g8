name := "$name;format="Camel"$"

organization := "io.superphone"
organizationName := "Disruptive Multimedia"

version := "1.0.0"

val scalaV = "2.11.11"
scalaVersion := scalaV
testOptions in Test += Tests.Setup(() => SbtDotenv.trigger)

// disables publishing
publish := ()
publishLocal := ()
publishArtifact := false

// makes sure test run in forked JVM, and not in parallel
parallelExecution in Test := false
fork in run := true

lazy val coreLibs = Seq(
)

lazy val testLibs = Seq(
)

lazy val utils = Seq(
)

libraryDependencies ++= coreLibs ++ testLibs ++ utils
