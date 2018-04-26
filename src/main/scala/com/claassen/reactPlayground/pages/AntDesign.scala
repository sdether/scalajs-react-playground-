package com.claassen.reactPlayground.pages

import com.claassen.reactPlayground.AppCircuit
import com.claassen.reactPlayground.components.antDesign.{BadgeExample, DatePickerExample, TimePickerExample}


object AntDesign extends ChapterPage {

  case object MBadge
    extends Item("Badge", "badge", () => {
      val connection = AppCircuit.connect(_.app.antDesign.badge)
      connection(BadgeExample(_)).vdomElement
    })

  case object MDatePicker
    extends Item("DatePicker", "datepicker", () => {
      val connection = AppCircuit.connect(_.app.antDesign.datePicker)
      connection(DatePickerExample(_)).vdomElement
    })

  case object MTimePicker
    extends Item("TimePicker", "timepicker", () => TimePickerExample())

  val menu = Vector(MBadge, MDatePicker, MTimePicker)
}

