package com.example.planegame.game;

import android.graphics.Bitmap;
/**
 * Created by 我选择四娃 on 2021-03-26.
 */

public class SmallEnemyPlane extends EnemyPlane {
    public SmallEnemyPlane(Bitmap bitmap){
        super(bitmap);
        setPower(1);//小敌机抗抵抗能力为1，即一颗子弹就可以销毁小敌机
        setValue(1000);//销毁一个小敌机可以得1000分
    }
}
