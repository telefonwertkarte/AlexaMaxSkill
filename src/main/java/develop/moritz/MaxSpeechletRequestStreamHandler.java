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

    static {

        // This is needed to be changed by user
        supportedApplicationIds.add("amzn1.ask.skill.x.y.z");
    }

    /**
     * Instantiates a new max speechlet request stream handler.
     */
    public MaxSpeechletRequestStreamHandler() {
        super(new MaxSpeechlet(), supportedApplicationIds);
    }

}
