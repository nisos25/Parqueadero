package domain;

public class MotoFee extends CalculateFee {

    @Override
    public int calculateFee(int parkingTime) {

        fee = 1000;

        if (parkingTime > 60) {
            fee += (parkingTime - 60) * (25 / 3);
            fee = roundUp(fee);
        }

        return fee;
    }
}
        

