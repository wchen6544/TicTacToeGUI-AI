import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

class q7 
{
	private static int numberOne;
	private static int who;
	static char[] num = {'_','_','_','_','_','_','_','_','_'};
    int b = 0;
    public q7(int a, int b)
    {
        numberOne = a;
        who = b;
    }
    static class Move 
    { 
        int row, col; 
    }; 

static char player = 'x', opponent = 'o'; 


static Boolean isMovesLeft(char board[][]) 
{ 
	for (int i = 0; i < 3; i++) 
		for (int j = 0; j < 3; j++) 
			if (board[i][j] == '_') 
				return true; 
	return false; 
} 

static int evaluate(char b[][]) 
{ 
	for (int row = 0; row < 3; row++) 
	{ 
		if (b[row][0] == b[row][1] && 
			b[row][1] == b[row][2]) 
		{ 
			if (b[row][0] == player) 
				return +10; 
			else if (b[row][0] == opponent) 
				return -10; 
		} 
	} 

	for (int col = 0; col < 3; col++) 
	{ 
		if (b[0][col] == b[1][col] && 
			b[1][col] == b[2][col]) 
		{ 
			if (b[0][col] == player) 
				return +10; 

			else if (b[0][col] == opponent) 
				return -10; 
		} 
	} 

	if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) 
	{ 
		if (b[0][0] == player) 
			return +10; 
		else if (b[0][0] == opponent) 
			return -10; 
	} 

	if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) 
	{ 
		if (b[0][2] == player) 
			return +10; 
		else if (b[0][2] == opponent) 
			return -10; 
	} 

	return 0; 
} 

static int minimax(char board[][], 
					int depth, Boolean isMax) 
{ 
	int score = evaluate(board); 

	if (score == 10) 
		return score; 
 
	if (score == -10) 
		return score; 


	if (isMovesLeft(board) == false) 
		return 0; 

	if (isMax) 
	{ 
		int best = -1000; 

		for (int i = 0; i < 3; i++) 
		{ 
			for (int j = 0; j < 3; j++) 
			{ 
				if (board[i][j]=='_') 
				{ 
					board[i][j] = player; 

					best = Math.max(best, minimax(board, 
									depth + 1, isMax)); 

					board[i][j] = '_'; 
				} 
			} 
		} 
		return best; 
	} 

	else
	{ 
		int best = 1000; 

		for (int i = 0; i < 3; i++) 
		{ 
			for (int j = 0; j < 3; j++) 
			{ 
				if (board[i][j] == '_') 
				{ 
					board[i][j] = opponent; 
					best = Math.min(best, minimax(board, 
									depth + 1, isMax)); 
					board[i][j] = '_'; 
				} 
			} 
		} 
		return best; 
	} 
} 

static Move findBestMove(char board[][]) 
{ 
	int bestVal = -1000; 
	Move bestMove = new Move(); 
	bestMove.row = -1; 
	bestMove.col = -1; 

	for (int i = 0; i < 3; i++) 
	{ 
		for (int j = 0; j < 3; j++) 
		{ 
			if (board[i][j] == '_') 
			{ 
				board[i][j] = player; 

				int moveVal = minimax(board, 1, false); 

				board[i][j] = '_'; 


				if (moveVal > bestVal) 
				{ 
					bestMove.row = i; 
					bestMove.col = j; 
					bestVal = moveVal; 
				} 
			} 
		} 
	} 

	System.out.printf("The value of the best Move " + 
							"is : %d\n\n", bestVal); 

	return bestMove; 
} 

 
public String getDivisionAnswer() throws IOException
{ 
	String d = String.valueOf(numberOne);
	String e = String.valueOf(who);
	String con = d + e;                      
	char symbol = 'x';
	if (con.substring(1, 2).equalsIgnoreCase("1")) {
		symbol = 'x';
		String conn = con.substring(0,1);
		int inum = Integer.parseInt(conn);
		if (inum == 1) {
			num[0] = symbol;
		}
		if (inum == 2) {
			num[1] = symbol;
		}
		if (inum == 3) {
			num[2] = symbol;
		}
		if (inum == 4) {
			num[3] = symbol;
		}
		if (inum == 5) {
			num[4] = symbol;
		}
		if (inum == 6) {
			num[5] = symbol;
		}
		if (inum == 7) {
			num[6] = symbol;
		}
		if (inum == 8) {
			num[7] = symbol;
		}
		if (inum == 9) {
			num[8] = symbol;
		}
	} else {
		symbol = 'o';
		String conn = con.substring(0,1);
		int inum = Integer.parseInt(conn);
		if (inum == 1) {
			num[0] = symbol;
		}
		if (inum == 2) {
			num[1] = symbol;
		}
		if (inum == 3) {
			num[2] = symbol;
		}
		if (inum == 4) {
			num[3] = symbol;
		}
		if (inum == 5) {
			num[4] = symbol;
		}
		if (inum == 6) {
			num[5] = symbol;
		}
		if (inum == 7) {
			num[6] = symbol;
		}
		if (inum == 8) {
			num[7] = symbol;
		}
		if (inum == 9) {
			num[8] = symbol;
		}
	}
    char board[][] = {{num[0], num[1], num[2] }, 
                     { num[3], num[4], num[5] }, 
                     { num[6], num[7], num[8] }}; 
	Move bestMove = findBestMove(board); 
	int a = bestMove.row; 
	int b = bestMove.col;
	String f = String.valueOf(a);
	String g = String.valueOf(b);
	String sf2 = String.format("value is %c %c %c %c %c %c %c %c %c %s", num[0], num[1], num[2], num[3], num[4], num[5], num[6]
																	,num[7], num[8],
																	con);
    FileWriter writer = new FileWriter("/Users/CiY/eclipse-workspace/app/bin/app/scores.txt", true);
	String sf3 = String.format(sf2);
    writer.write(sf3);
	writer.write("\n");
	writer.close();	
	return f+g;
	// returns the row and column the CPU wants to move to.
} 

} 
