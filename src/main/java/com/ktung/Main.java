package com.ktung;

import com.ktung.game.bet.Corner;
import com.ktung.game.bet.Red;
import com.ktung.game.bet.Street;
import com.ktung.simulator.Simulator;

public class Main {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();

        int initialBalance = 200;
        int miseTotale = 0;

        int balance = initialBalance;
        int nbIteration = 10;
        int totalWin = 0;
        int pnlPerRound = 0;
        for (int i = 0; i < nbIteration; i++) {
            if (pnlPerRound <= 0) {
                miseTotale += balance;
            }

            System.out.printf("%d | Initial balance %d%n", i, balance);
            pnlPerRound = simulator.run2(balance, 40, 10, 1.8);
            totalWin += pnlPerRound;

            if (pnlPerRound > 0) {
                balance += pnlPerRound/2;
            } else {
                balance = initialBalance+pnlPerRound;
            }
        }

        System.out.printf("Mise totale %d%n", miseTotale);
        System.out.printf("totalWin %d (%f)", totalWin, (((double)totalWin/miseTotale)*100));
    }
}
