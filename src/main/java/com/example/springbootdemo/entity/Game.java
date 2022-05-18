package com.example.springbootdemo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(length = 64)
    private String id;
    private int playerMove1;/** kopplar 1 2 3 värde till sten sax påse, som i sig är kopplad till symbolen för
     respektive drag i en if stats hos appskaparen. move1 kopplas till användaren som har invitad**/
    private int playerMove2;
    private String playerId1;/** playerid1 är den som har invitat, tänkte att detta ska kopplas till messageFrom/messageTo i table så att man kan visa namn i chatten**/
    private String playerId2;/** den som fått inv,kopplas till message_to/messageFrom så att man kan visa namn i chatten **/
    /** Den som sköter appen kan sätta status här baserat på mottagarens val**/
    private String Status;


    public int getPlayerMove1() {
        return playerMove1;
    }

    public void setPlayerMove1(int playerMove1) {
        this.playerMove1 = playerMove1;
    }

    public int getPlayerMove2() {
        return playerMove2;
    }

    public void setPlayerMove2(int playerMove2) {
        this.playerMove2 = playerMove2;
    }

    public String getPlayerId1() {
        return playerId1;
    }

    public void setPlayerId1(String playerId1) {
        this.playerId1 = playerId1;
    }

    public String getPlayerId2() {
        return playerId2;
    }

    public void setPlayerId2(String playerId2) {
        this.playerId2 = playerId2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


}