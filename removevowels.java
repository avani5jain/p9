import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	
		String str1=str.replaceAll("[aeiouAEIUO]","");
		System.out.print(str1);

	}
}

