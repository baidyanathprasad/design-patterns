package abstractfactory.color

/**
 * This interface represents the Color family with its general
 * characteristic - apply and remove
 */
interface Color {
    fun apply(): String

    fun remove(): String
}