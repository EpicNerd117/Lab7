package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RPSLSpock_Test {
    private RPSLSpock hChoice;
    private RPSLSpock cChoice;
    private RPSLSpock compWin;


    @Test
    public void testSuiteOne(){
        Assert.assertTrue(hChoice.isValidPick("rock") == RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(hChoice.isValidPick("paper") == RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(hChoice.isValidPick("scissors") == RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(hChoice.isValidPick("lizard") == RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(hChoice.isValidPick("spock") == RPSLSpock.isValidPick(RPSLSpock.SPOCK));

    }

    @Test
    public void testSuiteTwo(){
        Assert.assertNotNull(cChoice.generatePick() == null);
        Assert.assertTrue(cChoice.isValidPick("lizard") == RPSLSpock.isValidPick(RPSLSpock.LIZARD));

    }

    @Test
    public void testSuiteThree(){

    }
}


