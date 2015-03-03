name := """com.zx80.mod.util.console"""

version := "1.0"

scalaVersion := "2.11.5"

resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

