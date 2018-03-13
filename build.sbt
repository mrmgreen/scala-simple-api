val commonSettings = Seq(
  name := "api-test",
  version := "0.1",
  scalaVersion := "2.12.4"
)

val dependencies = Seq(
  "com.typesafe.akka" %% "akka-http"   % "10.1.0-RC2",
  "com.typesafe.akka" %% "akka-stream" % "2.5.9"
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    libraryDependencies ++= dependencies
  )

