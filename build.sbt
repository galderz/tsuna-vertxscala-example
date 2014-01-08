name := "foo"
 
version := "0.1"
 
scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// vertx-scala doesn't ship on 2.9
scalaVersion := "2.10.2"

// Fork required to avoid conflicts when compiling the .scala source on the fly
fork := true

libraryDependencies ++= Seq(
  // If changing lang-scala version, make sure src/main/resources/langs.properties is updated too
  "io.vertx" % "lang-scala" % "0.3.+" changing(),
  "io.vertx" % "vertx-platform" % "2.1M1"
)

// resolvers += "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
