package net.zffu.commons.storage.bundles;

/**
 * <p>A {@link Bundle} that can be written.</p>
 * @param <K> the first data type.
 * @param <T> the second data type.
 */
public class WritableBundle<K, T> extends Bundle<K, T> {

    /**
     * <p>Creates a new bundle with the new provided elements.</p>
     *
     * @param k the first element.
     * @param t the second element.
     */
    public WritableBundle(K k, T t) {
        super(k, t);
    }

    /**
     * <p>Sets the first element of the {@link Bundle}</p>
     * @param k the future first element
     */
    public void setFirst(K k) {
        this.k = k;
    }

    /**
     * <p>Sets the second element of the {@link Bundle}</p>
     * @param t the future second element
     */
    public void setSecond(T t) {
        this.t = t;
    }

}
