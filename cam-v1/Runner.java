import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        VirtualPet v1 = new VirtualPet();
        v1.exercise();
        sleep(1000);
        v1.feed();
        sleep(1000);
        v1.sleep();
        String ans = getAnswer("How are you?");
        if(ans.equalsIgnoreCase("Good")){
            
        }
    }

    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE


    
);
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
