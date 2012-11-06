package org.androidtransfuse.examples.dosug;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;
import org.androidtransfuse.intentFactory.IntentFactory;

import javax.inject.Inject;

/**
 * @author John Ericksen
 */
public class AndyVoteButtonListener implements View.OnClickListener, View.OnLongClickListener {

    private Vibrator vibrator;
    private Context context;
    private IntentFactory intentFactory;

    @Inject
    public AndyVoteButtonListener(Vibrator vibrator, Context context, IntentFactory intentFactory) {
        this.vibrator = vibrator;
        this.context = context;
        this.intentFactory = intentFactory;
    }

    @Override
    public void onClick(View v) {
        vibrator.vibrate(1000);
        Toast.makeText(context, "Sabotage!", 3000).show();
    }

    @Override
    public boolean onLongClick(View v) {

        intentFactory.start(new VotingResultsActivityStrategy("Andy Wins!"));

        return true;
    }
}
