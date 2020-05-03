package Application;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(1, "Carlos Abbade","carlos@gmail.com");
		Pessoa p2 = new Pessoa(1, "Teresa Abbade","teca@gmail.com");
		Pessoa p3 = new Pessoa(1, "Renan Abbade","renan@gmail.com");
		System.out.println(p1+","+ p2+","+ p3);
	}

}
