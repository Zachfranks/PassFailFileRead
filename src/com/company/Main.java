package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        //global variubles

        double sumWeight = 0;
        int numStudents = 0;
        int pass = 0;


        java.io.File PassFail = new java.io.File("/Users/zachary/Desktop/DATA10.txt");

        try {
            //scanner to read what the user is entering
            Scanner reader = new Scanner(PassFail);

            ArrayList<Double> arrayListWeight = new ArrayList<Double>();


            String input = reader.nextLine();
            Scanner weightReader = new Scanner(input);

            while (weightReader.hasNextDouble()) {
                double x = weightReader.nextDouble();
                arrayListWeight.add(x);
            }

            //Scanner studentReader = new Scanner(System.in);
            // Scanner markReader = new Scanner(System.in);


            //System.out.println("Add the weights in th line under make sure the numbers add up to 100. \n enter 'Done' when finished");


            //System.out.println("the weights are" + arrayListWeight);

            for (int i = 0; i < arrayListWeight.size(); i++) {
                sumWeight = sumWeight + arrayListWeight.get(i);
            }

            /*
            if (arrayListWeight == 100) {

            } else {
                System.out.println("enter a sum that is = 100");
            }

             */

            input = reader.nextLine();

            Scanner studentReader = new Scanner(input);

            numStudents = studentReader.nextInt();


            while (reader.hasNextLine()) {
                //System.out.println("Enter the marks for each students");

                for (int j = 0; j < numStudents; j++) {
                    double sum = 0;
                    input = reader.nextLine();
                    Scanner markReader = new Scanner(input);
                    for (int k = 0; k < arrayListWeight.size(); k++) {
                        double x = markReader.nextDouble();
                        sum = sum + x * arrayListWeight.get(k) / 100.;
                    }
                    System.out.println(sum);
                    if (sum >= 50.) {
                        pass++;
                    }
                }
                System.out.println(pass + " passed");
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Cannot open /Users/zachary/Desktop/DATA10.txt");
            System.exit(0);
        }
    }
}
