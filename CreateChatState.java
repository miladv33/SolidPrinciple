/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.Chat.Conversation;
import game.starts.StartAction;
import game.starts.StartConversation;

/**
 *
 * @author milad
 */
public class CreateChatState extends ChatState{
    public CreateChatState(StartAction action) {
        super(action);
    }
    @Override
    public void setState() {
       activity = new Conversation();
       action = new StartConversation();
    }
    
}
