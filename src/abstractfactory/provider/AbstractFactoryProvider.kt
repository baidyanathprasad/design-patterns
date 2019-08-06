package abstractfactory.provider

import abstractfactory.factory.AnimalFactory
import abstractfactory.factory.ColorFactory

class AbstractFactoryProvider {
    fun getFactory(choice: String) = when {
        "Animal".equals(choice, true) -> AnimalFactory()
        "Color".equals(choice, true) -> ColorFactory()
        else -> null
    }
}