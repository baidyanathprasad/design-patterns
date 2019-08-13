package abstractfactory.provider

import abstractfactory.factory.AnimalFactory
import abstractfactory.factory.ColorFactory

/**
 * This @class provides the factory of family based on the family choice
 * For example - if input is Animal it should return the Animal factory and
 * so on.
 */
class AbstractFactoryProvider {
    fun getFactory(choice: String) = when {
        "Animal".equals(choice, true) -> AnimalFactory()
        "Color".equals(choice, true) -> ColorFactory()
        else -> null
    }
}