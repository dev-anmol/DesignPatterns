package com.anmol;

import com.anmol.behavioural.chainofresponsibility.process.InterviewProcess;
import com.anmol.structural.adapter.Payments.Payment;
import com.anmol.structural.adapter.Payments.RazorPayGateway;
import com.anmol.structural.adapter.Payments.Stripe;
import com.anmol.structural.adapter.adapter.RazorPayAdapter;
import com.anmol.structural.adapter.order.Order;
import com.anmol.structural.facade.facade.BankFacade;
import com.anmol.structural.proxy.proxy.UserServiceProxy;
import com.anmol.structural.proxy.user.User;
import com.anmol.structural.proxy.user.UserRole;
import com.anmol.structural.proxy.user.UserService;
import com.anmol.structural.proxy.user.UserServiceImplementation;

public class Main {
    public static void main(String[] args) {

        // Behavioural Design pattern trigger
        // Strategy Design pattern testing
//        Purchase order = new Purchase();
//        order.selectPaymentMethod();

//        InterviewProcess process = new InterviewProcess();
//        process.start("Anmol");


        // Creational Design pattern
        // Singleton design pattern testing
//        DBConnection.initialize(new MongoDatabase());
//        DBConnection connection1 = DBConnection.getInstance();
//        DBConnection connection2 = DBConnection.getInstance();
//        DBConnection connection3 = DBConnection.getInstance();
//
//        DBConnection.initialize(new MongoDatabase());
//
//
//        System.out.println(connection1 == connection2);
//        System.out.println(connection2 == connection3);


        // Creational Patter - Factory Design Pattern

//        Factory factory = new Factory();
//        factory.createTroop(Troops.ARCHER).attack();


        // Structural Design Pattern
        // Adapter Design Pattern

//        String paymentType = "razorpay";
//        Payment payment;
//        switch (paymentType) {
//            case "stripe":
//                payment = new Stripe("1111111111");
//                break;
//
//            case "razorpay":
//                RazorPayGateway razorPayGateway = new RazorPayGateway();
//                payment = new RazorPayAdapter(razorPayGateway, "1234-2342-234-2352");
//                break;
//            default:
//                throw new IllegalArgumentException("Please select the supported payment options!!!");
//        }
//
//        Order order = new Order("PS5", 200, payment);
//        order.placeOrder();

        // Facade Design Pattern

//        BankFacade bank =  new BankFacade();
//        bank.withdraw("234234", "2343", 10027.2);

        User admin = new User("23", "Anmol", UserRole.ADMIN);
        User user = new User("45", "Bob", UserRole.USER);
        User targetUser = new User("89", "John Doe", UserRole.USER);

        // Real service
        UserService realService = new UserServiceImplementation();

        // Proxy wraps the real service
        UserService proxy = new UserServiceProxy(realService);

        // Admin actions
        proxy.getUser(admin, targetUser);
        proxy.deleteUser(admin, targetUser);

        // Normal user actions
        proxy.getUser(user, targetUser);
        proxy.deleteUser(user, targetUser);

    }
}