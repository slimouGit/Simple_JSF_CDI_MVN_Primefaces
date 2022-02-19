package net.slimou.lifecycle;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class ViewBean extends AbstractNavigation implements Serializable  {

	private static final long serialVersionUID = 1166440779679935889L;
	
	private String text;
	
	public void druckeEingabeInKonsole(){
		System.out.println(this.text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	
	

}
