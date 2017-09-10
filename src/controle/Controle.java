package controle;

public class Controle {

	public String nomeSO() {
		return System.getProperty("os.name");
	}
	
	public String versaoSO() {
		return System.getProperty("os.version");
	}
}
