package model;

import model.Material;

import java.time.LocalDate;

public class Meat extends Material implements Discount{

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufaturingDate, int cost, double weight) {
        super(id, name, manufaturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        double result = getCost()*weight;
        return result;
    }

    @Override
    public LocalDate getExpiryDate() {
        LocalDate result = getManufaturingDate().plusDays(7);
        return result;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", manufaturingDate=" + getManufaturingDate() +
                ", cost=" + getCost() +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        LocalDate expiry = getExpiryDate();
        double realMoney = 0;
        if (today.plusDays(5).isEqual(expiry) || today.plusDays(5).isAfter(expiry)) {
            realMoney = getAmount() - getAmount()/100*30;
        } else if (today.plusDays(5).isBefore(expiry)) {
            realMoney = getAmount() - getAmount()/100*10;
        }
        return realMoney;
    }
}
