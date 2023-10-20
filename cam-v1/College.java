public class College{

public boolean college(int avgTemp, int numStudents, boolean csMajor){
   boolean b = true;

      if(avgTemp <= 80){
        b = false;
      }
       if(numStudents <= 8000){
         b = false;
      }
       if(!csMajor){
         b = false;
      }
   return b;
   }


public boolean college2(int avgTemp, int numStudents, boolean csMajor){
   if (avgTemp > 80){
      if (numStudents > 8000){
         if (csMajor = true){
            return true;
         }
      }
   }
   return false;}
}
