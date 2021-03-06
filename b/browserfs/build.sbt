organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-8c1217"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "buffer" % "6.0.3-20ade9",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20201002Z-60b01f",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-4b69db",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-f9857e",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
