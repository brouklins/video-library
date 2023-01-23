package com.videolibrary.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_video")
public class Videos {

    @Id
    @GeneratedValue
    private Integer video_Id;
    @Column(unique = true)
    private String name;
    @Lob
    private byte[] data;
}
