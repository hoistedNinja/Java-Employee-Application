/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Mahesh
 */
import java.util.*;

public class Assignment2 {

    
   public static void main(String[] args) {
	String []employee;
		employee=new String[40];
       Menu(employee);
       
	}
   
   
	
	public static void Menu(String[]e){
            System.out.println("1."+'\t'+"Add New Employee          *        *");
	    System.out.println("2."+'\t'+"Delete Employee           *  *   * *");
	    System.out.println("3."+'\t'+"Change Employee           *    *   *");
	    System.out.println("4."+'\t'+"Print Employee Roster     *        *");
	    System.out.println("5."+'\t'+"Quit ");
            
            System.out.println();
           
       
        Scanner input= new Scanner(System.in);
            System.out.println(" Please select the option !!! . Hint: Press  '1' to choose Add Employee");
            int menuNum=0;
            if(input.hasNextInt()) {
                 menuNum =input.nextInt();
                     }else
            {System.out.println(" Please enter numbers only for god shake!!!!!!!!!!");
                System.out.println();
            }
            
            if(menuNum == 5){Quit();}
            else{
            if(menuNum>=1 && menuNum<=4)
            {displayMenuFunc(menuNum,e);}
           
            else {
                System.out.println("Wrong Input , Try later !!!");
                System.out.println("_________________________________________________");
                System.out.println();
                Menu(e);
            }
            }
        }
        
	public static void Quit(){
	    System.out.println("System is closed Now");
            System.exit(0);
	}
	public static void displayMenuFunc(int menuNum,String[]emp){
	    
            
            
            switch(menuNum){
                case 1:readEmp(emp);
                
                case 2:Delete(emp);;
                break;
                case 3:modify(emp);;
                break;
                case 4:displayFinal(emp);
                break;
                case 5:Quit();;
                break;
                default: System.out.println(" Invalid entry");
                }
                
            
            
            
            
            
	    
	}
	
	public static void Delete(String[] del){
	  Scanner input=new Scanner(System.in);
          if(!checkEmpty(del)){
	    display(del);
	    String old;
	   
	    System.out.println("Please enter the employee you want to delete from above");
	    old=input.nextLine();
	    System.out.println("Name of employee entered for deletion:"+old);
            System.out.println();
	    
	    for(int i=0;i<40 && del[i]!=null;i++){
	        String m=del[i];
	        if(m.equals(old)){
	            System.out.println("Do you really want to delete :"+old+" press yes to continue");
	            String newName=input.nextLine();
	            if(newName.equals("yes")){
	            
	            del[i]=null;
                    System.out.println(" record deleted Sucessfully");
                    }else{
	           System.out.println("Not deleted. Try again");
	        }
	    } else{
                    System.out.println(" Employee is not in list.Try Again");
                } 
            }
          
            
            
	}
        Menu(del);
        }
	
    /**
     *
     * @param modEmp
     */
    public static void modify(String[] modEmp){
            if(checkEmpty(modEmp)){System.out.println("no input");}
            else{
                
                Scanner input=new Scanner(System.in);
                display(modEmp);
                String old;
                System.out.println("***********************************");
                System.out.println();
                System.out.println("Please enter the employee you want to modify from above");
                old=input.nextLine();
                System.out.println(old);
                
                for(int i=0;i<40 && modEmp[i]!=null;i++){
                    String m=modEmp[i];
                    if(m.equals(old)){
                        System.out.println("Enter the new Name to replace"+old);
                        String newName=input.nextLine();
                        modEmp[i]=newName;
                        System.out.println("Employee record modified Successfully");
                        
                    }else{System.out.println("employee not found! try again");}
                }
                }
            Menu(modEmp);
	    
	}
	
	
	public static boolean checkEmpty(String[] chk){
	    if(" ".equals(chk[0])|| chk[0]==null){
	        System.out.println("EMpty record");
	        return true;
	    }else{return false;}
	}
	
	
	public static void display(String[] showArr){
	    if(!checkEmpty(showArr)){
	    System.out.println("******************************************");
	    for(int i=0;i<40;i++){
		    if(showArr[i]!=null){
		    System.out.println(showArr[i]);}
		    else{
		        
		    }
		}
            System.out.println("********************************************");
	}
            
        }
	
	
	
	public static void displayFinal(String[] showArr){
	    if(!checkEmpty(showArr)){
	    System.out.println("******************************************");
	    for(int i=0;i<40;i++){
		    if(showArr[i]!=null){
		    System.out.println(showArr[i]);}
		    else{
		        
		    }
		}
            System.out.println("********************************************");
	}
            Menu(showArr);
        }
        
	
	
	
	
	
	
public static void readEmp (String [] intArr){
    Scanner input=new Scanner(System.in);
	    boolean run=true; 

     int counter=0; 

     // addEmployee 

    while(run){ 

     

     char ch; 

         System.out.println("please enter the name of employee. Will ya?"); 

         intArr[counter]=input.nextLine();    

         System.out.println("Record Saved"); 

         System.out.printf(" Do you want to record another employee? Hit 'Y' for yes and 'E' to Exit"); 

        ch = input.next().charAt(0); 

        if(ch=='E'){ 

            run=false; 

             System.out.println(" New Entry Application closed");
             Menu(intArr);
        } 
 
           else{ 

       counter++; 

                

              

         intArr[counter]=input.nextLine();    

                

           } 

} 
	    
	    
	    
	    
	    
	}

   
	
	
	
}

    
    
    
    
    
    
    

