package net.zffu.commons.seal;

/**
 * <p>An object that can be sealed to prevent further modifications.</p>
 */
public interface Sealable<K> {

    /**
     * <p>Seals the object and internally prevents further modifications.</p>
     * @throws IllegalStateException if the object is already sealed.
     */
    K seal() throws IllegalStateException;

    /**
     * <p>Returns if the object is sealed or not</p>
     * @return true or false.
     */
    default boolean isSealed() {
        return false;
    }

}
