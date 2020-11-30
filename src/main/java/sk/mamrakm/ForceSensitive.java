package sk.mamrakm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForceSensitive  {
    @Autowired
    private Force forceUser;

    void doTheThing() {
        forceUser.useTheForce();
    }
}
