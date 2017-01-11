package com.example.zach.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    private TextView tv_xianshi;
    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_dian,btn_jia,btn_jian,btn_cheng,btn_chuyi,btn_dengyu,btn_qingchu;
    private ButtonOnClick listener;
    private double yunsuanfu;
    private boolean bbb;
    private double numA,numB;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        listener=new ButtonOnClick();
        tv_xianshi=(TextView) findViewById(R.id.tv_xianshi);
        tv_xianshi.setText("");
        yunsuanfu=0;
        bbb=false;
        numA=0;
        numB=0;
        btn_1=(Button) findViewById(R.id.btn_1);
        btn_2=(Button) findViewById(R.id.btn_2);
        btn_3=(Button) findViewById(R.id.btn_3);
        btn_4=(Button) findViewById(R.id.btn_4);
        btn_5=(Button) findViewById(R.id.btn_5);
        btn_6=(Button) findViewById(R.id.btn_6);
        btn_7=(Button) findViewById(R.id.btn_7);
        btn_8=(Button) findViewById(R.id.btn_8);
        btn_9=(Button) findViewById(R.id.btn_9);
        btn_0=(Button) findViewById(R.id.btn_0);
        btn_dian=(Button) findViewById(R.id.btn_dian);
        btn_jia=(Button) findViewById(R.id.btn_jia);
        btn_jian=(Button) findViewById(R.id.btn_jian);
        btn_cheng=(Button) findViewById(R.id.btn_cheng);
        btn_chuyi=(Button) findViewById(R.id.btn_chuyi);
        btn_dengyu=(Button) findViewById(R.id.btn_dengyu);
        btn_qingchu=(Button) findViewById(R.id.btn_qingchu);



        btn_1.setOnClickListener(listener);
        btn_2.setOnClickListener(listener);
        btn_3.setOnClickListener(listener);
        btn_4.setOnClickListener(listener);
        btn_5.setOnClickListener(listener);
        btn_6.setOnClickListener(listener);
        btn_7.setOnClickListener(listener);
        btn_8.setOnClickListener(listener);
        btn_9.setOnClickListener(listener);
        btn_0.setOnClickListener(listener);
        btn_dian.setOnClickListener(listener);
        btn_jia.setOnClickListener(listener);
        btn_jian.setOnClickListener(listener);
        btn_cheng.setOnClickListener(listener);
        btn_chuyi.setOnClickListener(listener);
        btn_dengyu.setOnClickListener(listener);
        btn_qingchu.setOnClickListener(listener);

    }

    private void setTextOnView(String str){
        tv_xianshi.setText(str);
    }
    class ButtonOnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_1:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp1=tv_xianshi.getText().toString()+"1";
                    setTextOnView(temp1);
                    break;
                case R.id.btn_2:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp2=tv_xianshi.getText().toString()+"2";
                    setTextOnView(temp2);
                    break;
                case R.id.btn_3:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp3=tv_xianshi.getText().toString()+"3";
                    setTextOnView(temp3);
                    break;
                case R.id.btn_4:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp4=tv_xianshi.getText().toString()+"4";
                    setTextOnView(temp4);
                    break;
                case R.id.btn_5:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp5=tv_xianshi.getText().toString()+"5";
                    setTextOnView(temp5);
                    break;
                case R.id.btn_6:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp6=tv_xianshi.getText().toString()+"6";
                    setTextOnView(temp6);
                    break;
                case R.id.btn_7:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp7=tv_xianshi.getText().toString()+"7";
                    setTextOnView(temp7);
                    break;
                case R.id.btn_8:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp8=tv_xianshi.getText().toString()+"8";
                    setTextOnView(temp8);
                    break;
                case R.id.btn_9:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp9=tv_xianshi.getText().toString()+"9";
                    setTextOnView(temp9);
                    break;
                case R.id.btn_0:
                    if(yunsuanfu!=0&&bbb){
                        numA=Double.parseDouble(tv_xianshi.getText().toString().trim());
                        setTextOnView("");
                        bbb=false;
                    }
                    String temp0=tv_xianshi.getText().toString()+"0";
                    setTextOnView(temp0);
                    break;
                case R.id.btn_dian:
                    String tempdian=tv_xianshi.getText().toString()+".";
                    setTextOnView(tempdian);
                    break;
                case R.id.btn_jia:
                    bbb=true;
                    yunsuanfu=1;
                    break;
                case R.id.btn_jian:
                    bbb=true;
                    yunsuanfu=2;
                    break;
                case R.id.btn_cheng:
                    bbb=true;
                    yunsuanfu=3;
                    break;
                case R.id.btn_chuyi:
                    bbb=true;
                    yunsuanfu=4;
                    break;
                case R.id.btn_dengyu:
                    String s=tv_xianshi.getText().toString().trim();
                    numB=Double.parseDouble(tv_xianshi.getText().toString().trim());
                    if(yunsuanfu==1){
                        tv_xianshi.setText(String.valueOf(numA+numB));
                    }


                    else if (yunsuanfu==2){
                        tv_xianshi.setText(String.valueOf(numA-numB));
                    }

                    else if (yunsuanfu==3){
                        tv_xianshi.setText(String.valueOf(numA*numB));
                    }

                    else if (yunsuanfu==4){
                        tv_xianshi.setText(String.valueOf(numA/numB));
                    }
                    break;
                case R.id.btn_qingchu:
                    setTextOnView("");
                    yunsuanfu=0;
                    break;
            }
        }
    }

}
