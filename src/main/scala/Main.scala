import cats.effect.*
import cats.effect.std.*
import cats.implicits.*
import com.comcast.ip4s.Host
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.syntax.*
import org.http4s.implicits.*
import org.typelevel.log4cats.noop.*
import org.http4s.*
import org.http4s.dsl.Http4sDsl
import org.typelevel.log4cats.*

object Main extends IOApp:
  given LoggerFactory[IO] = NoOpFactory[IO]

  override def run(args: List[String]): IO[ExitCode] = program[IO](args)

  def program[F[_]: Async: Console: LoggerFactory](args: List[String]): F[ExitCode] = {
    val dsl = new Http4sDsl[F] {}
    import dsl._
    EmberServerBuilder
      .default[F]
      .withHost(Host.fromString("0.0.0.0").get)
      .withHttpApp(
        HttpRoutes
          .of[F] { case GET -> Root =>
            Ok("hi")
          }
          .orNotFound
      )
      .build
      .useForever
      .as(ExitCode.Success)
  }
