 import java.util.Scanner;



         public class ReadData {

 public static void main(String[] args) throws Exception {

         // Create a File instance

         java.io.File file = new java.io.File("D:\\modul 2\\m2_L16_TextFile\\src\\File");


        // Create a Scanner for the file

        Scanner input = new Scanner(file);



         // Read data from a file

         while (input.hasNext()) {

            String firstName = input.next();

             String mi = input.next();

             String lastName = input.next();

             int score = input.nextInt();

             System.out.println(

                     firstName + " " + mi + " " + lastName + " "+score );

            }



         // Close the file

         input.close();

         }
 }
