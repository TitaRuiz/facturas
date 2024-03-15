package com.equipo2.facturas.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="detalle_facturas")
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsecutivo;
    @Column(length = 60, nullable = false)
    private String concepto;
    @Column(length = 60, nullable = false)
    private double importe;
    @ManyToOne()
    @JoinColumn(name="id_factura",referencedColumnName = "idFactura", foreignKey = @ForeignKey(name="FK_Detalle_factura_factura"))
    private Factura factura;

}
