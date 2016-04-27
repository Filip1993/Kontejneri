package com.filipkesteli.kontejneri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String PARAMETER_SPINNER = "com.filipkesteli.kontejneri.SPINNER";
    public static final String UCENICI = "Ovo je spinner activity sa spinnerom za ucenike";
    private static String[] karte = {"pik", "tikva", "tref", "herc"};
    private ListView lvKarte;
    private Button btnSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListView();
        initWidgets();
        setupListeners();
    }


    private void initWidgets() {
        btnSpinner = (Button) findViewById(R.id.btnSpinner);
    }

    private void initListView() {
        lvKarte = (ListView) findViewById(R.id.lvKarte);

        //definiramo adapter kao posrednik (proxi) izmedu .java i .xml file-a
        //kreiramo adapter iz resursa s parametima: context kao kontekst na koji se odnosi,
        //array kojim baratamo i stil layout-a iz android.R biblioteke
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.kartice,
                        android.R.layout.simple_list_item_1
                );

        //postavljamo adapter na ListView i time povezujemo ListView dio xml-a sa .java
        lvKarte.setAdapter(adapter);

        /*

        //definiramo adapter kao proxi (poveznik, pomocnik) kako bi mogli mijenjati i dinamicki i staticki dio
        ArrayAdapter<CharSequence> adapter =
                new ArrayAdapter<CharSequence>(
                        this,
                        android.R.layout.simple_list_item_activated_1,
                        karte
                );
        //settiramo adapter na staticki objekt (listu tipa ListView)
        lvKarte.setAdapter(adapter);

        */
    }

    private void setupListeners() {
        btnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iGoToSpinnerActivity();
            }
        });
    }

    private void iGoToSpinnerActivity() {
        Intent intent = new Intent(this, SpinnerActivity.class);
        intent.putExtra(PARAMETER_SPINNER, UCENICI);
        startActivity(intent);
    }

}
