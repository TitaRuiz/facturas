package com.equipo2.facturas.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="clientes")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(length = 60)
    private String nombre;
    @Column(length = 60, nullable = false)
    private String telefono;
    @Column(length = 120)
    private String direccion;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Factura> facturas;
}
