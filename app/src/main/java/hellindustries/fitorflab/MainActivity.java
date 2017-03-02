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
                loadDetailedActivity(ExerciseType.WEIGHT_LIFTING);
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailedActivity(ExerciseType.YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailedActivity(ExerciseType.CARDIO);
            }
        });
    }

    private void loadDetailedActivity(ExerciseType exerciseType){

        switch(exerciseType){
            case WEIGHT_LIFTING:
                break;
            case YOGA:
                break;
            case CARDIO:
                break;

        }
    }
}
