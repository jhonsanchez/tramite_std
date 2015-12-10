package pe.com.ebuho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by eBuho on 10/12/2015.
 */
@Component("contractView")
@Scope("session")
public class ContractController  implements Serializable {

    private String contract = "sentinel";

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public void changeContract(String contract){
        this.contract = contract;
    }
}
