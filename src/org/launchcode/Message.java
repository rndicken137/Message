package org.launchcode;

public class Message {

    public static String getMessage(String language){

        if(language.equals("sp")){
            return "Hola Mundo";
        }
        else if (language.equals("fr")){
            return "Bonjour le monde";
        }
        else
            return "Hello World";
    }
}
