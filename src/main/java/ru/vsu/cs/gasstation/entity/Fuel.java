package ru.vsu.cs.gasstation.entity;

import javax.persistence.*;

@Entity
@Table(name = "fuels")
public class Fuel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "octane")
    private int octane;

    @Column(name = "mark")
    private String mark;

    @Column(name = "price")
    private int price;


    public Fuel(int octane, String mark, int price) {
        this.octane = octane;
        this.mark = mark;
        this.price = price;
    }

    public Fuel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOctane() {
        return octane;
    }

    public void setOctane(int octane) {
        this.octane = octane;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "id=" + id +
                ", octane=" + octane +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                '}';
    }
}
