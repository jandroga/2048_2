package com.example.a2048_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Celda c;
    private int contador;
    private int a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,c4,d1,d2,d3,d4;
    private int[][] tauler = {
            {a1,a2,a3,a4},
            {b1,b2,b3,b4},
            {c1,c2,c3,c4},
            {d1,d2,d3,d4}
    };

    private int[][] emptySlot = tauler.clone();
    //private int contador=0;
    private static final String DEBUG_TAG = "Gestos";

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //Button buttonNewGame = (Button)findViewById(R.id.NewGameButton);
            //buttonNewGame.setOnClickListener((View.OnClickListener) this);

        }
    @Override
    public boolean onTouchEvent(MotionEvent event){

        int action = MotionEventCompat.getActionMasked(event);

        switch(action) {
            case (MotionEvent.ACTION_DOWN) :
                Log.d(DEBUG_TAG,"Action was DOWN");
                spawnNumber();
                return true;
            case (MotionEvent.ACTION_MOVE) :
                Log.d(DEBUG_TAG,"Action was MOVE");
                return true;
            case (MotionEvent.ACTION_UP) :
                Log.d(DEBUG_TAG,"Action was UP");
                spawnNumber();
                return true;
            case (MotionEvent.ACTION_CANCEL) :
                Log.d(DEBUG_TAG,"Action was CANCEL");
                return true;
            case (MotionEvent.ACTION_OUTSIDE) :
                Log.d(DEBUG_TAG,"Movement occurred outside bounds " +
                        "of current screen element");
                return true;
            default :
                return super.onTouchEvent(event);
        }
    }


    public void spawnNumber(){
        int ranNumb = (int) Math.floor(Math.random() * 2);
        int newNumb;
        if(ranNumb == 1) newNumb = 2;
        else newNumb = 4;
        int[] ranPos = {(int) Math.floor(Math.random() * 4), (int) Math.floor(Math.random() * 4)};
        System.out.println(ranNumb);
    }
}