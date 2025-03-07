package org.example.Utils;

import org.mindrot.jbcrypt.BCrypt;

public class UserServiceUtil {

    public static  String hashPassword(String password){
        return BCrypt.hashpw(password,BCrypt.gensalt());
    }

    public static boolean checkPassword(String password,String hashesPassword){
        return BCrypt.checkpw(password,hashesPassword);
    }

}
