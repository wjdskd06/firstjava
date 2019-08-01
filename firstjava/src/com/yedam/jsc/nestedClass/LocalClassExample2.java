package com.yedam.jsc.nestedClass;

public class LocalClassExample2 {
	interface HelloThere {
		void greet();
	}

	public static void greetInEnglish(String name) {
		class EnglishHlloThere implements HelloThere {
			String name;

			EnglishHlloThere(String name) {
				this.name = name;
			}

			@Override
			public void greet() {
				System.out.println("Hello" + this.name);
			}

		}// end of EnglishHlloThere
		HelloThere myGreeting = new EnglishHlloThere(name);
		myGreeting.greet();
	}

	public static void main(String[] args) {
		greetInEnglish("Scott");
	}

}
