package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWritterMain {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("credo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Welcome Credo systems");
            bw.newLine();
            bw.write("Full Stack course");
            bw.newLine();
            bw.write("Angular");
            bw.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
