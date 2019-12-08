/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.match.OnlineSevenQuestionMatch;
import game.starts.StartAction;
import game.starts.StartOnlineSevenQuestionMatch;

/**
 *
 * @author milad
 */
public class CreateOnlineSevenQuestionMatchState extends GameState{

    public CreateOnlineSevenQuestionMatchState(StartAction action) {
        super(action);
    }

    @Override
    public void setState() {
       activity = new OnlineSevenQuestionMatch();
       action = new StartOnlineSevenQuestionMatch();
    }
    
}
