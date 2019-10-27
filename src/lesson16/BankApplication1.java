package lesson16;


import java.util.*;

public class BankApplication1 {

    public static void main(String[] args) {

        Payment1 inCafe = new Payment1(1, -10.0, "Cafe", 10, 2019);
        Payment1 inCafe2 = new Payment1(2, -11.2, "Cafe", 9, 2019);
        Payment1 rentOctober = new Payment1(3, -302.0, "House", 10, 2019);
        Payment1 rentNovember = new Payment1(4, -302.0, "House", 11, 2019);
        Payment1 foodRewe = new Payment1(5, -12.0, "Groceries", 10, 2019);
        Payment1 salaryOctober = new Payment1(6, 1200, "Salary", 10, 2019);
        Payment1 salaryNovember = new Payment1(7, 1200, "Salary", 11, 2019);

        Map<Integer, Payment1> payments = new HashMap<>();
        payments.put(inCafe.getId(), inCafe);
        payments.put(inCafe2.getId(), inCafe2);
        payments.put(rentOctober.getId(), rentOctober);
        payments.put(rentNovember.getId(), rentNovember);
        payments.put(foodRewe.getId(), foodRewe);
        payments.put(salaryOctober.getId(), salaryOctober);
        payments.put(salaryNovember.getId(), salaryNovember);


        Payment1 theBiggestPayment = null;
        for(Map.Entry<Integer, Payment1> entry: payments.entrySet()) {
            if (entry.getValue().getAmount() >= 0) {
                continue;
            }

            if (theBiggestPayment == null) {
                theBiggestPayment = entry.getValue();
            }

            if (theBiggestPayment.getAmount() > entry.getValue().getAmount()) {
                theBiggestPayment = entry.getValue();
            }
        }

        System.out.println("The biggest payment is " + theBiggestPayment.printPayment());


        int sum = 0;
        for (Map.Entry<Integer, Payment1> entry: payments.entrySet()) {
            if (entry.getValue().getAmount() >= 0) {
                sum += entry.getValue().getAmount();
            }
        }
        System.out.println("The total income is: " + sum+"$");

        Map<String, Double> inCategories = new HashMap<>();
        char c ='$';
        for (Map.Entry<Integer, Payment1> entry: payments.entrySet()) {
            Payment1 payment = entry.getValue();
            String category = payment.getCategory();

            double categorySum = inCategories.getOrDefault(category, 0.0);
            categorySum += payment.getAmount();

            inCategories.put(category, categorySum);

        }
        System.out.println("How do spend your money: "+inCategories+c);

        double summ = 0;
        String monat = " ";
        Map<String, Double> inMonth = new HashMap<>();
        for (Map.Entry<Integer, Payment1> entry: payments.entrySet()) {
            Payment1 payment = entry.getValue();
          int month =payment.getMonth ();

            String monthString;
            switch (month) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
                default:
                    monthString = "Invalid month";
                    break;
            }
           // monat= monthString;
            double monthSum = inMonth.getOrDefault(monthString, 0.0);
            monthSum += payment.getAmount();
            inMonth.put(monthString, monthSum);

            // summ= monthSum;
             System.out.println("In " +monthString +" you spent: "+monthSum+"$");
            // System.out.println("In " +monat +" you spent: "+amount+"$"+ " and earned: " +amount+"$");
            monat= monthString;
    }
        System.out.println(inMonth);




      /*  Map<Integer, Double> inMonth = new HashMap<>();
        for (Map.Entry<Integer, Payment1> entry: payments.entrySet()) {
            Payment1 payment = entry.getValue();
            int month = payment.getMonth();

            double monthSum = inMonth.getOrDefault(month, 0.0);
            monthSum += payment.getAmount();
            inMonth.put(month, monthSum);
        }*/
        //System.out.println(inMonth);

        System.out.println(" Enter what statistics you want to see:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(1+" - My biggest payment");
        System.out.println(2+" - My total income");
        System.out.println(3+" - How do I spend my money");
        System.out.println(4+" - Statistics for 1 year");
        System.out.println(0+" - exit");


        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("The biggest payment is " + theBiggestPayment.printPayment());
                break;
            case 2:
                System.out.println("The total income is: " + sum+"$");
                break;
            case 3:
                System.out.println(inCategories);
                break;
            case 4:
                System.out.println("> Enter a year: ");
                int year = scanner.nextInt();
                for (Map.Entry<Integer,Payment1>entry : payments.entrySet()) {
                    Payment1 payment = entry.getValue();
                    if (year==payment.getYear()) {
                      //  System.out.println(payment.printPayment());
                        System.out.println(payment.printY());
                      //  System.out.println("In " +monat+" "+payment.getYear()+" you spent: "+payment.getAmount()+"$");
                    }
                }System.out.println(year);
                break;
            case 5:
                System.out.println("exit");
                break;
        }




    }

}
