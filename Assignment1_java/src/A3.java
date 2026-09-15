import java.util.Scanner;
public class A3 {
public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	
	Canteen c = new Canteen();
	
	//int choice ;
	double totalBill=0.0;
	boolean running=true;
	
	while(running) {
		c.printmenu();
		int choice = sc.nextInt();
        switch (choice) {
        case 1:
            totalBill += c.getDosa();
            System.out.println("Dosa added to bill!");
            break;
        case 2:
            totalBill += c.getSamosa();
            System.out.println("Samosa added to bill!");
            break;
        case 3:
            totalBill += c.getIdli();
            System.out.println("Idli added to bill!");
            break;
        case 4:
            totalBill += c.getMeduwada();
            System.out.println("Meduwada added to bill!");
            break;
        case 5:
            totalBill += c.getKachori();
            System.out.println("Kachori added to bill!");
            break;
        case 6:
            totalBill += c.getMaggie();
            System.out.println("Maggie added to bill!");
            break;
        case 7:
            totalBill += c.getUttapa();
            System.out.println("Uttapa added to bill!");
            break;
        case 8:
            totalBill += c.getAappe();
            System.out.println("Aappe added to bill!");
            break;
        case 9:
            totalBill += c.getBonda();
            System.out.println("Bonda added to bill!");
            break;
        case 10:
            totalBill += c.getCoffe();
            System.out.println("Coffee added to bill!");
            break;
        case 11:
            
            System.out.println("Thank you for ordering!!!");
            System.out.printf("Your Total Bill is: ₹%.2f\n", totalBill);
          
            running = false; 
            break;
        default:
            System.out.println("Invalid option! Please pick a choice between 1 and 11.");
    }
}
sc.close();
	}
	
	
	
static	class Canteen{
	
	private double Dosa = 40;
	private double Samosa = 25;
	private double Idli = 30;
	private double Meduwada = 40;
	private double Kachori = 25;
	private double Maggie = 40;
	private double Uttapa = 60;
	private double Aappe = 30;
	private double Bonda = 30;
	private double Coffe = 20;
	
	 public double getDosa() { return Dosa; }
     public double getSamosa() { return Samosa; }
     public double getIdli() { return Idli; }
     public double getMeduwada() { return Meduwada; }
     public double getKachori() { return Kachori; }
     public double getMaggie() { return Maggie; }
     public double getUttapa() { return Uttapa; }
     public double getAappe() { return Aappe; }
     public double getBonda() { return Bonda; }
     public double getCoffe() { return Coffe; }
	
	
	void printmenu() {
		System.out.println("------Menue-----");
		System.out.println("1.Dosa "+Dosa);
		System.out.println("2.Samosa "+Samosa);
		System.out.println("3.Idli "+Idli);
		System.out.println("4.Meduwada "+Meduwada);
		System.out.println("5.Kachori "+Kachori);
		System.out.println("6.Maggie "+Maggie);
		System.out.println("7.Uttapa "+Uttapa);
		System.out.println("8.Aappe "+Aappe);
		System.out.println("9.Bonda " +Bonda);
		System.out.println("10.Coffe "+ Coffe);
		System.out.println("11. Generate Bill & Exit");
        System.out.print("\nEnter your choice (1-11): ");

	}
		
}



}
