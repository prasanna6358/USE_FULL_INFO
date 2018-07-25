package com.amara.palikala.jain;

public class Fruit implements Comparable<Fruit> {


    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public String getFruitDesc() {
        return fruitDesc;
    }
    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitDesc='" + fruitDesc + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Fruit compare) {
        //int compareQuantity = compare.getQuantity();
        return this.fruitName.compareTo(compare.getFruitName());
    }
}
