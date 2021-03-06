package controller;

import model.DataRetriever;

public class Offer {
    Double offerPrice;
    Driver driver;
    int rideID;
    DataRetriever db = DataRetriever.getInstance();

    public Offer() {
    }

    public Offer(Double offerPrice, Driver driver, int rideID) {
        this.offerPrice = offerPrice;
        this.driver = driver;
        this.rideID = rideID;
    }

    public int getRideID(){
        return rideID;
    }

    @Override
    public String toString() {
        return this.driver.account.getUsername();
    }

    public double getOfferPrice() {
        return this.offerPrice;
    }

    public double getAvgRating() {
        return db.calAvgRating(this.driver);
    }
}
