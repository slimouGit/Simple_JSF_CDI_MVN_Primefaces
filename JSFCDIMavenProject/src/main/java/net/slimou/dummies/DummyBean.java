package net.slimou.dummies;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class DummyBean {
	
	private String hello;
	
	@Inject
	private DummyService dummyService;
	
	@PostConstruct
	public void init(){
		System.out.println("DummyBean is running");
	}
	
	public void helloService(){
		this.hello = this.dummyService.helloUser();
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	
	

}
