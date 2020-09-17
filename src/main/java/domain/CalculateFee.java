package domain;

public abstract class CalculateFee {

    protected int fee;

    protected int roundUp(int value) {

        int residuo = value % 100;

        if (residuo != 0) {
            value += 100 - residuo;
        }

        return value;
    }

    public abstract int calculateFee(int parkingTime);

}
