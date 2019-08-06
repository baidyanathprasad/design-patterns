package abstractfactory.factory

interface AbstractFactory<T> {
    fun createType(type: String): T?
}