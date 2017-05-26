package org.kosta;

import java.util.ArrayList;

import org.kosta.Button.OnClickListener;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();
		
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(Button button) {
				System.out.println(button+" is Clicked");
			}
		});
		
		button.onClick();
	}

}


