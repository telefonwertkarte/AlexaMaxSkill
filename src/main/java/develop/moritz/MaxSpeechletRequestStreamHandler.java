package develop.moritz;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

/**
 * The Class MaxSpeechletRequestStreamHandler.
 */
public class MaxSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

    /** The Constant supportedApplicationIds. */
    private static final Set<String> supportedApplicationIds = new HashSet<>();
    private final static String APPLICATION_ID = "appId";
    static {
        String appId = System.getenv(APPLICATION_ID);

        // This is needed to be changed by user
        supportedApplicationIds.add(appId);
    }

    /**
     * Instantiates a new max speechlet request stream handler.
     */
    public MaxSpeechletRequestStreamHandler() {
        super(new MaxSpeechlet(), supportedApplicationIds);
    }

}
