organization := "org.scalablytyped"
name := "expect"
version := "26.6.2-95e931"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chalk" % "4.1.0-ea614b",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-91b57a",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-c02776",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-38cda5",
  "org.scalablytyped" %%% "jest-diff" % "26.6.2-919877",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.6.2-f33e41",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-14cad6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
