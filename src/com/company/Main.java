package com.company;

import javafx.util.Builder;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //loopy

        String yes = " ", no, maybe;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder();


        for(int x=1; x<=5; x++ ) {
            System.out.println("Enter any word:");
            output.append(scan.nextLine());
        }

        System.out.println(output);




        }
    }




