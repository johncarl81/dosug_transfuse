package org.androidtransfuse.examples.dosug;

import android.view.View;
import org.androidtransfuse.intentFactory.IntentFactory;

import javax.inject.Inject;

/**
 * @author John Ericksen
 */
public class BenderVoteButtonListener implements View.OnClickListener {

    private IntentFactory intentFactory;
    private BallotBox ballotBox;

    @Inject
    public BenderVoteButtonListener(IntentFactory intentFactory, BallotBox ballotBox) {
        this.intentFactory = intentFactory;
        this.ballotBox = ballotBox;
    }

    @Override
    public void onClick(View v) {

        ballotBox.vote("Bender");

        intentFactory.start(new VotingResultsActivityStrategy("Voted for Bender"));
    }
}
