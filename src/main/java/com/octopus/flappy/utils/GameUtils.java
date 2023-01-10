package com.octopus.flappy.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GameUtils {
    private GameUtils() {

    }

    public static BufferedImage loadImage(String path){
        try {
            return ImageIO.read(Files.newInputStream(Paths.get(path)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
