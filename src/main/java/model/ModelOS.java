/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author neto_
 */
@Entity
@Table(name = "os2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModelOS.findAll", query = "SELECT m FROM ModelOS m")
    , @NamedQuery(name = "ModelOS.findByCodigo", query = "SELECT m FROM ModelOS m WHERE m.codigo = :codigo")
    , @NamedQuery(name = "ModelOS.findByDataemissao", query = "SELECT m FROM ModelOS m WHERE m.dataemissao = :dataemissao")
    , @NamedQuery(name = "ModelOS.findByHoraemissao", query = "SELECT m FROM ModelOS m WHERE m.horaemissao = :horaemissao")
    , @NamedQuery(name = "ModelOS.findByStatus", query = "SELECT m FROM ModelOS m WHERE m.status = :status")
    , @NamedQuery(name = "ModelOS.findByCliente", query = "SELECT m FROM ModelOS m WHERE m.cliente = :cliente")
    , @NamedQuery(name = "ModelOS.findByTipo", query = "SELECT m FROM ModelOS m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "ModelOS.findByTecnico", query = "SELECT m FROM ModelOS m WHERE m.tecnico = :tecnico")
    , @NamedQuery(name = "ModelOS.findByNumerodeserie", query = "SELECT m FROM ModelOS m WHERE m.numerodeserie = :numerodeserie")
    , @NamedQuery(name = "ModelOS.findByPlaca", query = "SELECT m FROM ModelOS m WHERE m.placa = :placa")
    , @NamedQuery(name = "ModelOS.findByDatafechamento", query = "SELECT m FROM ModelOS m WHERE m.datafechamento = :datafechamento")
    , @NamedQuery(name = "ModelOS.findByHorafechamento", query = "SELECT m FROM ModelOS m WHERE m.horafechamento = :horafechamento")
    , @NamedQuery(name = "ModelOS.findByLoja", query = "SELECT m FROM ModelOS m WHERE m.loja = :loja")
    , @NamedQuery(name = "ModelOS.findByCor", query = "SELECT m FROM ModelOS m WHERE m.cor = :cor")
    , @NamedQuery(name = "ModelOS.findByModelo", query = "SELECT m FROM ModelOS m WHERE m.modelo = :modelo")
    , @NamedQuery(name = "ModelOS.findByFabricante", query = "SELECT m FROM ModelOS m WHERE m.fabricante = :fabricante")
    , @NamedQuery(name = "ModelOS.findByNome", query = "SELECT m FROM ModelOS m WHERE m.nome = :nome")
    , @NamedQuery(name = "ModelOS.findByKm", query = "SELECT m FROM ModelOS m WHERE m.km = :km")
    , @NamedQuery(name = "ModelOS.findByValortotalAv", query = "SELECT m FROM ModelOS m WHERE m.valortotalAv = :valortotalAv")
    , @NamedQuery(name = "ModelOS.findByValortotalAp", query = "SELECT m FROM ModelOS m WHERE m.valortotalAp = :valortotalAp")
    , @NamedQuery(name = "ModelOS.findByValorfinal", query = "SELECT m FROM ModelOS m WHERE m.valorfinal = :valorfinal")
    , @NamedQuery(name = "ModelOS.findByQuemcancelou", query = "SELECT m FROM ModelOS m WHERE m.quemcancelou = :quemcancelou")
    , @NamedQuery(name = "ModelOS.findByDatagatantia", query = "SELECT m FROM ModelOS m WHERE m.datagatantia = :datagatantia")})
public class ModelOS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "dataemissao")
    @Temporal(TemporalType.DATE)
    private Date dataemissao;
    @Column(name = "horaemissao")
    @Temporal(TemporalType.TIME)
    private Date horaemissao;
    @Size(max = 25)
    @Column(name = "status")
    private String status;
    @Column(name = "cliente")
    private Integer cliente;
    @Column(name = "tipo")
    private Integer tipo;
    @Column(name = "tecnico")
    private Integer tecnico;
    @Size(max = 30)
    @Column(name = "numerodeserie")
    private String numerodeserie;
    @Size(max = 15)
    @Column(name = "placa")
    private String placa;
    @Lob
    @Size(max = 65535)
    @Column(name = "obs")
    private String obs;
    @Column(name = "datafechamento")
    @Temporal(TemporalType.DATE)
    private Date datafechamento;
    @Column(name = "horafechamento")
    @Temporal(TemporalType.TIME)
    private Date horafechamento;
    @Column(name = "loja")
    private Integer loja;
    @Size(max = 255)
    @Column(name = "cor")
    private String cor;
    @Size(max = 100)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 100)
    @Column(name = "fabricante")
    private String fabricante;
    @Size(max = 100)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "km")
    private String km;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "problema_informado")
    private String problemaInformado;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "problema_datectado")
    private String problemaDatectado;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "solucao_aplicado")
    private String solucaoAplicado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valortotal_av")
    private BigDecimal valortotalAv;
    @Column(name = "valortotal_ap")
    private BigDecimal valortotalAp;
    @Column(name = "valorfinal")
    private BigDecimal valorfinal;
    @Size(max = 255)
    @Column(name = "quemcancelou")
    private String quemcancelou;
    @Column(name = "datagatantia")
    @Temporal(TemporalType.DATE)
    private Date datagatantia;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "condicoesdeservico")
    private String condicoesdeservico;

    public ModelOS() {
    }

    public ModelOS(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Date getHoraemissao() {
        return horaemissao;
    }

    public void setHoraemissao(Date horaemissao) {
        this.horaemissao = horaemissao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTecnico() {
        return tecnico;
    }

    public void setTecnico(Integer tecnico) {
        this.tecnico = tecnico;
    }

    public String getNumerodeserie() {
        return numerodeserie;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDatafechamento() {
        return datafechamento;
    }

    public void setDatafechamento(Date datafechamento) {
        this.datafechamento = datafechamento;
    }

    public Date getHorafechamento() {
        return horafechamento;
    }

    public void setHorafechamento(Date horafechamento) {
        this.horafechamento = horafechamento;
    }

    public Integer getLoja() {
        return loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getProblemaInformado() {
        return problemaInformado;
    }

    public void setProblemaInformado(String problemaInformado) {
        this.problemaInformado = problemaInformado;
    }

    public String getProblemaDatectado() {
        return problemaDatectado;
    }

    public void setProblemaDatectado(String problemaDatectado) {
        this.problemaDatectado = problemaDatectado;
    }

    public String getSolucaoAplicado() {
        return solucaoAplicado;
    }

    public void setSolucaoAplicado(String solucaoAplicado) {
        this.solucaoAplicado = solucaoAplicado;
    }

    public BigDecimal getValortotalAv() {
        return valortotalAv;
    }

    public void setValortotalAv(BigDecimal valortotalAv) {
        this.valortotalAv = valortotalAv;
    }

    public BigDecimal getValortotalAp() {
        return valortotalAp;
    }

    public void setValortotalAp(BigDecimal valortotalAp) {
        this.valortotalAp = valortotalAp;
    }

    public BigDecimal getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(BigDecimal valorfinal) {
        this.valorfinal = valorfinal;
    }

    public String getQuemcancelou() {
        return quemcancelou;
    }

    public void setQuemcancelou(String quemcancelou) {
        this.quemcancelou = quemcancelou;
    }

    public Date getDatagatantia() {
        return datagatantia;
    }

    public void setDatagatantia(Date datagatantia) {
        this.datagatantia = datagatantia;
    }

    public String getCondicoesdeservico() {
        return condicoesdeservico;
    }

    public void setCondicoesdeservico(String condicoesdeservico) {
        this.condicoesdeservico = condicoesdeservico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModelOS)) {
            return false;
        }
        ModelOS other = (ModelOS) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ModelOS[ codigo=" + codigo + " ]";
    }
    
}
