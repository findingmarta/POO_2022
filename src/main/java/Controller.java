public class Controller {
    public static void run() {
        Estado estado = new Estado();
        //boolean errorMessage = false;

        while (true) {
            int opcao = -1;
            while (opcao < 0 || opcao > 7) opcao = Menu.MenuInicial();
            switch (opcao) {
                case 1-> ControllerCasa.run(estado);
               // case 2-> ControllerFornecedores.run(estado);
                case 3-> ControllerEstado.run(estado);
                case 4-> ControllerSimulacao.run (estado);
                case 0-> {
                    System.exit (0);
                }
            }
        }
    }
}