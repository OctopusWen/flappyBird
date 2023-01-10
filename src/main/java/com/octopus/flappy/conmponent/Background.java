package com.octopus.flappy.conmponent;

import com.octopus.flappy.utils.Constant;
import com.octopus.flappy.utils.GameUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    private final BufferedImage bgImg;
    private final int imgWidth;
    private  final int imgHeight;

    public Background(){
        bgImg = GameUtils.loadImage(Constant.BG_IMG_PATH);
        assert bgImg != null;
        imgWidth = bgImg.getWidth();
        imgHeight = bgImg.getHeight();
    }
    public void draw(Graphics g){
        g.setColor(Constant.BG_COLOR);
        g.fillRect(0,0,Constant.FRAME_WIDTH,Constant.FRAME_HEIGHT);

        int count = Constant.FRAME_WIDTH / imgWidth +2;
        for(int i = 0;i<count;i++){
            g.drawImage(bgImg,imgWidth*i,Constant.FRAME_HEIGHT - imgHeight,null);
        }
    }
}
