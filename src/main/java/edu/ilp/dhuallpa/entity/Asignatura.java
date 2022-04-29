
package edu.ilp.dhuallpa.entity;
import jakarta.persistence.*;
import java.sql.Time;


@Entity
@Table(name = "asignatura")

public class Asignatura {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "denominacion" )
    private String denominacion;

    @Column( name = "sigla" )
    private String sigla;

    @Column( name = "Hora_Teórica" )
    private Time HoraTeórica;

    @Column( name = "Hora_Practica " )
    private Time HoraPractica;

    @Column( name = "Hora_Laboratorio " )
    private Time HoraLaboratorio;

    @Column( name = "creditos" )
    private int creditos;

    @Column( name = "serie" )
    private int serie;

    public Asignatura() {
    }

    public Asignatura(String denominacion, String sigla, Time horaTeórica, Time horaPractica, Time horaLaboratorio,
                      int creditos, int serie) {
        this.denominacion = denominacion;
        this.sigla = sigla;
        HoraTeórica = horaTeórica;
        HoraPractica = horaPractica;
        HoraLaboratorio = horaLaboratorio;
        this.creditos = creditos;
        this.serie = serie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Time getHoraTeórica() {
        return HoraTeórica;
    }

    public void setHoraTeórica(Time horaTeórica) {
        HoraTeórica = horaTeórica;
    }

    public Time getHoraPractica() {
        return HoraPractica;
    }

    public void setHoraPractica(Time horaPractica) {
        HoraPractica = horaPractica;
    }

    public Time getHoraLaboratorio() {
        return HoraLaboratorio;
    }

    public void setHoraLaboratorio(Time horaLaboratorio) {
        HoraLaboratorio = horaLaboratorio;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", denominacion='" + denominacion + '\'' +
                ", sigla='" + sigla + '\'' +
                ", HoraTeórica=" + HoraTeórica +
                ", HoraPractica=" + HoraPractica +
                ", HoraLaboratorio=" + HoraLaboratorio +
                ", creditos=" + creditos +
                ", serie=" + serie +
                '}';
    }
}

