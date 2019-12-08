/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.match.RecordGame;
import game.starts.StartAction;
import game.starts.StartRecordGame;

/**
 *
 * @author milad
 */
public class CreateRecordGame extends GameState{

    public CreateRecordGame(StartAction action) {
        super(action);
    }

    @Override
    public void setState() {
       activity = new RecordGame();
       action = new StartRecordGame();
    }
    
}
