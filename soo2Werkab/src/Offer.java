public class Offer {
    Integer offerPrice;
    Driver driver;

    public Offer() {
    }

    public Offer(Integer offerPrice, Driver driver) {
        this.offerPrice = offerPrice;
        this.driver = driver;
    }
    @Override
    public String toString(){
        return this.driver.account.getUsername();
    }
    public double getOfferPrice(){
        return this.offerPrice;
    }
}
