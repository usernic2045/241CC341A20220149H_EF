package uni.isw.sigconbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "solicitante")
public class Solicitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_solicitante;
    private Long id_persona;
    private Long id_rol;
    private String telefono;
    private String correo;
    private String dni;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona", insertable = false, updatable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol", insertable = false, updatable = false)
    private Rol rol;
}
