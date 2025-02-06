public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "A";
        // CONDICIONAL SWITCH CASE

        
        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("PMEDIO");
                break;
            } case "G":{
                System.out.println("PGRANDE");
                break;
            } case "A":{
                System.out.println("ARLINDO");
                break;
            }
        }






        // CONDICIAL IF AND ELSE IF

        // if(sigla == "P")
        //     System.out.println("PEQUENO");
        // else if(sigla == "M")
        //     System.out.println("Médio");
        // else if(sigla == "G")
        //     System.out.println("Grande");
        // else
        //     System.out.println("INDEFINIDO");
    }
}
