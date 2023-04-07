package manager.model.account;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(unique = true)
    private String username;
    @NotNull
    private String password;
    private String fullName;
    private String avatar;

    private String address;
    private String phoneNumber;
}
