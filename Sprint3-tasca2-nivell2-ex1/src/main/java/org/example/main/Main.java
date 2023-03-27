package org.example.main;

import Interfaces.IPayment;
import objects.Shoes;
import payments.AccountPayment;
import payments.CardPayment;
import payments.PayPalPayment;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        float totalPrice = 0;
        ArrayList<Shoes> stock = new ArrayList<>();

        stock.add(new Shoes("total90","nike",25,42));
        stock.add(new Shoes("puma50","puma",35,40));
        stock.add(new Shoes("addidas urban","addidas",40,44));

        System.out.println("*** Welcome to Shoes World ***\nThese are our current articles, " +
                "choose what shoes do you want to add to your cart");

        //Filling the cart with products
        ArrayList<Shoes> cart = fillCart(stock);

        //Calculating the total price of the cart

        for (Shoes shoe:cart) {
            totalPrice += shoe.getPrice();
        }
        System.out.println("Total cart: " + totalPrice);

        //Choosing payment method
        IPayment payment = choosePaymentMethod();

        //processPayment(payment);
        processPaymentAsync(payment);

    }

    private static ArrayList<Shoes> fillCart(ArrayList<Shoes> stock) {
        boolean finnished;
        ArrayList<Shoes> cart = new ArrayList<>();

        do{
            for (int i =0; i< stock.size();i++) {
                System.out.println(i+1 + " -> " + stock.get(i));
            }
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            cart.add(stock.get(userChoice-1));
            System.out.println("Shoe added to the cart!");
            System.out.println("Do you want to add more shoes?\n1-Yes\n2-No");
            int continueShopping = sc.nextInt();
            if (continueShopping==1){
                finnished=false;
            }else{
                finnished=true;
            }

        }while(!finnished);

        return cart;
    }

    private static void processPaymentAsync(IPayment payment) {
        new Thread(()-> {

            payment.pay();
            System.out.println("Processing payment...");

            //Just to simulate payment processing
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("payment successful!");

        }).start();


    }

    private static void processPayment(IPayment payment) {

        System.out.println("Processing payment...");
        payment.pay();

        //Just to simulate payment processing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("payment successful!");

    }

    private static IPayment choosePaymentMethod(){
        Boolean inRange = false;
        byte userAnswer;
        IPayment payment = null;

        do {
            System.out.println("What method do you want to use to pay?\n1-Card\n2-Paypal\n3-Account");
            Scanner sc = new Scanner(System.in);
            userAnswer= sc.nextByte();

            if(userAnswer ==1 || userAnswer ==2 || userAnswer==3){
                inRange=true;
            }else {
                System.out.println("Answer not in range!");
            }
        }while(!inRange);

        switch (userAnswer){
            case 1 -> payment = new CardPayment();
            case 2 -> payment = new PayPalPayment();
            case 3 -> payment = new AccountPayment();
        }

        return payment;
    }



}