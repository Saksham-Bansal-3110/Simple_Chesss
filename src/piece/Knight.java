package piece;

import main.GamePanel;
import main.Type;

public class Knight extends Piece {
	public Knight(int color,int col, int row) {
		super(color,col,row);
		
		type = Type.KNIGHT;
		
		if(color == GamePanel.WHITE) {
			image = getImage("/piece/knight");
		}
		else {
			image = getImage("/piece/knight1");
		}
	}
	public boolean canMove(int targetCol, int targetRow) {
		if(isWithinBoard(targetCol,targetRow)) {
			//knight can move if the movement ratio of col & row is 2:1 or 1:2
			if(Math.abs(targetCol - preCol) * Math.abs(targetRow-preRow) == 2) {
				if(isValidSquare(targetCol,targetRow)) {
					return true;
				}
			}
		}
		return false;
	}
}
