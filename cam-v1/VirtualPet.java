/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void happyforPark(){
        face.setImage("happy");
        face.setMessage("To the park we go!");
    }

    public void sadforHome(){
        face.setImage("sad");
        face.setMessage("Oh, okay. I'll see you later then...");
    }

    public void joyforUser(){
        hunger = hunger + 1;
        face.setImage("ecstatic");
        face.setMessage("Woohoo! Me too!");
    }

    public void joyforFood(){
        face.setImage("ecstatic");
        face.setMessage("Yay! Let's go!");
    }

    public void joyforBurger(){
        face.setImage("ecstatic");
        face.setMessage("Okay! Let's get ourselves some burgers!");
    }

     public void joyforSushi(){
        face.setImage("ecstatic");
        face.setMessage("Okay! Let's get ourselves some sushi!");
    }

    public void sadforUser(){
        face.setImage("sad");
        face.setMessage("I'm sorry to hear that...");
    }

    public void sadforFood(){
        face.setImage("sad");
        face.setMessage("Oh, well, that's okay. I was really looking forward to eating with you.");
    }

    public void hopefulforUser(){
        face.setImage("joyful");
        face.setMessage("I hope I can make your day better!");
    }

    public void hopefulforFood(){
        face.setImage("happy");
        face.setMessage("That's okay. Maybe we can go some other day then!");
    }

    public void astonishedforUser(){
        face.setImage("astonished");
    }
} // end Virtual Pet
