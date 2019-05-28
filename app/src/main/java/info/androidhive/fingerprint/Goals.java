package info.androidhive.fingerprint;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Goals extends AppCompatActivity {
    private static String TAG= Goals.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
        Log.i(TAG, "Calling get shared preferences");
        SharedPreferences storage = getSharedPreferences("robert", Context.MODE_PRIVATE);

        String finalcalories = storage.getString("finalcalories", "Go to Kcal calculator to calculate your necessary");
        int finalcaloriesInt = storage.getInt("sdfgh", -1);
        ((TextView) findViewById(R.id.txtkcal)).setText("To mentain your weigh you need " + finalcalories + " kcalories");

        Spinner spinner = (Spinner) findViewById(R.id.goal_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.establish_goal, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        Spinner spinner2 = (Spinner) findViewById(R.id.hard_light);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.hard_light, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);


    }

    public void recalculate_kcal(){
        double hard = 0.2;
        double light = 0.1;
        double kcalgoals = 0;




    }
}
