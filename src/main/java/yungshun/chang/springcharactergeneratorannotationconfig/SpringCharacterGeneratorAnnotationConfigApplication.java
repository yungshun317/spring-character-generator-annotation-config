package yungshun.chang.springcharactergeneratorannotationconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCharacterGeneratorAnnotationConfigApplication {

    public static void main(String[] args) {

        // [1] Read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // [2] Get the bean from Spring container
        CharacterProfile characterProfile = context.getBean("maleCharacterProfile", CharacterProfile.class);

        // [3] Call a method on the bean
        System.out.println(characterProfile.getName());

        // [5] Call method to get personality
        System.out.println(characterProfile.getPersonality());

        // [4] Close the context
        context.close();
    }

}
