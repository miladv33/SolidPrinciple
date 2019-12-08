/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.Chat.MiddleAdminComment;
import game.starts.StartAction;
import game.starts.StartMiddleAdminComment;

/**
 *
 * @author milad
 */
public class CreateMiddleAdminCommentState extends CommentState{

    public CreateMiddleAdminCommentState(StartAction action) {
        super(action);
    }

    @Override
    public void setState() {
        activity = new MiddleAdminComment();
       action = new StartMiddleAdminComment();
    }
    
}
