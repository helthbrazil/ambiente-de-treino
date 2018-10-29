package exceptions;

public class FaltaDeFundosException extends Exception {
	
	private static final long serialVersionUID = -5007617245162549375L;
	private final double fundos;
	private String mensagem;

	public FaltaDeFundosException(double fundos, String mensagem) {
		this.fundos = fundos;
		this.mensagem = mensagem;
	}

	public double getFundos() {
		return fundos;
	}
	
	 @Override
	    public String getMessage(){
	        return mensagem;
	    }
}
