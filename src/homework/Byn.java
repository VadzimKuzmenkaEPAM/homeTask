package homework;

import java.util.Objects;

public class Byn {
    private int value;

    public int getValue() {
        return value;
    }

    public Byn(int value) {
        this.value = value;
    }

    public Byn(int rubs, int coins) {
        this(rubs * 100 + coins);
    }

    public Byn(Byn byn) {
        this(byn.value);
    }

    public int getRub() {
        return value / 100;
    }

    public int getCoins() {
        return value % 100;
    }

    public Byn addRub(Byn byn) {
        value += byn.value;
        return this;
    }

    public Byn subtracktRub(Byn byn) {
        value -= byn.value;
        return this;
    }

    public Byn mulRub(double k) {
        value *= k;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%d.%02d", getRub(), getCoins());
    }
}