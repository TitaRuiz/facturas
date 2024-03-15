package com.equipo2.facturas.servicio.impl;

import com.equipo2.facturas.modelo.DetalleFactura;
import com.equipo2.facturas.repositorio.IDetalleFacturaRepository;
import com.equipo2.facturas.repositorio.IGenericoRepositorio;
import com.equipo2.facturas.servicio.IDetalleFacturaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServicioImpl extends CRUDImpl<DetalleFactura,Integer> implements IDetalleFacturaServicio {
    @Autowired
    private IDetalleFacturaRepository repo;
    @Override
    protected IGenericoRepositorio<DetalleFactura, Integer> getRepo() {
        return repo;
    }

    @Override
    public List<DetalleFactura> detalleFacturaPorCliente(int id) {
        return repo.detalleFacturaPorCliente(id);
    }
}
