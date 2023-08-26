package home.azatvaleev.skymail.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "sendings")
@NoArgsConstructor
@Getter
@Setter
public class Sending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 32)
    private SendingType type;

    @Column(nullable = false)
    private long receiverZipCode;

    @Column(nullable = false)
    private Address receiverAddress;

    @Column(nullable = false)
    private String receiverName;
}
