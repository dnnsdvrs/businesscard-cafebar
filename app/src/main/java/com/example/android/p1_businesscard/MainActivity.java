package com.example.android.p1_businesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void websiteClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com"));
        startActivity(browserIntent);
    }

    public void addressClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=udacity"));
        startActivity(browserIntent);
    }

    public void phoneClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:003112345678"));
        startActivity(browserIntent);

    }
}
