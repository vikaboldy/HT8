package com.company;

import java.math.BigDecimal;

public class LongDeposit extends Deposit implements Prolongable{


    public LongDeposit(BigDecimal depositeAmount, int depositePeriod) {
        super(depositeAmount, depositePeriod);
    }

    @Override
    public BigDecimal Income() {
        BigDecimal income = BigDecimal.valueOf(0);
        BigDecimal income_amount=BigDecimal.valueOf(0);
        BigDecimal deposite_amount = super.getAmount();
        double percent = 0.15;
        for (int i = 0; i <= super.getPeriod(); i++) {

            if(i>=7){
                income_amount = deposite_amount.multiply(BigDecimal.valueOf(percent));
                deposite_amount=deposite_amount.add(income_amount);
            }

        }
        income = deposite_amount.subtract(super.getAmount());
        return income;
    }


    public boolean canToProlong() {
        return getPeriod() <= 3;
    }

    @Override
    public String toString() {
        return "LongDeposit{"+fullDepositeAmount()+"}";
    }
}
