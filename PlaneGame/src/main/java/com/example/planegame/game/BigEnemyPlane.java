package com.example.planegame.game;

import android.graphics.Bitmap;

/**
 * Created by 我选择四娃 on 2021-03-26.
 */

public class BigEnemyPlane extends EnemyPlane {
    public BigEnemyPlane(Bitmap bitmap){
        super(bitmap);
        setPower(10);//大敌机抗抵抗能力为10，即需要10颗子弹才能销毁大敌机
        setValue(30000);//销毁一个大敌机可以得30000分
    }
}
