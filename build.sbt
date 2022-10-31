version := "0.0.1"
organization := "dev.zio"
name := "zio-sbt-example"

docsDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.2"
)

enablePlugins(WebsitePlugin)
