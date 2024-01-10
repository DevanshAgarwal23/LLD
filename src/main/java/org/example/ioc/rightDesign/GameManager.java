package org.example.ioc.rightDesign;

import org.example.ioc.data.Game;

public class GameManager {

    private final Game game;

    //Control of obj creation is at client side.
    public GameManager(Game game){
        //IOC - Inversion of control.(Spring uses this)
        this.game = game;
    }

    public void manage(){
        game.init();
        game.start();
        game.finish();
    }
}
