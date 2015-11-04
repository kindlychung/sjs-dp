package vu.co.kaiyin.sjsdp

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import org.querki.jquery._
import org.querki.jsext._
import vu.co.kaiyin.sjsdp.optbuilder._
import scala.language.implicitConversions

/**
  * Created by kaiyin on 04/11/2015.
  */
@JSExport
object Main {
  @JSExport
  def main(): Unit = {
    val opt = new BootstrapDatepickerOptionBuilder(noOpts)
    $("#pick").datepicker(opt.format("dd/mm/yyyy"))
    //    $("#pick").addClass("pickclass")
    //    $("ul li").addClass((elem: dom.Element, index: Int, currentClass: String) => {
    //      currentClass + index
    //    })
    //    $("ul li").after((elem: dom.Element, idx: Int) => ("<li>Repeat %d</li>".format(idx): ElementDesc))
    //    $("ul li").append((elem: dom.Element, idx: Int) => ("Index: %d".format(idx): ElementDesc))
    val tf: js.ThisFunction1[dom.Element, Int, ElementDesc] = (e: dom.Element, i: Int) => {
      println("adding index...")
//      return ("index: " + i): ElementDesc
      $("#math"): ElementDesc
    }
    val ulli = $("ul li")
    $("ul li").after("<p>hello</p>")
    println(ulli)
    println(tf)
    ulli.after(tf)
//    $("ul li").after(tf)
//    $("ul li").after((elem: dom.Element, idx: Int) => ("what?": ElementDesc))
//    $("ul li").append("<h1>what is this?</h1>")
//    $("<h1>hi there</h1>").appendTo("li")
  }

}
