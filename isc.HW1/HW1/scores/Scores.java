/**
 * 
 */
package HW1.scores;

/**
 * 
 */
public class Scores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] score = {20,40,80,100,57,90,25,5,77};
		for(int i=0; i<score.length;i++) {
			System.out.println("Student" + i + "Score is "+ score[i]+" and grade is "+ranked(score[i]));
		}
		System.out.println("maximum number of class is "+max(score));
		

	}
	public static String ranked (int s) {
		s = (int)s/10;
		switch (s) {
			case 10,9: return "A"; 
			case 8,7: return "B"; 
			case 5,6: return "C";
			case 3,4: return "D";
			case 2: return "E";
			default: return "F";		
		}
	}
	public static int max(int []s) {
		int m = 0;
		for(int i =0; i<s.length;i++) {
			if (m<s[i]) {
				m = s[i];
			}
		}
		return m;
	}

}
