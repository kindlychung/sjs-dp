package vu.co.kaiyin.sjsdp

/**
  * Created by kaiyin on 03/11/2015.
  */
package object types {


  case class DayOfWeek(val underlying: Int) extends AnyVal

  object DayOfWeek {
    val Sunday = DayOfWeek(0)
    val Monday = DayOfWeek(1)
    val Tuesday = DayOfWeek(2)
    val Wednesday = DayOfWeek(3)
    val Thursday = DayOfWeek(4)
    val Friday = DayOfWeek(5)
    val Saturday = DayOfWeek(6)
  }

  case class ViewMode(val underlying: Int) extends AnyVal

  object ViewMode {
    val Days = ViewMode(0)
    val Months = ViewMode(1)
    val Years = ViewMode(2)
  }

  case class StartView(val underlying: Int) extends AnyVal

  object StartView {
    val Month = StartView(0)
    val Year = StartView(1)
    val Decade = StartView(2)
  }

  case class Orientation(val underlying: String) extends AnyVal

  object Orientation {
    val Auto = Orientation("auto")
    val Top = Orientation("top")
    val Bottom = Orientation("bottom")
    val Left = Orientation("left")
    val Right = Orientation("right")
  }


}
