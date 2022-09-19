package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.stereotype.Component;

@Component
public class MaleCharacterProfile implements CharacterProfile {

    public String getName() {
        return "John Doe";
    }
}
