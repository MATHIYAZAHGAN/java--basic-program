// How do you read/write a text file

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class java27{
    public static void main(String[] args)throws Exception {

  

      FileWriter abc = new  FileWriter("hello.txt");
abc.write("java basic interview programs.. .. ..");
abc.close();

File ab = new File("hello.txt");
Scanner read  = new Scanner(ab);
while(read.hasNextLine()){
  String data =read.nextLine();
  System.out.println(data);
}


    

        
    }
}
