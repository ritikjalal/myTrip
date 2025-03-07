package org.example.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Entities.Train;
import org.example.Entities.User;
import org.example.Utils.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class UserBookingService {

    private User user;

    private static final String USER_PATH="../LocalDb/local.json";

    //Object mapper to map json file to entities files
    //serailize and deseralize

    private  ObjectMapper objectMapper=new ObjectMapper();

    private List<User>userList;


    public UserBookingService(User user1) throws IOException {
        this.user=user1;
        userList=getUsers();

    }

    public UserBookingService() throws IOException {
        userList=getUsers();
    }


    public List<User> getUsers() throws IOException{
        File userfiles=new File(USER_PATH);
        return objectMapper.readValue(userfiles, new TypeReference<List<User>>(){});
    }

    public Boolean loginUser(){

        //optional used if suppose nothing returns that it should not throw null pointer exception

        Optional<User> foundUser=userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashPassword());
        }).findFirst();

        return foundUser.isPresent();
    }

    public Boolean signup(User user1){

        try {
            userList.add(user1);
            saveToFile();
            return Boolean.TRUE;
        }catch (IOException e){
            return Boolean.FALSE;
        }

    }

    private void saveToFile() throws IOException{
        File userfiles=new File(USER_PATH);
        objectMapper.writeValue(userfiles,userList);
    }


    public void fetchBookings() {
        user.printTicket();
    }


    public List<Train> getTrains(String srcStation, String destStation) {
        return
    }
}
