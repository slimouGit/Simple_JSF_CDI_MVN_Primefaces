package net.slimou.lifecycle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ApplicationBean {
	
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
