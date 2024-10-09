package net.zffu.commons.storage.bundles;

/**
 * <p>Stores two elements of different data types.</p>
 * @param <K> the first data type.
 * @param <T> the second data type.
 */
public class Bundle<K, T> {

    protected K k;
    protected T t;

    /**
     * <p>Creates a new bundle with the new provided elements.</p>
     * @param k the first element.
     * @param t the second element.
     */
    public Bundle(K k, T t) {
        this.k = k;
        this.t = t;
    }

    /**
     * <p>Gets the first element</p>
     * @return the first element as K
     */
    public K getFirst() {
        return this.k;
    }

    /**
     * <p>Gets the second element.</p>
     * @return the second element as T
     */
    public T getSecond() {
        return this.t;
    }

}
