/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.starts;

import game.states.CreateMiddleAdminCommentState;

/**
 *
 * @author milad
 */
public class StartMiddleAdminComment extends StartChat implements StartAction{

    @Override
    public void start() {
         state = new CreateMiddleAdminCommentState(this);
    }
    
}
