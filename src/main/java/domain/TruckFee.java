package domain;

public class TruckFee extends CalculateFee {

    @Override
    public int calculateFee(int parkingTime) {

        fee = 15000;

        if (parkingTime <= 720) {
            fee = 10000;
        } else if (parkingTime > 1440) {
            fee += (parkingTime - 1440) * (125.0 / 12.0);
            fee = roundUp(fee);
        }

        if (Sortear()) {
            fee = 0;
        }

        return fee;
    }

    private boolean Sortear() {

        int numeroAleatorio = (int) (Math.random() * (1000 - 1)) + 1;
        return fee % numeroAleatorio == 0;
    }

}
