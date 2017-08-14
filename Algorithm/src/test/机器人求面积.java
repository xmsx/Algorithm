package test;

public class 机器人求面积 {
	static int ans = 0;
	public static void main(String[] args) {
		char[][] m = {{'X',' ','X',' ',' '}, 
					  {'X','X','X',' ','X'},
					  {'X','X','X','X','X'}};
		bfs(m, 0, 0);
		System.out.println(ans);
	}


	private static void bfs(char[][] m, int x, int y) {
		if(m[x][y]=='X'){
			ans++;
			m[x][y]=' ';
		}
		else return ;
		if(x+1<m.length)bfs(m,x+1,y);
		if(x-1>=0)bfs(m,x-1,y);
		if(y+1<m[0].length)bfs(m,x,y+1);
		if(y-1>0)bfs(m,x,y-1);
		
	}
}
