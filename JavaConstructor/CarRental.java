public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final int COST_PER_DAY = 50;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }
}
