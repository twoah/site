package project.lunch.vo;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of={"id", "name"})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;

    @Column(name="en_name")
    private String enName;

    public Category(String name) {
        this.name = name;
    }

}
