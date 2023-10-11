import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet v1 = new VirtualPet();
        // v1.exercise();
        // sleep(1000);
        // v1.feed();
        // sleep(1000);
        // v1.sleep();
        int ans = getAnswerGOB("Friend! How ya hangin'?");
        if(ans == 0){
            v1.joyforUser();
        }
        else if(ans == 1){
            v1.astonishedforUser();
            sleep(1000);
            v1.sadforUser();
            sleep(1000);
            v1.hopefulforUser();
        }


        // LEFT OFF HERE! IDEA IS TO MAKE DUDE SAD IF REFUSE, ASK AGAIN, THEN GET MAD
        v1.face.setImage("hungry");
        sleep(5000);
        v1.face.setImage("happy");
        int ans1 = getAnswerYON("I'm hungry. Want to go somewhere to eat?");
        if(ans1 == 0){
            v1.joyforUser();
        }
        else if(ans1 == 1){
            v1.astonishedforUser();
            sleep(1000);
            v1.sadforUser();
            sleep(1000);
            v1.hopefulforUser();
        }
    }


    public String getAnswerPM(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Mood",
                    JOptionPane.PLAIN_MESSAGE
);
return s;
    }

    public int getAnswerYON(String q){
        Object[] options = {"Yes", "No"};
        int s = (int)JOptionPane.showOptionDialog(
                    new JFrame(),
                    q,
                    "Mood",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,     //do not use a custom Icon
                    options,  //the titles of buttons
                    options[0]); //default button title
        return s;
    }

    public int getAnswerGOB(String q){
        Object[] options = {"Good", "Bad"};
        int s = (int)JOptionPane.showOptionDialog(
                    new JFrame(),
                    q,
                    "Mood",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,     //do not use a custom Icon
                    options,  //the titles of buttons
                    options[0]); //default button title
        return s;
    }

    

    public static void main(String[] args){
        new Runner();
    }

    public void sleep(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }

    }
}
