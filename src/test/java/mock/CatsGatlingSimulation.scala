package mock

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._
import io.gatling.core.structure._
import scala.language.postfixOps

class CatsGatlingSimulation extends Simulation {
  val getSingleUser: ScenarioBuilder = scenario("get method").exec(karateFeature("classpath:mock/GetSingle1.feature"))


  setUp(
    getSingleUser.inject(rampUsers(5) during (10 seconds))
  )
}
