
public class Task3 {

	public static void main(String[] args) {
		int [] []  num = {
				{15,30,45},
				{4,10,18},
				{33,66,99}
		};
				int sum=0;
						
				for(int i=0; i<num.length; i++) {
					for (int j=0; j<num[i].length; j++) {
						sum+=num[i][j];
						
					}
				}
				System.out.println(sum);
	}
	}


