organization := "org.scalablytyped"
name := "protoo-client"
version := "4.0-dt-20200514Z-954b46"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "retry" % "0.12-dt-20181229Z-bd12dc",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "websocket" % "1.0-dt-20200707Z-224eed")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
