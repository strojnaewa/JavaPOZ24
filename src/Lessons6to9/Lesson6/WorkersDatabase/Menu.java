package Lessons6to9.Lesson6.WorkersDatabase;

import java.util.Scanner;

public class Menu {

        public void showMenu () {
                System.out.println("Choose:");
                System.out.println("1-List all employees (cut data)");
                System.out.println("2-Add new employee");
                System.out.println("3-Export to text file");
                System.out.println("4-Delete employee");
                System.out.println("5-Edit employee data");
                System.out.println("6-Additional options");
                System.out.println("7-Additional options for text files");
                System.out.println("8-Program info");
                System.out.println("9-Change file name");
                System.out.println("0-Exit");
            }
            //do obsługi menu
            public int takeUserAction(){
                Scanner scanner=new Scanner(System.in);
                int line = scanner.nextInt();
                return line;

            }


        }



