package com.serverSide.javaSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;




@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UsersModel {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name", nullable = false)
    private  String first_name;

    @Column(name="last_name", nullable = false)
    private  String last_name;

    @Column(name="email", nullable = false)
    private  String email;

    @Column(name="password", nullable = false)
    private  String password;

    @OneToMany(mappedBy = "usersModel")
    private Set<ReservationModel> reservationModel;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private RolesModel rolesModel;
}
