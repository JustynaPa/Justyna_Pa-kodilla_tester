package com.kodilla.bank.homework;

public class CashMachine {

    double[] transaction;

    public CashMachine(double[] transaction) {
        this.transaction = transaction;
    }

    public double getBalance() {
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            sum += this.transaction[i];
        }
        return sum;
    }

    public int getQuantity() {
        return transaction.length;
    }

    public int getPayOutQuantity() {
        int quantity = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if(this.transaction[i] < 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public int getPayInQuantity() {
        int quantity = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if(this.transaction[i] > 0) {
                quantity++;
            }
        }
        return quantity;
    }

    public double getPayOutSum() {
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if(this.transaction[i] < 0) {
                sum += this.transaction[i];
            }
        }
        return sum;
    }

    public double getPayInSum() {
        double sum = 0;
        for (int i = 0; i < this.getQuantity(); i++) {
            if(this.transaction[i] > 0) {
                sum += this.transaction[i];
            }
        }
        return sum;
    }


}