package cdi.generator;

import cdi.qualifiers.EightDigits;
import cdi.qualifiers.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@EightDigits
public class IssnGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {

        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("ISSN number has been generated: " + issn);
        return issn;
    }

}
