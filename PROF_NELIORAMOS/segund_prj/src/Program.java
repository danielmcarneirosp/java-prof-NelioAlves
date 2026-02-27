void main() {
	double x= 10.35785;
	IO.println("Olá Mundo!");
	System.out.printf("%.2f%n",x);
	Locale.setDefault(Locale.US);
	System.out.printf("%.4f%n",x);
	System.out.printf("RESULTDAO = %.2f Metros%n",x);
	
	String nome = "Maria";
	int idade = 32;
	double renda = 4000.0;
	
	System.out.printf("%s tem, %d anos e ganha  R$ %.2f reais%n",nome,idade,renda);
	
}