package net.zffu.commons.storage.trigons;

/**
 * <p>Stores 3 elements of different data types.</p>
 * @param <A> the first data type.
 * @param <B> the second data type.
 * @param <C> the third data type.
 */
public class Trigon<A, B, C> {

    protected A a;
    protected B b;
    protected C c;

    /**
     * <p>Creates a new {@link Trigon} with the provided elements.</p>
     * @param a the first element.
     * @param b the second element.
     * @param c the third element.
     */
    public Trigon(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * <p>Gets the first element of the {@link Trigon}</p>
     * @return the first element as A.
     */
    public A getFirst() {
        return this.a;
    }

    /**
     * <p>Gets the second element of the {@link Trigon}</p>
     * @return the second element as B.
     */
    public B getSecond() {
        return this.b;
    }

    /**
     * <p>Gets the third element of the {@link Trigon}</p>
     * @return the third element as C.
     */
    public C getThird() {
        return this.c;
    }

}
