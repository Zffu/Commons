package net.zffu.commons.storage.trigons;

import net.zffu.commons.seal.Sealable;

/**
 * <p>A {@link WritableTrigon} that can sealed to prevent future editions.</p>
 * @param <A> the first data type.
 * @param <B> the second data type.
 * @param <C> the third data type.
 */
public class SealableTrigon<A, B, C> extends WritableTrigon<A, B, C> implements Sealable<SealedTrigon<A, B, C>> {

    /**
     * <p>Creates a new {@link Trigon} with the provided elements.</p>
     *
     * @param a the first element.
     * @param b the second element.
     * @param c the third element.
     */
    public SealableTrigon(A a, B b, C c) {
        super(a, b, c);
    }

    @Override
    public SealedTrigon<A, B, C> seal() throws IllegalStateException {
        return new SealedTrigon<>(a, b, c);
    }
}
