package info.androidhive.fingerprint;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Goals extends AppCompatActivity {
    private static String TAG = Goals.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        // Take value from Kcal_calculator activity
        SharedPreferences storage = getSharedPreferences("robert", Context.MODE_PRIVATE);
        String finalcalories = storage.getString("finalcalories", "Go to Kcal calculator to calculate your necessary");
        ((TextView) findViewById(R.id.txtkcal)).setText("To mentain your weigh you need " + finalcalories + " kcalories");


        // Take the value from spinner when you choose the goal
        Spinner spinner = (Spinner) findViewById(R.id.goal_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.establish_goal, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        // Take the valeu from spineer whe you choose hard or light
        Spinner spinner2 = (Spinner) findViewById(R.id.hard_light);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.hard_light, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        // Take current values from spinners
        String txtgoal_spinner= spinner.getSelectedItem().toString();
        String txthard_light = spinner2.getSelectedItem().toString();


        if (txtgoal_spinner.equals("Mentain weigh")){
            System.out.println("Muieeee");
        }


        // Send values to recalculate_cal
        SharedPreferences.Editor edit2 = getSharedPreferences("goal", Context.MODE_PRIVATE).edit();
        edit2.putString("txtgoal",txtgoal_spinner);
        SharedPreferences.Editor edit3 = getSharedPreferences("hard_light", Context.MODE_PRIVATE).edit();
        edit3.putString("txthard_light",txthard_light);
        edit2.apply();
        edit3.apply();



        Button buton_calc = (Button) findViewById(R.id.button_recalculate);
        buton_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recalculate_kcal();
            }
        });


    }
    // In this method will be calculate nr of kcalories in depend of goal

    // take  finalcalories and if the customer chose  lose weigh  - and  if he choose gain muscle +
    // if he chose in 2nd spinner hard   finalcalories + 0.2 * finalcalories
    // same with light but for light is 0.1 and fianlcalories - 0.1 * finalcalories


    public void recalculate_kcal(){
        double hard = 0.2;
        double light = 0.1;


        SharedPreferences storage = getSharedPreferences("goal", Context.MODE_PRIVATE);
        String txtgoal = storage.getString("txtgoal", "");

        SharedPreferences storage2 = getSharedPreferences("hard_light", Context.MODE_PRIVATE);
        String txthard_light = storage2.getString("txthard_light", "");










    }
}
