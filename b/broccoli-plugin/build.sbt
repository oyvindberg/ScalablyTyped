organization := "org.scalablytyped"
name := "broccoli-plugin"
version := "4.0.3-cc14de"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-068c26",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-04f04c",
  "org.scalablytyped" %%% "fs-merger" % "3.1.0-fcb6fa",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-57d176",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "walk-sync" % "2.2.0-835fb1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
