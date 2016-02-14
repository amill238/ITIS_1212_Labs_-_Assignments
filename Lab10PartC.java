/* Lab 10, Part C: Created by Celine Latulipe  */  
public class Lab10PartC {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String filename1;
    String filename2;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename1 = args[0];      
       System.out.println("Filename passed in: " + filename1);
       
    } else {
       // ask user for a picture
       System.out.println("Please open a file.");
       filename1 = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename1);
    }
    Picture pic = new Picture(filename1);
    pic.show();

    
    // open a second picture. Make sure it is smaller than the first picture.
    if (args.length > 1) {
      filename2 = args[1];
      System.out.println("Second filename passed in: " + filename2);
    } else {
      System.out.println("Please choose a second picture that is smaller than the first.");
      filename2 = FileChooser.pickAFile();
      System.out.println("User picked a second file: " + filename2);
    }
    Picture target = new Picture(filename2);

    // add target into first picture at 50, 70
    pic.checkerboard(20, target);
    // update display
    pic.repaint();

    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("revealByCheckerboard.jpg");
    if (args.length > 2) {
      outfilename = args[args.length - 1];    
    }
    pic.write(outfilename);
  } 
}  