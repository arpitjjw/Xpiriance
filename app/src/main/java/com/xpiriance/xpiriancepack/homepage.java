package com.xpiriance.xpiriancepack;

import android.app.Dialog;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

public class homepage extends AppCompatActivity {
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        myDialog=new Dialog(this);




        ImageView img1 = (ImageView) findViewById(R.id.arrow1);
        ImageView img2=(ImageView)findViewById(R.id.arrow2);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

               Showpopup2();


            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Showpopup1();


            }
        });

    }
    public void Showpopup1(){
        myDialog.setContentView(R.layout.popup1);
        TextView txtclose;
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose1);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    public void Showpopup2(){
        myDialog.setContentView(R.layout.notification);

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

}
