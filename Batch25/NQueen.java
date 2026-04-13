package Batch25;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class NQueen {
	static List <List<String>> result=new ArrayList<>();
	public static void main(String[] args) {
	// col=0;
	// lD =row+col;
	// rd=row-col;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		solve(n);
		System.out.println("All Posibility Solutions");
		
		for(List<String> sol:result) {
			for(String row :sol) {
				System.out.println(row);
			}
			System.out.println();
		}

	}
	static void solve(int n) {
		HashSet<Integer> cols=new HashSet();
		HashSet<Integer> leftdiag=new HashSet();
		HashSet<Integer> rightdiag=new HashSet();
		
		char[][] board=new char[n][n];
		for(char[] row:board) {
			Arrays.fill(row, '.');
		}
		backtrack(0,n,board,cols,leftdiag,rightdiag);
	}
	static void backtrack(int row,int n,char[][] board, Set<Integer> cols,
			Set<Integer> leftdiag,Set<Integer> rightdiag) {
		
		if(row==n) {
			List<String> temp=new ArrayList<>();
			for(char[] r :board) {
				temp.add(new String(r));
			}
			result.add(temp);
			return;
		}
		for(int col=0;col<n;col++) {
			if(cols.contains(col)||
					leftdiag.contains(row+col)||
					rightdiag.contains(row-col)) {
				continue;
			}
			// Placing the queen on Index;
			board[row][col]='Q';
			cols.add(col);
			leftdiag.add(row+col);
			rightdiag.add(row-col);
		// Move next Row
		backtrack(row+1,n,board,cols,leftdiag,rightdiag);
		// Backtracking 
		board[row][col]='.';
		cols.remove(col);
		leftdiag.remove(row+col);
		rightdiag.remove(row-col);
		
		}
	}
}