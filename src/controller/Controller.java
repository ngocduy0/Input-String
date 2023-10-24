
package controller;

import menu.Menu;
import valadation.Validation;


public class Controller extends Menu{
    public Validation v = new Validation();
    public Controller(String title, String []mc){
        super(title, mc);
    }
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                 v.getNumber("321sdhkjDFGH!@#$%^22fdsf3");
                 v.getCharacter("321sdhkjDFGH!@#$%^22fdsf3");
                break;
            case 2: 
                 return; 
            default:
                throw new AssertionError();
        }
    }
    
}
