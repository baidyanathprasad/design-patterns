package abstractfactory.animal

/**
 * @Duck implements @Animal
 */
class Duck: Animal {
    override fun eat() = "Duck is eating fish"

    override fun sound() = "Duck is hinging..!!"
}