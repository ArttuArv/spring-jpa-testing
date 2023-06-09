package com.example.springjpatesting.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "sessions")
@SecondaryTable(name = "venues", pkJoinColumns = @PrimaryKeyJoinColumn(name = "venue_id"))
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String sessionName;

    @Column(name = "description")
    private String sessionDescription;

    @Column(name = "length")
    private Integer sessionLength;

    @Column(name = "venue_name", table = "venues")
    private String venueName;

    @Column(name = "venue_city", table = "venues")
    private String venueCity;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "session")
    private List<Attendee> attendees;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(
            name = "session_speakers",
            joinColumns = @JoinColumn(name = "session_id", referencedColumnName = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id", referencedColumnName = "speaker_id")
    )
    private List<Speaker> speakers = new java.util.ArrayList<>();

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;

        if (null != attendees) {
            attendees.forEach(attendee -> attendee.setSession(this));
        }
    }
}