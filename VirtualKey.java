package Phase2Project;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKey {
    public static void main(String[] args) throws IOException {
    	
    	// Display Welcome Screen By given problem statement (Lockedme.com).
    	
    	// Given Developer Details also mention Here.
    	
        System.out.println("**************** Welcome to Lockedme.com ***********************\n" +
                "Application Name: Virtual Key Repository\n" +
                "***************Developer Details***************\n" +
                "Name: KORIVI EDUKONDALU \n" +
                "Designation: JAVA Developer\n" +
                "Date: 01-07-2022");

        //  we create Some Multiple choices for user convenience
        
        while (true) {
        	
            System.out.println("Enter 1 : Get file names in ascending order\n" +
                    "Enter 2:  For Business Level Operation\n" +
                    "Enter 3: Close the Application");
            System.out.println("Please Select any one given above options :");
            
            
          // we take input dynamically from user end here.
            
            Scanner s = new Scanner(System.in);
            int option = s.nextInt();

            // The Existing and add new files are arranged in Sorting order by Using list and Arrays concepts in Collections
            
          
            if (option == 1) {
            	 System.out.println("The files are in Assending order :\n");
                File file = new File("D:\\LockedMe.com Files" );
                String[] files = file.list();
                Arrays.sort(files);
                for (int i = 0; i< files.length; i++) {
                    String filename = files[i];
                    System.out.println(filename);
                  
                    
     // for user requirement, we are doing Business operations like Create, Delete and Searching files.               
                    
                }
                System.out.println();
            } 
            
            else if (option == 2) {
                System.out.println("Enter 1 : add a new file\n" +
                        "enter 2:  Delete Existing file\n" +
                        "enter 3:  Search file in Directory\n" +
                        "enter 4:  Go back Main Menu");
                System.out.println("Please Select any one given above options :");
                int input = s.nextInt();
                switch (input) {
                
           // we are doing Create a new file functionality    
                    case 1:
                        System.out.println("Enter your file name");
                        Scanner scanner1 = new Scanner(System.in);
                        String name = scanner1.nextLine();
                        File file = new File("D:\\LockedMe.com Files" + name);
                        if (file.createNewFile()) {
                            System.out.println("File is created sucessfully");
                        } else {
                            System.out.println("File is already exist");
                        }
                        break;
                        
                        // we are doing delete existing file in directory.            
                        
                    case 2:
                        System.out.println("Enter file name for delete");
                        Scanner scanner2 = new Scanner(System.in);
                        String name1 = scanner2.nextLine();
                        File file1 = new File("D:\\LockedMe.com Files" + name1);
                        if(file1.delete())
                            System.out.println("File is deleted");
                        else
                            System.out.println("File is not deleted or file is not found");
                        break;
                    
                        // we are doing search a file in Directory
                    
                    case 3:
                        System.out.println("Enter your file name to search");
                        Scanner scanner3 = new Scanner(System.in);
                        String fileName = scanner3.nextLine();
                        File file2 = new File("D:\\LockedMe.com Files" + fileName);
                        if( file2.exists())
                        {
                            System.out.println("File is available in this Directory : D:\\\\LockedMe.com Files ");
                        }
                        else {
                            System.out.println("File is not available In this Directory");
                        }
                  
                // Otherwise we will goto Main Menu    
                    
                    case 4:
                        System.out.println("GoBack to Main Menu");
                        break;
                    default:
                        System.out.println("Please enter a valid file name");
                }
            }
            if (option == 3){
                System.exit(option);
                System.out.println("you have Exited successfully");
                System.out.println("Thank you");
            }
        }
    }
}
