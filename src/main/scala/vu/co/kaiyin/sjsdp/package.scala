package vu.co.kaiyin

import vu.co.kaiyin.sjsdp.datepicker._
import scala.language.implicitConversions

/**
  * Created by kaiyin on 04/11/2015.
  */
package object sjsdp {

  import org.querki.jquery.JQuery

  /**
    * This package provides a facade for Bootstrap Datepicker, a third-party plugin
    * for Bootstrap that can be found at:
    *
    * https://github.com/eternicode/bootstrap-datepicker
    *
    * As the name implies, this provides a cross-platform, responsive UI for choosing a
    * date. In principle, it would be ideal to do this as a polyfill instead, based on
    * the HTML5 date input type; in practice, date isn't well-supported, and I haven't
    * loved any of the polyfills I've encountered yet. So for now, this UI still seems
    * useful.
    */
  implicit def jq2Datepicker(jq: JQuery): BootstrapDatepicker = jq.asInstanceOf[BootstrapDatepicker]

//  implicit def jq2DatepickerCommands(jq: JQuery) = new DatepickerCommands(jq)

}
