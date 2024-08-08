name := "Streams"

version := "1.0.0"

scalaVersion := "2.13.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.1" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.5.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19"

libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % Test