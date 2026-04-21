package Filehandling;

import java.io.*;
public class FileConcept {
    public static void main(String[] args) {
        File fs = new File("data.txt");

        System.out.println(fs.exists());
        System.out.println(fs.getName());
        System.out.println("fs path name===>" + fs.getAbsolutePath());

    }
}
