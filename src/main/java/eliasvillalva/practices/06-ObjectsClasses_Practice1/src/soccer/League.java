/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author evillalva
 */
public class League {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Game game1= new Game();
        
        player1.playerName="George Eliot";
        player2.playerName="Graham Greene";
        player3.playerName="Geoffrey Chaucer";
        
        Player[] thePlayers ={player1,player2,player3,};
        Team team1= new Team();
        team1.teamName="The Greens";
        team1.playerArray=thePlayers;
        for(Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }
        
        //player1.playerName="Robert Service";
        
        Team team2= new Team();
        team2.teamName="The Reds";
        
        team2.playerArray = new Player[3];
        
        team2.playerArray[0]= new Player();
        team2.playerArray[0].playerName="Robert Service";
        
        team2.playerArray[1]= new Player();
        team2.playerArray[1].playerName="Robie Burns";
        team2.playerArray[2]= new Player();
        team2.playerArray[2].playerName="Rafael Sabatini";
        
        for(Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }
        

    }
}








