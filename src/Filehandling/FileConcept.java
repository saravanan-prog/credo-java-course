package Filehandling;

import java.io.*;
public class FileConcept {
    public static void main(String[] args) {

            try{
                FileWriter fw = new FileWriter("saravanan.txt");
                fw.write("Hello Prem welcome to Java world");
                fw.write("created By : Saravanan");
                fw.close();
                System.out.println("File is created and successfully content loaded");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }


    }
}
