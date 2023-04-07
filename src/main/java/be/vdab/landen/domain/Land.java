package be.vdab.landen.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "landen")
public class Land {
    @Id
    private String code;
    private String naam;
}
