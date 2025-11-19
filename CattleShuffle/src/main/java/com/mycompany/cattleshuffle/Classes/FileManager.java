package com.mycompany.cattleshuffle.Classes;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.*;
import java.util.*;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class FileManager {
    private static final Gson json = new GsonBuilder().setPrettyPrinting().create();
    
    public static void save_user(List<UserData> users, Path route, boolean append)throws IOException {
        if (route.getParent() != null) Files.createDirectories(route.getParent());
        if(append){
            List<UserData> oldUsers = read_user(route);
            oldUsers.addAll(users);
            String toJson = json.toJson(oldUsers);
            Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } else {
            String toJson = json.toJson(users);
            Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }    
    }
   
    
    public static List<UserData> read_user(Path route) throws IOException {
        if (!Files.exists(route)) return new ArrayList<>();
        
        String content = Files.readString(route);
        Type type = new TypeToken<List<UserData>>(){}.getType();
        return json.fromJson(content, type);
    }
    
    public static boolean delete_user(Path route, String Name)throws IOException {
        if (!Files.exists(route)) return false;
        
        String content = Files.readString(route, StandardCharsets.UTF_8);
        Type type = new TypeToken<List<UserData>>(){}.getType();
        List<UserData> users = new Gson().fromJson(content, type);
        
        List<UserData> updateList = new ArrayList<>();
                
        for (UserData user: users){
            if(!user.getName().equalsIgnoreCase(Name)){
                updateList.add(user);
            }
        }
        if (updateList.size() == users.size()){
            return false;
        }
        
        Gson json = new GsonBuilder().setPrettyPrinting().create();
        String toJson = json.toJson(updateList);
        Files.write(route, toJson.getBytes(StandardCharsets.UTF_8), StandardOpenOption.TRUNCATE_EXISTING);
        return true;   
    }
    public static boolean verify_user(String name, String password, Path route) throws IOException {
        if (!Files.exists(route)) return false;
        
        String content = Files.readString(route, StandardCharsets.UTF_8);
        Type type = new TypeToken<List<UserData>>(){}.getType();
        List<UserData> users = new Gson().fromJson(content, type);
               
        for (UserData user: users){
            if(user.getName().equalsIgnoreCase(name) && user.verify_password(password, user.getPassword())){
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean user_exists(String name, Path route) throws IOException{
        if(!Files.exists(route)) return false;
        
        String content = Files.readString(route, StandardCharsets.UTF_8);
        Type type = new TypeToken<List<UserData>>(){}.getType();
        List<UserData> users = new Gson().fromJson(content, type);
        
        for(UserData user: users){
            if(user.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    
    //se va a guardar los animales por cada tipo en archivos diferentes
    //BREEDER
    public static void saveBreeders(List<AnimalBreeder> animals, Path route) throws IOException {
       if (route.getParent() != null) Files.createDirectories(route.getParent());

        String toJson = json.toJson(animals);
        Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
     
     public static List<AnimalBreeder> loadBreeders(Path route) throws IOException {
        if (!Files.exists(route)) return new ArrayList<>();

        String content = Files.readString(route);
        Type type = new TypeToken<List<AnimalBreeder>>(){}.getType();
        List<AnimalBreeder> animals = json.fromJson(content, type);

        return animals != null ? animals : new ArrayList<>();
    }
     
    //PRODUCER
    public static void saveProducers(List<AnimalProducer> animals, Path route) throws IOException {
        if (route.getParent() != null) Files.createDirectories(route.getParent());

        String toJson = json.toJson(animals);
        Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
    
    public static List<AnimalProducer> loadProducers(Path route) throws IOException {
        if (!Files.exists(route)) return new ArrayList<>();

        String content = Files.readString(route);
        Type type = new TypeToken<List<AnimalProducer>>(){}.getType();
        List<AnimalProducer> animals = json.fromJson(content, type);

        return animals != null ? animals : new ArrayList<>();
    }
    
    //FATTENING
    public static void saveFattening(List<AnimalFattening> animals, Path route) throws IOException {
        if (route.getParent() != null) Files.createDirectories(route.getParent());

        String toJson = json.toJson(animals);
        Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
    
    public static List<AnimalFattening> loadFattening(Path route) throws IOException {
        if (!Files.exists(route)) return new ArrayList<>();

        String content = Files.readString(route);
        Type type = new TypeToken<List<AnimalFattening>>(){}.getType();
        List<AnimalFattening> animals = json.fromJson(content, type);

        return animals != null ? animals : new ArrayList<>();
    }
    
}
