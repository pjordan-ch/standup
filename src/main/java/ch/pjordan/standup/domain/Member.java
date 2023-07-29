package ch.pjordan.standup.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    private String name;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @Setter
    private Team team;
}
