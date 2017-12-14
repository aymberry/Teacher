package Question;

public class Test {

	public static void main(String[] args) {
		int[][] score=new int[6][3];
		for(int i=0;i<score[i].length;i++){
			for(int j=0;j<score.length-1;j++){
				score[i][j]=(int)(Math.random()*(100-0+1)+0);
			}
		}
		for(int i=0;i<score[i].length;i++){
			for(int j=0;j<score.length-1;j++){
				score[5][i]=score[5][i]+score[j][i];
			}
		}
		for(int i=0;i<score[i].length;i++){
			for(int j=0;j<score.length;j++){
				System.out.print(score[i][j]+"  ");
				}
				System.out.println();
		}
		
	}
}

