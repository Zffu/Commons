package net.zffu.commons.storage.bundles;

import net.zffu.commons.seal.Sealed;

/**
 * <p>A bundle that is sealed from any further modifications.</p>
 * @param <K> the first data type.
 * @param <T> the second data type.
 */
public class SealedBundle<K, T> extends WritableBundle<K, T> implements Sealed<SealedBundle> {

    /**
     * <p>Creates a new bundle with the new provided elements.</p>
     *
     * @param k the first element.
     * @param t the second element.
     */
    public SealedBundle(K k, T t) {
        super(k, t);
    }

    @Override
    public void setFirst(K k) {
        throw new IllegalArgumentException("Object is sealed!");
    }

    @Override
    public void setSecond(T t) {
        throw new IllegalArgumentException("Object is sealed!");
    }
}
