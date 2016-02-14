/* Lab 10, Part E: Created by Celine Latulipe  */  
public class Lab10PartE {   
  public static void main(String [] args) throws InterruptedException  
  {   
    String filename1;
    
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
    
    // create a new, small blank Picture
    Picture croppedPic = new Picture(150, 100);
    // crop the picture to a 150 by 100 area, at position 30, 50
    pic.crop(130, 80, 150, 100, croppedPic);
    // update display
    croppedPic.show();

    // Don't touch this code, 
    // it writes out the result of the picture manipulation to a file for autograding.
    String outfilename = SimplePicture.getMediaPath("Lab10PartE.jpg");
    if (args.length > 1) {
      outfilename = args[args.length - 1];    
    }
    croppedPic.write(outfilename);
  } 
}  