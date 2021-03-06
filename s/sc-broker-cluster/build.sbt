organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "9.0-dt-20200205Z-16a02b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-43823a",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-d70564",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ec9d89",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b5e59b",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-61a4ae",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-174750",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-fe4f5a",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2f29e2",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-4f8e22",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-c0bbb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
