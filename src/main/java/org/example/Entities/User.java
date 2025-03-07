package org.example.Entities;

import java.util.*;

public class User {

    private String userId;
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketListBooked;


    public User(String userId, String name, String password, String hashPassword, List<Ticket> ticketListBooked) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.ticketListBooked = ticketListBooked;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public List<Ticket> getTicketListBooked() {
        return ticketListBooked;
    }

    public void setTicketListBooked(List<Ticket> ticketListBooked) {
        this.ticketListBooked = ticketListBooked;
    }

    public void printTicket(){
        for(int i=0;i<ticketListBooked.size();i++){
            System.out.println(ticketListBooked.get(i).getTicketInfo());
        }
    }

}
