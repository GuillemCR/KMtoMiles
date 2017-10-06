package edu.upc.eseiaat.pma.guillemcomas.kmtomiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

public class ConversionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        //Button btn_ToMiles = (Button) findViewById(R.id.btn_Miles);
        //Button btn_ToKm = (Button) findViewById(R.id.btn_KM);
        final EditText edit_KM = (EditText) findViewById(R.id.edit_KM);
        final EditText edit_miles = (EditText) findViewById(R.id.edit_Miles);
        /*
        btn_ToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sKM = edit_KM.getText().toString();
                float KM = Float.parseFloat(sKM);
                float miles = KM/1.609f;
                String smiles = String.format("%f",miles);

                edit_miles.setText(smiles);
                //Log.i("cora","btn_miles activated");
            }
        });

        btn_ToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String smiles = edit_miles.getText().toString();
                float miles = Float.parseFloat(smiles);
                float KM = miles*1.609f;
                String sKM = String.format("%f",KM);

                edit_KM.setText(sKM);
            }
        });
        */
        edit_KM.setOnEditorActionListener(new TextView.OnEditorActionListener(){
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String sKM = edit_KM.getText().toString();
                float KM = Float.parseFloat(sKM);
                float miles = KM/1.60934f;
                String smiles = String.format("%f",miles);

                edit_miles.setText(smiles);
                return false;
            }
        });

        edit_miles.setOnEditorActionListener(new TextView.OnEditorActionListener(){
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String smiles = edit_miles.getText().toString();
                float miles = Float.parseFloat(smiles);
                float KM = miles*1.60934f;
                String sKM = String.format("%f",KM);

                edit_KM.setText(sKM);
                return false;
            }
        });
    }
}
