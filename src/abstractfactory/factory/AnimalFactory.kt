package abstractfactory.factory

import abstractfactory.animal.Animal
import abstractfactory.animal.Dog
import abstractfactory.animal.Duck

/**
 * @AnimalFactory class implements the AbstractFactory with animal and
 * and return the instance of animal type based on the type
 */
class AnimalFactory : AbstractFactory<Animal> {
    override fun createType(type: String) = when {
        "Dog".equals(type, true) -> Dog()
        "Duck".equals(type, true) -> Duck()
        else -> null
    }
}