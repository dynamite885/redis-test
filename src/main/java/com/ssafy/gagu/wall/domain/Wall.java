package com.ssafy.gagu.wall.domain;

import com.ssafy.gagu.room.domain.Room;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "walls")
public class Wall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_x",nullable = false)
    private int startX;

    @Column(name = "start_y",nullable = false)
    private int startY;

    @Column(name = "end_x", nullable = false)
    private int endX;

    @Column(name = "end_y", nullable = false)
    private int endY;

    @Column(nullable = false)
    private int thickness;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @Builder
    public Wall(int startX, int startY, int endX, int endY, int thickness, Room room) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.thickness = thickness;
        this.room = room;
    }
}
