public class TipoVistoriaMotor implements TipoVistoria {
	private static TipoVistoriaMotor tipoVistoriaMotor = new TipoVistoriaMotor();
	private TipoVistoriaMotor() {}
	public static TipoVistoriaMotor getTipoVistoriaMotor() {
		return tipoVistoriaMotor;
	}
}