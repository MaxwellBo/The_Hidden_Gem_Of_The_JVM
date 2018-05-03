name := "Hidden Gem of the JVM"

scalacOptions += "-Ypartial-unification"

version := "1.0"

scalaVersion := "2.12.5"

val initCommands = """
import contextual.examples.email._
import com.typesafe.config.ConfigFactory.parseString
import eu.timepit.refined.refineV
import eu.timepit.refined.string._
import eu.timepit.refined.W
import eu.timepit.refined.api.{Refined, Validate}
import eu.timepit.refined.collection.NonEmpty
import eu.timepit.refined.numeric.{Greater, Positive, Interval}
import eu.timepit.refined.boolean.Or
import eu.timepit.refined.generic.Equal
import eu.timepit.refined.auto._
"""

initialCommands in console := initCommands

val circeVersion = "0.9.2"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion) ++ Seq(
  "com.chuusai" %% "shapeless" % "2.3.3",
  "com.propensive" %% "contextual" % "1.0.0",
  "com.propensive" %% "contextual-examples" % "1.0.0",
  "eu.timepit" %% "refined" % "0.9.0",
  "eu.timepit" %% "refined-pureconfig" % "0.9.0",
  "com.github.pureconfig" %% "pureconfig" % "0.9.1",
  "io.monix" %% "monix" % "3.0.0-RC1"
)
