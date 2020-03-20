/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.FrameMain;
import view.PanelCurrentPlayer;
import view.PanelInfo;
import view.PanelScore;
import view.PanelViewerPopUp;

/**
 *
 * @author Vic
 */
public class ModelGame {

    public static int size = 20;
    public static int[][] gameArray = new int[size][size]; // isinya representasi warna 1-4 tergantung player. 0 kosong
    public static int type = 0;
    public static int rotation = 0;
    public static boolean flip = false;
    public static int color = 1;
    public static boolean[][] isUsed = new boolean[21][4];
    public static int[] score = {-89, -89, -89, -89};
    public static int[] piecesUsed = new int[4];
    public static int[][] coordinates = getCoordinates(type);
    public static ArrayList<Integer> listOp = new ArrayList<Integer>();
    
    public static int gameOver = 0;

    public ModelGame() {
        for (int i = 0; i < gameArray.length; i++) {
            for (int j = 0; j < gameArray.length; j++) {
                gameArray[i][j] = 0;
            }
        }
    }
    
    public static int[][] getCoordinates(int type){
    	int[][] coordinates = null;
    	int x = 0;
    	int y = 0;
    	switch (type) {
        case 0:
            coordinates = new int[][]{
                {x, y},
                {x + 1, y},
                {x + 2, y},
                {x + 1, y + 1},
                {x + 1, y + 2},};
            break;
        case 1:
            coordinates = new int[][]{
                {x, y},
                {x, y + 1},
                {x, y + 2},
                {x + 1, y + 2},};
            break;
        case 2: // I5
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x+2,y},
        		{x+3,y},
        		{x+4,y}
        	};
        	break;
        case 3: // I4
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x+2,y},
        		{x+3,y}
        	};
        	break;
        case 4: // I3
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x+2,y}
        	};
        	break;
        case 5: // I2
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y}
        	};
        	break;
        case 6: // I1
        	coordinates = new int[][] {
        		{x,y}
        	};
        	break;
        case 7: // O4
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x,y+1},
        		{x+1,y+1}
        	};
        	break;
        case 8: // T4
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x+2,y},
        		{x+1,y+1}
        	};
        	break;
        case 9: // Z5
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x+1,y+1},
        		{x+1,y+2},
        		{x+2,y+2}
        	};
        	break;
        case 10: // Y
        	coordinates = new int[][] {
        		{x,y},
        		{x,y+1},
        		{x+1,y+1},
        		{x,y+2},
        		{x,y+3}
        	};
        	break;
        case 11: // N
        	coordinates = new int[][] {
        		{x,y},
        		{x,y+1},
        		{x,y+2},
        		{x+1,y+2},
        		{x+1,y+3}
        	};
        	break;
        case 12: // P
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x,y+1},
        		{x+1,y+1},
        		{x, y+2}
        	};
        	break;
        case 13: // Z4
        	coordinates = new int[][] {
        		{x,y},
        		{x+1,y},
        		{x+1,y+1},
        		{x+2,y+1}
        	};
        	break;
        case 14: // V3
        	coordinates = new int[][] {
        		{x,y},
        		{x,y+1},
        		{x+1,y+1}
        	};
        	break;
        case 15: // U
        	coordinates = new int[][] {
        		{x,y},
        		{x+2,y},
        		{x,y+1},
        		{x+1,y+1},
        		{x+2,y+1}
        	};
        	break;
        case 16: // V5
        	coordinates = new int[][] {
        		{x,y},
        		{x,y+1},
        		{x,y+2},
        		{x+1,y+2},
        		{x+2,y+2}
        	};
        	break;
        case 17: // W
        	coordinates = new int[][] {
        		{x,y},
        		{x,y+1},
        		{x+1,y+1},
        		{x+1,y+2},
        		{x+2,y+2}
        	};
        	break;
        case 18: // F
        	coordinates = new int[][] {
        		{x+1,y},
        		{x+2,y},
        		{x,y+1},
        		{x+1,y+1},
        		{x+1,y+2}
        	};
        	break;
        case 19: // X
        	coordinates = new int[][] {
        		{x+1,y},
        		{x,y+1},
        		{x+1,y+1},
        		{x+2,y+1},
        		{x+1,y+2}
        	};
        	break;
        case 20: // L5
        	coordinates = new int[][] {
        		{x,y},
        		{x,y+1},
        		{x,y+2},
        		{x,y+3},
        		{x+1,y+3}
        	};
        	break;
    }
    	return coordinates;
    }
    
    
    
    public static void addBlockToModel(int x, int y) {
    	System.out.println("masuk addblockto model");
        switch (type) {
            case 0:
                coordinates = new int[][]{
                    {x, y},
                    {x + 1, y},
                    {x + 2, y},
                    {x + 1, y + 1},
                    {x + 1, y + 2},};
                break;
            case 1:
                coordinates = new int[][]{
                    {x, y},
                    {x, y + 1},
                    {x, y + 2},
                    {x + 1, y + 2},};
                break;
            case 2: // I5
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y},
            		{x+3,y},
            		{x+4,y}
            	};
            	break;
            case 3: // I4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y},
            		{x+3,y}
            	};
            	break;
            case 4: // I3
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y}
            	};
            	break;
            case 5: // I2
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y}
            	};
            	break;
            case 6: // I1
            	coordinates = new int[][] {
            		{x,y}
            	};
            	break;
            case 7: // O4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x,y+1},
            		{x+1,y+1}
            	};
            	break;
            case 8: // T4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+2,y},
            		{x+1,y+1}
            	};
            	break;
            case 9: // Z5
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+1,y+1},
            		{x+1,y+2},
            		{x+2,y+2}
            	};
            	break;
            case 10: // Y
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x,y+2},
            		{x,y+3}
            	};
            	break;
            case 11: // N
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x,y+2},
            		{x+1,y+2},
            		{x+1,y+3}
            	};
            	break;
            case 12: // P
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x, y+2}
            	};
            	break;
            case 13: // Z4
            	coordinates = new int[][] {
            		{x,y},
            		{x+1,y},
            		{x+1,y+1},
            		{x+2,y+1}
            	};
            	break;
            case 14: // V3
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x+1,y+1}
            	};
            	break;
            case 15: // U
            	coordinates = new int[][] {
            		{x,y},
            		{x+2,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+2,y+1}
            	};
            	break;
            case 16: // V5
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x,y+2},
            		{x+1,y+2},
            		{x+2,y+2}
            	};
            	break;
            case 17: // W
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+1,y+2},
            		{x+2,y+2}
            	};
            	break;
            case 18: // F
            	coordinates = new int[][] {
            		{x+1,y},
            		{x+2,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+1,y+2}
            	};
            	break;
            case 19: // X
            	coordinates = new int[][] {
            		{x+1,y},
            		{x,y+1},
            		{x+1,y+1},
            		{x+2,y+1},
            		{x+1,y+2}
            	};
            	break;
            case 20: // L5
            	coordinates = new int[][] {
            		{x,y},
            		{x,y+1},
            		{x,y+2},
            		{x,y+3},
            		{x+1,y+3}
            	};
            	break;
        }
        
        if(listOp!=null) {
        	for (int i = 0; i < listOp.size(); i++) {
    			if(listOp.get(i)==1) {
    				coordinates = rotatePiece(coordinates);
    			}else if(listOp.get(i)==2) {
    				coordinates = flipHPiece(coordinates);
    			}else if(listOp.get(i)==3) {
    				coordinates = flipVPiece(coordinates);
    			}
    		}
        }
        System.out.println("curr coor: ");
        for (int i = 0; i < coordinates.length; i++) {
			System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
		}
        
        System.out.println("ops:");
        for (int i = 0; i < listOp.size(); i++) {
			System.out.println(listOp.get(i));
		}
        
        addIfValid(coordinates);
      
    }
   

	public static void setCoordinates(int[][] coordinates) {
		ModelGame.coordinates = coordinates;
	}


    public static int[][] rotatePiece(int[][] coordinates) {
    	System.out.println("masuk rotate");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	for (int j = 0; j < 1; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			int a = coordinates[i][0]-x;
    			int b = coordinates[i][1]-y;
    			if(a==0) {
    				temp[i][0] = x-b;
    				temp[i][1] = y-a;
    			}else{
    				temp[i][0] = x-b;
    				temp[i][1] = y+a;
    			}
    		}
        	coordinates = temp;
		}
    	return coordinates;
    }
    
    public static boolean aNeg, bNeg, aMax, bMax;
    public static int[][] rotate(int[][] coordinates) {
    	int op1 = 1;
    	int op2 = 0;
    	aNeg = false;
    	bNeg = false;
    	aMax = false;
    	bMax = false;
    	System.out.println("masuk rotate");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	int[] a = new int[coordinates.length];
    	int[] b = new int[coordinates.length];
     	for (int j = 0; j < 1; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			a[i] = coordinates[i][0]-x;
    			b[i] = coordinates[i][1]-y;
    			if(a[i]==0) {
    				temp[i][0] = x-b[i];
    				temp[i][1] = y-a[i];
    				if(temp[i][0] <0) {
    					aNeg = true;
    				}
    				if(temp[i][1]<0) {
    					bNeg = true;
    				}
    				if(temp[i][0] >4) {
    					aMax = true;
    				}
    				if(temp[i][1]>4) {
    					bMax = true;
    				}
    			}else{
    				temp[i][0] = x-b[i];
    				temp[i][1] = y+a[i];
    				if(temp[i][0] <0) {
    					aNeg = true;
    				}
    				if(temp[i][1]<0) {
    					bNeg = true;
    				}
    				if(temp[i][0]>4) {
    					aMax = true;
    				}
    				if(temp[i][1]>4) {
    					bMax = true;
    				}
    			}
    		}
        	coordinates = temp;
		}
     	
     	coordinates = checkCoordinates(coordinates, a, b, aNeg, bNeg, aMax, bMax, op1, op2);
    	return coordinates;
    }
    
    public static int[][] checkCoordinates(int[][] coordinates, int[] a, int[] b, boolean aNeg, boolean bNeg, boolean aMax, boolean bMax, int op1, int op2){
    	for (int i = 0; i < coordinates.length; i++) {
    		System.out.println(coordinates[i][0]+ " " + coordinates[i][1]);
		}
    	System.out.println(aMax+"");
    	System.out.println("a and b");
     	for (int i = 0; i < b.length; i++) {
			System.out.println(a[i] + " " + b[i]);
		}
     	int[] max = new int[2];
        for(int i = 0; i < a.length; i++)
        {
            if(max[0] < Math.abs(a[i]))
            {
               max[0] = Math.abs(a[i]);
            	//max[0] = a[i];
            }
            if(max[1] < Math.abs(b[i])) {
           	max[1] = Math.abs(b[i]);
            	//max[1] = b[i];
            }
        }
        int[] min = {999999999, 99999999};
        for(int i = 0; i < coordinates.length; i++)
        {
            if(min[0] > Math.abs(coordinates[i][0]))
            {
               min[0] = Math.abs(coordinates[i][0]);
            }
            if(min[1] > Math.abs(coordinates[i][1])) {
            	min[1] = Math.abs(coordinates[i][1]);
            }
        }
        System.out.println("max");
        System.out.println(max[0] + " " + max[1]);
        System.out.println("min");
        System.out.println(min[0] + " " + min[1]);
        
        for (int i = 0; i < coordinates.length; i++) {
        	if(aNeg) {
        		coordinates[i][0] += max[op1];
        	}
        	if(bNeg) {
        		coordinates[i][1] += max[op2];
        	}
        	if(aMax) {
        		System.out.println("masuk a max");
        		coordinates[i][0] -= min[op2];
        	}
        	if(bMax) {
        		coordinates[i][1] -= min[op1];
        	}
		}
        return coordinates;
    }
    
    public static int[][] flipHPiece(int[][] coordinates) {
    	System.out.println("masuk flip piece");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	for (int j = 0; j < 1; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			int a = coordinates[i][0]-x;
    			temp[i][0] = coordinates[i][0]-(2*a);
    			temp[i][1] = coordinates[i][1];
    		}
        	coordinates = temp;
		}
    	return coordinates;
    }
    
    public static int[][] flipH(int[][] coordinates) {
    	aNeg = false;
    	bNeg = false;
    	aMax = false;
    	bMax = false;
    	int op1 = 0;
    	int op2 = 0;
    	System.out.println("masuk flipH");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	int[] a = new int[coordinates.length];
    	int[] b = new int[coordinates.length];
     	for (int j = 0; j < 1; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			a[i] = coordinates[i][0]-x;
    			temp[i][0] = coordinates[i][0]-(2*a[i]);
    			temp[i][1] = coordinates[i][1];
				if(temp[i][0] <0) {
					aNeg = true;
				}
				if(temp[i][1]<0) {
					bNeg = true;
				}
				if(temp[i][0] >4) {
					aMax = true;
				}
				if(temp[i][1]>4) {
					bMax = true;
				}
    		}
        	coordinates = temp;
		}
     	
     	coordinates = checkCoordinates(coordinates, a, b, aNeg, bNeg, aMax, bMax, op1, op2);
    	return coordinates;
    }
    
    public static int[][] flipVPiece(int[][] coordinates) {
    	System.out.println("masuk flip piece");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	for (int j = 0; j < 1; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			int b = coordinates[i][1]-y;
    			temp[i][0] = coordinates[i][0];
    			temp[i][1] = coordinates[i][1]-(2*b);
    		}
        	coordinates = temp;
		}
    	return coordinates;
    }
    
    public static int[][] flipV(int[][] coordinates) {
    	aNeg = false;
    	bNeg = false;
    	aMax = false;
    	bMax = false;
    	int op1 = 0;
    	int op2 = 1;
    	System.out.println("masuk flipH");
    	int x = coordinates[0][0];
    	int y = coordinates[0][1];
    	int[][] temp = new int[coordinates.length][2];
    	int[] a = new int[coordinates.length];
    	int[] b = new int[coordinates.length];
     	for (int j = 0; j < 1; j++) {
    		for (int i = 0; i < coordinates.length; i++) {
    			b[i] = coordinates[i][1]-y;
    			temp[i][0] = coordinates[i][0];
    			temp[i][1] = coordinates[i][1]-(2*b[i]);
				if(temp[i][0] <0) {
					aNeg = true;
				}
				if(temp[i][1]<0) {
					bNeg = true;
				}
				if(temp[i][0] >4) {
					aMax = true;
				}
				if(temp[i][1]>4) {
					bMax = true;
				}
    		}
        	coordinates = temp;
		}
     	
     	coordinates = checkCoordinates(coordinates, a, b, aNeg, bNeg, aMax, bMax, op1, op2);
    	return coordinates;
    }


    public static void addIfValid(int[][] coordinates) {
    	boolean isValid = true;

        // disable reuse
        if (isUsed[type][color-1]) {
            System.out.println("Don't reuse!");
            PanelCurrentPlayer.tileUsed();
            return;
        }
                
        // check out of bounds
        for (int i = 0; i < coordinates.length; i++) {
            if (coordinates[i][0] == size || coordinates[i][0] < 0) {
                isValid = false;
                return;
            }
            if (coordinates[i][1] == size || coordinates[i][1] < 0) {
                isValid = false;
                return;
            }
        }

        // check collision
        for (int i = 0; i < coordinates.length; i++) {
            if (gameArray[coordinates[i][0]][coordinates[i][1]] != 0) {
                isValid = false;
                return;
            }
        }

        // check color side-by-side
        boolean sbsIsValid = false;
        for (int i = 0; i < coordinates.length; i++) {
//            System.out.print("Checking side: " + coordinates[i][0] + ", " + coordinates[i][1] + " - ");
            sbsIsValid = !checkSBS(coordinates[i][0], coordinates[i][1]);
//            System.out.println(sbsIsValid);
            if (!sbsIsValid) {
                return;
            }
        }

        // check corner
        boolean cornerIsValid = false;
        for (int i = 0; i < coordinates.length; i++) {
            cornerIsValid = checkCorner(coordinates[i][0], coordinates[i][1]);
            if (cornerIsValid) {
                break;
            }
        }
        if (!cornerIsValid) {
            isValid = false;
            return;
        }

        // apply to model
        if (isValid) {
            for (int i = 0; i < coordinates.length; i++) {
                try {
                    gameArray[coordinates[i][0]][coordinates[i][1]] = color;
                } catch (Exception e) {
                    System.out.println("Apply to model error");
                }
            }
            isUsed[type][color-1] = true;
            
            score[color-1] += coordinates.length;
            
            piecesUsed[color-1]++;
            
            // bonus score if all pieces are used
            if(piecesUsed[color-1]==21 && coordinates.length==1) {
            	score[color-1] +=20;
            }
            else if(piecesUsed[color-1]==21) {
            	score[color-1] += 15;
            }
            
            listOp.removeAll(listOp);
            
            PanelScore.updateScores();
            
            changeColor();
            
            PanelCurrentPlayer.updatePlayer();
            
            PanelCurrentPlayer.tileOkay();
            
        }

    }

    public static void changeColor() {
        color++;
        if (color > 4) {
            color = 1;
        }
    }

    public static boolean checkCorner(int x, int y) {
        try {
            if ((x == 0 && y == 0) || (x == 0 && y == size - 1) || (x == size - 1 && y == 0) || (x == size - 1 && y == size - 1)) {
                return true;
            }
            if (gameArray[x + 1][y + 1] == color) {
            	System.out.println("masuk cek 2");
                return true;
            }
            if (gameArray[x - 1][y + 1] == color) {
            	System.out.println("masuk cek 3");
                return true;
            }

            if (gameArray[x + 1][y - 1] == color) {
            	System.out.println("masuk cek 4");
                return true;
            }

            if (gameArray[x - 1][y - 1] == color) {
            	System.out.println("masuk cek 5");
                return true;
            }
        } catch (Exception e) {
            System.out.print("[Check corner error]");
        }

        return false;
    }

    public static boolean checkSBS(int x, int y) {
        boolean sbs = false;
        try {
            if (gameArray[x + 1][y] == color) {
                sbs = true;
            }
            if (gameArray[x][y + 1] == color) {
                sbs = true;
            }

            if (gameArray[x][y - 1] == color) {
                sbs = true;
            }

            if (gameArray[x - 1][y] == color) {
                sbs = true;
            }
        } catch (Exception e) {
            System.out.print("[Check sbs error]");
        }
        System.out.println("try");
        return sbs;
    }

}
