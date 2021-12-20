package com.company;

import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit> {

    private BigDecimal amount;
    private int period;

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }


    public BigDecimal fullDepositeAmount(){
        return amount.add(Income());
    }

    public Deposit(BigDecimal depositeAmount, int depositePeriod) {
        this.amount=depositeAmount;
        this.period=depositePeriod;

    }

public boolean canToProlong(){
        return false;
}
    public abstract BigDecimal Income();

    public int compareTo(Deposit deposit){
        return this.amount.compareTo(deposit.amount);
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                ", period=" + period +
                '}';
    }
}
