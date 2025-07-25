package sa.hisham.mushreffay.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sa.hisham.mushreffay.enums.GuardianRelationTypeEnum;

@Entity
@Table(name = "guradian")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GuardianModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Enumerated(EnumType.STRING) //will store the string of the enum instead of the index
    @Column(name = "relation_type")
    private GuardianRelationTypeEnum relationType;
    @OneToOne(mappedBy = "guardian")
    private StudentModel student;

}
