/* 

A
A B
A B C
 
*/
public class Assignment_2 {
	public static void main(String args[]) {
		for(char i='A';i<='C';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
