package abstractfactory.animal

/**
 * An interface which says the common behavior of the @Animal
 *
 * @Animal can eat
 * @Animal can sound
 */
interface Animal {
    fun eat(): String

    fun sound(): String
}