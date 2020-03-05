package edu.cscc;
import java.util.Random;



/**
 * Base RPSLSpock Class
 * @author Said ELKabraoui
 * @version Lab7
 */
public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";



    /**
     * Boolean method to remove white space from the String pick, and return false if pick is null.
     * @param pick is parameter inside the method. takes argument h-pick to test the validity of string.
     * @return false if pick is null, remove white space from the string pick, and ignore case(upper case, lower case). then return pick(Rock, scissors, lizard, spock, paper).
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    // TODO remove this comment and document this method

    /**
     * This method generate computer's pick (Rock, scissors, lizard, spock, paper).
     * @return computer's pick after running random operation to match which case is computer's pick.
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    // TODO remove this comment and document this method

    /**
     * This method sets the possibilities and condition where computer wins. also, it matches and compare computer's pick and user's pick.
     * @param c_pick is pick of computer.
     * @param h_pick is pick of user.
     * @return  one of possibilities where computer wins.
     */
    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}