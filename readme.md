quick demo of the new fs2-io snapshot not building with ember-server

```
[error] Found 6 missing definitions while linking
[error] Not found Top(java.nio.channels.AsynchronousChannel)
[error]         at https://raw.githubusercontent.com/typelevel/fs2/365636d3bc1e67c7b250b2de531a640c42b80748/io/jvm-native/src/main/scala/fs2/io/net/SocketGroupPlatform.scala:131
[error] Not found Top(java.nio.channels.AsynchronousChannelGroup)
[error]         at https://raw.githubusercontent.com/typelevel/fs2/365636d3bc1e67c7b250b2de531a640c42b80748/io/native/src/main/scala/fs2/io/net/NetworkPlatform.scala:71
[error] Not found Top(java.nio.channels.AsynchronousCloseException)
[error]         at https://raw.githubusercontent.com/typelevel/fs2/365636d3bc1e67c7b250b2de531a640c42b80748/io/jvm-native/src/main/scala/fs2/io/net/SocketGroupPlatform.scala:144
[error] Not found Top(java.nio.channels.AsynchronousServerSocketChannel)
[error]         at https://raw.githubusercontent.com/typelevel/fs2/365636d3bc1e67c7b250b2de531a640c42b80748/io/jvm-native/src/main/scala/fs2/io/net/SocketGroupPlatform.scala:157
[error] Not found Member(Top(java.nio.channels.AsynchronousServerSocketChannel),D4openL42java.nio.channels.AsynchronousChannelGroupL49java.nio.channels.AsynchronousServerSocketChannelEo)
[error]         at https://raw.githubusercontent.com/typelevel/fs2/365636d3bc1e67c7b250b2de531a640c42b80748/io/jvm-native/src/main/scala/fs2/io/net/SocketGroupPlatform.scala:94
[error] Not found Top(java.nio.channels.AsynchronousSocketChannel)
[error]         at https://raw.githubusercontent.com/typelevel/fs2/365636d3bc1e67c7b250b2de531a640c42b80748/io/jvm-native/src/main/scala/fs2/io/net/SocketGroupPlatform.scala:138
[error] Undefined definitions found in reachability phase
[error] (Compile / nativeLink) Undefined definitions found in reachability phase
[error] Total time: 9 s, completed 27 Jun 2024, 00:52:45
```
