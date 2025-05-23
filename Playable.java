interface Playable {
    void play()
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        football.play();
        volleyball.play();
        basketball.play();
        System.out.println("Kushal CSE24333 CSE-C");
    }
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}
public class PlayableTest {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        football.play();
        volleyball.play();
        basketball.play();
        System.out.println("Kushal CSE24333 CSE-C");
    }
}
