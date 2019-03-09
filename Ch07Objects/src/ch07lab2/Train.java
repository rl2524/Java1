package ch07lab2;

import java.util.ArrayList;

/**
 * Get user input and place it into an ArrayList. Asking for number of containers
 * 4/18/2018
 * @author Ramiro
 * @author Jacob M.
 * @author Jim
 */
public class Train {

   //creates an Arraylist
   private ArrayList<String> train;

   /**
    *set the array
    */
   public Train(){
   this(new ArrayList<>());
}

   /**
    *set the arraylist
    * @param containers name of the array list
    */
   public Train(ArrayList<String> containers){
   this.train = new ArrayList<String>();

   for(int i = 0; i < containers.size(); i++){
      this.train.add(containers.get(i));
   }

}

   /**
    *adds the content
    * @param contents name of the string
    * @return
    */
   public boolean addContainer(String contents){
   this.train.add(new String(contents));
   return true;

}

   /**
    *will get the amount of container
    * @param index name of the integer
    * @return a number of containers or a blank
    */
   public String getContainer(int index){

    //begins output
   if (index >= 0 && index <(this.train.size())){
     return this.train.get(index);

   }
   else{
      return "";
   }
}

   /**
    *
    * @param index name of the integer
    * @param newContents name of the string
    * @return will return a true or false statement
    */
   public boolean setContainer(int index, String newContents){

    //begins output
   if (index >= 0 && index < (this.train.size())){
      this.train.set(index, newContents);
      return true;
   }else{
      return false;
   }

}

   /**
    *looking for the size of the train
    * @return the size of the train
    */
   public int length(){
   return this.train.size();

}





}