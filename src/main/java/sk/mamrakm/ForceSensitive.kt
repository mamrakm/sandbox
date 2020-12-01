package sk.mamrakm;

public class ForceSensitive  {
    private Force forceUser;

    public ForceSensitive(Force forceUser1) {
        forceUser = forceUser1;
    }

    void doTheThing() {
        forceUser.useTheForce();
    }
}
