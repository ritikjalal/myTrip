package org.example.Entities;

import java.util.*;

public class Ticket {

    private String ticketId;
    private String userId;
    private String sourceStation;
    private String destination;
    private Date date;
    private Train train;

    public Ticket(String ticketId, String userId, String sourceStation, String destination, Date date, Train train) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.sourceStation = sourceStation;
        this.destination = destination;
        this.date = date;
        this.train = train;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }


    public String getTicketInfo() {
        return String.format("TicketId:%s UserId:%s sourceStation:%s  destination:%s date:%s  train:%s",ticketId,userId,sourceStation,destination,train.getTrainInfo());
    }
}
