package net.zffu.commons.seal;

/**
 * <p>An object that can be sealed to prevent further modifications.</p>
 * @param <K> the target output class.
 */
public interface Sealable<K extends Sealed> {

    /**
     * <p>Seals the object and internally prevents further modifications.</p>
     * @throws IllegalStateException if the object is already sealed.
     */
    K seal() throws IllegalStateException;

    /**
     * <p>Returns if the object is sealed or not</p>
     * @return true or false.
     */
    boolean isSealed();

}
