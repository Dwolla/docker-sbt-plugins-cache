lazy val buildSettings = Seq(
  name := "fake-project",
  organization := "com.dwolla",
  version := "0.0.1",
  scalaVersion := "2.12.4"
)

lazy val app = (project in file("."))
  .settings(buildSettings: _*)