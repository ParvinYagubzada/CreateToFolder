package model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
@Entity
public class Subject {
    @Id
    private Integer id;
    private String name;
    @OneToOne(mappedBy = "subject")
    private Teacher teacher;
}
