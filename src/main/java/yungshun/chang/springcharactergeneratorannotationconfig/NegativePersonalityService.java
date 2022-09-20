package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NegativePersonalityService implements PersonalityService {

    // Create an array of strings
    private String[] negativePersonalities = {
            "arrogance",
            "selfishness",
            "cruelty",
            "apathetic",
            "sarcastic",
            "cowardly",
            "argumentative",
            "jealous"
    };

    // Create a random number generator
    private Random random = new Random();

    public String getPersonality() {

        // Pick a random string from the array
        int idx = random.nextInt(negativePersonalities.length);

        String negativePersonality = negativePersonalities[idx];

        return negativePersonality;
    }
}
