package cdi.generator;

import cdi.qualifiers.Loggable;
import cdi.qualifiers.ThirteenDigits;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {

        String isbn = "34-556-" + Math.abs(new Random().nextInt());
        logger.info("ISBN number has been generated: " + isbn);
        return isbn;
    }
}
