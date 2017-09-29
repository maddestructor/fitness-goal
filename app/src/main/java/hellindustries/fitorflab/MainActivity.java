package hellindustries.fitorflab;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_EXERCISE_TITLE = "exercise title";

    public static final String EXERCISE_WEIGHT_LIFTING = "Weight Lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar toolbar = getSupportActionBar();


        RelativeLayout weightBtn = (RelativeLayout) findViewById(R.id.weightLayout);
        RelativeLayout yogaBtn = (RelativeLayout) findViewById(R.id.yogaLayout);
        RelativeLayout cardioBtn = (RelativeLayout) findViewById(R.id.cardioLayout);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    loadDetailedActivity(EXERCISE_WEIGHT_LIFTING);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    loadDetailedActivity(EXERCISE_YOGA);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    loadDetailedActivity(EXERCISE_CARDIO);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void loadDetailedActivity(String exerciseType) {

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(EXTRA_EXERCISE_TITLE, exerciseType);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(id){
            case R.id.action_settings:
                try {
                    Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                    startActivity(settingsIntent);
                } catch (Exception e) {
                    System.out.println("Le lancement de l'activité de paramètre a planté(");
                    e.printStackTrace();
                }
            default:
                return true;
        }

    }
}
