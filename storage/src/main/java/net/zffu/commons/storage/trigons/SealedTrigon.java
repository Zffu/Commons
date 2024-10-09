package net.zffu.commons.storage.trigons;

import net.zffu.commons.seal.Sealed;

public class SealedTrigon<A, B, C> extends SealableTrigon<A, B, C> implements Sealed<SealedTrigon<A, B, C>> {

    /**
     * <p>Creates a new {@link Trigon} with the provided elements.</p>
     *
     * @param a the first element.
     * @param b the second element.
     * @param c the third element.
     */
    public SealedTrigon(A a, B b, C c) {
        super(a, b, c);
    }

}
