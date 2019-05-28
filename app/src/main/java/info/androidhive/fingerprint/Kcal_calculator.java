package info.androidhive.fingerprint;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Kcal_calculator extends AppCompatActivity {
    public double activity_value = 0;
    public double caloriifinale =0;
    public String finalcalories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kcal_calculator);

        // Drop down for estabilish values from strings in Gender dropdown
        Spinner spinner = (Spinner) findViewById(R.id.gender_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Drop down for estabilish values from strings in Activities dropdown
        Spinner spinner_act = (Spinner) findViewById(R.id.activitiess_spinner);
        ArrayAdapter<CharSequence> adapter_act = ArrayAdapter.createFromResource(this,
                R.array.activitiess_array, android.R.layout.simple_spinner_item);
        adapter_act.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_act.setAdapter(adapter_act);



        // Establish method for button Calculate
        Button button_calculate;
        Button buton_calc = (Button) findViewById(R.id.button_calculate);
        buton_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculeazanecesarul_caloric();
            }
        });

    }

    public void  calculeazanecesarul_caloric(){

        // Take the info about Weight
        EditText edt = (EditText) findViewById(R.id.greutate);
        String greutate_str = edt.getText().toString();
        int greutate = Integer.parseInt(greutate_str);

        // Take the info about Height
        EditText edt_1 = (EditText) findViewById(R.id.inltime);
        String inaltime_str = edt_1.getText().toString();
        int inaltime = Integer.parseInt(inaltime_str);

        // Take the info about Age
        EditText edt_2 = (EditText) findViewById(R.id.varsta);
        String varsta_str = edt_2.getText().toString();
        int varsta = Integer.parseInt(varsta_str);

        // Take the info about Gender from spiner
        Spinner spn = (Spinner) findViewById(R.id.gender_spinner);
        String gender = spn.getSelectedItem().toString();

        // Take the info about Activity from spiner
        Spinner spn_act = (Spinner) findViewById(R.id.activitiess_spinner);
        String act_level = spn_act.getSelectedItem().toString();

        // Establish the alghoritms for RBM calculation
        double RBM_barbati = 10 * greutate + 6.25 * inaltime - 5 * varsta +5;
        double RBM_femei =  10 * greutate + 6.25 * inaltime - 5 * varsta - 161;

        // Conditional structure to chose on of 10 cases

        // dummie code, too hardcoded :))
        /*if (spn.getSelectedItem().toString().equals("Male") && spn_act.getSelectedItem().toString().equals("Sedentary lifestyle")){
            double caloriifinale = 0;
            caloriifinale = RBM_barbati*1.2;
            String newValue = Integer.toString((int) caloriifinale);
            TextView textView =(TextView) findViewById(R.id.text_calculate);
            textView.setText("The nr of necesesary calories is " + newValue + " kcalories");
        }*/


        if (spn.getSelectedItem().toString().equals("Male")){
            if (spn_act.getSelectedItem().toString().equals("Sedentary lifestyle")) {
                activity_value=1.2;
            }
            if (spn_act.getSelectedItem().toString().equals("Slightly active")){
                activity_value=1.375;
            }
            if (spn_act.getSelectedItem().toString().equals("Moderately active")){
                activity_value=1.55;
            }
            if (spn_act.getSelectedItem().toString().equals("Active lifestyle")){
                activity_value=1.725;
            }
            if (spn_act.getSelectedItem().toString().equals("Very active lifestyle")){
                activity_value=1.9;
            }

            caloriifinale = RBM_barbati * activity_value;
            finalcalories = Integer.toString((int) caloriifinale);
            TextView textView =(TextView) findViewById(R.id.text_calculate);
            textView.setText("The nr of necesesary calories is " + finalcalories + " kcalories to mentain your weight");


        }
        else if (spn.getSelectedItem().toString().equals("Female")){
            if (spn_act.getSelectedItem().toString().equals("Sedentary lifestyle")) {
                activity_value=1.2;
            }
            if (spn_act.getSelectedItem().toString().equals("Slightly active")){
                activity_value=1.375;
            }
            if (spn_act.getSelectedItem().toString().equals("Moderately active")){
                activity_value=1.55;
            }
            if (spn_act.getSelectedItem().toString().equals("Active lifestyle")){
                activity_value=1.725;
            }
            if (spn_act.getSelectedItem().toString().equals("Very active lifestyle")){
                activity_value=1.9;
            }

            caloriifinale = RBM_femei * activity_value;
            finalcalories = Integer.toString((int) caloriifinale);
            TextView textView =(TextView) findViewById(R.id.text_calculate);
            textView.setText("The nr of necesesary calories is " + finalcalories + " kcalories");

        }

        SharedPreferences.Editor edit = getSharedPreferences("robert", Context.MODE_PRIVATE).edit();
        edit.putString("finalcalories",finalcalories);
        edit.apply();

    }



}
