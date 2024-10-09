package net.zffu.commons.storage.trigons;

import net.zffu.commons.seal.Sealable;

/**
 * <p>A {@link WritableTrigon} that can sealed to prevent future editions.</p>
 * @param <A> the first data type.
 * @param <B> the second data type.
 * @param <C> the third data type.
 */
public class SealableTrigon<A, B, C> extends WritableTrigon<A, B, C> implements Sealable {

    private boolean seal;

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
    public void seal() throws IllegalStateException {
        if(this.seal) throw new IllegalStateException("Trigon is already sealed!");
        this.seal = true;
    }

    @Override
    public void setFirst(A a) {
        if(this.seal) throw new IllegalStateException("Trigon is sealed!");
        super.setFirst(a);
    }

    @Override
    public void setSecond(B b) {
        if(this.seal) throw new IllegalStateException("Trigon is sealed!");
        super.setSecond(b);
    }

    @Override
    public void setThird(C c) {
        if(this.seal) throw new IllegalStateException("Trigon is sealed!");
        super.setThird(c);
    }

    @Override
    public boolean isSealed() {
        return this.seal;
    }
}
