public class TipoVistoriaSeguranca implements TipoVistoria {
	private static TipoVistoriaSeguranca tipoVistoriaSeguranca = new TipoVistoriaSeguranca();
	private TipoVistoriaSeguranca() {}
	public static TipoVistoriaSeguranca getTipoVistoriaSeguranca() {
		return tipoVistoriaSeguranca;
	}
}