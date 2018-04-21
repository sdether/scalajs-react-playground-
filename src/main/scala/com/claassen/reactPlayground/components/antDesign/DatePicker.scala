package com.claassen.reactPlayground.components.antDesign

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object DatePicker extends ReactBridgeComponent {

  @JSImport("antd", "DatePicker")
  @js.native
  object RawComponent extends js.Object

  override lazy val componentValue = RawComponent

  def apply(allowClear: Boolean = true,
            autoFocus: Boolean = false,
            className: String = "",
            dateRender: js.UndefOr[js.Function2[String,String,js.Object]] = js.undefined,
            disabled: Boolean = false,
            disabledData: js.UndefOr[js.Function1[String,Boolean]] = js.undefined,
            getCalendarContainer: js.UndefOr[js.Function] = js.undefined,
            locale: js.UndefOr[js.Object] = js.undefined,
            open: Boolean = false,
            placeHolder: String = "",
            popupStyle: js.UndefOr[js.Object] = js.undefined,
            dropdownClassName: String = "",
            size: String = "",
            style: js.UndefOr[js.Object] = js.undefined,
            onOpenChange: js.UndefOr[Boolean => Callback] = js.undefined): WithProps = auto
}

object DatePickerExample {

  class Backend($: BackendScope[Int, Int]) {

    def render(p: Int, s: Int) = {
      <.div(
        Badge(count = s)(
          <.a(^.href := "#", ^.className := "head-example")
        ),
        <.button(
          ^.onClick --> $.modState(_ + 1),
          "+"
        ),
        <.button(
          ^.onClick --> $.modState(_ - 1),
          "-"
        )
      )
    }
  }

  val component = ScalaComponent.builder[Int]("BadgeExample")
    .initialStateFromProps(p => p)
    .renderBackend[Backend]
    .build

  def apply(count: Int) = component(count).vdomElement
}