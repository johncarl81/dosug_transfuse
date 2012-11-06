package org.androidtransfuse.examples.dosug;

import android.view.View;
import org.androidtransfuse.intentFactory.IntentFactory;

import javax.inject.Inject;

/**
 * @author John Ericksen
 */
public class BenderVoteButtonListener implements View.OnClickListener {

    private IntentFactory intentFactory;

    @Inject
    public BenderVoteButtonListener(IntentFactory intentFactory) {
        this.intentFactory = intentFactory;
    }

    @Override
    public void onClick(View v) {
        intentFactory.start(new VotingResultsActivityStrategy("BENDER WINS!"));
    }
}
