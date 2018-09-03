name := "Streams"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"


libraryDependencies += "org.apache.spark" % "spark-core" % "2.3.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "2.2.0" % "provided"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "2.2.0" % "provided"