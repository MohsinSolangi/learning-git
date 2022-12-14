import javax.swing.*;
  class Atm{

public static void main (String args []){


	String moneyValue = JOptionPane.showInputDialog("Enter   money ");
	
	int money = Integer.parseInt(moneyValue);
	
	int note5000 =  money/5000;
	int remNote5000 = money%5000;
	int note1000 = remNote5000/1000;
	int remNote1000 = remNote5000%1000;          
	int note500 = remNote1000/500;
	int remNote500 = remNote1000%500;
	int note100  = remNote500/100;
	int remNote100 = remNote500%100;
	int note50 = remNote100/50;
	int remNote50 = remNote100%50;
	int note20 = remNote50/20;
	int remNote20 = remNote50%20;
	int note10 = remNote20/10;
	int remNote10 = remNote20%10;
	int coin5 = remNote10/5;
	int remCoin5 = remNote10%5;
	int coin2 = remCoin5/2;
	int remCoin2 = remCoin5%2;
	int coin1 = remCoin2/1;
	
	JOptionPane.showMessageDialog(null,"Rupees Entered  "+ money +  "\n Five Thousand " + note5000+ " \n one Thousand " + note1000 +" \n Five hundred " +note500 + "\n one hundred "+ note100+ "\n Fifty  " + note50+"\n Twenty " + note20+" \n Ten " + note10 + "\n Five "+coin5 +"\n Two" +coin2 + "\n one "+ coin1 );
	
	 
//8888
}
}