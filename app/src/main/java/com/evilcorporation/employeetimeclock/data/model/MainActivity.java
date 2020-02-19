package com.evilcorporation.employeetimeclock.data.model;
import android.studio.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.button;
import android.os.Bundle;

import com.evilcorporation.employeetimeclock.R;

public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById (R.id.btnEmployeeHours);
        btn.setOnClickListener(new View.OnClickListener());
        @Override
                public void onClick(View v) {
            Log.i("MyApp", "Calculated EmployeeHours");
            Toast.makeText(getApplicationContext(), "EmployeeHours", Toast.LENGTH_SHORT).show();

        }
    }



}
