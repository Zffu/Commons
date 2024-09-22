package net.zffu.commons.storage.bundles;

/**
 * <p>A type of {@link Bundle} that allows writing on its values.</p>
 * @param <K> the type of the first element.
 * @param <T> the type of the second element.
 * @see {@link Bundle}
 * @since 1.0.0
 */
public interface WritableBundle<K, T> extends Bundle<K, T> {

    /**
     * <p>Sets the value of the first element.</p>
     * @param k the new first element
     */
    void setFirst(K k);

    /**
     * <p>Sets the value of the second element.</p>
     * @param t the new second element
     */
    void setSecond(T t);

}
