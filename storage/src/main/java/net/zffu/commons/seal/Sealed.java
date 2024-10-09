package net.zffu.commons.seal;

/**
 * <p>An object that is "permanently" sealed.</p>
 * @since 1.0.0
 */
public interface Sealed extends Sealable{

    default void seal() {
        throw new IllegalStateException("You cannot seal an already sealed object!");
    }

    /**
     * <p>Returns if the object is sealed or not.</p>
     * @return true.
     */
    default boolean isSealed() {
        return true;
    }

}
