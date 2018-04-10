package com.example.coder.ios_style_alerts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gdacciaro.iOSDialog.iOSDialog;
import com.gdacciaro.iOSDialog.iOSDialogBuilder;
import com.gdacciaro.iOSDialog.iOSDialogClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alertone(View v)
    {
        new iOSDialogBuilder(MainActivity.this)
                .setTitle("Permissions")
                .setSubtitle("Contacts Read Permissions")
                .setBoldPositiveLabel(true)
                .setCancelable(false)
                .setPositiveListener("Allow",new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_LONG).show();
                        dialog.dismiss();

                    }
                })
                .setNegativeListener("Dismiss", new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        dialog.dismiss();
                    }
                })
                .build().show();
    }
    public void alerttwo(View v)
    {
        new iOSDialogBuilder(MainActivity.this)
                .setTitle("Permissions")
                .setSubtitle("Contacts Read Permissions")
                .setBoldPositiveLabel(true)
                .setCancelable(false)
                .setPositiveListener("Allow",new iOSDialogClickListener() {
                    @Override
                    public void onClick(iOSDialog dialog) {
                        Toast.makeText(MainActivity.this,"Clicked!",Toast.LENGTH_LONG).show();
                        dialog.dismiss();

                    }
                })

                .build().show();
    }

}
