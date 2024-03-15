package com.equipo2.facturas.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name="facturas")
@Data
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;
    @Column(length = 60, nullable = false)
    private String tipoPago;
    @Column(length = 60, nullable = false)
    private LocalDate fecha;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "idCliente", foreignKey = @ForeignKey(name="FK_Factura_Cliente"))
    private Cliente cliente;

}
