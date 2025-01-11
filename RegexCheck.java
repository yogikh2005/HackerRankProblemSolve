/*
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D
*/
import java.io.*;
import java.util.*;

class MyRegex {
    // Updated regular expression to allow leading zeros
    String pattern = "^((0{1,2}[0-9]|0?[0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}" +
                     "(0{1,2}[0-9]|0?[0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}

public class RegexCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        
        // Read input
        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            // Validate IP using the regex pattern
            if (ip.matches(myRegex.pattern)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        
        scanner.close();
    }
}
