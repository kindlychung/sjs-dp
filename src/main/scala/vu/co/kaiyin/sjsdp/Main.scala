package vu.co.kaiyin.sjsdp

import scala.scalajs.js.annotation.JSExport
import org.querki.jquery._
import org.querki.jsext._
import vu.co.kaiyin.sjsdp.optbuilder._

/**
  * Created by kaiyin on 04/11/2015.
  */
@JSExport
object Main {
  @JSExport
  def main(): Unit = {
    val opt = new BootstrapDatepickerOptionBuilder(noOpts)
    $("#pick").datepicker(opt.format("dd/mm/yyyy"))
  }
}
