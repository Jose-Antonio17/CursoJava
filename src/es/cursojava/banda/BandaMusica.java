package es.cursojava.banda;

public class BandaMusica {

    private Instrumento[] banda;

    public static void main(String[] args) {

        BandaMusica banda = new BandaMusica();
        Instrumento[] bandaInsturmentos = banda.empezarConcierto();
        banda.afinarInstrumentos(bandaInsturmentos);
        banda.tocarInstrumentos(bandaInsturmentos);

    }

    private Instrumento[] empezarConcierto() {
        Guitarra guitarra1 = new Guitarra("guitarra", "Instrumeto de cuerda", false, 6);
        GuitarraElectrica guitarraElectrica1 = new GuitarraElectrica("guitarra eléctrica", "Instrumetos de cuerda",
                false, 6, 50);
        Piano piano1 = new Piano("piano", "Instrumetos de cuerda", false, 7, "cola");
        Tambor tambor1 = new Tambor("tambor", "Instrumentos de percusión", false, "fibra");

        Instrumento[] banda = { guitarra1, guitarraElectrica1, piano1, tambor1 };

        return banda;
    }

    private void afinarInstrumentos(Instrumento[] banda) {
        for (Instrumento instrumento : banda) {
            instrumento.afinar();
        }
    }

    private void tocarInstrumentos(Instrumento[] banda) {
        boolean afinados = true;
        for (Instrumento instrumento : banda) {
            if (instrumento.getNombre().equals("tambor")) {
                Tambor tambor2 = (Tambor) instrumento;
                tambor2.aporrear();
            } else {
                instrumento.tocar(instrumento.getNombre());
            }
        }
        for (Instrumento instrumento : banda) {
            if (!instrumento.getAfinado()) {
                System.out.println("La " + instrumento.getNombre() + " no esta afinado");
                afinados = false;
            }
        }
        if (!afinados) {
            System.out.println("La banda suena mal");
        } else {
            System.out.println("La banda suena bien");
        }
    }

}
