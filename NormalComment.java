/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.Chat;

/**
 *
 * @author milad
 */
public class NormalComment extends Comment{
    @Override
    public void startAction() {
        System.out.println("normal comment in someWhere");
    }
}
