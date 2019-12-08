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
public abstract class CommentState extends ChatState{
     public CommentState(StartAction action) {
        super(action);
    }
   
}
