package impactradius.example.gob;

import java.util.logging.Logger;

public class GameOfBranches {

    private static final Logger LOGGER = Logger.getLogger( GameOfBranches.class.getName() );
    private static final String JOHNSNOW_KNOWLEDGE_LEVEL = "You know nothing John Snow";

    public static void main(String[] args) {
        GameOfBranches gob = new GameOfBranches();

        gob.quote();
    }

    private String quote() {

        LOGGER.warning(JOHNSNOW_KNOWLEDGE_LEVEL);

        return JOHNSNOW_KNOWLEDGE_LEVEL;
    }
}
