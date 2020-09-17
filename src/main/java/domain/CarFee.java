package domain;

public class CarFee extends CalculateFee {

    @Override
    public int calculateFee(int parkingTime) {

        fee = 2000;

        if (parkingTime > 60) {
            fee += (parkingTime - 60) * (50 / 3);
            fee = roundUp(fee);
        }

        return fee;
    }
}
