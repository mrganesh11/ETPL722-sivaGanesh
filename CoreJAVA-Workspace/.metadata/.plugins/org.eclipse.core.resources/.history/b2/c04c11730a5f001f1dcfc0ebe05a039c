package com.ganesh.samplegame.guessing;

import java.util.Random;
import java.util.Scanner;

class Main
{
    static String bold="\u001B[1m";
    static String red="\u001B[31m";
    static String green="\u001B[32m";
    static String yellow="\u001B[33m";
    static String blue="\u001B[34m";
    static String cyan="\u001B[35m";
    public static class Colors5 
    {
        public static final String reset = "\u001B[0m";
        public static final String blink = "\u001B[5m";
    }
    public static class Fig
    {
        String orange = "\u001B[33m";
        String blink = "\u001B[5m";
        String reset = "\u001B[0m";
        Fig() 
        {
            String asciiArt =
 			"                           ##   ##  ### ###  ####      ## ##    ## ##   ##   ##  ### ###  \n" +
                	"                           ##   ##   ##  ##   ##      ##   ##  ##   ##   ## ##    ##  ##  \n" +
                	"                           ##   ##   ##       ##      ##       ##   ##  # ### #   ##      \n" +
                	"                           ## # ##   ## ##    ##      ##       ##   ##  ## # ##   ## ##   \n" +
                	"                           # ### #   ##       ##      ##       ##   ##  ##   ##   ##      \n" +
                	"                            ## ##    ##  ##   ##  ##  ##   ##  ##   ##  ##   ##   ##  ##  \n" +
                	"                           ##   ##  ### ###  ### ###   ## ##    ## ##   ##   ##  ### ###  \n" +
                	"                                                                                          \n" +
            		"                                                                      \n" +
            		"                                             #### ##   ## ##            \n" +
            		"                                             # ## ##  ##   ##           \n" +
           		"                                               ##     ##   ##           \n" +
           		"                                               ##     ##   ##           \n" +
            		"                                               ##     ##   ##           \n" +
            		"                                               ##     ##   ##           \n" +
            		"                                              ####     ## ##            \n" +
            		"                                                                      \n" +
            		" ## ##   ##  ###  ### ###   ## ##    ## ##     ####   ###  ##   ## ##             ## ##     ##     ##   ##  ### ###  \n" +
            		"##   ##  ##   ##   ##  ##  ##   ##  ##   ##     ##      ## ##  ##   ##           ##   ##     ##     ## ##    ##  ##  \n" +
            		"##       ##   ##   ##      ####     ####        ##     # ## #  ##                ##        ## ##   # ### #   ##      \n" +
            		"##  ###  ##   ##   ## ##    #####    #####      ##     ## ##   ## ###           ##  ###   ##  ##  ## # ##   ## ##   \n" +
            		"##   ##  ##   ##   ##          ###      ###     ##     ##  ##  ##   ##           ##   ##   ## ###  ##   ##   ##      \n" +
            		"##   ##  ##   ##   ##  ##  ##   ##  ##   ##     ##     ##  ##  ##   ##           ##   ##   ##  ##  ##   ##   ##  ##  \n" +
            		" ## ##    ## ##   ### ###   ## ##    ## ##     ####   ###  ##   ## ##             ## ##   ###  ##  ##   ##  ### ###  \n";

            String[] asciiLines = asciiArt.split("\n");
            for (String line : asciiLines) {
                System.out.println(blink + orange + line + Colors5.reset);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class user
{
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        new Main.Fig();
        game x = new game();
        x.m1();
    }
}

class game
{
    void m1()
    {
        Scanner sc = new Scanner(System.in);
        int num = new Random().nextInt(30) + 1;
        int c = 4;
        System.out.println(Main.bold + Main.blue + "Choose a number from 1 to 30");
        while(c>=1) 
        {
            System.out.println(Main.red + "you have " + c + " tries left");
            int n = sc.nextInt();
            if(n<=30&&n>=1)
            {
                if(n==num)
                {
                    System.out.println(Main.green + "yayyyy correct number nu thop raww....");
                    break;
                } 
                else if(n>num)
                {
                    System.out.println(Main.yellow + "guess is high please try again");
                } 
                else 
                {
                    System.out.println(Main.cyan + "guess is low try a bigger number");
                }
                c--;
            } else {
                System.out.println(Main.red + "Invalid range, please select numbers between 1 to 30");
            }
        }

        if (c < 1) {
            System.out.print(Main.red + "you lose: ");
        }
        System.out.println("correct number = " + num);
        System.out.println("press 1 to try again, any other key to exit");
        char ch = sc.next().charAt(0);
        if (ch == '1') {
            m1();
        }
    }
}