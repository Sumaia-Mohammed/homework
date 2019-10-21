package lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> typeArtPiece= new HashSet<>();
        typeArtPiece.add("Painting");

        MoMa one = new MoMa("Guernica",typeArtPiece, 1937,"Pablo Picasso","a beautiful pic for a women");
        MoMa two = new MoMa("The Starry Night" ,1889);
        MoMa three = new MoMa("Untitled ", 2018);
        MoMa four = new MoMa( "Fiery Sunset",  1973);
        MoMa five = new MoMa( "The Kiss",  1907);

        Map<String,Integer> momas=new HashMap<>();
        momas.put("Guernic",1937);
        momas.put("The Starry Night",1889);
        momas.put("Untitled ",2018);
        momas.put("Fiery Sunset",1973);
        momas.put("The Kiss",1907);

       int x = 1;
        System.out.println("Welcome to MoMa! Please select one of the pieces below");
          for (Map.Entry<String,Integer>entry : momas.entrySet()) {


              System.out.println(x++ + ". " + entry.getKey() + " - " + entry.getValue());
        }

        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println(one.printMomo());
                break;
            case 2:
                System.out.println(two.printMomo());
                break;
            case 3:
                System.out.println(three.printMomo());
                break;
            case 4:
                System.out.println(four.printMomo());
                break;
            case 5:
                System.out.println(five.printMomo());
                break;
        }



    }
}
