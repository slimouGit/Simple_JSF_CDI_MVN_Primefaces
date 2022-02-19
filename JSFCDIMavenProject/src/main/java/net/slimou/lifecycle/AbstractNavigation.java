package net.slimou.lifecycle;

abstract class AbstractNavigation  {
	
	private final String REDIRECT = "?faces-redirect=true";
	
	public String redirect() {
		String target = "/index.xhtml"+REDIRECT;
		System.out.println(target);
		return target;
	}
}
