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

    public void joyforUser(){
        hunger = hunger + 1;
        face.setImage("ecstatic");
        face.setMessage("Woohoo! Me too!");
    }

    public void joyforFood(){
        face.setImage("ecstatic");
        face.setMessage("Yay! Let's go!");
    }

    public void sadforUser(){
        face.setImage("verysad");
        face.setMessage("I'm sorry to hear that...");
    }

    public void hopefulforUser(){
        face.setImage("joyful");
        face.setMessage("I hope I can make your day better!");
    }

    public void astonishedforUser(){
        face.setImage("astonished");
    }
} // end Virtual Pet
