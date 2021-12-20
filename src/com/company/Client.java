package com.company;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Client {
    private  Deposit[] deposits;

    public Client() {
        deposits = new Deposit[10];
    }

    public boolean addDeposite(Deposit deposit){
        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i]==null){
                this.deposits[i]=deposit;
                return true;
            }

        }
        return false;
    }

    public BigDecimal totalIncome(){
        BigDecimal total_income = BigDecimal.valueOf(0);
        for (int i = 0; i < deposits.length; i++) {
            if(deposits[i]!=null){
                total_income = total_income.add(deposits[i].Income());

            }else break;

        }
        return total_income;
    }

    public BigDecimal maxIncome(){
        BigDecimal max_income = BigDecimal.valueOf(0);

        for (Deposit deposit : deposits) {
            if (deposit != null) {
                if (deposit.Income().compareTo(max_income) > 0) {
                    max_income = deposit.Income();
                }
            } else break;
        }
        return max_income;
    }

    public BigDecimal getIncomeByNumber(int n){
        if(deposits[n-1]!=null){
            return deposits[n-1].Income();
        }
        return BigDecimal.valueOf(0);
    }

    public Iterator<Deposit> iterator(){
        return new Iterator<>(){
            private int pos = 0;

            public boolean hasNext(){
                return pos<deposits.length;
            }

            public Deposit next(){
                if(!hasNext()) throw new NoSuchElementException();

                return deposits[pos++];
            }
        };
    }



public void sortDeposits(){

        //сортировка пузырьком
        boolean isSorted = false;
        Deposit buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < deposits.length-1; i++) {

                if(deposits[i].fullDepositeAmount().compareTo(deposits[i+1].fullDepositeAmount())<0){
                    isSorted= false;

                    buf=deposits[i];
                    deposits[i]=deposits[i+1];
                    deposits[i+1]=buf;
                }
            }
        }

}

public int countPossibleToProlongDeposit(){
        int count = 0;
    for (Deposit deposit : deposits) {
        if (deposit != null) {
            if (deposit.canToProlong()) {
                count++;
            }
        } else break;
    }
    return count;
}

    @Override
    public String toString() {
        return "Client{" +
                "deposits=" + Arrays.toString(deposits) +
                '}';
    }
}