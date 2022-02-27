package model;

import java.time.LocalDate;

public abstract class Material implements Comparable<Material>{
    private String id;
    private String name;
    private LocalDate manufaturingDate;
    private int cost;

    public Material() {
    }

    public Material(String id, String name, LocalDate manufaturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufaturingDate = manufaturingDate;
        this.cost = cost;
    }

    @Override
    public int compareTo(Material o) {
        return this.cost - o.cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufaturingDate() {
        return manufaturingDate;
    }

    public void setManufaturingDate(LocalDate manufaturingDate) {
        this.manufaturingDate = manufaturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufaturingDate=" + manufaturingDate +
                ", cost=" + cost +
                '}';
    }

    public abstract double getAmount ();
    public abstract LocalDate getExpiryDate();
}
