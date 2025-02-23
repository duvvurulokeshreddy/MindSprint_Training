package com.mindsprint.project1.oops;


import java.util.Scanner;

// Interface 1
interface Razorpay {
    public void pay();
}

// Interface 2
interface Paypal {
    public void pay();
}

class PaymentMethod implements Razorpay, Paypal {
    // Variable to store the user payment method
    String payMethod;

    // Constructor
    public PaymentMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    // Defining (giving body to) the abstract method
    @Override
    public void pay() {
        if (payMethod.equalsIgnoreCase("Razorpay")) {
            payWithRazorpay();
        } else if (payMethod.equalsIgnoreCase("Paypal")) {
            payWithPaypal();
        } else {
            System.out.println("Unknown payment method");
        }
    }

    public void payWithRazorpay() {
        System.out.println("Paying with Razorpay");
    }

    public void payWithPaypal() {
        System.out.println("Paying with Paypal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment method: ");
        String pm = sc.next();
        PaymentMethod p = new PaymentMethod(pm);
        p.pay();
    }
}
