/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.Serializable;
import java.awt.Point;

/**
 *
 * @author pozdv
 */
public class State implements Serializable {
    private int player_num;
    
    private Point puck;
    private Point mallet_1, mallet_2;
    
    private int malletRadius = 20;

    public State(Point puck, Point mallet_1, Point mallet_2) {
        this.puck = puck;
        this.mallet_1 = mallet_1;
        this.mallet_2 = mallet_2;
    }
    
    public State() {
    }

    public Point getMallet_1() {
        return mallet_1;
    }

    public Point getMallet_2() {
        return mallet_2;
    }

    public void setMallet_1(Point mallet) {
        this.mallet_1 = mallet;
    }

    public void setMallet_2(Point mallet) {
        this.mallet_2 = mallet;
    }

    public Point getPuck() {
        return puck;
    }

    public void setPuck(Point puck) {
        this.puck = puck;
    }
    
    public int getPlayerNum() {
        return player_num;
    }

    public void setPlayerNum(int value) {
        this.player_num = value;
    }
    
    public int getMalletRadius() {
        return malletRadius;
    }
}
