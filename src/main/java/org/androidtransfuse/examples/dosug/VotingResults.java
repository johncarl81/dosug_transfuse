package org.androidtransfuse.examples.dosug;

import android.widget.TextView;
import org.androidtransfuse.annotations.*;

import javax.inject.Inject;

/**
 * @author John Ericksen
 */
@Activity
@Layout(R.layout.voteresults)
public class VotingResults {

    private String result;
    private TextView resultsText;

    @Inject
    public VotingResults(@Extra(value = "results") String result, @View(R.id.results) TextView resultsText) {
        this.result = result;
        this.resultsText = resultsText;
    }

    @OnCreate
    public void updateResults() {
        resultsText.setText(result);
    }

}
