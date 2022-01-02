public class FirstRideDiscount implements Discount {
    User user;
    DataRetriever db = DataRetriever.getInstance();

    FirstRideDiscount(User user) {
        this.user = user;
    }

    @Override
    public double getDiscount(double price) {
        if (db.isFirstRide(this.user)) {
            return price - (price * 0.1);
        }
        return price;
    }
}
