package com.mycompany.cattleshuffle;
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
    
    public static void save_user(UserData users, Path route, boolean append)throws IOException {
        String toJson = json.toJson(users);
        if (route.getParent() != null) Files.createDirectories(route);
        if(append){
            Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } else {
            Files.write(route, toJson.getBytes(StandardCharsets.UTF_8),
            StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }    
    }
    
    public static List<UserData> read_user(String route) throws IOException {
        Path path = Paths.get(route);
        if (!Files.exists(path)) return new ArrayList<>();
        
        String content = Files.readString(path);
        Type type = new TypeToken<List<UserData>>(){}.getType();
        return json.fromJson(content, type);
    }
    // Debo cambiar absolutamente todo. att: Juan
}
