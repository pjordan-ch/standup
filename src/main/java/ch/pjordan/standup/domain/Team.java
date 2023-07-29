package ch.pjordan.standup.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter
    private String name;

    @Setter
    @OneToMany(mappedBy = "team")
    private List<Member> members;
}
