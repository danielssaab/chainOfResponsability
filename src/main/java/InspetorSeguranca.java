public class InspetorSeguranca extends Inspetor {
	public InspetorSeguranca(Inspetor superior) {
		listaVistorias.add(TipoVistoriaSeguranca.getTipoVistoriaSeguranca());
		setInspetorSuperior(superior);
	}

	public String getDescricaoCargo() {
		return "Inspetor de Segurança";
	}
}