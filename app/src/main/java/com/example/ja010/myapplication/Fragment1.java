package com.example.ja010.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
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
    Button b1,b2,b3,b4,btt1,btt2,btt3;
    data a,b,c,d;
    EditText e1,e2;
    int sum,pz_co,sp_co,sp_sum,pz_sum;
    RadioButton rb1,rb2,rb3;
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View fv = inflater.inflate(R.layout.fragment1,container,false);
        b1=(Button)fv.findViewById(R.id.bt1); //1번테이블
        b2=(Button)fv.findViewById(R.id.bt2); //2번테이블
        b3=(Button)fv.findViewById(R.id.bt3); // 3번테이블
        b4=(Button)fv.findViewById(R.id.bt4);
        btt1 =(Button)fv.findViewById(R.id.b1);//새주문
        btt2 =(Button)fv.findViewById(R.id.b2);// 정보수정
        btt3 =(Button)fv.findViewById(R.id.b3);// 초기화
        t1=(TextView)fv.findViewById(R.id.t1);
        t2=(TextView)fv.findViewById(R.id.t2);
        t3=(TextView)fv.findViewById(R.id.t3);
        t4=(TextView)fv.findViewById(R.id.t4);
        t5=(TextView)fv.findViewById(R.id.t5);
        t6=(TextView)fv.findViewById(R.id.t6);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//일단 A 부분

                clear2();
                if(b1.getText().toString().equals("사과 table(비어있음)")){
                    a = new data();
                    Toast.makeText(getContext(),"비어있습니다.",Toast.LENGTH_SHORT).show();
                    b1.setText("사과 Table");
                    btt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sd(a);
                        }
                    });
                    btt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sd(a);
                        }
                    });
                    btt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            clear1(a);
                            clear2();
                            b1.setText("사과 table(비어있음)");

                        }
                    });
                }
                else{
                    b1.setText("사과 table(비어있음)");
                }
                String str1 = dt();

                a.name = "사과 Table";
                a.time = str1;
//                a.//date class 확인
                t1.setText(a.name);
                t2.setText(a.time);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//일단 A 부분
                if(b2.getText().toString().equals("포도 table(비어있음)")){
                    clear2();
                    b = new data();
                    Toast.makeText(getContext(),"비어있습니다.",Toast.LENGTH_SHORT).show();
                    b2.setText("포도 Table");
                    btt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sd(b);
                        }
                    });
                    btt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sd(b);
                        }
                    });
                    btt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            clear1(b);
                            clear2();
                            b2.setText("포도 table(비어있음)");

                        }
                    });
                }
                else{
                    b2.setText("포도 table(비어있음)");
                }
                String str1 = dt();

                b.name = "포도 Table";
                b.time = str1;
//                a.//date class 확인
                t1.setText(b.name);
                t2.setText(b.time);

            }
        });


        return fv;
    }
        String dt(){
        // 시간 받기
            Date dt = new Date();
            SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd HH:mm");
            String str =form.format(dt);
            return str;
        }//시간 받기
        //초기화
        void clear1(data b){
            b.sp = 0;
            b.pz = 0;
            b.sum =0;
            b.members ="";
            b.time = "";
            b.name = "";


        }// data 초기화
        void clear2(){
            t1.setText("");
            t2.setText("");

            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
        } // table 값들 초기화
        void sd (final data a ){
            View dig = View.inflate(getActivity(),R.layout.message1,null); // 대화창
            AlertDialog.Builder ch = new AlertDialog.Builder(getActivity());
            e1 = (EditText)dig.findViewById(R.id.et1);
            e2 = (EditText)dig.findViewById(R.id.et2);
            rb1 = (RadioButton)dig.findViewById(R.id.rb1);
            rb2 = (RadioButton)dig.findViewById(R.id.rb2);
            rb3 = (RadioButton)dig.findViewById(R.id.rb3);
            final int[] sum_mid = new int[1];
            ch.setTitle("예약").setView(dig).
                    setPositiveButton("확인", new DialogInterface.OnClickListener() { // 데이터 저장 하기
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

//                                    Toast.makeText(getContext(),e1.getText().toString(),Toast.LENGTH_SHORT).show();
                            sp_co = Integer.parseInt(e1.getText().toString());
                            pz_co = Integer.parseInt(e2.getText().toString());
                            sp_sum =  sp_co*10000;
                            pz_sum = pz_co*12000;
                            //       Toast.makeText(getContext(),"a"+sp_co,Toast.LENGTH_SHORT).show();
                            sum_mid[0] = sp_sum+pz_sum;
                            a.sp = sp_co;
                            a.pz = pz_co;
                            if(rb1.isChecked()==true){ // 10%
                                a.members = "기본멤버쉽 (10%할인)";
                                sum = (int)(sum_mid[0]*0.9);
                                a.sum = sum;
                                sts(a);

                            }
                            else if (rb2.isChecked() == true){
                                a.members = "vip멤버쉽 (30%할인)";
                                sum = (int)(sum_mid[0]*0.7);
                                a.sum = sum;
                                sts(a);
                            }
                            else if(rb3.isChecked()== true){
                                a.members = "멤버쉽 없음";
                                a.sum = sum_mid[0];
                                sts(a);
                            }

                        }}).show();
        }// data 계산 밑 저장
        void sujung(data a){
            View dd = View.inflate(getActivity(),R.layout.message1,null);
        }
        void sts(data a){
            t3.setText(""+a.pz);
            t4.setText(""+a.pz);
            t5.setText(a.members);
            t6.setText(""+a.sum);
        }
}
