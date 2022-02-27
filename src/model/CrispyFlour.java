package model;

import java.time.LocalDate;
import java.time.Year;

public class CrispyFlour extends Material implements Discount{

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufaturingDate, int cost, int quantity) {
        super(id, name, manufaturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        double result = quantity*getCost();
        return result;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate result = getManufaturingDate().plusYears(1);
        return result;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", manufaturingDate=" + getManufaturingDate() +
                ", cost=" + getCost() +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        LocalDate expiry = getExpiryDate();
        double realMoney = 0;
       if(today.plusMonths(2).isAfter(expiry) || today.plusMonths(2).isEqual(expiry)) {
           realMoney = getAmount() - getAmount()/100*40;
       } else if (today.plusMonths(4).isAfter(expiry) || today.plusMonths(4).isEqual(expiry) && today.plusMonths(2).isBefore(expiry) ) {
           realMoney = getAmount() - getAmount()/100*20;
       } else if (today.plusMonths(4).isBefore(expiry)) {
           realMoney = getAmount() - getAmount()/100*5;
       }
        return realMoney;
    }
}
