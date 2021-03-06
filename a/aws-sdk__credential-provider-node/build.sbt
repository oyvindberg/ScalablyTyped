organization := "org.scalablytyped"
name := "aws-sdk__credential-provider-node"
version := "1.0.0-rc.7-53da0b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-imds" % "1.0.0-rc.7-f7144c",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-ini" % "1.0.0-rc.7-d8fce6",
  "org.scalablytyped" %%% "aws-sdk__credential-provider-process" % "1.0.0-rc.7-e1b544",
  "org.scalablytyped" %%% "aws-sdk__shared-ini-file-loader" % "1.0.0-rc.3-88e41e",
  "org.scalablytyped" %%% "aws-sdk__types" % "1.0.0-rc.7-cfb321",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
