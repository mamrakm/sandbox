package sk.mamrakm;

public class Jedi implements Force {
    private void useTheLightForcePower() {
    }

    @Override
    public void useTheForce() {
        useTheLightForcePower();
    }
}
