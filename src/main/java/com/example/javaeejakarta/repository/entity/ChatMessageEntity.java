package com.example.javaeejakarta.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "chat_messages")
public class ChatMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChatMessage_SEQ")
    @SequenceGenerator(name = "ChatMessage_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
