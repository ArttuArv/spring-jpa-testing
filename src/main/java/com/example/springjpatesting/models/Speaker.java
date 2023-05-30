package com.example.springjpatesting.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "speakers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "speaker_id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "speaker_bio")
    private String speakerBio;

    @Lob
    private byte[] speakerPhoto;

    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    private List<Session> sessions;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "speaker",
            fetch = FetchType.LAZY
    )
    private SpeakerAddress address;


}