package estudo.dev.maratonajava.introducao;

public class music {
    public static void main(String[] args) {
        String linhaPausa = "Monitoring you, like machines do (will not)\n" +
                "You've still got it, I'm just keeping an eye\n";

        boolean pausaFeita = false;

        for (int i = 0; i < linhaPausa.length(); i++) {

            char letra = linhaPausa.charAt(i);
            System.out.print(letra);


            if (!pausaFeita
                    && i + 1 >= linhaPausa.length()
                    && linhaPausa.substring(i - linhaPausa.length() + 1, i + 1).equals(linhaPausa)) {

                try {
                    Thread.sleep(15000); // 14 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                pausaFeita = true;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String trecho =
                "You know you're better than this\n" +
                        "Can't make a start\n" +
                        "Got your heart in a headlock\n" +
                        "No, I don't believe any of it \n" +
                        "You say too late to start \n" +
                        "With your heart in a headlooock \n" +
                        "You know you're better than this\n \n" +
                        "Afraid to start  \n" +
                        "Got your heart in a headlock \n" +
                        "I don't believe any of it \n" +
                        "You say too late to start\n" +
                        "With your heart in a headlock\n" +
                        "You know you're better than this";

        for (int i = 0; i < trecho.length(); i++) {
            char letra = trecho.charAt(i);
            System.out.print(letra);

            try {
                if (letra == '-') {
                    Thread.sleep(35);        // ligação rápida do "la-la"
                } else if (letra == 'L' || letra == 'a') {
                    Thread.sleep(90);        // batida principal
                } else if (letra == ',') {
                    Thread.sleep(79);       // respiro curto
                } else if (letra == ' ') {
                    Thread.sleep(70);        // espaço quase colado
                } else if (letra == '\n') {
                    Thread.sleep(420);       // troca de verso
                } else if (letra == ' ') {
                    Thread.sleep(160);
                } else {
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
