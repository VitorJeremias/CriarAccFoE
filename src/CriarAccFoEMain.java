import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class CriarAccFoEMain {
	private static Robot clicker = null;
	private static Robot keyboard = null;
	private static int casas = 16;
	private static ArrayList<String> accs = new ArrayList<String>();

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		accs.add("NovaConta");

		System.out.println(accs.get(0).toUpperCase());
		executarPassos(accs.get(0));
		wait(2);

	}

	public static void executarPassos(String acc) throws AWTException, IOException, HeadlessException, InterruptedException {
		fecharJanela(acc);
		tirarMusica(acc);
		tirarSom(acc);
		ok(acc);
		construir(acc);
		cabanaMenu(acc);
		colocarCabana(acc);
		wait(3);
		ok(acc);
		Thread.sleep(2000);
		coletarPrimeiraCabana(acc);
		ok(acc);
		Thread.sleep(1000);
		construir(acc);
		mantimentosMenu(acc);
		cacadorMenu(acc);
		colocarCacador(acc);
		Thread.sleep(1000);
		construir(acc);
		botaoMover(acc);
		pegarCacadorEmConstrucao(acc);
		moverCacador(acc);
		Thread.sleep(1000);
		idadeDaPedra(acc);
		Thread.sleep(500);
		cacadorEsperando(acc);
		cincoMin(acc);
		ok(acc);
		pesquisa(acc);
		ok(acc);
		pesquisaPalafitas(acc);
		use3Pontos(acc);
		okVerde(acc);
		abrirOBau(acc);
		fecharVerde(acc);
		ok(acc);
		voltarACidade(acc);
		wait(15);
		construir(acc);
		decoracaoMenu(acc);
		memorialMenu(acc);
		colocarMemorial(acc);
		ok(acc);
		historia(acc);
		ok(acc);
		Thread.sleep(600);
		construir(acc);
		casaMenu(acc);
		palafitaMenu(acc);
		colocarPalafita(acc);
		historia2(acc);
		Thread.sleep(1000);
		coletarVerde(acc);
		ok(acc);
		construir(acc);
		Thread.sleep(1000);
		casaGrandeMenu(acc);
		colocarCasaGrande(acc);
		ok(acc);
		Thread.sleep(7000);
		configuracoes(acc);
		desmarcarOpcao(acc);
		ok(acc);
		recarregar(acc);
		Thread.sleep(10000);
		zoomIn();
		pesquisa(acc);
		Thread.sleep(2000);
		pesquisaLancas(acc);
		Thread.sleep(2000);
		use3Pontos(acc);
		okVerde(acc);
		ok(acc);
		voltarACidade(acc);
		Thread.sleep(1000);
		mapa(acc);
		explorar(acc);
		wait(8);
		provincia(acc);
		Thread.sleep(2000);
		setor1(acc);
		botaoAtacar(acc);
		lanceiro(acc);
		botaoAtacarVerde(acc);
		moverLanceiro1(acc);
		Thread.sleep(5000);
		ok(acc);
		moverLanceiro2(acc);
		Thread.sleep(5000);
		atacarInimigo1(acc);
		Thread.sleep(3000);
		ok(acc);
		atacarInimigo2(acc);
		Thread.sleep(3000);
		okVerde(acc);
		voltarParaVisaoGeral(acc);
		Thread.sleep(2000);
		mapaDoContinente(acc);
		voltarACidade2(acc);
		auxiliar(acc);
		fecharJanela(acc);
		fecharJanela(acc);
		fecharJanela(acc);
		sentarNaTaberna(acc);
		fecharJanela(acc);
		pesquisa(acc);
		pesquisaOlaria(acc);
		use3Pontos(acc);
		okVerde(acc);
		pesquisaRoda(acc);
		useXPontos(acc);
		fecharJanela(acc);
		voltarACidade(acc);
		logout(acc);
		sair(acc);
		Thread.sleep(3000);
		sair2(acc);
	}

	public static void mapaDoContinente(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mapaDoContinente.png")), "mapaDoContinente", acc);
	}

	public static void recarregar(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\recarregar.png")), "recarregar", acc);
	}

	public static void desmarcarOpcao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\desmarcarOpcao.png")), "desmarcarOpcao", acc);
	}

	public static void configuracoes(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\configuracoes.png")), "configuracoes", acc);
	}

	public static void idadeDaPedra(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\idadeDaPedra.png")), "idadeDaPedra", acc);
	}

	public static void voltarACidade2(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarACidade2.png")), "voltarACidade2", acc);
	}

	public static void voltarParaVisaoGeral(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarParaVisaoGeral.png")), "voltarParaVisaoGeral", acc);
	}

	public static void useXPontos(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\useXPontos.png")), "useXPontos", acc);
	}

	public static void pesquisaRoda(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaRoda.png")), "pesquisaRoda", acc);
	}

	public static void pesquisaOlaria(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaOlaria.png")), "pesquisaOlaria", acc);
	}

	public static void auxiliar(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\auxiliar.png")), "auxiliar", acc);
		Thread.sleep(1000);
	}

	public static void sentarNaTaberna(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\sentarNaTaberna.png")), "sentarNaTaberna", acc);
		Thread.sleep(1000);
	}

	public static void atacarInimigo2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\atacarInimigo2.png")), "atacarInimigo2", acc);
	}

	public static void atacarInimigo1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\atacarInimigo1.png")), "atacarInimigo1", acc);
	}

	public static void moverLanceiro2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverLanceiro2.png")), "moverLanceiro2", acc);
	}

	public static void moverLanceiro1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverLanceiro1.png")), "moverLanceiro1", acc);
	}

	public static void botaoAtacarVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoAtacarVerde.png")), "botaoAtacarVerde", acc);
	}

	public static void lanceiro(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\lanceiro.png")), "lanceiro", acc);
	}

	public static void botaoAtacar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoAtacar.png")), "botaoAtacar", acc);
	}

	public static void setor1(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\setor1.png")), "setor1", acc);
	}

	public static void provincia(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\provincia.png")), "provincia", acc);
	}

	public static void explorar(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\explorar.png")), "explorar", acc);
	}

	public static void mapa(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mapa.png")), "mapa", acc);
	}

	public static void pesquisaLancas(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaLancas.png")), "pesquisaLancas", acc);
	}

	public static void colocarCasaGrande(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCasaGrande.png")), "colocarCasaGrande", acc);
	}

	public static void casaGrandeMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\casaGrandeMenu.png")), "casaGrandeMenu", acc);
	}

	public static void coletarVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\coletarVerde.png")), "coletarVerde", acc);
	}

	public static void historia2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\historia2.png")), "historia2", acc);
	}

	public static void colocarPalafita(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarPalafita.png")), "colocarPalafita", acc);
	}

	public static void palafitaMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\palafitaMenu.png")), "palafitaMenu", acc);
	}

	public static void casaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\casaMenu.png")), "casaMenu", acc);
	}

	public static void historia(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\historia.png")), "historia", acc);
	}

	public static void colocarMemorial(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarMemorial.png")), "colocarMemorial", acc);
	}

	public static void memorialMenu(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\memorialMenu.png")), "memorialMenu", acc);
	}

	public static void decoracaoMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\decoracaoMenu.png")), "decoracaoMenu", acc);
	}

	public static void voltarACidade(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\voltarACidade.png")), "voltarACidade", acc);
	}

	public static void fecharVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\fecharVerde.png")), "fecharVerde", acc);
	}

	public static void abrirOBau(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\abrirOBau.png")), "abrirOBau", acc);
	}

	public static void okVerde(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\okVerde.png")), "okVerde", acc);
	}

	public static void use3Pontos(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\use3Pontos.png")), "use3Pontos", acc);
	}

	public static void pesquisaPalafitas(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisaPalafitas.png")), "pesquisaPalafitas", acc);
	}

	public static void fecharJanela(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\fecharJanela.png")), "Fechar janela", acc);
	}

	public static void abrir(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\abrir.png")), "Abrir", acc);
	}

	public static void logout(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\logout.png")), "Logout", acc);
	}

	public static void sair(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\sair.png")), "Sair", acc);
	}

	public static void sair2(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\sair2.png")), "Sair2", acc);
	}

	public static void tirarMusica(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\tirarMusica.png")), "tirarMusica", acc);
	}

	public static void tirarSom(String acc) throws HeadlessException, AWTException, IOException {
		clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\tirarSom.png")), "tirarSom", acc);
	}

	public static void ok(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\ok.png")), "ok", acc);
	}

	public static void construir(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\construir.png")), "construir", acc);
	}

	public static void cabanaMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cabanaMenu.png")), "cabanaMenu", acc);
	}

	public static void colocarCabana(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCabana.png")), "colocarCabana", acc);
	}

	public static void coletarPrimeiraCabana(String acc) throws HeadlessException, AWTException, IOException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\coletarPrimeiraCabana.png")), "coletarPrimeiraCabana", acc);
	}

	public static void mantimentosMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\mantimentosMenu.png")), "mantimentosMenu", acc);
	}

	public static void cacadorMenu(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		Thread.sleep(1000);
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cacadorMenu.png")), "cacadorMenu", acc);
	}

	public static void colocarCacador(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\colocarCacador.png")), "colocarCacador", acc);
	}

	public static void botaoMover(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\botaoMover.png")), "botaoMover", acc);
	}

	public static void pegarCacadorEmConstrucao(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pegarCacadorEmConstrucao.png")), "pegarCacadorEmConstrucao", acc);
	}

	public static void moverCacador(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\moverCacador.png")), "moverCacador", acc);
	}

	public static void cacadorEsperando(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cacadorEsperando.png")), "cacadorEsperando", acc);
	}

	public static void cincoMin(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\cincoMin.png")), "cincoMin", acc);
	}

	public static void pesquisa(String acc) throws HeadlessException, AWTException, IOException, InterruptedException {
		clicar(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\CriarAcc\\pesquisa.png")), "pesquisa", acc);
	}

	public static void escrever(String string) throws AWTException {
		apagar();
		digitar(string);
	}

	public static void digitar(String nome) throws AWTException {
		keyboard = new Robot();
		for (int i = 0; i < nome.length(); i++) {
			char[] chars = nome.toUpperCase().toCharArray();
			switch (chars[i]) {
			case '�':
				keyboard.keyPress(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyRelease(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyPress(KeyEvent.VK_A);
				keyboard.keyRelease(KeyEvent.VK_A);
				keyboard.delay(20);
				break;
			case '�':
				keyboard.keyPress(KeyEvent.VK_SHIFT);
				keyboard.keyPress(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyRelease(KeyEvent.VK_SHIFT);
				keyboard.keyRelease(KeyEvent.VK_DEAD_TILDE);
				keyboard.keyPress(KeyEvent.VK_E);
				keyboard.keyRelease(KeyEvent.VK_E);
				keyboard.delay(20);
				break;
			default:
				keyboard.keyPress(chars[i]);
				keyboard.keyRelease(chars[i]);
			}
			keyboard.delay(20);
		}
	}

	public static void apagar() throws AWTException {
		keyboard = new Robot();
		for (int i = 0; i < 20; i++) {
			keyboard.keyPress(KeyEvent.VK_BACK_SPACE);
			keyboard.delay(20);
		}
	}

	public static void wait(int segundos) throws AWTException {
		clicker = new Robot();
		System.out.print("Wait " + segundos + "s: ");
		for (int i = 0; i < segundos - 1; i++) {
			clicker.delay(1000);
			System.out.print(i + 1 + ", ");
		}
		clicker.delay(1000);
		System.out.println(segundos);
	}

	public static void clickEvent(double x, double y) throws AWTException {
		clicker = new Robot();
		clicker.mouseMove((int) x, (int) y);
		clicker.delay(500);
		clicker.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		clicker.delay(20);
		clicker.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
	}

	public static void zoomIn() throws AWTException {
		clicker = new Robot();
		clicker.delay(500);
		clicker.mouseWheel(-50);
		clicker.delay(200);
	}

	public static void zoomOut() throws AWTException {
		clicker = new Robot();
		clicker.mouseWheel(50);
		clicker.delay(200);
	}

	public static void aguardar(ArrayList<BufferedImage> bi, String acao, String acc) throws HeadlessException, AWTException {

		boolean achouUm = false;
		while (!achouUm) {
			achouUm = achouUm || esperarImagem(bi.get(1), acao, acc);
			achouUm = achouUm || esperarImagem(bi.get(0), acao, acc); // S� procura a segunda imagem quando acha a
																		// primeira
		}
	}

	public static void clicar(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		if (acao == "lanceiro") {
			for (int i = 0; i < 1; i++) {
				compararImagens(bi, 0.5, 0.5, 0, 30, acao, acc);
			}
		}
		compararImagens(bi, 0.5, 0.5, 0, 30, acao, acc);
	}

	public static void clicarRapido(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.5, 0.5, 0, 10, acao, acc);
	}

	public static void clicarLogin(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		compararImagens(bi, 0.6, 0.3, 0, 30, acao, acc);
	}

	public static void clicarColeta(BufferedImage bi, String acao, String acc) throws AWTException, HeadlessException, IOException {
		zoomIn();
		for (int i = 0; i < casas; i++) {
			compararImagens(bi, 0.6, 0.1, 0, 2, acao + (i + 1), acc);
		}
		wait(3);
		zoomOut();
	}

	public static boolean esperarImagem(BufferedImage bi, String acao, String acc) throws HeadlessException, AWTException {
		boolean achou = false;
		boolean fail = true;
		while (achou == false) {
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					boolean invalid = false;
					int k = x, l = y;
					for (int a = 0; a < bi.getWidth(); a++) {
						l = y;
						for (int b = 0; b < bi.getHeight(); b++) {
							if (bi.getRGB(a, b) != image.getRGB(k, l)) {
								invalid = true;
								break;
							} else {
								l++;
							}
						}
						if (invalid) {
							break;
						} else {
							k++;
						}
					}
					if (!invalid) {
						achou = true;
						System.out.println(acao + ": OK! " + acc);
						fail = false;
					}
				}
			}
		}
		if (fail) {
			System.out.println(acao + ": FAIL! " + acc);
			achou = false;
		}
		return achou;
	}

	public static void compararPixels(BufferedImage bi, double widthMult, double heigthMult, int count, int maxCount, String acao, String acc) throws HeadlessException, AWTException {
		boolean achou = false;
		boolean fail = true;
		boolean achouUm = false;
		while (achou == false && count < maxCount) {
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			for (int x = 0; x < image.getWidth(); x++) {
				for (int y = 0; y < image.getHeight(); y++) {
					boolean invalid = false;
					int k = x, l = y;
					for (int a = 0; a < bi.getWidth(); a++) {
						l = y;
						for (int b = 0; b < bi.getHeight(); b++) {
							if (bi.getRGB(a, b) != image.getRGB(k, l)) {
								invalid = true;
								break;
							} else {
								l++;
							}
						}
						if (invalid) {
							break;
						} else {
							k++;
						}
					}

					if (!invalid && !achouUm) {
						achou = true;
						achouUm = true;
						clickEvent(k - (bi.getWidth() * widthMult), l - (bi.getHeight() * heigthMult)); // Clica no centro do objeto
						System.out.println(acao + ": OK! " + acc);
						fail = false;
					}
				}
			}
			count++;
		}
		if (fail) {
			System.out.println(acao + ": FAIL! " + acc);
		}
	}

	public static void compararImagens(BufferedImage bi, double widthMult, double heigthMult, int count, int maxCount, String acao, String acc) throws HeadlessException, AWTException, IOException {
		if (acao == "Auxiliar") {
			for (int i = 0; i < 5; i++) {
				compararPixels(bi, widthMult, heigthMult, count, maxCount, acao, acc);
				clicarRapido(ImageIO.read(new File("C:\\Users\\Vitor\\Downloads\\PrintsFOE\\fechar.png")), "Fechar", acc);
			}
		} else {
			compararPixels(bi, widthMult, heigthMult, count, maxCount, acao, acc);
		}
	}
}