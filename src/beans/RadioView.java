package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class RadioView {
     
    private String contatoEmail;
    private String contatoEmail2;  
    private List<String> contatos;  
     
    @PostConstruct
    public void init() {
        contatos = new ArrayList<String>();
        contatos.add("Reservas");
        contatos.add("Administrativo");
    }
  
    public String getContatoEmail() {
        return contatoEmail;
    }
 
    public void setContatoEmail(String contatoEmail) {
        this.contatoEmail = contatoEmail;
    }
 
    public String getContatoEmail2() {
        return contatoEmail2;
    }
 
    public void setContatoEmail2(String contatoEmail2) {
        this.contatoEmail2 = contatoEmail2;
    }
 
    public List<String> getContatos() {
        return contatos;
    }
}
