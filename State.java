/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.Activity;
import game.starts.StartAction;

/**
 *
 * @author milad
 */
public abstract class State {
    public StartAction action;
    public Activity activity;

    public State(StartAction action) {
        this.action = action;
        setState();
       activity.startAction();
    }
    public abstract void setState();
    
}
