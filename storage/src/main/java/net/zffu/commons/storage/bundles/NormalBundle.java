package net.zffu.commons.storage.bundles;

/**
 * <p>Allows to store an element of type K and another element of type T</p>
 * @param <K> the type of the first element
 * @param <T> the type of the second element
 * @since 1.0.0
 */
public class NormalBundle<K, T> implements Bundle<K, T> {

    private K k;
    private T t;

    /**
     * <p>Constructs a new {@link NormalBundle} with the provided values.</p>
     * @param k the first element
     * @param t the second element
     */
    public NormalBundle(K k, T t) {
        this.k = k;
        this.t = t;
    }

    /**
     * <p>Gets the first element contained in the bundle.</p>
     * @return the first element of type K
     */
    @Override
    public K getFirst() {
        return this.k;
    }

    /**
     * <p>Gets the second element contained in the bundle.</p>
     * @return the second element of type T
     */
    @Override
    public T getSecond() {
        return this.t;
    }

}
