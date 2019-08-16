package com.example.toasty_3party;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        button1=findViewById( R.id.btn_error );
        button2=findViewById( R.id.btn_success );
        button3=findViewById( R.id.btn_info );
        button4=findViewById( R.id.btn_warning );
        button5=findViewById( R.id.btn_normal );
    }

    public void showtoast(View v)
    {
        switch (v.getId()){
            case R.id.btn_error:
                Toasty.error( this,"This Is Error Toasty",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.btn_success:
                Toasty.success( this,"This Is Successfully Toasty",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.btn_info:
                Toasty.info( this,"This Is Info Toasty",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.btn_warning:
                Toasty.warning( this,"This Is Warning Toasty",Toast.LENGTH_SHORT ).show();
                break;

            case R.id.btn_normal:
                Toasty.normal( this,"This Is Normal Toasty With Icon",Toast.LENGTH_SHORT,ContextCompat.getDrawable( this,R.drawable.ic_launcher_background) ).show();
                break;
        }
    }
}
