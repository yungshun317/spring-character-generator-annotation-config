package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MaleCharacterProfile implements CharacterProfile {

    /* Field injection (not recommended)
       @Autowired
       @Qualifier("negativePersonalityService")
     */
    private PersonalityService personalityService;

    /* Constructor injection
    @Autowired
    public MaleCharacterProfile(@Qualifier("negativePersonalityService") PersonalityService personalityService) {
        this.personalityService = personalityService;
    }
    */

    // Define a default constructor
    public MaleCharacterProfile() {
        System.out.println(">> MaleCharacterProfile: inside default constructor");
    }

    // Define a setter method for setter injection
    @Autowired
    public void setPersonalityService(@Qualifier("negativePersonalityService") PersonalityService personalityService) {
        System.out.println(">> MaleCharacterProfile: inside setPersonalityService() method");
        this.personalityService = personalityService;
    }

    /* Another syntax for setter injection: @Qualifier above the method name
    @Autowired
    @Qualifier("negativePersonalityService")
    public void setPersonalityService(@Qualifier("negativePersonalityService") PersonalityService personalityService) {
        System.out.println(">> MaleCharacterProfile: inside setPersonalityService() method");
        this.personalityService = personalityService;
    }
    */

    @Override
    public String getName() {
        return "John Doe";
    }

    @Override
    public String getPersonality() {
        return personalityService.getPersonality();
    }
}
