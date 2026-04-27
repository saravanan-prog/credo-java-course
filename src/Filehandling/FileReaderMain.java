package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderMain {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("data.txt");
            int ch;
            while((ch = fr.read()) != -1){
                System.out.println((char) ch);
            }
            fr.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
