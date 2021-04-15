lazy val buildSettings = Seq(
  name := "fake-project",
  organization := "com.dwolla",
  version := "0.0.1",
  scalaVersion := "2.12.13",
  crossScalaVersions := Seq("2.12.13", "2.13.5"),
)

lazy val app = (project in file("."))
  .settings(buildSettings: _*)
