package lesson16;

import java.util.HashMap;
import java.util.Map;

public class BankAplication {
    public static void main(String[] args) {
        Payment inCafe = new Payment(1,10.0,"Cafe",10,2019);
        Payment inCafe2 = new Payment(2,9.2,"Cafe",9,2019);
        Payment rentOctober = new Payment(3,302.0,"House",10,2019);
        Payment rentNovember = new Payment(4,302.0,"House",11,2019);
        Payment foodRewe = new Payment(5,-12.5,"Cafe",10,2019);
        Payment salaryOctober = new Payment(6,1200,"Salary",10,2019);
        Payment salaryNovember = new Payment(7,1200,"Salary",11,2019);

        Map<Integer,Payment>payments = new HashMap<>();
        payments.put(inCafe.getId(),inCafe);
        payments.put(inCafe2.getId(),inCafe2);
        payments.put(rentOctober.getId(),rentOctober);
        payments.put(rentNovember.getId(),rentNovember);
        payments.put(foodRewe.getId(),foodRewe);

        double f = 1000;
        int min=0;
       for(Map.Entry<Integer,Payment>entry :payments.entrySet()){
           Payment payment= entry.getValue();
           if (payment.getCategory().contains("Cafe")){
           if (payment.getAmount()<f) {
               f = payment.getAmount();
               min = payment.getId();
           }
           }
       }
        int sum = 0;
        for(Map.Entry<Integer,Payment>entry :payments.entrySet()) {
            if (entry.getValue().getAmount() >= 0) {
                sum += entry.getValue().getAmount();
            }
        }
        System.out.println("The total income is: "+ sum);




        System.out.println(min);
        System.out.println( payments.get(min).print());
       // System.out.println( payments.get(min).printTotal());


     /*   Map<String, Double>inCategories = new HashMap<>();
        for(Map.Entry<Integer,Payment> entry :payments.entrySet()) {
            Payment payment = entry.getValue();
            String category = payment.getCategory();

            inCategories.put(category,payment.getAmount());
        }
        System.out.println(inCategories);*/

        Map<String, Double>inCategories = new HashMap<>();
        for(Map.Entry<Integer,Payment> entry :payments.entrySet()) {
            Payment payment = entry.getValue();
            String category = payment.getCategory();

            double categorySum = inCategories.getOrDefault(category,0.0);
            categorySum +=payment.getAmount();


            inCategories.put(category,payment.getAmount());
        }
        System.out.println(inCategories);








    }
}
