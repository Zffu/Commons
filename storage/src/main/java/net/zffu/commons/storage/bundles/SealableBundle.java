package net.zffu.commons.storage.bundles;

/**
 * <p>A {@link Bundle} that can be sealed.</p>
 * @since 1.0.0
 */
public interface SealableBundle<K, T> extends WritableBundle<K, T> {

    /**
     * <p>Seals the {@link Bundle} and prevents future modifications.</p>
     * @throws IllegalStateException
     */
    void seal() throws IllegalStateException;

    /**
     * <p>Returns if the {@link Bundle} is sealed or not</p>
     * @return true or false.
     */
    boolean isSealed();

}
