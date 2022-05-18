package com.example.springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private Long Id;
    private String messageGameId;/** kopplar chatten till ett spel **/
    private String messageFrom;
    private String messageTo;
    private String bodyText;/** själva texten som användaren skriver sparas i en databas **/

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getMessageGameId() {
        return messageGameId;
    }

    public void setMessageGameId(String messageGameId) {
        this.messageGameId = messageGameId;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }


}
