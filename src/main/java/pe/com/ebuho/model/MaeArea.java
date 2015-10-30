package pe.com.ebuho.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by John on 10/29/2015.
 */
@Entity
@Table(name = "MAE_AREA", catalog = "")
public class MaeArea {
    private BigDecimal idenAreaAre;
    private String descAreaAre;
    private Integer tipoAreaAre;
    private String numeTeleAre;
    private String numeAnexAre;
    private BigDecimal codiMaeSede;
    private BigDecimal codiArepAre;
    private String usuaCreaAud;
    private Timestamp fechCreaAud;
    private String usuaModiAud;
    private Timestamp fechModiAud;
    private String nombEquiAud;
    private String nombSopeAud;
    private BigInteger flagEstaAre;
    private BigDecimal idenPersPer;
    private String nombCortAre;
    private MaeArea maeAreaByCodiArepAre;
    private Collection<MaeArea> maeAreasByIdenAreaAre;
    private MaeSede maeSedeByCodiMaeSede;
    private Collection<MaeResponsableHistorico> maeResponsableHistoricosByIdenAreaAre;

    @Id
    @Column(name = "IDEN_AREA_ARE")
    public BigDecimal getIdenAreaAre() {
        return idenAreaAre;
    }

    public void setIdenAreaAre(BigDecimal idenAreaAre) {
        this.idenAreaAre = idenAreaAre;
    }

    @Basic
    @Column(name = "DESC_AREA_ARE")
    public String getDescAreaAre() {
        return descAreaAre;
    }

    public void setDescAreaAre(String descAreaAre) {
        this.descAreaAre = descAreaAre;
    }

    @Basic
    @Column(name = "TIPO_AREA_ARE")
    public Integer getTipoAreaAre() {
        return tipoAreaAre;
    }

    public void setTipoAreaAre(Integer tipoAreaAre) {
        this.tipoAreaAre = tipoAreaAre;
    }

    @Basic
    @Column(name = "NUME_TELE_ARE")
    public String getNumeTeleAre() {
        return numeTeleAre;
    }

    public void setNumeTeleAre(String numeTeleAre) {
        this.numeTeleAre = numeTeleAre;
    }

    @Basic
    @Column(name = "NUME_ANEX_ARE")
    public String getNumeAnexAre() {
        return numeAnexAre;
    }

    public void setNumeAnexAre(String numeAnexAre) {
        this.numeAnexAre = numeAnexAre;
    }

    @Basic
    @Column(name = "CODI_MAE_SEDE")
    public BigDecimal getCodiMaeSede() {
        return codiMaeSede;
    }

    public void setCodiMaeSede(BigDecimal codiMaeSede) {
        this.codiMaeSede = codiMaeSede;
    }

    @Basic
    @Column(name = "CODI_AREP_ARE")
    public BigDecimal getCodiArepAre() {
        return codiArepAre;
    }

    public void setCodiArepAre(BigDecimal codiArepAre) {
        this.codiArepAre = codiArepAre;
    }

    @Basic
    @Column(name = "USUA_CREA_AUD")
    public String getUsuaCreaAud() {
        return usuaCreaAud;
    }

    public void setUsuaCreaAud(String usuaCreaAud) {
        this.usuaCreaAud = usuaCreaAud;
    }

    @Basic
    @Column(name = "FECH_CREA_AUD")
    public Timestamp getFechCreaAud() {
        return fechCreaAud;
    }

    public void setFechCreaAud(Timestamp fechCreaAud) {
        this.fechCreaAud = fechCreaAud;
    }

    @Basic
    @Column(name = "USUA_MODI_AUD")
    public String getUsuaModiAud() {
        return usuaModiAud;
    }

    public void setUsuaModiAud(String usuaModiAud) {
        this.usuaModiAud = usuaModiAud;
    }

    @Basic
    @Column(name = "FECH_MODI_AUD")
    public Timestamp getFechModiAud() {
        return fechModiAud;
    }

    public void setFechModiAud(Timestamp fechModiAud) {
        this.fechModiAud = fechModiAud;
    }

    @Basic
    @Column(name = "NOMB_EQUI_AUD")
    public String getNombEquiAud() {
        return nombEquiAud;
    }

    public void setNombEquiAud(String nombEquiAud) {
        this.nombEquiAud = nombEquiAud;
    }

    @Basic
    @Column(name = "NOMB_SOPE_AUD")
    public String getNombSopeAud() {
        return nombSopeAud;
    }

    public void setNombSopeAud(String nombSopeAud) {
        this.nombSopeAud = nombSopeAud;
    }

    @Basic
    @Column(name = "FLAG_ESTA_ARE")
    public BigInteger getFlagEstaAre() {
        return flagEstaAre;
    }

    public void setFlagEstaAre(BigInteger flagEstaAre) {
        this.flagEstaAre = flagEstaAre;
    }

    @Basic
    @Column(name = "IDEN_PERS_PER")
    public BigDecimal getIdenPersPer() {
        return idenPersPer;
    }

    public void setIdenPersPer(BigDecimal idenPersPer) {
        this.idenPersPer = idenPersPer;
    }

    @Basic
    @Column(name = "NOMB_CORT_ARE")
    public String getNombCortAre() {
        return nombCortAre;
    }

    public void setNombCortAre(String nombCortAre) {
        this.nombCortAre = nombCortAre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaeArea maeArea = (MaeArea) o;

        if (idenAreaAre != null ? !idenAreaAre.equals(maeArea.idenAreaAre) : maeArea.idenAreaAre != null) return false;
        if (descAreaAre != null ? !descAreaAre.equals(maeArea.descAreaAre) : maeArea.descAreaAre != null) return false;
        if (tipoAreaAre != null ? !tipoAreaAre.equals(maeArea.tipoAreaAre) : maeArea.tipoAreaAre != null) return false;
        if (numeTeleAre != null ? !numeTeleAre.equals(maeArea.numeTeleAre) : maeArea.numeTeleAre != null) return false;
        if (numeAnexAre != null ? !numeAnexAre.equals(maeArea.numeAnexAre) : maeArea.numeAnexAre != null) return false;
        if (codiMaeSede != null ? !codiMaeSede.equals(maeArea.codiMaeSede) : maeArea.codiMaeSede != null) return false;
        if (codiArepAre != null ? !codiArepAre.equals(maeArea.codiArepAre) : maeArea.codiArepAre != null) return false;
        if (usuaCreaAud != null ? !usuaCreaAud.equals(maeArea.usuaCreaAud) : maeArea.usuaCreaAud != null) return false;
        if (fechCreaAud != null ? !fechCreaAud.equals(maeArea.fechCreaAud) : maeArea.fechCreaAud != null) return false;
        if (usuaModiAud != null ? !usuaModiAud.equals(maeArea.usuaModiAud) : maeArea.usuaModiAud != null) return false;
        if (fechModiAud != null ? !fechModiAud.equals(maeArea.fechModiAud) : maeArea.fechModiAud != null) return false;
        if (nombEquiAud != null ? !nombEquiAud.equals(maeArea.nombEquiAud) : maeArea.nombEquiAud != null) return false;
        if (nombSopeAud != null ? !nombSopeAud.equals(maeArea.nombSopeAud) : maeArea.nombSopeAud != null) return false;
        if (flagEstaAre != null ? !flagEstaAre.equals(maeArea.flagEstaAre) : maeArea.flagEstaAre != null) return false;
        if (idenPersPer != null ? !idenPersPer.equals(maeArea.idenPersPer) : maeArea.idenPersPer != null) return false;
        if (nombCortAre != null ? !nombCortAre.equals(maeArea.nombCortAre) : maeArea.nombCortAre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idenAreaAre != null ? idenAreaAre.hashCode() : 0;
        result = 31 * result + (descAreaAre != null ? descAreaAre.hashCode() : 0);
        result = 31 * result + (tipoAreaAre != null ? tipoAreaAre.hashCode() : 0);
        result = 31 * result + (numeTeleAre != null ? numeTeleAre.hashCode() : 0);
        result = 31 * result + (numeAnexAre != null ? numeAnexAre.hashCode() : 0);
        result = 31 * result + (codiMaeSede != null ? codiMaeSede.hashCode() : 0);
        result = 31 * result + (codiArepAre != null ? codiArepAre.hashCode() : 0);
        result = 31 * result + (usuaCreaAud != null ? usuaCreaAud.hashCode() : 0);
        result = 31 * result + (fechCreaAud != null ? fechCreaAud.hashCode() : 0);
        result = 31 * result + (usuaModiAud != null ? usuaModiAud.hashCode() : 0);
        result = 31 * result + (fechModiAud != null ? fechModiAud.hashCode() : 0);
        result = 31 * result + (nombEquiAud != null ? nombEquiAud.hashCode() : 0);
        result = 31 * result + (nombSopeAud != null ? nombSopeAud.hashCode() : 0);
        result = 31 * result + (flagEstaAre != null ? flagEstaAre.hashCode() : 0);
        result = 31 * result + (idenPersPer != null ? idenPersPer.hashCode() : 0);
        result = 31 * result + (nombCortAre != null ? nombCortAre.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CODI_AREP_ARE", referencedColumnName = "IDEN_AREA_ARE",insertable = false,updatable = false)
    public MaeArea getMaeAreaByCodiArepAre() {
        return maeAreaByCodiArepAre;
    }

    public void setMaeAreaByCodiArepAre(MaeArea maeAreaByCodiArepAre) {
        this.maeAreaByCodiArepAre = maeAreaByCodiArepAre;
    }

    @OneToMany(mappedBy = "maeAreaByCodiArepAre")
    public Collection<MaeArea> getMaeAreasByIdenAreaAre() {
        return maeAreasByIdenAreaAre;
    }

    public void setMaeAreasByIdenAreaAre(Collection<MaeArea> maeAreasByIdenAreaAre) {
        this.maeAreasByIdenAreaAre = maeAreasByIdenAreaAre;
    }

    @ManyToOne
    @JoinColumn(name = "CODI_MAE_SEDE", referencedColumnName = "CODI_MAE_SEDE",insertable = false,updatable = false)
    public MaeSede getMaeSedeByCodiMaeSede() {
        return maeSedeByCodiMaeSede;
    }

    public void setMaeSedeByCodiMaeSede(MaeSede maeSedeByCodiMaeSede) {
        this.maeSedeByCodiMaeSede = maeSedeByCodiMaeSede;
    }

    @OneToMany(mappedBy = "maeAreaByIdenAreaAre")
    public Collection<MaeResponsableHistorico> getMaeResponsableHistoricosByIdenAreaAre() {
        return maeResponsableHistoricosByIdenAreaAre;
    }

    public void setMaeResponsableHistoricosByIdenAreaAre(Collection<MaeResponsableHistorico> maeResponsableHistoricosByIdenAreaAre) {
        this.maeResponsableHistoricosByIdenAreaAre = maeResponsableHistoricosByIdenAreaAre;
    }
}
