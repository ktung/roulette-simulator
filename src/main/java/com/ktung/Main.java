package com.ktung;

import com.ktung.game.bet.Street;
import com.ktung.simulator.Simulator;

public class Main {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.addBet(new Street(1, 1,2, 3));
        simulator.addBet(new Street(1, 3,4, 5));
        simulator.addBet(new Street(10, 33, 5, 31));

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
