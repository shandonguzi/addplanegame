package com.example.jakera.smartchat.Fragment;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.jakera.smartchat.Activity.MainActivity;
import com.example.jakera.smartchat.Activity.UserInfoActivity;
import com.example.jakera.smartchat.R;

/**
 * Created by 我选择四娃 on 2021-03-29.
 */

public class GameFragment extends Fragment implements Button.OnClickListener{
    private TextView planegame;
    private View layout;

    public GameFragment() {
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.game_item, container, false);
        initgame();
        return layout;
    }

    public void initgame(){
        planegame = (TextView) layout.findViewById(R.id.game_plane);
        planegame.setOnClickListener(this);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.game_plane) {
            Intent intent = new Intent();
            ComponentName name = new ComponentName("com.example.planegame", "com.example.planegame.MainActivity");
            intent.setComponent(name);
            startActivity(intent);
        }
    }
}
