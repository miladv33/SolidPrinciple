/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.states;

import game.Chat.NormalComment;
import game.starts.StartAction;
import game.starts.StartNormalComment;

/**
 *
 * @author milad
 */
public class CreateNormalCommentState extends CommentState{
  
    public CreateNormalCommentState(StartAction action) {
        super(action);
    }
    @Override
    public void setState() {
       activity = new NormalComment();
       action = new StartNormalComment();
    }
    
}
