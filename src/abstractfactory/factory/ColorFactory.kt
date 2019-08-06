package abstractfactory.factory

import abstractfactory.color.Blue
import abstractfactory.color.Color
import abstractfactory.color.White

class ColorFactory : AbstractFactory<Color> {
    override fun createType(type: String) = when {
        "White".equals(type, true) -> White()
        "Blue".equals(type, true) -> Blue()
        else -> null
    }
}