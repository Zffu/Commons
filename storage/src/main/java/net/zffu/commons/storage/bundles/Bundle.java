package net.zffu.commons.storage.bundles;

/**
 * <p>Base of a bundle. Allows to store an element of type K and another element of type T</p>
 * @param <K> the type of the first element
 * @param <T> the type of the second element
 * @since 1.0.0
 */
public interface Bundle<K, T> {

    /**
     * <p>Gets the first element contained in the bundle.</p>
     * @return the first element of type K
     */
    K getFirst();

    /**
     * <p>Gets the second element contained in the bundle.</p>
     * @return the second element of type T
     */
    T getSecond();

}
