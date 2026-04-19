package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer dostarcza podstawową funkcjonalność wyliczanki.
 * Działa w oparciu o strukturę stosu (LIFO).
 */
public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY = -1;
    public static final int FULL = 11;
    private final int[] NUMBERS = new int[CAPACITY];

    private int total = -1;

    public int getTotal() {
		return total;
	}

	public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}