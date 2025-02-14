package com.compiletimeexception;

//import
import java.io.FileReader;
import java.io.*;
//class
public class CheckedExceptionExample {

    public static void main(String[] args) {
        //file Name
        String fileName="data.txt";

        //using try catch block here
        try{
            //using filereader and bufferedReader
            FileReader fileReader =new FileReader(fileName);
            BufferedReader bufferdReader=new BufferedReader(fileReader);

            String line;

            //use loop to print lines
            while((line=bufferdReader.readLine() )!= null){
                System.out.println(line);
            }
        }
        //use catch block if file does not exist
        catch(FileNotFoundException e){
            System.out.println("File not found" +e.getMessage());
        }
        //use catch block if file does not have content
        catch(IOException e){
            System.out.println("Content is not available"+e.getMessage());
        }
    }
}
