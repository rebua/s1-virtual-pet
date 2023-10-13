import javax.swing.*;

public class Runner {
    public Runner(){
        VirtualPet v1 = new VirtualPet();
        // v1.exercise();
        // sleep(1000);
        // v1.feed();
        // sleep(1000);
        // v1.sleep();
        // int ans = getAnswerGOB("Friend! How ya hangin'?");
        // if(ans == 0){
        //     v1.joyforUser();
        //     sleep(2000);
        // }
        // else if(ans == 1){
        //     v1.astonishedforUser();
        //     sleep(1000);
        //     v1.sadforUser();
        //     sleep(1000);
        //     v1.hopefulforUser();
        // }


        // LEFT OFF HERE! IDEA IS TO MAKE DUDE SAD IF REFUSE, ASK AGAIN, THEN GET MAD
        v1.face.setImage("hungry");
        sleep(3000);
        v1.face.setImage("happy");
        int ans1 = getAnswerYON("I'm hungry. Want to get something to eat?");
        int ans2 = -1;
        int ans3 = -1;
        int ansSushi = -1;
        if(ans1 == 0){
            v1.joyforFood();
        }
        else if(ans1 == 1){
            v1.astonishedforUser();
            sleep(1000);
            v1.sadforUser();
            sleep(1000);
            v1.hopefulforFood();
        }

        if(ans1 == 0){
            ans2 = getAnswerFood("What kind of food should we get?");
            if (ans2 == 0){
                v1.joyforBurger();
                sleep(2000);
            }
            else if (ans2 == 1){
                v1.joyforSushi();
                sleep(2000);
            }
            else if (ans2 == 2){
                v1.sadforFood();
                sleep(2000);
            }
        }

        if (ans2 == 2 || ans1 == 1){
            ans3 = getAnswerBored("Well, what should we do now?");
                if (ans3 == 0){
                    v1.happyforPark();
                    sleep(2000);
                }
                else if (ans3 == 1){
                    v1.sadforHome();
                    sleep(2000);
                }
            }

        if (ans2 == 0){
            ansSushi = getAnswerSushi("What kind of sushi should we get? I think I got sick because I ate one of them before...");
                if (ansSushi == 0){
                    
                }
                else if (ansSushi == 1){

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

    public int getAnswerFood(String q){
        Object[] options = {"Burger", "Sushi", "I don't feel like eating anymore."};
        int s = (int)JOptionPane.showOptionDialog(
                    new JFrame(),
                    q,
                    "Mood",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,     //do not use a custom Icon
                    options,  //the titles of buttons
                    options[0]); //default button title
        return s;
    }

    public int getAnswerSushi(String q){
        Object[] options = {"Tuna", "Salmon"};
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

    public int getAnswerBored(String q){
        Object[] options = {"Go to the Park", "I think I should go home."};
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
