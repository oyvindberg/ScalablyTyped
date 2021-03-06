organization := "org.scalablytyped"
name := "webtorrent"
version := "0.109-dt-20201023Z-4ada6d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bittorrent-protocol" % "3.1-dt-20200728Z-ba88d9",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20200515Z-39e99d",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20200226Z-420286",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20200515Z-2573b7",
  "org.scalablytyped" %%% "simple-peer" % "9.6-dt-20201016Z-f3f62e",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
