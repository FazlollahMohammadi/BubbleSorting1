
package fazlollah;

public class Fazlollah {

    public static void main(String[] args) {
 System.out.println("befor Sorting");
        int myarry[]={1,3,2,6,5,8,7};
 for(int i=0;i<myarry.length;i++){
 
 System.out.print(myarry[i]);
 }
 int inner=0;
 int outer=myarry.length-1;
 int tempt=0;
 while(outer>0){
     while(inner<outer){
         if(myarry[inner]>myarry[inner+1]){
             tempt=myarry[inner];
             myarry[inner]=myarry[inner+1];
             myarry[inner+1]=tempt;
            
         }
         inner+=+1;
 }
     outer+=-1;
 }
 System.out.println("\nAfter Sorting");
 for(int i=0;i<myarry.length;i++){
 System.out.print(myarry[i]);
}}
}