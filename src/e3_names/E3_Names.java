
package e3_names;

import java.util.Scanner;

public class E3_Names {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String name[] = new String[5];
        int marks[]= new int[5];
        int max=0;
        int maxname=0;
        int min=100;
        int minname=0;
        int tot = 0;
        int avg=0;
        for (int i=0; i<5;i++){
            System.out.print("Enter the name: ");
            name[i]=x.nextLine();
        }
        for (int i=0; i<5;i++){
            System.out.print("Enter the mark: ");
            marks[i]=x.nextInt();
            if (marks[i]>max){
                max=marks[i];
                maxname=i;
            }
            if (marks[i]<min){
                min=marks[i];
                minname=i;
            }
            tot=tot+marks[i];
            avg = tot/5;
        }
        
        for (int i=4;i>=0; i--){
            System.out.println("Name: "+name[i]+" Marks: "+marks[i]);
        }
        System.out.println("The highest mark was "+max+" from "+name[maxname]);
        System.out.println("The lowest mark was "+min+" from "+name[minname]);
        System.out.println("The average grade was "+avg);
        
    }
    
}
