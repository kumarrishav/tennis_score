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
	final static int MINSCORE=6;
	final static int MINDIFF=2;
    static Player A;
    static Player B;
	ScoreBoard(){
	A=new Player();
	B=new Player();
	}
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
	public void score(String str){
             gameCheck(str);
             
       }
       public static void gameCheck(String str){
             for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
                    if(ch=='A')
                           A.point++;
                    else
                           B.point++;
                    if(A.point >= 4 || B.point >= 4){
                           
                           if(Math.abs(A.point-B.point)>=2){
                                 if(A.point>B.point){
                                        A.game++;
									}
                                 else{
                                        B.game++;
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
				setCheck();
				display();
             }
       }
	   public static void display(){
             System.out.print("Player A "+ A.set+"  "+A.game+"  ");
             
			 if(A.point==1)
                    System.out.println(15);
             else if(A.point==2)
                    System.out.println(30);
             else if(A.point==3)
                    System.out.println(40);
             else if(A.point==4)
                    System.out.println("AD");
			else 
					System.out.println(0);
             System.out.print("Player B "+B.set+"  "+B.game+" ");
             if(B.point==1)
                    System.out.println(15);
             else if(B.point==2)
                    System.out.println(30);
             else if(B.point==3)
                    System.out.println(40);
             else if(B.point==4)
                    System.out.println("AD");
			else 
					System.out.println(0);
			
			System.out.println();
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
