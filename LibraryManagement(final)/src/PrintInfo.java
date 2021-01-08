
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */

public class PrintInfo {
private static final PrintInfo print = new PrintInfo();
    private PrintInfo(){ }
    public static PrintInfo getPrintInformation(){
        return print;
    }

public void printWelcome(String name){
	JOptionPane.showMessageDialog(null,"Welcome back, " + name + "!");
}
<<<<<<< HEAD



=======
>>>>>>> 7d31e8f6ea3fd7632e945498a816596fbcc59664
}

    class getPrintInformation {

        static void printWelcome(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public getPrintInformation() {
        }
    }

