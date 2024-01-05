package week3.day2;

public class Elements {

	public static void main(String[] args) {
		
		Button buttonobj = new Button();
		buttonobj.click();
		buttonobj.settext("inheritance");
		buttonobj.submit();
		
		Textfield textfieldobj1 = new Textfield();
		textfieldobj1.click();
		textfieldobj1.settext("Shastiram");
		textfieldobj1.gettext();
		
		Radiobutton radiobuttonobj2 = new Radiobutton();
		radiobuttonobj2.click();
		radiobuttonobj2.Selectradiobutton();
		radiobuttonobj2.submit();

		Checkboxbutton checkboxbuttonobj3 = new Checkboxbutton();
		checkboxbuttonobj3.click();
		checkboxbuttonobj3.Clickcheckbutton();
		checkboxbuttonobj3.submit();



	}

}
