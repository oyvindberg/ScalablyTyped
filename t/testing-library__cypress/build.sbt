organization := "org.scalablytyped"
name := "testing-library__cypress"
version := "5.0-dt-20200624Z-a858aa"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cypress" % "4.9.0-61b23b",
  "org.scalablytyped" %%% "eventemitter2" % "6.4.3-f008d0",
  "org.scalablytyped" %%% "moment" % "2.27.0-da83b2",
  "org.scalablytyped" %%% "pretty-format" % "25.5.0-c99381",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200331Z-88541a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20200515Z-775559",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "testing-library__dom" % "7.19.0-a620b1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
