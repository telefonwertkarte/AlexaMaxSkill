package develop.moritz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.google.common.base.Strings;
import com.google.common.primitives.Doubles;

/**
 * The Class MaxSpeechlet.
 */
public class MaxSpeechlet implements Speechlet {

    /** The Constant COMMAND_GET_TEMP. */
    private final static String COMMAND_GET_TEMP = "getTemp";

    /** The Constant COMMAND_SET_TEMP. */
    private static final String COMMAND_SET_TEMP = "setTemp";

    /** The Constant COMMAND_GET_MODUS. */
    private static final String COMMAND_GET_MODUS = "getModus";

    /** The Constant INC_TEMP. */
    private static final String INC_TEMP = "incTemp";

    /** The Constant DEC_DEMP. */
    private static final String DEC_TEMP = "decTemp";

    /**
     * Instantiates a new max speechlet.
     */
    public MaxSpeechlet() {
        super();
        org.apache.log4j.BasicConfigurator.configure();
    }

    /** The Constant log. */
    private final static Logger log = LoggerFactory.getLogger(MaxSpeechlet.class);

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.amazon.speech.speechlet.Speechlet#onSessionStarted(com.amazon.speech.
     * speechlet.SessionStartedRequest, com.amazon.speech.speechlet.Session)
     */
    @Override
    public void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {
        log.info("onSessionStarted requestId = {}, sessionId={}", request.getRequestId(), session.getSessionId());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.amazon.speech.speechlet.Speechlet#onLaunch(com.amazon.speech.
     * speechlet.LaunchRequest, com.amazon.speech.speechlet.Session)
     */
    @Override
    public SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
        log.info("onLaunch requestId = {}, sessionId={}", request.getRequestId(), session.getSessionId());
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText("Willkommen bei Moritz!");

        return SpeechletResponse.newAskResponse(speech, createRepromptSpeech());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.amazon.speech.speechlet.Speechlet#onIntent(com.amazon.speech.
     * speechlet.IntentRequest, com.amazon.speech.speechlet.Session)
     */
    @Override
    public SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
        log.info("onIntent requestId = {}, sessionId={}", request.getRequestId(), session.getSessionId());
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();

        final String maxUsername = System.getenv("maxUsername");
        final String maxPassword = System.getenv("maxPassword");

        if (!Strings.isNullOrEmpty(maxUsername) && !Strings.isNullOrEmpty(maxPassword)) {
            MaxControl maxControl = new MaxControl();
            String temperature = null;
            boolean result = false;
            log.info("Request: {}", request.getIntent().getName());
            if (request.getIntent().getName() != null) {
                switch (request.getIntent().getName()) {
                case COMMAND_GET_TEMP:
                    temperature = maxControl.getTemperature(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue());
                    if (temperature != null) {
                        speech.setText("Die Temperatur im Raum " + request.getIntent().getSlot("room").getValue()
                                + " ist eingestellt auf " + temperature.replace(".", ",") + " Grad");
                    } else {
                        speech.setText("Ich konnte die Temperatur leider nicht ermitteln");
                    }
                    break;
                case COMMAND_SET_TEMP:
                    result = maxControl.setTemperature(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue(),
                            request.getIntent().getSlot("temperature").getValue());
                    if (result) {
                        speech.setText("Die Temperatur im Raum " + request.getIntent().getSlot("room").getValue()
                                + " wurde eingestellt auf " + request.getIntent().getSlot("temperature").getValue()
                                + " Grad");
                    } else {
                        speech.setText("Das Einstellen der Temperatur ist fehlgeschlagen");
                    }
                    break;
                case COMMAND_GET_MODUS:
                    String modus = maxControl.getModus(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue());
                    if (modus != null) {
                        speech.setText("Der Modus im Raum " + request.getIntent().getSlot("room").getValue()
                                + " ist eingestellt auf " + modus);
                    } else {
                        speech.setText("Ich konnte den Modus leider nicht ermitteln");
                    }
                    break;
                case INC_TEMP:
                    temperature = maxControl.getTemperature(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue());
                    result = maxControl.incrementTemperature(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue());
                    if (result) {
                        speech.setText("Die Temperatur im Raum " + request.getIntent().getSlot("room").getValue()
                                + " wurde eingestellt auf "
                                + new String("" + (Doubles.tryParse(temperature).doubleValue() + 0.5)).replace(".", ",")
                                + " Grad.");
                    } else {
                        speech.setText("Ich konnte die Temperatur leider nicht ermitteln");
                    }
                    break;
                case DEC_TEMP:
                    temperature = maxControl.getTemperature(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue());
                    result = maxControl.decrementTemperature(maxUsername, maxPassword,
                            request.getIntent().getSlot("room").getValue());
                    if (result) {
                        speech.setText("Die Temperatur im Raum " + request.getIntent().getSlot("room").getValue()
                                + " wurde eingestellt auf "
                                + new String("" + (Doubles.tryParse(temperature).doubleValue() - 0.5)).replace(".", ",")
                                + " Grad.");
                    } else {
                        speech.setText("Ich konnte die Temperatur leider nicht ermitteln!");
                    }
                    break;
                default:
                    speech.setText("Tut mir leid, aber mit diesem Befehl kann ich nichts anfangen!");
                    break;
                }
            }
        } else {
            speech.setText("Ich habe keine gültigen Anmeldedaten. Bitte zuerst eingeben!");
        }

        return SpeechletResponse.newTellResponse(speech);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.amazon.speech.speechlet.Speechlet#onSessionEnded(com.amazon.speech.
     * speechlet.SessionEndedRequest, com.amazon.speech.speechlet.Session)
     */
    @Override
    public void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {
        log.info("onSessionEnded requestId = {}, sessionId={}", request.getRequestId(), session.getSessionId());

    }

    /**
     * Creates the reprompt speech.
     *
     * @return the reprompt
     */
    private Reprompt createRepromptSpeech() {
        PlainTextOutputSpeech repromptSpeech = new PlainTextOutputSpeech();
        repromptSpeech.setText("ich habe Dich nicht verstanden");
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptSpeech);
        return reprompt;
    }
}
