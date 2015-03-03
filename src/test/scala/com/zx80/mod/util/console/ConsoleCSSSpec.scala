package com.zx80.mod.util.console

import org.scalatest.FlatSpec

class ConsoleCSSSpec extends FlatSpec {

  "ConsoleCSS" should "" in {
    import ConsoleCSS._

    val cssWarn = Foreground.Red | Background.color(217) | Format.Bold
    val cssHeader = Background.LightBlue | Foreground.White | Format.Bold
    val cssTerm = Format.Underlined

    printlnStyled("This is warning string printed by printStyled", cssWarn)
    printlnStyled("This is header string printed by printStyled", cssHeader)
    printlnStyled("This is term string printed by printStyled", cssTerm)
    println("---------------------------------------")
    println("This is warning string printed by println".attr(cssWarn))
    println("This is header string printed by println".attr(cssHeader))
    println("This is term string printed by println".attr(cssTerm))
  }
}
