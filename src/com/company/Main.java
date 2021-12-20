package com.company;


import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Client cl = new Client();

        LongDeposit dep1 = new LongDeposit(BigDecimal.valueOf(1000),2);//income:0
        LongDeposit dep2 = new LongDeposit(BigDecimal.valueOf(100),7);//income:15
        LongDeposit dep3 = new LongDeposit(BigDecimal.valueOf(2000),12);//income:2626.121531250000
        SpecialDeposit dep4 = new SpecialDeposit(BigDecimal.valueOf(1000),4);//income:103.55024000
        SpecialDeposit dep5 = new SpecialDeposit(BigDecimal.valueOf(100),0);//income:0
        SpecialDeposit dep6 = new SpecialDeposit(BigDecimal.valueOf(2000),5);//income:317.4555040000
        SpecialDeposit dep7 = new SpecialDeposit(BigDecimal.valueOf(5500),2);//income:166.1000
        BaseDeposit dep8 = new BaseDeposit(BigDecimal.valueOf(1000),8);//income:477.4554437890625000
        BaseDeposit dep9 = new BaseDeposit(BigDecimal.valueOf(100),3);//income:15.762500
        BaseDeposit dep10 = new BaseDeposit(BigDecimal.valueOf(2000),1);//income:100.00

        System.out.println(dep1.canToProlong());

        cl.addDeposite(dep1);
        cl.addDeposite(dep2);
        cl.addDeposite(dep3);
     cl.addDeposite(dep4);
     cl.addDeposite(dep5);
     cl.addDeposite(dep6);
     cl.addDeposite(dep7);
    cl.addDeposite(dep8);
     cl.addDeposite(dep9);
     cl.addDeposite(dep10);

        System.out.println(cl.getIncomeByNumber(3));
        System.out.println(cl.countPossibleToProlongDeposit());
        cl.sortDeposits();
        System.out.println(cl.toString());
    }
}

