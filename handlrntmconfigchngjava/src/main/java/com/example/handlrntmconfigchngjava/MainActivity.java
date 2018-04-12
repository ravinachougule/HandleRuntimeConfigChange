package com.example.handlrntmconfigchngjava;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
        img=(ImageView)findViewById(R.id.imgVw);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        img=(ImageView)findViewById(R.id.imgVw);
        Toast.makeText(MainActivity.this, "onConfigurationChanged", Toast.LENGTH_SHORT).show();
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            img.setImageResource(R.drawable.ic_backup_black_24dp);
        }else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            img.setImageResource(R.drawable.ic_cloud_download_black_24dp);
        }else{
            img.setImageResource(R.drawable.ic_launcher_background);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();

    }
}
