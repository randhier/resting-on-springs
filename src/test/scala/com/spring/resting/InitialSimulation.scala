import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class Simulation extends Simulation {
  private val baseUrl = "http://localhost:8080/"
  private val contentType = "application/json"
  private val endpoint = "greetings"
  private val requestCount = 10


  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl(baseUrl)
    .inferHtmlResources()
    .acceptHeader("*/*")
    .contentTypeHeader(contentType)
    .userAgentHeader("curl/7.54.0")

  val headers_0 = Map("Expect" -> "100-continue")

  val scn: ScenarioBuilder = scenario("RecordedSimulation")
    .exec(http("request_0")
      .get(endpoint)
      .headers(headers_0)
      .check(status.is(200)))

  setUp(scn.inject(atOnceUsers(requestCount))).protocols(httpProtocol)
}