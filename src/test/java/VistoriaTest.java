import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VistoriaTest {
	InspetorMotor inspetorMotor;
	InspetorSeguranca inspetorSeguranca;
	InspetorDocumentacao inspetorDocumentacao;

	@BeforeEach
	void setUp() {
		inspetorDocumentacao = new InspetorDocumentacao(null);
		inspetorSeguranca = new InspetorSeguranca(inspetorDocumentacao);
		inspetorMotor = new InspetorMotor(inspetorSeguranca);
	}

	@Test
	void deveRetornarInspetorDeMotorParaVistoriaMotor() {
		assertEquals("Inspetor de Motor", inspetorMotor.realizarVistoria(new Vistoria(TipoVistoriaMotor.getTipoVistoriaMotor())));
	}

	@Test
	void deveRetornarInspetorDeSegurancaParaVistoriaSeguranca() {
		assertEquals("Inspetor de Segurança", inspetorMotor.realizarVistoria(new Vistoria(TipoVistoriaSeguranca.getTipoVistoriaSeguranca())));
	}

	@Test
	void deveRetornarInspetorDeDocumentacaoParaVistoriaDocumentacao() {
		assertEquals("Inspetor de Documentação", inspetorMotor.realizarVistoria(new Vistoria(TipoVistoriaDocumentacao.getTipoVistoriaDocumentacao())));
	}

	@Test
	void deveRetornarVistoriaNaoRealizadaParaTipoDesconhecido() {
		assertEquals("Vistoria não realizada", inspetorMotor.realizarVistoria(new Vistoria(new TipoVistoria() {})));
	}
}