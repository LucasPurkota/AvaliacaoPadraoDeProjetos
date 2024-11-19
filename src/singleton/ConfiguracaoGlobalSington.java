package singleton;

public class ConfiguracaoGlobalSington {
	private static ConfiguracaoGlobalSington instancia;
	private String url = "http://localhost";
	private int porta = 4000;
	
	 public String getUrlServidor() {
	        return url;
	    }

	    public void setUrlServidor(String url) {
	        this.url = url;
	    }

	    public int getPorta() {
	        return porta;
	    }

	    public void setPorta(int porta) {
	        this.porta = porta;
	    }
	
	public static ConfiguracaoGlobalSington getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoGlobalSington();
        }
        return instancia;
    }
}
