package vu.co.kaiyin.sjsdp

import org.querki.jquery.JQuery
import org.querki.jsext._
import vu.co.kaiyin.sjsdp.types.{StartView, Orientation, ViewMode, DayOfWeek}

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.Date

/**
  * Created by kaiyin on 03/11/2015.
  */
package object optbuilder {

  trait BootstrapDatepickerOptions extends js.Object

  object BootstrapDatepickerOptions extends BootstrapDatepickerOptionBuilder(noOpts)

  /**
    * Options available to BootstrapDatepicker.
    *
    * See http://bootstrap-datepicker.readthedocs.org/en/latest/options.html for full documentation.
    */
  class BootstrapDatepickerOptionBuilder(val dict: OptMap)
    extends JSOptionBuilder[BootstrapDatepickerOptions, BootstrapDatepickerOptionBuilder](
      new BootstrapDatepickerOptionBuilder(_)
    ) {
    // ******************************
    //
    // Options
    //

    def autoclose(v: Boolean) = jsOpt("autoclose", v)

    def beforeShowDay(v: Date) = jsOpt("beforeShowDay", v)

    def calendarWeeks(v: Boolean) = jsOpt("calendarWeeks", v)

    def clearBtn(v: Boolean) = jsOpt("clearBtn", v)

    def container(v: String) = jsOpt("container", v)

    def daysOfWeekDisabled(v: Seq[DayOfWeek]) = jsOpt("daysOfWeekDisabled", v.map(_.underlying).toJSArray)

    def daysOfWeekHighlighted(v: Seq[DayOfWeek]) = jsOpt("daysOfWeekHighlighted", v.map(_.underlying).toJSArray)

    def datesDisabled(v: String) = jsOpt("datesDisabled", v)

    def datesDisabled(v: js.Array[String]) = jsOpt("datesDisabled", v)

    def defaultViewDate(v: js.Dictionary[Int]) = jsOpt("defaultViewDate", v)

    def disableTouchKeyboard(v: Boolean) = jsOpt("disableTouchKeyboard", v)

    def enableOnReadonly(v: Boolean) = jsOpt("enableOnReadonly", v)

    def endDate(v: Date) = jsOpt("endDate", v)

    def forceParse(v: Boolean) = jsOpt("forceParse", v)

    def format(v: String) = jsOpt("format", v)

    def immediateUpdates(v: Boolean) = jsOpt("immediateUpdates", v)

    def inputs(v: js.Array[JQuery]) = jsOpt("inputs", v)

    def keyboardNavigation(v: Boolean) = jsOpt("keyboardNavigation", v)

    def language(v: String) = jsOpt("language", v)

    def minViewMode(v: ViewMode) = jsOpt("minViewMode", v.underlying)

    def maxViewMode(v: ViewMode) = jsOpt("maxViewMode", v.underlying)

    def multidate(v: Boolean) = jsOpt("multidate", v)

    def multidate(v: Int) = jsOpt("multidate", v)

    def multidateSeparator(v: String) = jsOpt("multidateSeparator", v)

    def orientation(v: Orientation*) = jsOpt("orientation", v.map(_.underlying).mkString(""))

    def showOnFocus(v: Boolean) = jsOpt("showOnFocus", v)

    def startDate(v: Date) = jsOpt("startDate", v)

    def startView(v: StartView) = jsOpt("startView", v.underlying)

    def todayBtn(v: Boolean) = jsOpt("todayBtn", v)

    def todayBtnLinked() = jsOpt("todayBtn", "linked")

    def todayHighlight(v: Boolean) = jsOpt("todayHighlight", v)

    def toggleActive(v: Boolean) = jsOpt("toggleActive", v)

    def weekStart(v: DayOfWeek) = jsOpt("weekStart", v.underlying)
  }


}
