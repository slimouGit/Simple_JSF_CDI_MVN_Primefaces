package net.slimou.lifecycle;

import javax.inject.Named;

@Named
public class NoneBean {
	
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
