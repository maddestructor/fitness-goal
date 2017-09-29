package hellindustries.fitorflab;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView exerciseTitle;
    ImageView exerciseImage;
    ConstraintLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

         exerciseTitle = (TextView) findViewById(R.id.exerciseTitle);
         exerciseImage = (ImageView) findViewById(R.id.exerciseImage);
         background = (ConstraintLayout) findViewById(R.id.activity_details);

        configureExerciseView(getIntent().getStringExtra(MainActivity.EXTRA_EXERCISE_TITLE));

    }

    private void configureExerciseView(String exerciseType) {

        exerciseTitle.setText(exerciseType);

        if (exerciseType.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT_LIFTING)){
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            background.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseType.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            background.setBackgroundColor(Color.parseColor("#916bcd"));
        } else if (exerciseType.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)){
            exerciseImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            background.setBackgroundColor(Color.parseColor("#52ad56"));
        } else {

        }

    }
}
