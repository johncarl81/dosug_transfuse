package org.androidtransfuse.examples.dosug.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import org.androidtransfuse.examples.dosug.R;

public class DetailActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Need to check if Activity has been switched to landscape mode
        // If yes, finished and go back to the start Activity
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }

        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String s = extras.getString("value");
            TextView view = (TextView) findViewById(R.id.detailsText);
            view.setText(s);
        }
    }
} 