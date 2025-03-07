package org.example;

import org.example.Entities.Train;
import org.example.Entities.User;
import org.example.Services.UserBookingService;
import org.example.Utils.UserServiceUtil;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello to myTrip!");

        Scanner sc=new Scanner(System.in);
        int choice=0;
        UserBookingService userBookingService;

        try {
          userBookingService =new UserBookingService();

        }catch (IOException e){
            System.out.println("Something went wrong");
            return;
        }

        while (choice!=4){
            System.out.println("Enter your choice");
            System.out.println("1, Signup");
            System.out.println("2, Login");
            System.out.println("3, Fetch Booking");
            System.out.println("4, Exit");

            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the username");
                    String username=sc.next();
                    System.out.println("Enter the password");
                    String password=sc.next();
                    User user=new User(UUID.randomUUID().toString(),username,password, UserServiceUtil.hashPassword(password),new ArrayList<>());
                    userBookingService.signup(user);
                    break;


                case 2:
                    System.out.println("Enter the username to login");
                    String usernameLogin=sc.next();
                    System.out.println("Enter the password to login");
                    String psswdLogin=sc.next();
                    User usertoLogin=new User(UUID.randomUUID().toString(),usernameLogin,psswdLogin, UserServiceUtil.hashPassword(psswdLogin),new ArrayList<>());
                    try {
                        userBookingService=new UserBookingService(usertoLogin);
                        userBookingService.loginUser();
                    }catch (IOException e){
                        return;
                    }
                    break;

                case 3:
                    userBookingService.fetchBookings();
                    break;

                case 4:
                    break;
            }
        }

    }
}