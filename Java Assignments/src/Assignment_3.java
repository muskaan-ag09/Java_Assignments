/* 

$ $ $ $
$     $
$     $
$ $ $ $
 
*/
public class Assignment_3 {
	public static void main(String args[]) {
		for(int i=0;i<4;i++)
			System.out.print("$");
		
		System.out.println();
		int start=0,end=3;
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
				if(j==start || j==end)
					System.out.print("$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++)
			System.out.print("$");
	}
}
