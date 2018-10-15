package com.example.jacki.actualconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_number;
    EditText et_number2;
    EditText et_number3;
    Button b_convert;
    Button b_convert2;
    Button b_convert3;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_number = (EditText) findViewById(R.id.et_number);
        et_number2 = (EditText) findViewById(R.id.et_number2);
        et_number3 = (EditText) findViewById(R.id.et_number3);
        b_convert = (Button) findViewById(R.id.b_convert);
        b_convert2 = (Button) findViewById(R.id.b_convert2);
        b_convert3 = (Button) findViewById(R.id.b_convert3);
        tv_result = (TextView) findViewById(R.id.tv_result);

        b_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = et_number.getText().toString();


                int dec = Integer.parseInt(et_number.getText().toString());
                String bin = Integer.toBinaryString(dec);
                String hex= Integer.toHexString(dec);
                tv_result.setText("Hex: " + hex +  "\n\n" + "BIN: "
                + bin + "\n\n");



            }
        });
        b_convert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input2 = et_number2.getText().toString();
                int dec = Integer.parseInt(input2, 2);
                String hex= Integer.toHexString(dec);
                tv_result.setText("HEX: " + hex +  "\n\n" + "DEC: "
                        + dec + "\n\n");
    }
});
                b_convert3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String input3 = et_number3.getText().toString();
                        int dec = Integer.parseInt(input3, 16);
                        String bin = Integer.toBinaryString(dec);
                        tv_result.setText("DEC: " + dec + "\n\n" + "BIN: "
                                + bin + "\n\n");
                    }});}}
