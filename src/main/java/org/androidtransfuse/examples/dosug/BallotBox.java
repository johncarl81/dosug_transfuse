package org.androidtransfuse.examples.dosug;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

/**
 * @author John Ericksen
 */
@Singleton
public class BallotBox {

    private Map<String, Integer> ballots = new HashMap<String, Integer>();

    public void vote(String name) {

        if (!ballots.containsKey(name)) {
            ballots.put(name, 0);
        }
        ballots.put(name, ballots.get(name) + 1);
    }

    public String getWinner() {
        String winner = "none";
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> ballotEntry : ballots.entrySet()) {
            if (ballotEntry.getValue() > max) {
                winner = ballotEntry.getKey();
                max = ballotEntry.getValue();
            }
        }

        return winner;
    }
}
