package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MaleCharacterProfile implements CharacterProfile {

    private PersonalityService personalityService;

    /* Constructor injection
    @Autowired
    public MaleCharacterProfile(PersonalityService personalityService) {
        this.personalityService = personalityService;
    }
     */

    // Define a default constructor
    public MaleCharacterProfile() {
        System.out.println(">> MaleCharacterProfile: inside default constructor");
    }

    // Define a setter method
    @Autowired
    public void setPersonalityService(PersonalityService personalityService) {
        System.out.println(">> MaleCharacterProfile: inside setPersonalityService() method");
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
