/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import DAO.DaoOs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import model.ModelOS;

/**
 *
 * @author neto_
 */
@Named
@ManagedBean
@SessionScoped
//@RequestScoped
public class beanOS {

    private ModelOS modelOS = new ModelOS();
    private DaoOs daoOs = new DaoOs();
    private List<ModelOS> listaOS = new ArrayList<>();
    private String alterarSalvar = "salvar";

    public beanOS() {

    }

    //  @PostConstruct
    public List<ModelOS> listarOS() {
        listaOS = daoOs.listaOS();
        return listaOS;
    }

    public void salvarOs() {

        if (modelOS != null) {
            Calendar calendar = Calendar.getInstance();
            Date dataEmissao = calendar.getTime();
            Date horaEmissao = new Date(System.currentTimeMillis());
            modelOS.setHoraemissao(horaEmissao);
            modelOS.setDataemissao(dataEmissao);
            if (alterarSalvar.equals("salvar")) {
                daoOs.salvarOs(modelOS);
                mensagemSalvo(true);
            } else if (alterarSalvar.equals("alterar")) {
                daoOs.atualizarOs(modelOS);
                mensagemSalvo(true);
            }
            alterarSalvar = "salvar";
            listarOS();
            modelOS = new ModelOS();
        } else {
            mensagemSalvo(false);
        }
    }

    public void atualizarOs(ModelOS modelOS) {
        setModelOS(modelOS);
        alterarSalvar = "alterar";
    }

    public void mensagemSalvo(Boolean status) {
        FacesContext context = FacesContext.getCurrentInstance();
        if (status) {
            context.addMessage(null, new FacesMessage("Sucesso!", "O.S. Salva!"));
        } else {
            context.addMessage(null, new FacesMessage("Erro!", "Erro ao Salvar!"));
        }
    }

    public ModelOS getModelOS() {
        return modelOS;
    }

    public void setModelOS(ModelOS modelOS) {
        this.modelOS = modelOS;
    }

    public DaoOs getDaoOs() {
        return daoOs;
    }

    public void setDaoOs(DaoOs daoOs) {
        this.daoOs = daoOs;
    }

    public List getListaOS() {
        return listaOS;
    }

    public void setListaOS(List listaOS) {
        this.listaOS = listaOS;
    }

}
