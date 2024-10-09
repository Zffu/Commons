package net.zffu.commons.storage.trigons;

/**
 * <p>A {@link Trigon} that can be written over.</p>
 * @param <A> the first data type.
 * @param <B> the second data type.
 * @param <C> the third data type.
 */
public class WritableTrigon<A, B, C> extends Trigon<A, B, C> {

    /**
     * <p>Creates a new {@link Trigon} with the provided elements.</p>
     *
     * @param a the first element.
     * @param b the second element.
     * @param c the third element.
     */
    public WritableTrigon(A a, B b, C c) {
        super(a, b, c);
    }

    /**
     * <p>Sets the first element of the {@link Trigon}.</p>
     * @param a the future first element of the trigon.
     */
    public void setFirst(A a) {
        this.a = a;
    }

    /**
     * <p>Sets the second element of the {@link Trigon}.</p>
     * @param b the future second element of the trigon.
     */
    public void setSecond(B b) {
        this.b = b;
    }

    /**
     * <p>Sets the first third of the {@link Trigon}.</p>
     * @param c the future third element of the trigon.
     */
    public void setC(C c) {
        this.c = c;
    }

}
