import abstractfactory.animal.Dog
import abstractfactory.animal.Duck
import abstractfactory.color.Blue
import abstractfactory.color.White
import abstractfactory.factory.AnimalFactory
import abstractfactory.factory.ColorFactory
import abstractfactory.provider.AbstractFactoryProvider

fun main() {
    val abstractFactoryProvider = AbstractFactoryProvider()

    //Abstract factory design demo
    while (true) {
        println("Enter your choice(Animal, Color): ")

        val choice = readLine()!!

        when (abstractFactoryProvider.getFactory(choice)) {
            is AnimalFactory -> {
                println("Enter animal name: ")
                val name = readLine()!!

                when (val animal = AnimalFactory().createType(name)) {
                    is Dog -> println("${animal.eat()} \n${animal.sound()}")
                    is Duck -> println("${animal.eat()} \n${animal.sound()}")
                    else -> println("You entered the wrong name: $name")
                }
            }
            is ColorFactory -> {
                println("Enter color name: ")
                val name = readLine()!!

                when (val color = ColorFactory().createType(name)) {
                    is White -> println("${color.apply()} \n${color.remove()}")
                    is Blue -> println("${color.apply()} \n${color.remove()}")
                    else -> println("You entered the wrong name: $name")
                }
            }
        }
    }
}