package Impl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lsepulveda on 1/11/2018.
 */
public class UserConfiguration {

    public Map<String, String> createUser() {
        Map<String, String> users = new HashMap<String, String>();

        users.put("1053781223" , "Luisa Sepúlveda");
        users.put("1098326512" , "Raúl Fandiño");

        users.put("1070618993" , "Juan Castro");
        users.put("1013614487" , "Eduardo Galeano");
        users.put("451191" , "Alejandra Chacón");
        users.put("1014282537" , "Luis Zarate");
        users.put("1032466534" , "Sebastian Puerto");
        //Add the new users here ...
        users.put("1033773744" , "Jhonatan Guzmán");
        users.put("1031135661" , "Miguel Ballen");
        users.put("1072703286" , "Andrés Gómez");
		//Add the new users here ...
        users.put("502736", "Javier Troconis");
        users.put("1013649582" , "David Beltrán");
        users.put("1031425678" , "Ricardo Gonzalez");
        users.put("1022393416" , "Mauricio Hernandez");
        users.put("1031425678" , "Ricardo Gonzalez");
        return users;
    }
}
