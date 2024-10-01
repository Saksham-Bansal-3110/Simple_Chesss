package piece;

import main.GamePanel;
import main.Type;

public class Bishop extends Piece{
	public Bishop(int color,int col, int row) {
		super(color,col,row);
		
		type = Type.BISHOP;
		
		if(color == GamePanel.WHITE) {
			image = getImage("/piece/bishop");
		}
		else {
			image = getImage("/piece/bishop1");
		}
	}
	public boolean canMove(int targetCol, int targetRow) {
		if(isWithinBoard(targetCol,targetRow) && isSameSquare(targetCol,targetRow)==false) {
			//Bishop came move if the ratio of col and row is 1:1
			if(Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
				if(isValidSquare(targetCol,targetRow) && pieceIsOnDiagonalLine(targetCol,targetRow) == false) {
					return true;
				}
			}
		}
		return false;
	}
}
