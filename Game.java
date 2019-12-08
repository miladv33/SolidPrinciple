/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.starts.StartConversation;
import game.starts.StartNormalComment;
import game.starts.StartAction;
import game.starts.StartManageralComment;
import game.starts.StartMiddleAdminComment;
import game.starts.StartOnlineSevenQuestionMatch;
import game.starts.StartRecordGame;
import game.starts.StartSecurePrivateChat;
import game.starts.StartgroupConversation;

/**
 *
 * @author milad
 */
public class Game {
   static StartAction action;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      action = new StartConversation();
      action.start();
      
      action = new StartNormalComment();
      action.start();
      
      action = new StartManageralComment();
      action.start();
      
      action = new StartMiddleAdminComment();
      action.start();
      
      action = new StartSecurePrivateChat();
      action.start();
      
      action = new StartgroupConversation();
      action.start();
      
      action = new StartRecordGame();
      action.start();
     
      action = new StartOnlineSevenQuestionMatch();
      action.start();
      
    }
    
}
