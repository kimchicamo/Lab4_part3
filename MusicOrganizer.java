import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        /* 24 public void listAllFiles() {
        /*    int position = 0;
         * for (String file : files) {
         *     System.out.println(position + ":" + filename);
         *     position ++;
         *  }
        }*/
         
        
         if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(String filename : files) {
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
    
     public void listMatching(String searchString)
     //List the names of files matching the given search string.
    //param searchString The string to match
    //QUESTION 26
    {
       for(String filename : files) {
           boolean foundMatch = false; //Declare a boolean variable to track if a match is found
           if(filename.contains(searchString)){
             // A match.
             System.out.println("Found match :" + filename);
             foundMatch = true; //Set to true if a match is found
           }
           
           if (!foundMatch) {
           System.out.println("No files matched the search string.");
           }
       } 
    }
    
     /*Question 29
      * boolean missing = true; 
      * while(missing) { 
      *     if(the keys are in the next place) { 
      *         missing = false;
      *         boolean found = false; 
      *         while(!found) {// continue looping until keys are found
      *          if(the keys are in the next place) 
      *          { found = true; //keys found, so stop searching 
      *             } 
      *         }
     }
    }
     */
    //Question 30
    public void multiplesOfFive()
    {
        int number = 10; // start at 10,the first multiple of 5 in the range 
        while (number<= 95) {
                    System.out.println(number);
                    number+=5; 
        }
    }
    //32
    public int sum(int a, int b)
    { 
        int sum = 0;
        int number = a ; 
        while (number<=b){
         sum += number;
         number++;
        }
        
        return sum;
    }
    //31
    
    public void sumOneToTen()
    {
        int sum = 0;
        int number = 1;
        
        while (number <= 10) {
            sum += number;
            number++;
        }
        
        System.out.println("the sum of values from 1 to 10 is:"+sum);
    }
}


