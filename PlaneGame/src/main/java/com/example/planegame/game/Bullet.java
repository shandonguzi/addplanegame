package com.example.planegame.game;

import android.graphics.Bitmap;
/**
 * Created by 我选择四娃 on 2021-03-26.
 */

public class Bullet extends AutoSprite {
    public Bullet(Bitmap bitmap){
        super(bitmap);
        setSpeed(-10);//负数表示子弹向上飞
    }
}
