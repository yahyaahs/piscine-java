classDiagram
class Excalibur{
    -String name
    -Excalibur INSTANCE$
    -Excalibur(String name)
    +getName() String
    +getInstance()$ Excalibur
}
Excalibur <-- Excalibur