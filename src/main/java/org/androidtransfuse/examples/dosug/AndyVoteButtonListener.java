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
    private BallotBox ballotBox;

    @Inject
    public AndyVoteButtonListener(Vibrator vibrator, Context context, IntentFactory intentFactory, BallotBox ballotBox) {
        this.vibrator = vibrator;
        this.context = context;
        this.intentFactory = intentFactory;
        this.ballotBox = ballotBox;
    }

    @Override
    public void onClick(View v) {
        vibrator.vibrate(1000);
        Toast.makeText(context, "Sabotage!", 3000).show();
    }

    @Override
    public boolean onLongClick(View v) {

        ballotBox.vote("Andy");

        intentFactory.start(new VotingResultsActivityStrategy("Voted for Andy"));

        return true;
    }
}
