package model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "relation_student_teacher",
            joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "id"))
    private List<Teacher> teachers;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grade_id", referencedColumnName = "id")
    private Grade grade;
}
