package com.filipkesteli.kontejneri;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerFragment extends Fragment {

    //spinner kao widget unutar fragmenta:
    private Spinner spFragmentUcenici;

    //defaultni constructor koji je bolje ne dirati - ne otvarati Pandorinu kutiju
    public SpinnerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //ovo je kao setContentView kod activityja
        View v = inflater.inflate(R.layout.fragment_spinner, container, false);
        //moramo inicijalizirati i definirati widgete
        initWidgets(v);
        return v;
    }

    private void initWidgets(View v) {
        spFragmentUcenici = (Spinner) v.findViewById(R.id.spFragmentUcenici);
    }
}
