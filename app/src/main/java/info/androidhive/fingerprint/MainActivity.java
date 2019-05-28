package info.androidhive.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureKcalButton();
        configureGoalButton();
        configureMealButton();
    }

    private void configureKcalButton(){
        LinearLayout kcal_button = (LinearLayout) findViewById(R.id.kcal_button);
        kcal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Kcal_calculator.class));
            }
        });
    }

    private void configureGoalButton(){
        LinearLayout goal_button = (LinearLayout) findViewById(R.id.goals_button);
        goal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Goals.class));
            }
        });
    }
    private void configureMealButton(){
        LinearLayout meal_button = (LinearLayout) findViewById(R.id.meals);
        meal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Meals_generator.class));
            }
        });
    }
    }

