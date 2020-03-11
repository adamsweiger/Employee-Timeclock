package com.evilcorporation.employeetimeclock;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.*;
import androidx.viewpager.widget.*;
import android.os.Bundle;
import android.*;

import com.evilcorporation.employeetimeclock.R;
import com.google.android.gms.samples.vision.barcodereader.BarcodeCapture;
import com.google.android.gms.samples.vision.barcodereader.BarcodeGraphic;
import com.google.android.gms.vision.barcode.Barcode;

import java.util.List;

import xyz.belvi.mobilevisionbarcodescanner.BarcodeRetriever;

class BarcodeActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Button btn = (Button) findViewById (R.id.btnEmployeeHours);
        btn.setOnClickListener(new View.OnClickListener());
                public void onClick(View v) {
                    Log.i("MyApp", "Calculated EmployeeHours");
                    Toast.makeText(getApplicationContext(), "EmployeeHours", Toast.LENGTH_SHORT).show();

         */
        BarcodeCapture barcodeCapture = (BarcodeCapture)getSupportFragmentManager().findFragmentById(R.id.barcode);
        barcodeCapture.setRetrieval((BarcodeRetriever) this);

    }

    public void onPermissionRequestDenied() {

    }

    public void onRetrievedFailed(String reason) {

    }

    public void onRetrieved(final Barcode barcode) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(BarcodeActivity.this)
                        .setTitle("Code Retrieved")
                        .setMessage(barcode.displayValue);
                builder.show();
            }
        });
    }

    public void onRetrievedMultiple(Barcode closetToClick, List<BarcodeGraphic> barcode) {

    }

    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }



}
