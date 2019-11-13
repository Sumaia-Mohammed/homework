package lesson21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reaad {
    public static void main(String[] args)throws IOException {

        File file = new File("C:\\Users\\sasys\\homework\\src\\lesson21\\My.File");
        File file1 = new File("C:\\Users\\sasys\\homework\\src\\lesson21\\My.File2");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br1 = new BufferedReader(new FileReader(file1));

        String st ;
        while (((st = br.readLine()) != null)||((st = br1.readLine()) != null )){
            System.out.println(st);

        }

      /*  while ((st = br1.readLine()) != null ){
            System.out.println(st);

        }*/

    }
}
