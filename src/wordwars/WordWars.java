/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordwars;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sifiso
 */
public class WordWars {

    static char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static int No1Score = 0;
    static int No2Score = 0;
    static String firstPlayer;
    static String secondPlayer;
    static String yes;
    static String word;
    static String quit = "???";
    static char empty = ' ';
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter Player 1 Name: ");
        firstPlayer = scan.nextLine();
        System.out.print("Enter Player 2 Name: ");
        secondPlayer = scan.nextLine();
        
        
        System.out.println("Lets Play WORD WARS!!!!!");
        //User input to play
        System.out.println("" +Arrays.toString(alphabets));
        playGame();
          
    }
    
    public static void playGame(){
      
      do{
          
                System.out.print(firstPlayer +" enter a word: ");
                word=scan.next();  
          
         if(!word.equals(quit)){
             
             System.out.print("Enter [y] if the word is correct: ");
             yes = scan.next();
            if(yes.equals("y")){
                No1Score += 1;
                Score();
                
          for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if(word.charAt(i)==alphabets[j]){
                    
                    alphabets[j] = ' ';
                    alphabets[0] = 'a';
                    alphabets[4] = 'e';
                    alphabets[8] = 'i';
                    alphabets[14] = 'o';
                    alphabets[20] = 'u';
                    
                } 
                else if(word.charAt(i)==empty){
                   
                    System.out.println("Invalid input");
                }
            }
             
        }
            }
          System.out.println("Letters Left: " +Arrays.toString(alphabets));
         }else {
             Score();
             if(No1Score > No2Score){
               System.out.println("THE WINNER OF THE GAME IS: " +firstPlayer +" with a score of " +No1Score);  
             } else if(No1Score < No2Score){
                System.out.println("THE WINNER OF THE GAME IS: " +secondPlayer +" with a score of " +No2Score); 
             } else{
                 System.out.println("IT'S A DRAW: " +firstPlayer +" score is " +No1Score +"\n" +secondPlayer +" score is " +No2Score);
             }
             break;
         }
         
         // System.out.println("" +Arrays.toString(alphabets));
        System.out.print(secondPlayer +" enter a word: ");
        word=scan.next();
        
         if(!word.equals(quit)) {
             
             System.out.print("Enter [y] if the word is correct: ");
             yes = scan.next();
            if(yes.equals("y")){
                No2Score += 1;
                Score();
                
          for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if(word.charAt(i)==alphabets[j]){
                    
                    alphabets[j] = ' ';
                    alphabets[0] = 'a';
                    alphabets[4] = 'e';
                    alphabets[8] = 'i';
                    alphabets[14] = 'o';
                    alphabets[20] = 'u';
                    
                }
            }
              
        }
            }
          System.out.println("Letters Left: " +Arrays.toString(alphabets));
         }else{
             if(No1Score > No2Score){
               System.out.println("THE WINNER OF THE GAME IS: " +firstPlayer +" with a score of " +No1Score);  
             } else if(No1Score < No2Score){
                System.out.println("THE WINNER OF THE GAME IS: " +secondPlayer +" with a score of " +No2Score); 
             } else{
                 System.out.println("IT'S A DRAW: " +firstPlayer +" score is " +No1Score +"\n" +secondPlayer +" score is " +No2Score);
             }
             
             Score();
             break;
         }
   }while(!word.equals(quit));
   
    }
    public static void Score(){
        
        System.out.println(firstPlayer +" " +No1Score);
        System.out.println(secondPlayer +" " +No2Score);
        
    }
   
}
