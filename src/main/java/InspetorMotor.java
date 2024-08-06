public class InspetorMotor extends Inspetor {
	public InspetorMotor(Inspetor superior) {
		listaVistorias.add(TipoVistoriaMotor.getTipoVistoriaMotor());
		setInspetorSuperior(superior);
	}

	public String getDescricaoCargo() {
		return "Inspetor de Motor";
	}
}