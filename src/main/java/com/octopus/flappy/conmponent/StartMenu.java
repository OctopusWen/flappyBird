package com.octopus.flappy.conmponent;

import com.octopus.flappy.utils.Constant;
import com.octopus.flappy.utils.GameUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StartMenu {
    private final BufferedImage noticeImg;
    private final BufferedImage titleImg;

    public StartMenu() {
        noticeImg = GameUtils.loadImage(Constant.NOTICE_IMG_PATH);
        assert noticeImg != null;

        titleImg = GameUtils.loadImage(Constant.TITLE_IMG_PATH);
        assert titleImg != null;


    }

    public void draw(Graphics g) {
        int noticeX = (Constant.FRAME_WIDTH - noticeImg.getWidth()) / 2;
        int noticeY = (Constant.FRAME_HEIGHT - noticeImg.getHeight()) * 2 / 3;
        g.drawImage(noticeImg, noticeX, noticeY, null);

        int titleX = (Constant.FRAME_WIDTH - noticeImg.getWidth()) / 2;
        int titleY = (Constant.FRAME_HEIGHT - noticeImg.getHeight()) / 3;
        g.drawImage(titleImg, titleX, titleY, null);

    }
}

