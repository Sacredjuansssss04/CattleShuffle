package com.mycompany.cattleshuffle.Classes;
import org.mindrot.jbcrypt.BCrypt;

public class UserData {
    private String name;
    private String password;
    private String numberPhone;
    private String email;

    public UserData(String name, String numberPhone, String email) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.email = email;
    }
    
    public void hashed_password(String password){
        int cost = 12;
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt(cost));
        this.password = hashed;
    }
    public boolean verify_password(String password, String hash){
        if (hash == null || !hash.startsWith("$2")){
            return false;
        } else{
            return BCrypt.checkpw(password, hash);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + ". \n Password: " + this.password + ". \n Number Phone: " + this.numberPhone + ". \n Email: " + this.email + ".";
    }
}
