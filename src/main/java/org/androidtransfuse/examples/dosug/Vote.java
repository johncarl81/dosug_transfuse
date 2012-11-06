package org.androidtransfuse.examples.dosug;

import org.androidtransfuse.annotations.*;

import javax.inject.Inject;

/**
 * @author John Ericksen
 */
@Activity(label = "Robot Voting Booth")
@IntentFilter({
        @Intent(type = IntentType.ACTION, name = android.content.Intent.ACTION_MAIN),
        @Intent(type = IntentType.CATEGORY, name = android.content.Intent.CATEGORY_LAUNCHER)
})
@Layout(R.layout.vote)
public class Vote {

    @Inject
    @RegisterListener(R.id.andyvotebutton)
    private AndyVoteButtonListener andyVoteButtonListener;

    @Inject
    @RegisterListener(R.id.bendervotebutton)
    private BenderVoteButtonListener benderVoteButtonListener;

    @Inject
    @RegisterListener(R.id.tallyvotes)
    private TallyVotesListener tallyVotesListener;
}
