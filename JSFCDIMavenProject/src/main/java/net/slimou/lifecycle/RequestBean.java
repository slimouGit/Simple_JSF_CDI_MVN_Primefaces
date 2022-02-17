package net.slimou.lifecycle;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RequestBean {

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
