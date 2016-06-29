package ch05;

/**
 * Tests the PollDisplayPanel class.
 * Should output
 *      "Tammy: 1  Brian: 2  Liz: 0"
 *
 * Created by justin on 6/28/16.
 */
public class PollDisplayPanelTest {
    public static void main(String[] args) {
        PollDisplayPanel votingMachine = new PollDisplayPanel("Tammy", "Brian", "Liz");
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();

        System.out.println(votingMachine);
    }
}
