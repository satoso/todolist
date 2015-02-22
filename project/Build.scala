import sbt._
import Keys._
//import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "My first application"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      "postgresql" % "postgresql" % "8.4-702.jdbc4"
      )

}
