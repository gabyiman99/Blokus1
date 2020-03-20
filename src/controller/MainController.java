/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ModelGame;
import view.FrameMain;
import view.PanelGame;
import view.PanelMain;

/**
 *
 * @author Vic
 */
public class MainController {
    
    private static FrameMain frameMain;

    public MainController() {
        ModelGame modelGame = new ModelGame();
        frameMain = new FrameMain("Blokus");
        
    }
    
    public static void forceRender(){
        PanelGame panelGame = ((PanelMain)frameMain.getContentPane()).getPanelGame();
    }
    
}
