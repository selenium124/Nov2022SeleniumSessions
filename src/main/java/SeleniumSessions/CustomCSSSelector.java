package SeleniumSessions;

import org.openqa.selenium.By;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		//id
		// #id
		// #input-firstname -- css
		//input[@id='input-firstname'] -- xpath
		By fn = By.cssSelector("#input-firstname");
		
		//tag#id
		// input#input-firstname
		
		//class
		// .class
		// .form-control
		// .login-email
		
		// tag.class
		// input.form-control
		// input.login-email
		// button.login-submit
		
		//.c1.c2.c3...cn
		// .form-control.private-form__control.login-email
		//tag.c1.c2.c3...cn
		// input.form-control.private-form__control.login-email
		
		// input.login-email.form-control
		
		//tag#id.class
		// input#username.login-email
		//tag.class#id
		// input.login-email#username
		//#id.class
		// #username.login-email
		//.class#id
		//.login-email#username
		
		//tag.c1.c2.c3...cn#id
		//input#username.form-control.private-form__control.login-email
		//input.form-control.private-form__control.login-email#username
		//input.form-control#username.private-form__control.login-email
		
		
		//other attr:
		// tag[attr='value']
		// input[type='text'] -- css
		//input[@type='text'] -- xpath
		// input[placeholder='First Name']
		
		// input[id='input-firstname']
		
		// input[class='login-email'] --- css --0
		//input[@class='login-email'] -- xpath --0
		
		//input[contains(@class,'login-email')] -- 1 -- xpath
		
		// input[class='form-control private-form__control login-email']
		
		
		//multiple attr:
		// tag[attr1='value'][attr2='value'][attr3='value']
		// input[type='text'][name='firstname']
		// input[type='text'][name='firstname'][placeholder='First Name'] -- css
		//input[@type='text' and @name='firstname' and @placeholder='First Name'] --xpath
		
		//tag#id[attr='value']
		// input#input-firstname[placeholder='First Name'][type='text']
		// input#input-firstname[placeholder='First Name'][type='text'].form-control
		// input[placeholder='First Name'][type='text'].form-control#input-firstname
		
		//h1[text()='Register Account']
		//text is not supported in CSS
		
		//contains:
		// tag[attr*='value']
		// input[id*='firstname']
		// input[class*='login-email']
		
		//starts-with:
		// tag[attr^='value']
		// input[placeholder^='First']
		
		// input[id^='naveen_']
		
		//ends-with:
		// tag[attr$='value']
		// input[placeholder$='Name']
		
		
		//parent to child:
		// parent tag child tag
		// parent tag > child tag > child tag
		
		// form#Form_getForm > select -- 0 --> direct child element
		// form#Form_getForm select -- 1 --> indirect + direct child elements
		
		// form#hs-login > div -- 8
		// form#hs-login div --20
		
		
		//child to parent: backward traversing -- not available
		


	}

}
