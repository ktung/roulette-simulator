package com.ktung;

import com.ktung.game.Black;
import com.ktung.game.Even;
import com.ktung.game.Red;
import com.ktung.game.StraightUp;
import com.ktung.simulator.Simulator;

public class Main {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.addBet(new Red(1));
        simulator.addBet(new Black(1));
        simulator.addBet(new StraightUp(1, 0));

        simulator.showOdds();
        int pnl = simulator.run(20);
        if (pnl > 0) {
            System.out.println("Yay!");
        } else if (pnl == 0) {
            System.out.println("Yay...");
        } else {
            System.out.println("...");
        }
    }
}
