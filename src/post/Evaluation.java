package post;

public class Evaluation{  
   public float calculate(String s)  
   {  
	   String arr[]= s.split(" ");
	   
     int n;float r=0;  
     n=s.length();  
     Stack a=new Stack(n);  
     for(int i=0;i<arr.length;i++)  
     {  
    	
         
       if(!check_ex(arr[i]))  
         a.push(Float.parseFloat(arr[i]));  
       else  
       {  char ch=arr[i].charAt(0);
         float x=a.pop();  
         float y=a.pop();  
         switch(ch)  
         {  
           case '+':r=x+y;  
              break;  
           case '-':r=y-x;  
              break;  
           case '*':r=x*y;  
              break;  
           case '/':r=y/x;  
              break;  
           default:r=0;  
         }  
         a.push(r);  
       }  
     }  
     
     r=a.pop();
     if(a.empty()){
    	 return(r);	 
     }
     else{
    	 return (34097);
     }
       
   }
   
  static  boolean check_ex(String s){
	   if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
		   return true;
	   return false;
   }
 
  class Stack  
{  
   private float[] a;  
   private int top;
   private int m;
   public Stack(int max)  
   {  
     m=max;  
     a=new float[m];  
     top=-1;  
   }  
   public void push(float key)  
   {  
     a[++top]=key;  
   }  
   public float pop()  
   {  
     return(a[top--]);  
   }  
   public boolean empty(){
	   if(top == -1){
		   return true;
	   }
	   else{
        	return false;
	   }
   }
}  
}  
