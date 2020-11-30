package sk.mamrakm;

public class Sith implements Force {
    private void useTheDarkForcePower() {
        System.out.println("Dark side force power used");
    }

    @Override
    public void useTheForce() {
        useTheDarkForcePower();
    }
}
