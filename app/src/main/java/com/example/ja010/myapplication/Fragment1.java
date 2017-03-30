package com.example.ja010.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ja010 on 2017-03-30.
 */

public class Fragment1 extends Fragment {
    TextView t1,t2,t3,t4,t5,t6;
    Button b1,b2,b3,b4;
    data a,b,c,d;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fv = inflater.inflate(R.layout.fragment1,container,false);
        b1=(Button)fv.findViewById(R.id.bt1);
        b2=(Button)fv.findViewById(R.id.bt2);
        b3=(Button)fv.findViewById(R.id.bt3);
        b4=(Button)fv.findViewById(R.id.bt4);
        t1=(TextView)fv.findViewById(R.id.t1);
        t2=(TextView)fv.findViewById(R.id.t2);
        b = new data();
        c = new data();
        d = new data();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals("사과 table(비어있음)")){
                    b1.setText("사과 Table");
                    AlertDialog.Builder ch = new AlertDialog(this);
                    ch.setTitle("예약");

                }
                else{
                }
                Date dt = new Date();
                SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd HH:mm");
                String str =form.format(dt);
                a =new data();
                a.name = "사과 Table";
                a.time = str;
//                a.//date class 확인
                t1.setText(a.name);
                t2.setText(a.time);

//                Toast.makeText(getContext(),"asda",Toast.LENGTH_SHORT).show();
            }
        });
        return fv;
    }


}
