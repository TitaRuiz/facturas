package com.equipo2.facturas.servicio;

import com.equipo2.facturas.modelo.DetalleFactura;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDetalleFacturaServicio extends ICRUD<DetalleFactura,Integer> {
    List<DetalleFactura> detalleFacturaPorCliente(@Param("id") int id);
}
