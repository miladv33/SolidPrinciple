/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.starts.StartAction;

/**
 *
 * @author milad
 */
public abstract class GameState extends State{

    public GameState(StartAction action) {
        super(action);
    }
}
