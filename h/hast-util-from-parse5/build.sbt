organization := "org.scalablytyped"
name := "hast-util-from-parse5"
version := "6.0.0-f036f3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20200515Z-a5c018",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20190213Z-95e8cb",
  "org.scalablytyped" %%% "vfile" % "4.2.0-722c9d",
  "org.scalablytyped" %%% "vfile-message" % "2.0.4-60ed86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
