lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.twitter",
      scalaVersion := "2.12.12",
      version      := "1.0",
      libraryDependencies += "com.twitter" %% "finagle-http" % "21.9.0"
    )),
    name := "quickstart"
  )



// libraryDependencies ++= Seq(
//   "com.twitter" %% "finatra-http-server" % "21.9.0"
// )