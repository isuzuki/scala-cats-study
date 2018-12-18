lazy val commonSettings = Seq(
  version := "0.1",
  scalaVersion := "2.12.8",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked",
    "-Ypartial-unification"
  ),
)

lazy val sutrasSettings = (project in file("sutras"))
  .settings(
    commonSettings,
    name := "sutras"
  )

lazy val studySettings = (project in file("study"))
  .settings(
    commonSettings,
    name := "study",
    Seq(
      libraryDependencies += "org.typelevel" %% "cats-core" % "1.5.0"
    )
  )
