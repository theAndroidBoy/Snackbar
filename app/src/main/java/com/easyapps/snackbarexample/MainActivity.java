package com.easyapps.snackbarexample;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button normal,action,custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        normal= (Button) findViewById(R.id.normal);
        action=(Button) findViewById(R.id.action);
        custom=(Button) findViewById(R.id.custom);


        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"normal button clicked",Toast.LENGTH_SHORT).show();
                Snackbar snackbar=Snackbar.make(normal,"I am normal",Snackbar.LENGTH_SHORT);  //you can place any view in first parameter
                snackbar.show();


            }
        });
//...........................................................................
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(action,"I am Action",Snackbar.LENGTH_LONG); //you can place any view in first parameter

                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(MainActivity.this,"OK clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                snackbar.show();
            }
        });

//.........................................................................
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(custom,"Custom button clicked " +  //you can place any view in first parameter
                        "",Snackbar.LENGTH_LONG);

                snackbar.setAction("setting", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(MainActivity.this,"setting clicked",Toast.LENGTH_SHORT).show();
                    }
                });

                snackbar.setActionTextColor(Color.GREEN);
                View sb=snackbar.getView();
                TextView textView= (TextView) sb.findViewById(R.id.snackbar_text);
                textView.setTextColor(Color.CYAN);
                snackbar.show();
            }
        });




    }
}
