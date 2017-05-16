package hellindustries.fitorflab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.Enumeration;

public class MainActivity extends AppCompatActivity {

    public enum ExerciseType {
        WEIGHT_LIFTING, YOGA, CARDIO
    }
    public static String weightTitle = "Weight Lifting";
    public static String yogaTitle = "Yoga";
    public static String cardioTitle = "Cardio";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.weightLayout);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.yogaLayout);
        RelativeLayout cardioBtn = (RelativeLayout) findViewById(R.id.cardioLayout);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    loadDetailedActivity(weightTitle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    loadDetailedActivity(yogaTitle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    loadDetailedActivity(cardioTitle);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void loadDetailedActivity(String exerciseType) throws Exception{

        if (exerciseType == weightTitle){

        } else if (exerciseType == yogaTitle){

        } else if (exerciseType == cardioTitle){

        } else {
            throw new Exception("Something went wrong when loading activity");
        }
    }
}
