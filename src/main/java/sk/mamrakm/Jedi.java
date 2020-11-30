package sk.mamrakm;

public class Jedi implements Force {
    private void useTheLightForcePower() {
        System.out.println("Light side force power used");
    }

    @Override
    public void useTheForce() {
        useTheLightForcePower();
    }
}
