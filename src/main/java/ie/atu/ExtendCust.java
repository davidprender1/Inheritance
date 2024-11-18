package ie.atu;

public class ExtendCust extends Customer {
    private int loyaltyPoints;

    private int discount;

    public ExtendCust() {

    }

    public ExtendCust(String name, String address, String phone, String custNumber, boolean mailingList, int loyaltyPoints, int discount) {
        super(name, address, phone, custNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "loyaltyPoints='" + loyaltyPoints + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }

    public String getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public void setLoyaltyPoints(String loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}
