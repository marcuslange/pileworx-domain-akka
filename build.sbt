name := """pileworx-domain-akka"""

version := "1.0.1"

scalaVersion := "2.12.1"

scalacOptions := Seq("-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.4.14"
  Seq(
    "com.typesafe.akka" %% "akka-persistence" % akkaV,
    "com.typesafe.akka" %% "akka-actor" % akkaV,

    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test")
}
