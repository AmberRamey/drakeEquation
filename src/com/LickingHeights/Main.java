package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }


    public static void drakeEquation(){
    /*Drake equation
    N = number of intelligent species that can communicate with us
    R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
    fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
    ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
    fl = 1 (100% of these planets will develop life)
    fi = 1 (100% of which will develop intelligent life)
    fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
    L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
     */
    Scanner Drake;
    Drake = new Scanner(System.in);


        int N;
    int rStar;
    double f_p;
    int numberOfExoplanets;
    double f_l;
    double f_i;
    double f_c;
    int L;

    //todo initialize scanner to take input and commit
        // Ask for rStar number store in the rStar variable and commit
        //Complete each one of the variables storing them correctly and commiting each time

        System.out.println("What is the rate of star formation in the galaxy" );
        rStar = Drake.nextInt();
        

    N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L;


    System.out.println("The number of intelligent peces \n" +
                " that are out there that can communicate with us is:" + N);






    }

}
