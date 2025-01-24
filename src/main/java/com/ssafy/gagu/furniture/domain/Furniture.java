package com.ssafy.gagu.furniture.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "furnitures")
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String furnitureName;

    @Column(nullable = false, length = 255)
    private String imageUrl;

    @Column(nullable = false)
    private int width;

    @Column(nullable = false)
    private int height;

    @Builder
    public Furniture(String furnitureName, String imageUrl, int width, int height) {
        this.furnitureName = furnitureName;
        this.imageUrl = imageUrl;
        this.width = width;
        this.height = height;
    }
}
