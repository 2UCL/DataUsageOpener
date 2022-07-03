package com.example.OpenDataUsageSettings;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            startActivity(new Intent(Settings.ACTION_DATA_USAGE_SETTINGS));
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "「データ使用」\n設定項目を呼び出せません。", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}