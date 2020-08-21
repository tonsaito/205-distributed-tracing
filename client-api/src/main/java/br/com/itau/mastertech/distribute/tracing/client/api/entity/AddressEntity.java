package br.com.itau.mastertech.distribute.tracing.client.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;
    private String zipcode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
}
