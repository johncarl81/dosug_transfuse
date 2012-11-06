package org.androidtransfuse.examples.dosug;

import android.view.View;
import org.androidtransfuse.intentFactory.IntentFactory;

import javax.inject.Inject;

/**
 * @author John Ericksen
 */
public class TallyVotesListener implements View.OnClickListener {

    private BallotBox ballotBox;
    private IntentFactory intentFactory;

    @Inject
    public TallyVotesListener(BallotBox ballotBox, IntentFactory intentFactory) {
        this.ballotBox = ballotBox;
        this.intentFactory = intentFactory;
    }

    @Override
    public void onClick(View view) {
        String winner = ballotBox.getWinner();

        intentFactory.start(new VotingResultsActivityStrategy(winner + " Wins!"));
    }
}
