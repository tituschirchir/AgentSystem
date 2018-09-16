package controllers

import javax.inject._
import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index = Action {
    Ok(views.html.index(s"Your new application is ready,", "Titus Chirchir"))
  }

  def chirchir = Action {
    Ok(views.html.chirchir(1.to(50).map("Titus Rachel " + _).foldRight("")(_ + "\n" + _)))
  }

}
