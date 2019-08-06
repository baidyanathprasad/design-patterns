package abstractfactory.factory

import abstractfactory.animal.Animal
import abstractfactory.animal.Dog
import abstractfactory.animal.Duck

class AnimalFactory : AbstractFactory<Animal> {
    override fun createType(type: String) = when {
        "Dog".equals(type, true) -> Dog()
        "Duck".equals(type, true) -> Duck()
        else -> null
    }
}