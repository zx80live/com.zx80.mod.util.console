## Linux console CSS utility

####Setup:
1. Build project: `> sbt compile`
2. Publish to local repository: `> sbt publishLocal`
3. Import dependencies in your project:
```
libraryDependencies += "com.zx80.util" %% "console-utils" % "1.0"
```

### Usage
See [example usage](https://github.com/zx80live/com.zx80.mod.util.console/blob/master/src/test/scala/com/zx80/mod/util/console/ConsoleCSSSpec.scala)

```
// import implicit conversions and features
import ConsoleCSS._

// define styles
val cssWarn = Foreground.Red | Background.color(217) | Format.Bold
val cssHeader = Background.LightBlue | Foreground.White | Format.Bold
val cssTerm = Format.Underlined

// use special method for printing styled strings
printlnStyled("This is warning string printed by printStyled", cssWarn)
printlnStyled("This is header string printed by printStyled", cssHeader)
printlnStyled("This is term string printed by printStyled", cssTerm)

// use classic println for printing styled strings
println("This is warning string printed by println".attr(cssWarn))
println("This is header string printed by println".attr(cssHeader))
println("This is term string printed by println".attr(cssTerm))

// use string interpolation
println(s""" hello ${"world".attr(cssHeader)}  """)
println(s""" Some text with ${"bold".attr(Format.Bold|Foreground.Green)} and ${"yellow".attr(Foreground.Yellow)}  """)
```
