package org.wallet;

public class Wallet {
    private String color;
    private int size;
    private double balance;
    private boolean isLost;
    private boolean isOpen;

    public Wallet(String color, int size, boolean isLost, double balance) {
        this.color = color;
        this.size = size;
        this.isLost = isLost;
        this.balance=balance;
        this.isOpen=false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isLost() {
        return isLost;
    }


    public void setLost(boolean lost) {
        isLost = lost;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double addvola(double amount){
        balance += amount;
        return balance;
    }

    public double getVola(){
        return balance;
    }

    public boolean close(){
        if (isOpen)
            isOpen = false;
        return true;
    }

    public boolean open() {
        if (!isOpen) {
            isOpen = true;
        }
        return true;
    }
}
