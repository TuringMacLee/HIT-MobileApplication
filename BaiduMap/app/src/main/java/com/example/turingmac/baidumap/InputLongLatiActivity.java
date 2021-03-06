package com.example.turingmac.baidumap;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class InputLongLatiActivity extends AppCompatActivity {

    EditText editTextInputLong = null;
    EditText editTextInputLati = null;
    Button buttonLocateLangLati = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_long_lati);

        editTextInputLong = (EditText) this.findViewById(R.id.editTextInputLong);
        editTextInputLati = (EditText) this.findViewById(R.id.editTextInputLati);
        buttonLocateLangLati = (Button) this.findViewById(R.id.buttonLocateLongLati);


        buttonLocateLangLati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String longitudeStr = editTextInputLong.getText().toString();
                String latitudeStr = editTextInputLati.getText().toString();
                try
                {
                    final double longitude = Double.parseDouble(longitudeStr);
                    final double latitude = Double.parseDouble(latitudeStr);

                    Intent intent = new Intent(InputLongLatiActivity.this, MainActivity.class);
                    intent.putExtra("POS", Double.toString(latitude) + " " + Double.toString(longitude));
                    startActivity(intent);
                }
                catch(Exception e)
                {

                }
            }

        });
    }

}
