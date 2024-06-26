scalaVersion := "3.3.3"

enablePlugins(ScalaNativePlugin)

logLevel := Level.Info

import scala.scalanative.build._

nativeConfig ~= { c =>
  c.withLTO(LTO.none)
    .withMode(Mode.debug)
    .withGC(GC.immix)
}

libraryDependencies ++= List(
  "org.http4s"    %%% "http4s-ember-server" % "1.0.0-M41",
  "org.http4s"    %%% "http4s-dsl"          % "1.0.0-M41",
  "co.fs2"        %%% "fs2-io"              % "3.10-365636d",
  "co.fs2"        %%% "fs2-core"            % "3.10-365636d",
  "org.typelevel" %%% "log4cats-core"       % "2.7.0"
)
