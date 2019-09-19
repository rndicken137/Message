package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter language: ");
        String str = scan.next();
	    System.out.println(Message.getMessage(str));
	    scan.close();
    }
}
