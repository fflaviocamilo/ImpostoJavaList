package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer>  list = new ArrayList<>(); 
		System.out.print("Quantos contribuintes irá digitar : ");
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
				
		
		System.out.println("Dados do primeiro contribuinte #"+ (i+1) + ":" );
		System.out.print("Renda anual do salario: ");
		double salary = sc.nextDouble();
		//double salary = 189000.00;
		//double salary = 48000.00;
		
		System.out.print("Renda anual com prestação de serviço : ");
		double servico = sc.nextDouble();
		//double servico = 55184.93;
		//double servico = 0;
		
		
		System.out.print("Renda anual com ganho de capital : ");
		double rendaCapital = sc.nextDouble();
		//double rendaCapital = 20000.00;
		//double rendaCapital = 800.00;
		
		
		System.out.print("Gastos médicos : ");
		double gastoMedico = sc.nextDouble();
		//double gastoMedico = 600.00;
		//double gastoMedico = 400.00;
		
		System.out.print("Gastos educacionas : ");
		double gastoEducacional = sc.nextDouble();
		//double gastoEducacional = 7500;
		//double  gastoEducacional = 5400;
		
		System.out.println("-------------------");
		
		TaxPayer taxpayer = new TaxPayer(salary, servico, rendaCapital, gastoMedico, gastoEducacional);
		
		list.add(taxpayer);
		}
		
		System.out.println();
		
		for (int i = 0 ;  i< list.size() ; i ++) {
			System.out.println("Resumo do " + (i + 1) + " contribuinte ");
			System.out.println("Imposto bruto total :  " + list.get(i).grossTax() );
			System.out.println("Abatimento :  " + list.get(i).taxRebate());
			System.out.println("Imposto devido :  " + list.get(i).netTax());
				
		}
		
		
		
	}
	
	 

}
