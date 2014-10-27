
import java.awt.event.ActionEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class scaleable extends Shape{
    public void actionPerformed2(ActionEvent evt) {
               // Called to respond to action events.  The three shape-adding
        // buttons have been set up to send action events to this canvas.
        // Respond by adding the appropriate shape to the canvas.
        if (evt.getSource() == scalChoice) {
            switch (scalChoice.getSelectedIndex()) {
                case 0:
                    scalChoice = width * 1
                    , height * 1;
                    break;
                case 1:
                    scalChoice = width * 2
                    , height * 2;
                    break;
                case 2:
                    scalChoice = width * 3
                    , height * 3;
                    break;
                case 3:
                    scalChoice = width * 4
                    , height * 4;
                    break;
                case 4:
                    scalChoice = width * 5
                    , height * 5;
                    break;

            }
        }

    }
}