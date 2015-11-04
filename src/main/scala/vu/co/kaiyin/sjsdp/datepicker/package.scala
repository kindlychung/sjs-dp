package vu.co.kaiyin.sjsdp

import org.querki.jquery.{JQueryEventObject, JQuery}
import vu.co.kaiyin.sjsdp.optbuilder.BootstrapDatepickerOptions
import vu.co.kaiyin.sjsdp.types.DayOfWeek

import scala.scalajs.js
import scala.scalajs.js.JSConverters._
import scala.scalajs.js.{UndefOr, Date}
import scala.scalajs.js.annotation.JSName

/**
  * Created by kaiyin on 04/11/2015.
  */
package object datepicker {

  @js.native
  trait BootstrapDatepicker extends js.Object {

    def datepicker(options: BootstrapDatepickerOptions): JQuery = js.native

    /**
      * Underlying API to send commands to datepicker. Don't use this; use the methods in
      * DatepickerCommands instead.
      */
    @JSName("datepicker")
    def datepickerInternal(cmd: String, params: js.Any*): Any = js.native
  }

  implicit class DatepickerCommands(dp: BootstrapDatepicker) {

    def command(cmd: String, params: js.Any*) = dp.datepickerInternal(cmd, params: _*)

    def clearDates() = command("clearDates")

    def getDate() = command("getDate").asInstanceOf[Date]

    def getDates() = command("getDates").asInstanceOf[js.Array[Date]]

    def getUTCDate() = command("getUTCDate").asInstanceOf[Date]

    def getUTCDates() = command("getUTCDates").asInstanceOf[js.Array[Date]]

    def hide() = command("hide")

    def remove() = command("remove")

    def setDate(date: Date) = command("setDate", date)

    def setDates(dates: Seq[Date]) = command("setDates", dates.toJSArray)

    def setDaysOfWeekDisabled(v: Boolean) = command("setDaysOfWeekDisabled", v)

    def setDaysOfWeekDisabled(v: Seq[DayOfWeek]) = command("setDaysOfWeekDisabled", v.map(_.underlying).toJSArray)

    def setEndDate(date: Date) = command("setEndDate", date)

    def setStartDate(date: Date) = command("setStartDate", date)

    def setUTCDate(date: Date) = command("setUTCDate", date)

    def setUTCDates(dates: Seq[Date]) = command("setUTCDates", dates.toJSArray)

    def show() = command("show")

    def update(date: String) = command("update", date)

    def update(date: Date) = command("update", date)
  }


  /**
    * According to the documentation, events defined on BootstrapDatepicker return this enhanced version
    * of JQueryEventObject. See http://bootstrap-datepicker.readthedocs.org/en/latest/events.html
    */
  @js.native
  trait DatepickerEventObject extends JQueryEventObject {
    def date: Date = js.native

    def dates: js.Array[Date] = js.native

    def format: js.Function2[UndefOr[Int], UndefOr[String], String] = js.native
  }

}
