/**
 * Classe do mouse
 * @author tiago
 */

public class Mouse {

//Clique esquerdo do mouse
    private int cliqueEsquerdo;

//Clique direito do mouse
    private int cliqueDireito;

//Scroll do mouse
    private int scroll;

    public int getCliqueEsquerdo() {
        return cliqueEsquerdo;
    }

    public void setCliqueEsquerdo(int cliqueEsquerdo) {
        this.cliqueEsquerdo = cliqueEsquerdo;
    }

    public int getCliqueDireito() {
        return cliqueDireito;
    }

    public void setCliqueDireito(int cliqueDireito) {
        this.cliqueDireito = cliqueDireito;
    }

    public int getScroll() {
        return scroll;
    }

    public void setScroll(int scroll) {
        this.scroll = scroll;
    }
}
