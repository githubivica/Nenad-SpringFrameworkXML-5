package spring.demo;

public class ProfesorFizike implements Profesor {
	
	private String ime;
	private Oblast oblast;
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Oblast getOblast() {
		return oblast;
	}

	public void setOblast(Oblast oblast) {
		this.oblast = oblast;
	}

	@Override
	public String getGreeting() {
		return "Pozdrav od fizicara " + getIme() ;
	}

	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}

}
