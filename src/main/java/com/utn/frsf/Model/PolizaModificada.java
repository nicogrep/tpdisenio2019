package com.utn.frsf.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "polizaModificada")
public class PolizaModificada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_poliza_modif")
    private Integer nro_poliza_modif;

    @Column(name = "año_vehiculo",nullable = false)
    private Integer año_vehiculo;

    @Column(name = "motor",nullable = false)
    private Integer motor;

    @Column(name = "chasis",nullable = false)
    private Integer chasis;

    @Column(name="km_año",nullable = false)
    private   Float km_año;

    @Column(name="fecha_inicioVigencia",nullable = false)
    private Date fecha_inicioVigencia;

    @Column(name="fecha_finVigencia",nullable = false)
    private   Date fecha_finVigencia;

    @OneToMany
    @JoinColumn(name = "fk_polizaModif")
    private List<MedidasDeSeguridadModif> medidasDeSeguridadModifs;

    @OneToMany
    @JoinColumn(name = "fk_polizaModif")
    private List<HijoModificado> hijoModificados;

    @OneToOne
    @JoinColumn(name = "fk_tipoCobModif")
    private TipoCoberturaModif tipoCoberturaModif;

    @ManyToOne
    @JoinColumn(name = "fk_poliza")
    private Poliza poliza;
}
