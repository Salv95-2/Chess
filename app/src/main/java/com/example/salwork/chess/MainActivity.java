package com.example.salwork.chess;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends Activity implements Observer, View.OnClickListener {


    private Model model  = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gameLogic(View view) {

        Log.d("ID", String.valueOf(view.getTag()));



        model.test();
        updateBoard();

    }

    public void updateBoard(){

        ImageView image = (ImageView) findViewById(R.id.box_0);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][0]);

        image = (ImageView) findViewById(R.id.box_1);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][1]);

        image = (ImageView) findViewById(R.id.box_2);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][2]);

        image = (ImageView) findViewById(R.id.box_3);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][3]);

        image = (ImageView) findViewById(R.id.box_4);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][4]);

        image = (ImageView) findViewById(R.id.box_5);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][5]);

        image = (ImageView) findViewById(R.id.box_6);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][6]);

        image = (ImageView) findViewById(R.id.box_7);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[0][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[0][7]);

        image = (ImageView) findViewById(R.id.box_8);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][0]);

        image = (ImageView) findViewById(R.id.box_9);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][1]);

        image = (ImageView) findViewById(R.id.box_10);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][2]);

        image = (ImageView) findViewById(R.id.box_11);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][3]);

        image = (ImageView) findViewById(R.id.box_12);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][4]);

        image = (ImageView) findViewById(R.id.box_13);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][5]);

        image = (ImageView) findViewById(R.id.box_14);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][6]);

        image = (ImageView) findViewById(R.id.box_15);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[1][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[1][7]);

        image = (ImageView) findViewById(R.id.box_16);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][0]);

        image = (ImageView) findViewById(R.id.box_17);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][1]);

        image = (ImageView) findViewById(R.id.box_18);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][2]);

        image = (ImageView) findViewById(R.id.box_19);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][3]);

        image = (ImageView) findViewById(R.id.box_20);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][4]);

        image = (ImageView) findViewById(R.id.box_21);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][5]);

        image = (ImageView) findViewById(R.id.box_22);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][6]);

        image = (ImageView) findViewById(R.id.box_23);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[2][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[2][7]);

        image = (ImageView) findViewById(R.id.box_24);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][0]);

        image = (ImageView) findViewById(R.id.box_25);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][3]);

        image = (ImageView) findViewById(R.id.box_26);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][2]);

        image = (ImageView) findViewById(R.id.box_27);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][3]);

        image = (ImageView) findViewById(R.id.box_28);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][4]);

        image = (ImageView) findViewById(R.id.box_29);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][4]);

        image = (ImageView) findViewById(R.id.box_30);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][6]);

        image = (ImageView) findViewById(R.id.box_31);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[3][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[3][7]);

        image = (ImageView) findViewById(R.id.box_32);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][0]);

        image = (ImageView) findViewById(R.id.box_33);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][1]);

        image = (ImageView) findViewById(R.id.box_34);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][2]);

        image = (ImageView) findViewById(R.id.box_35);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][3]);

        image = (ImageView) findViewById(R.id.box_36);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][4]);

        image = (ImageView) findViewById(R.id.box_37);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][5]);

        image = (ImageView) findViewById(R.id.box_38);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][6]);

        image = (ImageView) findViewById(R.id.box_39);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[4][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[4][6]);

        image = (ImageView) findViewById(R.id.box_40);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][0]);

        image = (ImageView) findViewById(R.id.box_41);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][1]);

        image = (ImageView) findViewById(R.id.box_42);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][2]);

        image = (ImageView) findViewById(R.id.box_43);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][3]);

        image = (ImageView) findViewById(R.id.box_44);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][4]);

        image = (ImageView) findViewById(R.id.box_45);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][4]);

        image = (ImageView) findViewById(R.id.box_46);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][6]);

        image = (ImageView) findViewById(R.id.box_47);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[5][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[5][7]);

        image = (ImageView) findViewById(R.id.box_48);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][0]);

        image = (ImageView) findViewById(R.id.box_49);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][1]);

        image = (ImageView) findViewById(R.id.box_50);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][2]);

        image = (ImageView) findViewById(R.id.box_51);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][3]);

        image = (ImageView) findViewById(R.id.box_52);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][4]);

        image = (ImageView) findViewById(R.id.box_53);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][5]);

        image = (ImageView) findViewById(R.id.box_54);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][6]);

        image = (ImageView) findViewById(R.id.box_55);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[6][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[6][7]);

        image = (ImageView) findViewById(R.id.box_56);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][0]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][0]);

        image = (ImageView) findViewById(R.id.box_57);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][1]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][1]);

        image = (ImageView) findViewById(R.id.box_58);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][2]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][2]);

        image = (ImageView) findViewById(R.id.box_59);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][3]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][3]);

        image = (ImageView) findViewById(R.id.box_60);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][4]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][4]);

        image = (ImageView) findViewById(R.id.box_61);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][5]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][5]);

        image = (ImageView) findViewById(R.id.box_62);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][6]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][6]);

        image = (ImageView) findViewById(R.id.box_63);
        image.setImageResource(model.getGrid().getGridViewIdsArr()[7][7]);
        image.setTag(model.getGrid().getGridViewTagsArr()[7][7]);



        Log.d("Wpond", String.valueOf(R.id.box_55));
    }

    @Override
    public void onClick(View view) {



    }

    @Override
    public void update(Observable observable, Object o) {

    }

}
