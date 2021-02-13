/*
 * File: 
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the target problem.
 */

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

/* form a diamond in the center of a nxn table and paint it red; n- odd integer */

public class D extends GraphicsProgram {
	/*set grid dimension NxN */ 
	private final int N=readInt();
	
	public void run() {
		if(N%2!=0) {
			double grid_size= getHeight()/ N;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					double x=i * grid_size;
					double y=j * grid_size; 
					GRect board =new GRect(x, y, grid_size, grid_size);
					board.setColor(Color.RED);
					board.setFilled(true);
					add(board); 
				}
			}
			for(int i=N/2; i<N; i++) {
				for(int j=0; j<(i-N/2); j++) {
					double x=i * grid_size;
					double y=j * grid_size; 
					GRect board =new GRect(x, y, grid_size, grid_size);
					board.setColor(Color.WHITE);
					board.setFilled(true);
					add(board);
				}
			}
			for(int i=0; i<N/2; i++) {
				for(int j=(N/2-i-1); j>=0; j--) {
					double x=i * grid_size;
					double y=j * grid_size; 
					GRect board =new GRect(x, y, grid_size, grid_size);
					board.setColor(Color.WHITE);
					board.setFilled(true);
					add(board);
				}
			}
			for(int i=0; i<N/2; i++) {
				for(int j=(N/2+i+1); j<N; j++) {
					double x=i * grid_size;
					double y=j * grid_size; 
					GRect board =new GRect(x, y, grid_size, grid_size);
					board.setColor(Color.WHITE);
					board.setFilled(true);
					add(board);
				}
			}
			for(int i=N/2; i<N; i++) {
				for(int j=N; j>=(N/2-i+N); j--) {
					double x=i * grid_size;
					double y=j * grid_size; 
					GRect board =new GRect(x, y, grid_size, grid_size);
					board.setColor(Color.WHITE);
					board.setFilled(true);
					add(board);
				}
			}
		}
		
		else {
			System.out.println("error!");
		}
	}
}


