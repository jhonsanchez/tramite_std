package pe.com.ebuho.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.io.Serializable;

/**
 * Created by johnm on 11/26/2015.
 */
@Component("themeView")
@Scope("session")
public class ThemeController implements Serializable {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void change(String color) {
        if(color.equals("green"))
            this.color = null;
        else
            this.color = "-" + color;
    }


}
