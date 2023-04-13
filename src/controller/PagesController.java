package controller;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PagesController {
    
    public void mudaTela(JFrame open, JFrame close)
    {
        close.dispose();
        open.show();
    }
    
    public void mudaTelaInterna(JFrame open)
    {
        open.show();
    }
    
    public void fechaTelaInterna(JFrame close) {
        close.dispose();
    }
}
