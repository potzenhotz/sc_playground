import Dependencies._

ThisBuild / scalaVersion := "2.13.9"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala_playground",
    libraryDependencies += scalaTest % Test
  )
