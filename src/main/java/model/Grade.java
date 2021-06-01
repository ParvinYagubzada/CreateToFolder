package model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grades")
@Entity
public class Grade {
    @Id
    private Integer id;
    private String name;
}
