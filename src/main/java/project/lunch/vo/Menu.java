package project.lunch.vo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of={"id", "name","description"})
@Table(name="menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoryId", referencedColumnName = "id")
    Category category;

    public Menu(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
