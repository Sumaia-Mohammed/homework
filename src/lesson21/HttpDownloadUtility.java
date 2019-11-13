package lesson21;

import java.io.*;

public class HttpDownloadUtility {
        public static void main(String[] args) throws IOException {
           /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter String");
            String s = br.readLine();
            System.out.print("Enter Integer:");
            try {
                int i = Integer.parseInt(br.readLine());
            } catch(NumberFormatException nfe) {
                System.err.println("Invalid Format!");
            }*/
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();

            Writer writer = new FileWriter("Gatto.txt");
            writer.write(text);
            writer.close();
        }


}