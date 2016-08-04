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
    Player A=new Player();
    Player B=new Player();
	static void setCheck(){
	    if(A.game>=6 && A.game>=(B.game+2)){
	        A.set++;
	        A.game=0;
	        B.game=0;
	    }
	}
}
class TennisMain{
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ScoreBoard SB=new ScoreBoard();
        String s=br.readLine();
        score(s);
    }
}
