package com.ssafy.gagu.roomfurniture.domain;

import com.ssafy.gagu.furniture.domain.Furniture;
import com.ssafy.gagu.room.domain.Room;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "room_furnitures")
public class RoomFurniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int xPos;

    @Column(nullable = false)
    private int yPos;

    @Column(nullable = false)
    private int width;

    @Column(nullable = false)
    private int height;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "furniture_id", nullable = false)
    private Furniture furniture;
}
