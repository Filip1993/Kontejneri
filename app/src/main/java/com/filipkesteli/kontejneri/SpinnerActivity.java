package com.filipkesteli.kontejneri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spUcenici;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        handleIntent();
        initSpinner();
    }

    private void initSpinner() {
        spUcenici = (Spinner) findViewById(R.id.spUcenici);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.ucenici,
                        android.R.layout.simple_list_item_1
                );

        spUcenici.setAdapter(adapter);
    }

    private void handleIntent() {
        Intent intent = getIntent();
        if (intent.hasExtra(MainActivity.PARAMETER_SPINNER)) {
            Toast.makeText(SpinnerActivity.this, MainActivity.UCENICI, Toast.LENGTH_SHORT).show();
        }
    }
}

