// A Minesweeper game that runs in the command line
// Created 10.04.2017 by CB Fay

// To do:
	// consolidate the build and fill methods in the MapFunction class
	// implement scalability with size and mines
	// add a soft fail to scanner input

import java.util.Random;
import java.util.Scanner;

class MapFunctions {
	int size;
	int mines;
	int[][] map; // a map that the user cannot see
	char[][] umap; // a map that the user can see
	boolean unique[][]; // a map that remembers if the user has guessed squares

	void buildMaps(int size) {
		map = new int[this.size][this.size];
		umap = new char[this.size][this.size];
		unique = new boolean[this.size][this.size];
	}

	// places 1s (mines) randomly into the array
	void fillMap(int[][] map, int mines) {
		Random R = new Random();
		for(int i = 0; i < this.mines; i++) {
			while(true) {
				int x = R.nextInt(map.length);
				int y = R.nextInt(map.length);
				if(map[x][y] == 0) {
					map[x][y] = 1;
					break;
				}
			}
		}
	}

	// fill the entire array with the char that will represent an unchecked square
	void fillUmap(char[][] umap, char val) {
		for(int i = 0; i < this.umap.length; i++) {
			for(int j = 0; j < this.umap[i].length; j++)
				umap[i][j] = val;
		}
	}

	// create an array that keeps track of which coordinates have been probed
	void fillUnique(boolean unique[][]) {
		for(int x = 0; x < this.unique.length; x++) {
			for(int y = 0; y < this.unique[x].length; y++)
				unique[x][y] = true;
		}
	}

	// print the map that shows the real location of items on the board
	void printMap(int[][] map) {
		for(int y = this.map.length-1; y > - 1; y--) {
			for(int x = 0; x < this.map.length; x++) {
				System.out.print("[" + this.map[x][y] + "]" + " ");
			}
			System.out.println("\n");
		}
	}

	// print the map that helps the user
	void printUmap(char[][] umap) {
		for(int y = this.umap.length-1; y > -1 ; y--) {
			System.out.print(y+1 + "   ");
			for(int x = 0; x < this.umap.length; x++) {
				System.out.print(this.umap[x][y] + " ");
			}
			System.out.println();
		}
		System.out.print("\n    ");
		for(int z = 0; z < this.umap.length; z++) {
			System.out.print(z+1 + " ");
		}
		System.out.println();
	}

	// see if a certain x,y pair corresponds to a location on the map
	boolean rangeCheck(int x, int y, int map[][]) {
			if (-1 < x && x < this.map.length && -1 < y && y < this.map[x].length)
				return true;
			return false;
	}

	// return a char that indicates how many mines are in the adjacent squares, or a '#' if the target square is a mine.
	char adjacent(int x, int y, int map[][]) {
		int adj = '0';
		if(this.map[x][y] == 1)
			return '#';
		for(int xchange = -1; xchange < 2; xchange++) {
			for(int ychange = -1; ychange < 2; ychange++) {
				if ((-1 < x+xchange && x+xchange < this.map.length) &&
					(-1 < y+ychange && y+ychange < this.map[x].length) &&
					(this.map[x+xchange][y+ychange] == 1))
						adj += 1;
			}
		}
		return (char) adj;
	}

}

class UserFunctions {
	MapFunctions M = new MapFunctions();
	Scanner input = new Scanner(System.in);
	int x, y;
	int count;

	void defineMaps() {
		M.size = 8;
		M.mines = 10;

		M.buildMaps(M.size);
		M.fillMap(M.map, M.mines);
		M.fillUmap(M.umap, '+');
		M.fillUnique(M.unique);
	}

	int askX() {
		while(true) {
			System.out.print("X: ");
			int x = input.nextInt();
			if(-1 < x && x < M.size+1)
				return x-1;
			else System.out.println("error: X out of range\n");
		}
	}

	int askY() {
		while(true) {
			System.out.print("Y: ");
			int y = input.nextInt();
			if(-1 < y && y < M.size+1)
				return y-1;
			else System.out.println("error: Y out of range\n");
		}
	}

	boolean probe(int x, int y) {
		M.umap[x][y] = M.adjacent(x,y,M.map);
		M.printUmap(M.umap);
		if(M.map[x][y] == 1)
			return false;
		if(M.unique[x][y] == true) {
			M.unique[x][y] = false;
			count++;
		}
		return true;
	}
}

class Minesweeper {
	public static void main(String[] args) {
		UserFunctions U = new UserFunctions();
		U.defineMaps();

		while(true)	{
			U.x = U.askX();
			U.y = U.askY();
			System.out.println();
			if(!U.probe(U.x,U.y)) {
				System.out.println("\nGame Over!\n");
				break;
			}
			if(U.count > U.M.size*U.M.size-U.M.mines ) {
				System.out.println("\nYou win!\n");
			}
			else
			System.out.println("\nClear!\n");
		}
	}
}
