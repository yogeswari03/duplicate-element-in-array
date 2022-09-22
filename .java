
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String string=sc.nextLine();
	    int count=1;
	    char[]str=string.toCharArray();
	    for(int i=0;i<str.length;i++){
	        for(int j=i+1;j<str.length;j++){
	            if(str[i]==str[j]&&str[i]!=' '){
	                count++;
	             
	            str[j]='0';
	        }
	    
	    if(count>1&&str[i]!='0')
		System.out.print(str[i]);
	        }
	    }
	}
}

