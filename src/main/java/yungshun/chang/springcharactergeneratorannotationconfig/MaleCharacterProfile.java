package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MaleCharacterProfile implements CharacterProfile {

    private PersonalityService personalityService;

    @Autowired
    public MaleCharacterProfile(PersonalityService personalityService) {
        this.personalityService = personalityService;
    }

    @Override
    public String getName() {
        return "John Doe";
    }

    @Override
    public String getPersonality() {
        return personalityService.getPersonality();
    }
}
