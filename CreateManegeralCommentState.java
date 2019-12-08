/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.Chat.ManageralComment;
import game.starts.StartAction;
import game.starts.StartManageralComment;

/**
 *
 * @author milad
 */
public class CreateManegeralCommentState  extends CommentState{

    public CreateManegeralCommentState(StartAction action) {
        super(action);
    }

    @Override
    public void setState() {
        activity = new ManageralComment();
       action = new StartManageralComment();
    }
    
}
