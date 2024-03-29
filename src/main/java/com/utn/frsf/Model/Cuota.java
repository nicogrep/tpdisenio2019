package com.utn.frsf.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="cuota")
public class Cuota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuota")
    private Integer id_cuota;

    @Column(name="fecha_vencimiento")
    private Date fecha_vencimiento;

    @Column(name="monto")
    private Float monto;

    @Column(name = "recargos")
    private Float recargos;

    @Column(name = "bonificacion_pago_adelantado")
    private Float bonificacion_pago_adelantado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_poliza")
    private Poliza poliza;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_pago")
    private Pago pago;

    public Cuota() {
    }

    public Integer getId_cuota() {
        return id_cuota;
    }

    public void setId_cuota(Integer id_cuota) {
        this.id_cuota = id_cuota;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Float getRecargos() {
        return recargos;
    }

    public void setRecargos(Float recargos) {
        this.recargos = recargos;
    }

    public Float getBonificacion_pago_adelantado() {
        return bonificacion_pago_adelantado;
    }

    public void setBonificacion_pago_adelantado(Float bonificacion_pago_adelantado) {
        this.bonificacion_pago_adelantado = bonificacion_pago_adelantado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
