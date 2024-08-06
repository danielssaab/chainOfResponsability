public class TipoVistoriaDocumentacao implements TipoVistoria {
	private static TipoVistoriaDocumentacao tipoVistoriaDocumentacao = new TipoVistoriaDocumentacao();
	private TipoVistoriaDocumentacao() {}
	public static TipoVistoriaDocumentacao getTipoVistoriaDocumentacao() {
		return tipoVistoriaDocumentacao;
	}
}