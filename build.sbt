import java.nio.file.Paths

organization := "dev.zio"
name := "zio-sbt-example"

lazy val docs = project
  .in(file("zio-sbt-example-docs"))
  .settings(
    publish / skip := true,
    projectName := "ZIO SBT Example",
    badgeInfo := Some(
      BadgeInfo(
        artifact = "zio-sbt-example_2.12",
        projectStage = ProjectStage.ProductionReady
      )
    ),
    docsPublishBranch := "main",
    docsDependencies ++= Seq("dev.zio" %% "zio" % "2.0.4")
  )
  .enablePlugins(WebsitePlugin)
