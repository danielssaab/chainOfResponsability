import java.util.ArrayList;

public abstract class Inspetor {
	protected ArrayList<TipoVistoria> listaVistorias = new ArrayList<>();
	private Inspetor inspetorSuperior;

	public Inspetor getInspetorSuperior() {
		return inspetorSuperior;
	}

	public void setInspetorSuperior(Inspetor inspetorSuperior) {
		this.inspetorSuperior = inspetorSuperior;
	}

	public abstract String getDescricaoCargo();

	public String realizarVistoria(Vistoria vistoria) {
		if (listaVistorias.contains(vistoria.getTipoVistoria())) {
			return getDescricaoCargo();
		} else {
			if (inspetorSuperior != null) {
				return inspetorSuperior.realizarVistoria(vistoria);
			} else {
				return "Vistoria não realizada";
			}
		}
	}
}