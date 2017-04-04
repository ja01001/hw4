package com.example.ja010.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
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
        a = new data();
        b = new data();
        c = new data();
        d = new data();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//일단 A 부분
                a.tt =1;
                sts(a);
                if(b1.getText().toString().equals("사과 table(비어있음)")){

                    clear2();
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
                            sujung(a);
                        }
                    });
                    btt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            clear1(a);
                            clear2();
                            clear3(a);


                        }
                    });
                }
                else{
                    b1.setText("사과 table");

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
                b.tt =2;
                sts(b);
                if(b2.getText().toString().equals("포도 table(비어있음)")){
                    clear2();

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
                            sujung(b);
                        }
                    });
                    btt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            clear1(b);
                            clear2();
                            clear3(b);
                            b2.setText("포도 table(비어있음)");

                        }
                    });
                }
                else{
                    b2.setText("포도 table");
                }
                String str1 = dt();

                b.name = "포도 Table";
                b.time = str1;
//                a.//date class 확인
                t1.setText(b.name);
                t2.setText(b.time);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//일단 A 부분
                c.tt =3;
                sts(c);
                if(b3.getText().toString().equals("키위 table(비어있음)")){
                    clear2();

                    Toast.makeText(getContext(),"비어있습니다.",Toast.LENGTH_SHORT).show();
                    b3.setText("키위 Table");
                    btt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sd(c);
                        }
                    });
                    btt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sujung(c);
                        }
                    });
                    btt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            clear1(c);
                            clear2();
                            clear3(c);
                            b3.setText("키위 table(비어있음)");

                        }
                    });
                }
                else{
                    b3.setText("키위 table");
                }
                String str1 = dt();

                c.name = "키위 Table";
                c.time = str1;
//                a.//date class 확인
                t1.setText(c.name);
                t2.setText(c.time);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {//일단 A 부분
                d.tt =4;
                sts(d);
                if(b4.getText().toString().equals("자몽 table(비어있음)")){
                    clear2();

                    Toast.makeText(getContext(),"비어있습니다.",Toast.LENGTH_SHORT).show();
                    b4.setText("자몽 Table");
                    btt1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sd(d);
                        }
                    });
                    btt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sujung(d);
                        }
                    });
                    btt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            clear1(d);
                            clear2();
                            clear3(b);
                            b4.setText("자몽 table(비어있음)");

                        }
                    });
                }
                else{
                    b4.setText("자몽 table");
                }
                String str1 = dt();
                d.name = "자몽 Table";
                d.time = str1;
//                a.//date class 확인
                t1.setText(d.name);
                t2.setText(d.time);

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
            b.sp =0;
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
            final View dig = View.inflate(getActivity(),R.layout.message1,null); // 대화창
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
                            String ee1 =e1.getText().toString();
                            String ee2 = e2.getText().toString();
                            if (ee1.getBytes().length == 0) {
                                e1.requestFocus();


                            } else if (ee2.getBytes().length == 0) {
                                e2.requestFocus();
                            } else{
                                sp_co = Integer.parseInt(ee1);
                                pz_co = Integer.parseInt(ee2);
                            }
//                                    Toast.makeText(getContext(),e1.getText().toString(),Toast.LENGTH_SHORT).show();
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
                                a.bo1 =rb1.isChecked();
                                sts(a);

                            }
                            else if (rb2.isChecked() == true){
                                a.members = "vip멤버쉽 (30%할인)";
                                sum = (int)(sum_mid[0]*0.7);
                                a.sum = sum;
                                a.bo2 =rb2.isChecked();
                                sts(a);
                            }
                            else if(rb3.isChecked()== true){
                                a.members = "멤버쉽 없음";
                                a.sum = sum_mid[0];
                                a.bo3 =rb3.isChecked();
                                sts(a);
                            }
                            Snackbar.make(dig,"예약되었습니다.",1000).setAction("ok",null).show();
                        }}).setNegativeButton("취소", null).show();

        }// 추가
        void sujung(final data a){

            View dd = View.inflate(getActivity(),R.layout.message1,null);
            AlertDialog.Builder ch = new AlertDialog.Builder(getActivity());

            e1 = (EditText)dd.findViewById(R.id.et1);
            e2 = (EditText)dd.findViewById(R.id.et2);
            rb1 = (RadioButton)dd.findViewById(R.id.rb1);
            rb2 = (RadioButton)dd.findViewById(R.id.rb2);
            rb3 = (RadioButton)dd.findViewById(R.id.rb3);
            e1.setText(""+a.sp);
            e2.setText(""+a.pz);
            if ( a.bo1 == true){
                rb1.setChecked(true);
            }
            else if (a.bo2 == true){
                rb2.setChecked(true);
;
            }
            else if(a.bo3 ==true){

                rb3.setChecked(true);}
            final int[] sum_mid = new int[1];
            ch.setTitle("수정").setView(dd).
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
                                a.bo1 =rb1.isChecked();
                                a.bo2 =false;
                                a.bo3 =false;
                                sts(a);

                            }
                            else if (rb2.isChecked() == true){
                                a.members = "vip멤버쉽 (30%할인)";
                                sum = (int)(sum_mid[0]*0.7);
                                a.sum = sum;
                                a.bo2 =rb2.isChecked();
                                a.bo1 =false;
                                a.bo3 =false;
                                sts(a);
                            }
                            else if(rb3.isChecked()== true){
                                a.members = "멤버쉽 없음";
                                a.sum = sum_mid[0];
                                a.bo3 =rb3.isChecked();
                                a.bo2 =false;
                                a.bo1 =false;
                                sts(a);
                            }

                        }}).show();
        } // 수정 button

        void sts(data a){
            t3.setText(""+a.pz);
            t4.setText(""+a.sp);
            t5.setText(a.members);
            t6.setText(""+a.sum);
        } // text 적기
        void clear3(data a){ // title 바꾸기
            if(a.tt ==1){
                b1.setText("사과 Tabe(비어있음)");
                a.tt =0;

            }
            else if(a.tt ==2){
                b2.setText("포도 Tabe(비어있음)");
                a.tt=0;

            }
            else if(a.tt ==3){
                b3.setText("키위 Tabe(비어있음)");
                a.tt=0;

            }
            else if(a.tt ==4){
                b4.setText("자몽 Tabe(비어있음)");
                a.tt=0;

            }

        } // button 초기화

}
