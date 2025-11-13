package com.mycompany.cattleshuffle.Classes;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.*;
import java.util.*;
import java.nio.file.Path;

public class Routes {
    
    private static final String finalRoute = "data/usuarios.json";
    
    public static Path exact_route(String route){
        Objects.requireNonNull(route, "La ruta no puede ser nula");
        Path path = Paths.get(route);
        if(path.isAbsolute()) return path.normalize();
        Path relative = Paths.get(System.getProperty("user.dir"));
        return relative.resolve(path).normalize();
    }

    public static String getFinalRoute() {
        return finalRoute;
    }
    
}
