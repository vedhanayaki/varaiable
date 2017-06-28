package guviset3;
import java.util.Scanner;
public class character {

	public static void main(String[] args) {
		System.out.println("Enter the values");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>='a'||ch<='z'||ch>='A'||ch<='Z'){
			System.out.println("Values is Alphabet");
		}
		else if(ch==0&&ch==9){
			System.out.println("Values is Number");
		}
		else{
			System.out.println("Values is Special character");
		}
	}

}
