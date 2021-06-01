package model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
@Entity
public class Teacher {
    @Id
    private Integer id;
    private String name;
    private String surname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;
}
