package com.ktung;

import com.ktung.game.bet.Corner;
import com.ktung.game.bet.Red;
import com.ktung.game.bet.Street;
import com.ktung.simulator.Simulator;

public class Main {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.addBet(new Red(100));
        simulator.addBet(new Corner(1, 0, 1, 2, 3));

        simulator.showOdds();
        int pnl = simulator.run(10);
        if (pnl > 0) {
            System.out.println("Yay!");
        } else if (pnl == 0) {
            System.out.println("Yay...");
        } else {
            System.out.println("...");
        }
    }
}
