package com.company;

import java.math.BigDecimal;

public class BaseDeposit extends Deposit{


    public BaseDeposit(BigDecimal depositeAmount, int depositePeriod) {
        super(depositeAmount, depositePeriod);
    }

    @Override
    public BigDecimal Income() {
        BigDecimal income = null;
        BigDecimal income_amount=BigDecimal.valueOf(0);
        BigDecimal deposite_amount = super.getAmount();
        double percent = 0.05;
        for (int i = 0; i <= super.getPeriod(); i++) {
            if(i>=1){
                income_amount = deposite_amount.multiply(BigDecimal.valueOf(percent));
                deposite_amount=deposite_amount.add(income_amount);
            }
        }
        income = deposite_amount.subtract(super.getAmount());
        return income;
    }

    @Override
    public String toString() {
        return "BaseDeposit{"+fullDepositeAmount()+"}";
    }
}
