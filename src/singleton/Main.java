package singleton;

public class Main {

	public static void main(String[] args) {
		ConfiguracaoGlobalSington configGlobal1 = ConfiguracaoGlobalSington.getInstance();
		
		System.out.println("configuração global 1: " + configGlobal1);
		System.out.println(configGlobal1.getUrlServidor());
        System.out.println(configGlobal1.getPorta());
        
        ConfiguracaoGlobalSington configGlobal2 = ConfiguracaoGlobalSington.getInstance();
        System.out.println("configuração global 2: " + configGlobal2);
        System.out.println(configGlobal2.getUrlServidor());
        System.out.println(configGlobal2.getPorta());
        
        configGlobal1.setUrlServidor("http://servidor.com");
        configGlobal1.setPorta(9090);
        
        System.out.println("configuração global 2 apos mudar a 1:");
        System.out.println(configGlobal2.getUrlServidor());
        System.out.println(configGlobal2.getPorta());
        
	}

}