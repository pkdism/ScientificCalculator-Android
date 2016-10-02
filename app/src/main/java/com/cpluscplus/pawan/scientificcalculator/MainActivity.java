package com.cpluscplus.pawan.scientificcalculator;
import java.lang.Math;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public Button plus, minus, multiply, divide, equal, dot, backspace, sin, cos, tan, log, log10, loge, ex, x2, xy;
    public Button[] num = new Button[10];
    public TextView text;
    String total = "";
    double v1,v2;
    String sign = "";
    public MainActivity MainActivity;
    public MainActivity() {}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View v){
        Button button = (Button)v;
        String str = button.getText().toString();
        total += str;
        TextView edit = (TextView)findViewById(R.id.textView);
        edit.setText(total);
    }
    public void OnAdd(View v){
        v1 = Double.parseDouble(total);
        total = "";
        Button button = (Button)v;
        String str = button.getText().toString();
        sign = str;
        TextView edit = (TextView)findViewById(R.id.textView);
        edit.setText("");
    }
    public void OnCalculate(View v){
        TextView edit = (TextView)findViewById(R.id.textView);
        String str2 = edit.getText().toString();
        v2 = Double.parseDouble(str2);
        double grandtotal = 0.0;
        if(sign.equals("+")){
            grandtotal = v1+v2;
        }
        else if(sign.equals("-")){
            grandtotal = v1-v2;
        }
        else if(sign.equals("x")){
            grandtotal = v1*v2;
        }
        else if(sign.equals("/")) {
            grandtotal = v1 / v2;
        }
        else if(sign.equals("x^y")){
            grandtotal = (double)Math.pow(v1,v2);
        }
        edit.setText(grandtotal+"");
    }
    public void OnClear(View v){
        TextView edit = (TextView)findViewById(R.id.textView);
        edit.setText("");
        total = "";
    }

    public void sine(View v)
    {
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.sin(x);
        edit.setText(sum+"");
    }
    public void cosine(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.cos(x);
        edit.setText(sum+"");
    }
    public void tangent(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.tan(x);
        edit.setText(sum+"");
    }
    public void log2(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.log10(x)/Math.log10(2);
        edit.setText(sum+"");
    }
    public void log10(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.log10(x);
        edit.setText(sum+"");
    }
    public void loge(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.log(x);
        edit.setText(sum+"");
    }
    public void epowerx(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = Math.pow(2.7183,x);
        edit.setText(sum+"");
    }
    public void square(View v){
        double x;
        TextView edit = (TextView)findViewById(R.id.textView);
        String str = edit.getText().toString();
        x = Double.parseDouble(str);
        double sum = x*x;
        edit.setText(sum+"");
    }
    public void pi(View v){
        Button button = (Button)v;
        String str = "3.1415926535897932384626433832795";
        total += str;
        TextView edit = (TextView)findViewById(R.id.textView);
        edit.setText(total);
    }
}
