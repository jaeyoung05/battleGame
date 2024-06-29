package org.lastdice.battlegame.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.bukkit.entity.Player;
import org.lastdice.battlegame.Round.Round;
import org.lastdice.battlegame.Round.RoundHandler;
import org.lastdice.battlegame.game.gameController;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Json {

    private static Gson gson = new GsonBuilder().create();
    private static Player player = RoundHandler.player;
    private static String name = String.valueOf(RoundHandler.player);
    private static int round = Round.getRound();
    private static int difficult = gameController.difficult;

    public static void data() {
        PlayerData playerData = new PlayerData(name,round,difficult);
        String json = gson.toJson(playerData);

        Path path = Path.of(".data/playerData/ple.json");
        if (Files.notExists(path)){
            try {
                Files.createDirectories(path.getParent());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(path.toFile()));
            out.write(json);
            out.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(path.toFile()));
            try {
                String read = in.readLine();
                JsonElement element = JsonParser.parseString(read);
                PlayerData readPlayerData = gson.fromJson(element, PlayerData.class);
                player.sendMessage(readPlayerData.getName());
                player.sendMessage(String.valueOf(readPlayerData.getRound()));
                player.sendMessage(String.valueOf(difficult));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
