//Project1-TechModule1
package MinorProjects;

import java.util.Scanner;

public class EmployeeDetails {
    
    private int emp_no[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
    private String emp_name[] = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
    private String join_date[] = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
    private char desg_code[] = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
    private String dept[] = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
    private int basic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
    private int HRA[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
    private int IT[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
    
    private int calcDA(int i){
        
        char desg = desg_code[i];
        switch(desg){
            case 'e':
                return 20000;
            case 'c':
                return 32000;
            case 'k':
                return 12000;
            case 'r':
                return 15000;
            case 'm':
                return 40000;         
        }
        return 0;
    }
    private char getdesgCode(int id){
        return desg_code[getIndex(id)];
    }
    
    private int getIndex(int id){
        int index = -1;
        for(int i = 0; i<emp_no.length;i++){
            if(id == emp_no[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public int getSalary(int id){
        int index = getIndex(id);
        if(index == -1){
            return -1;
        }
        return (basic[index] + HRA[index] + calcDA(index) -IT[index]);
    }
    public String getName(int id){
        return emp_name[getIndex(id)];
    }
    public String getDept(int id){
        return dept[getIndex(id)];
    }
    public boolean empExists(int id){
        if(getIndex(id) != -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String getDesg(int id){
        char d = getdesgCode(id);
        switch(d){
            case 'e':
                return "Engineer";
            case 'c':
                return "Consultant";
            case 'k':
                return "Clerk";
            case 'r':
                return "Receptionist";
            case'm':
                return "Manager";
        }
        return null;
    }
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int emp_no = scan.nextInt();
        EmployeeDetails obj = new EmployeeDetails();
        
        if(obj.empExists(emp_no)){
            System.out.println("Emp No. Emp Name Department Designation Salary");
            System.out.printf("%7d ", emp_no);
            System.out.printf("%8s ", obj.getName(emp_no));
            System.out.printf("%10s ", obj.getDept(emp_no));
            System.out.printf("%11s ", obj.getDesg(emp_no));
            System.out.printf("%6d\n", obj.getSalary(emp_no));
        }
        else{
            System.out.println("There is no employee with empno. "+emp_no);
        }
    }
}
