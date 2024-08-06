public class InspetorDocumentacao extends Inspetor {
	public InspetorDocumentacao(Inspetor superior) {
		listaVistorias.add(TipoVistoriaDocumentacao.getTipoVistoriaDocumentacao());
		setInspetorSuperior(superior);
	}

	public String getDescricaoCargo() {
		return "Inspetor de Documentação";
	}
}