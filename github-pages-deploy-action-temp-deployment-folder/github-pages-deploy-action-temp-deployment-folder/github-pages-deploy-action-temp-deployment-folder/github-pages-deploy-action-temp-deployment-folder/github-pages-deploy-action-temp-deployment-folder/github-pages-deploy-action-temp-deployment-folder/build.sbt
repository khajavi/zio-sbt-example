import java.nio.file.Paths

organization := "dev.zio"
name := "zio-sbt-example"

websiteDir := Paths.get("./")

docsDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.2"
)

enablePlugins(WebsitePlugin)
