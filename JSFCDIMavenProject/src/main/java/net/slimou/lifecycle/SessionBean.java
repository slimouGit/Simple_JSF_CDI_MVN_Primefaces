package net.slimou.lifecycle;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SessionBean implements Serializable {

	private static final long serialVersionUID = -9080543072492671910L;
	
	private String text;

	public void druckeEingabeInKonsole() {
		System.out.println(this.text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
