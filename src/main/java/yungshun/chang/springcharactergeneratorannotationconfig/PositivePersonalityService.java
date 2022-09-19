package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.stereotype.Component;

@Component
public class PositivePersonalityService implements PersonalityService {

    public String getPersonality() {
        return "Generous";
    }
}
