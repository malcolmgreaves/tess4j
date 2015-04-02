name := "tess4j"

version := "0.1"

organization := "mwg"

scalaVersion := "2.11.6"

resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Twitter Repository" at "http://maven.twttr.com/",
  "Ghost4J releases" at "http://repo.ghost4j.org/maven2/releases",
  "myGrid Repository" at "http://repository.mygrid.org.uk/artifactory/mygrid-all/"
  //"jai-imageio on bintray" at  "http://dl.bintray.com/jai-imageio/maven/bintray-jai-imageio"
)

// Take note of the "%%" vs "%"! Double means use the Scala major (e.g. 2.11 vs 2.10) version dependency.
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test",
  "org.hamcrest" % "hamcrest-integration" % "1.3" % "test",
  "net.avh4.util" % "imagecomparison" % "0.0.2" % "test",
  "net.java.dev.jna" % "jna" % "4.1.0",
  "net.java.dev.jna" % "platform" % "3.5.2",
  //"com.github.jai-imageio" % "jai-imageio-core" % "1.3.0",
  "net.java.dev.jai-imageio" % "jai-imageio-core-standalone" % "1.2-pre-dr-b04-2014-09-13",
  "org.ghost4j" % "ghost4j" % "0.5.1"
)

/*
scalacOptions ++= Seq(
  "-optimize",
  "-target:jvm-1.8",
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions", 
  "-language:experimental.macros",
  "-unchecked",
  "-Xfatal-warnings", 
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Yinline-warnings"
)
*/

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

testOptions in Test += Tests.Argument("-oF")

packAutoSettings

fork := false

