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
	final int MINSCORE=6;
	final int MINDIFF=2
    Player A;
    Player B;
	static void setCheck(){
	    if(A.game>=MINSCORE && A.game>=(B.game+MINDIFF)){
	        A.set++;
	        A.game=0;
	        B.game=0;
	    }
		if(B.game>=MINSCORE && B.game>=(A.game+MINDIFF)){
	        B.set++;
	        B.game=0;
	        A.game=0;
	    }
	}
	public static void Score(String str){
             GameCheck(String str);
             
       }
       public static void gameCheck(String str){
             for(int i=0;i<str.length();i++){
				char ch=s.charAt(i);
                    if(ch=='a')
                           A.point++;
                    else
                           B.point++;
                    if(A.point >= 4 || B.point >= 4){
                           
                           if(Math.abs(A.point-B.point)>=2){
                                 if(A.point>B.point){
                                        A.game++;
										setCheck();
									}
                                 else{
                                        B.game++;
										setcheck();
									}
                                 A.point=0;
                                 B.point=0;
                           }
                           else{
                                 if(A.point==B.point){
                                        A.point=3;
                                        B.point=3;
                                 }
                           }
                    }
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
