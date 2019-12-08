/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.starts;

import game.states.CreateOnlineSevenQuestionMatchState;

/**
 *
 * @author milad
 */
public class StartOnlineSevenQuestionMatch extends StartMatch implements StartAction {

    @Override
    public void start() {
        state = new CreateOnlineSevenQuestionMatchState(this);
    }
    
}
