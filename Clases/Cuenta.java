public class Cuenta {
	private float saldo=0;
	
	public Cuenta(){
		saldo=0;		
	}
	public Cuenta(float saldo){
		this.saldo=saldo;
	}
	public void ingresar (float c){
		saldo+=c;
	}
	public void extraer (float c) throws CuentaException {
		if(saldo<c){
			throw new CuentaException("Saldo en rojo");
		}else{
			saldo-=c;
		}
	}
	public float getSaldo(){
		return this.saldo;
	}

}
