/**
 * This project is implementation of all the common design patterns which is
 * very beneficial among the developers which especially for Java Developers.
 *
 * <p> There are mainly three kinds of **Design Patterns** :
 * 1. Creational
 * 2. Structural
 * 3. Behavioral
 *
 * This project will deep dive into all the above three with demoable code is written in Kotlin.
 * <p>
 *
 * @version 1.0.0
 * @github https://github.com/BaidyanathPrasad/design-patterns
 *
 * @author Baidyanath Prasad
 * @website https://baidyanathprasad.com
 */
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
        //Input choice of the available families
        println("Enter your choice(Animal, Color): ")

        val choice = readLine()!!

        //Get the respective factory based on the input provided
        when (abstractFactoryProvider.getFactory(choice)) {
            is AnimalFactory -> {
                println("Enter animal name: ")
                val name = readLine()!!

                //Extract the type of animal based of the input provided.
                when (val animal = AnimalFactory().createType(name)) {
                    is Dog -> println("${animal.eat()} \n${animal.sound()}")
                    is Duck -> println("${animal.eat()} \n${animal.sound()}")
                    else -> println("You entered the wrong name: $name")
                }
            }
            is ColorFactory -> {
                println("Enter color name: ")
                val name = readLine()!!

                //Extract the type of color based of the input provided.
                when (val color = ColorFactory().createType(name)) {
                    is White -> println("${color.apply()} \n${color.remove()}")
                    is Blue -> println("${color.apply()} \n${color.remove()}")
                    else -> println("You entered the wrong name: $name")
                }
            }
        }
    }
}