import java.util.*;
import java.lang.*;
import java.io.*;
class Player
{
    int point;
    int game;
    int set;
}
class ScoreBoard{
    Player A;
    Player B;
	static void setCheck(){
	    if(A.game>=6 && A.game>=(B.game+2)){
	        A.set++;
	        A.game=0;
	        B.game=0;
	    }
		if(B.game>=6 && B.game>=(A.game+2)){
	        B.set++;
	        B.game=0;
	        A.game=0;
	    }
	}
}
class TennisMain{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ScoreBoard SB=new ScoreBoard();
        String s=br.readLine();
        SB.score(s);
    }
}
