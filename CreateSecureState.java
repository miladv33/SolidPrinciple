/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.Chat.SecurPrivateChat;
import game.starts.StartAction;
import game.starts.StartSecurePrivateChat;

/**
 *
 * @author milad
 */
public class CreateSecureState extends ChatState{

    public CreateSecureState(StartAction action) {
        super(action);
    }

    @Override
    public void setState() {
        activity = new SecurPrivateChat();
        action = new StartSecurePrivateChat();
    }
    
}
