package net.zffu.commons.storage.bundles;

import net.zffu.commons.seal.Sealable;

/**
 * <p>A {@link WritableBundle} that can be sealed to prevent further modifications.</p>
 * @param <K> the first data type.
 * @param <T> the second data type.
 */
public class SealableBundle<K, T> extends WritableBundle<K, T> implements Sealable<SealedBundle<K, T>> {

    /**
     * <p>Creates a new bundle with the new provided elements.</p>
     *
     * @param k the first element.
     * @param t the second element.
     */
    public SealableBundle(K k, T t) {
        super(k, t);
    }

    @Override
    public SealedBundle<K, T> seal() throws IllegalStateException {
        return new SealedBundle<>(k, t);
    }

}
