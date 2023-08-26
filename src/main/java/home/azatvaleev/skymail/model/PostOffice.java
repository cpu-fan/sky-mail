package home.azatvaleev.skymail.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post_offices")
@NoArgsConstructor
@Getter
@Setter
public class PostOffice {

    @Id
    private long zipCode;

    @Column(nullable = false, length = 1024)
    private String name;

    @Column(nullable = false, length = 2048)
    private Address postAddress;
}
