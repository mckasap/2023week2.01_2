package com.example.a2023week201;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MCK","OnResume_Bize her yer Trabzon");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MCK","OnPause_Bize her yer Trabzon");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("MCK","OnPostResume_Bize her yer Trabzon");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MCK","OnRestart_Bize her yer Trabzon");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MCK","OnDestroy_Bize her yer Trabzon");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MCK","OnStop_Bize her yer Trabzon");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MCK","OnStart_Bize her yer Trabzon");
    }
    Button btn;
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        tv=(TextView) findViewById(R.id.tvLabl1);
        et=(EditText) findViewById(R.id.editTextTextPersonName);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(et.getText().toString());

            }
        });
        Log.d("MCK","OnCreate_Bize her yer Trabzon");
    }

    public  void ClickMe(View  v){

        Toast.makeText(MainActivity.this,"2Bize her yer Trabzon ",Toast.LENGTH_LONG).show();
        Log.d("MCK","clickme_ her yer Trabzon");
    }


}