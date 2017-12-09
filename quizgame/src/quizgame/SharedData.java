/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

/**
 *
 * @author admin
 */
public class SharedData {
    
    public static String name;
    public static int score;
    public static int qnid;
    public static void setname(String n){
        name=n;
    }
     public static void setqnid(int n){
        qnid=n;
    }
    public static void setscore(int n){
        score=n;
    }
    
    public static String getname(){
        return SharedData.name;
    }
     public static int getscore(){
        return SharedData.score;
    }
      public static int getqnid(){
        return SharedData.qnid;
    }
}
