package JavaAdvanced.IOFiles;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;
        int c;
        try {
            inputStream = new FileReader("test.txt");
            System.out.println(new File(".").getCanonicalFile());
            outputStream = new FileWriter("testInput.txt");
            /*while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);}*/

            Scanner scanner=new Scanner(System.in);
            System.out.println("Shift of");
            int shift=scanner.nextInt();

            while ((c = inputStream.read()) != -1) {

                if (c == 32) {
                    System.out.print((char) c);
                    outputStream.write(c);
                } else if ((c > (122 - shift))) {
                    c=(96+(shift-(122-c)));
                    System.out.print((char) (c));
                    outputStream.write((c));
                } else {
                    c+=shift;
                    System.out.print((char) (c));
                    outputStream.write((c));
                }
            }


        } catch (IOException e) {
            e.printStackTrace();   //wydrukuje stos wykorzystanych metod
        } /*catch (FileNotFoundException e){  //IO exception już wyłapuje ten bład
            e.printStackTrace();
        }
        */ finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
