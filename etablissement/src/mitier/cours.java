package mitier;

public class cours {
	public cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cours(String theme, double nombreHeures) {
		super();
		this.theme = theme;
		this.nombreHeures = nombreHeures;
	}
	private String theme;
	private double nombreHeures;
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public double getNombreHeures() {
		return nombreHeures;
	}
	public void setNombreHeures(double nombreHeures) {
		this.nombreHeures = nombreHeures;
	}
	@Override
	public String toString() {
		return "cours [theme=" + theme + ", nombreHeures=" + nombreHeures + "]";
	}

}
