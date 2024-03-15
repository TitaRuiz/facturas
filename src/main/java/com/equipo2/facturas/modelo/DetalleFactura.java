package com.equipo2.facturas.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="detalle_facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsecutivo;
    @Column(length = 60, nullable = false)
    private String concepto;
    @Column(length = 60, nullable = false)
    private double importe;
    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name="id_factura",referencedColumnName = "idFactura", foreignKey = @ForeignKey(name="FK_Detalle_factura_factura"))
    private Factura factura;

}
