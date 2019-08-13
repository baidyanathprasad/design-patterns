package abstractfactory.factory

/**
 * This interface create type of the family based on the type entered.
 */
interface AbstractFactory<T> {
    fun createType(type: String): T?
}