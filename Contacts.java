import javax.swing.JOptionPane;

public class Contacts {
   


public static void Syptoms() {
	String yes="θετικο";
	int dayspassed= 0 ;
    int qcontact;
	int symptcounter = 0;
	int question1 =JOptionPane.showConfirmDialog(null,"Εχέτε υψηλό και συνεχή πυρετο;");
	int question2 =JOptionPane.showConfirmDialog(null," Έχετε βήχα;");
	int question3 =JOptionPane.showConfirmDialog(null,"Εχέτε δύσπνοια;");
	int question4 =JOptionPane.showConfirmDialog(null,"Εχετε συμπτώμτα αγευσιας η αοσμιας;");
	int question5 =JOptionPane.showConfirmDialog(null,"Εχετε μυικούς πονους , πονόλαιμο, πονοκέφαλό;");
	if ( question1==0 && question2==0 && question3==0 && question4==0 ) {
		 JOptionPane.showMessageDialog( null , "Aπαιτείται η διενεργεια μοριακου τεστ covid-19(PCR)");
		 String COVIDresult =JOptionPane.showInputDialog("Αποτελεσμα τεστ(θετικο/αρνητικο):");
		 System.out.println(COVIDresult);
		 if (COVIDresult.contentEquals(yes)) {
			  System.out.println("Κρουσμα θετικο στον ιο SARS-COV-1");           //καλω τον πινακα οπου ειναι 
			  System.out.println("Δωστε ΑΜΚΑ, ωστε να ξεκινησει ιχνηλατιση.");   //αποθηκευμενο το αμκα  και αρχιζει
		 }     else {                                                            // ιχνηλάτιση επαφών.   
		        System.out.println("δεν διετρεχεται καποιος κινδυνος διασπορας");   
			 System.exit(0);
		 }
		 
	}else {
		     qcontact=JOptionPane.showConfirmDialog(null,"ερχετε έρθει σε επαφή με κρούσμα κορονοιου;");
	      if (qcontact==0) {
		  dayspassed =JOptionPane.showConfirmDialog(null,"Εχουν πέρασει 14 μέρες απο την εκθεση σας;");
		    if (dayspassed==1 ) {
			  JOptionPane.showMessageDialog( null , "Aπαιτείται η διενεργεια μοριακου τεστ covid-19(PCR)");
				 String COVIDresult =JOptionPane.showInputDialog("Αποτελεσμα τεστ(θετικο/αρνητικο):");
				 if (COVIDresult.contentEquals(yes)) {
					  System.out.println("Κρουσμα θετικο στον ιο SARS-COV-1");           //καλω τον πινακα οπου ειναι 
					  System.out.println("Δωστε ΑΜΚΑ, ωστε να ξεκινησει ιχνηλατιση."); 
				 }else {
					 System.exit(0);
		         }
	         }
		  
	        } else if (qcontact== 1 || dayspassed==0) {
	        	System.exit(0);
	        	
	}
		}	
  }
}
