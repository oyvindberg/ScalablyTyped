organization := "org.scalablytyped"
name := "react-apollo"
version := "3.1.5-415d44"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.5-6a9a7d",
  "org.scalablytyped" %%% "apollo-client" % "2.6.10-6596da",
  "org.scalablytyped" %%% "apollo-link" % "1.2.14-246d1b",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.4-f700a9",
  "org.scalablytyped" %%% "apollo__react-common" % "3.1.4-82c66d",
  "org.scalablytyped" %%% "apollo__react-components" % "3.1.5-a95ed2",
  "org.scalablytyped" %%% "apollo__react-hoc" % "3.1.5-b856ab",
  "org.scalablytyped" %%% "apollo__react-hooks" % "3.1.5-92f4de",
  "org.scalablytyped" %%% "apollo__react-ssr" % "3.1.5-22d808",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "graphql" % "15.3.0-ff42a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20200515Z-3a3722",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.21-e83db8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
