package sk.mamrakm;

import org.springframework.stereotype.Component;

@Component("forceUser")
public class Jedi implements Force {
    private void useTheLightForcePower() {
        System.out.println("Light side force power used");
    }

    @Override
    public void useTheForce() {
        useTheLightForcePower();
    }
}
