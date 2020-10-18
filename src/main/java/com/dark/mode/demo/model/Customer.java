package com.dark.mode.demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Transient
    @Setter(AccessLevel.NONE)
    private String fullName;

    public String getFullName() {
        return String.format("%s, %s", this.getLastName(), this.getFirstName());
    }
}
