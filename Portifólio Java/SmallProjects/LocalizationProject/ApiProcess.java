public class ApiProcess {
    // set attributes -----------------------------------------------------------------
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    // set annotations -----------------------------------------------------------------
    @Override
    public String toString() {
        return "Street: " + logradouro + "\n" +
                "neighborhood: " + bairro + "\n" + "location: " + localidade + " (" + uf + ")" +
                "\n" + "CEP: " + cep;
    }

    // set methods -------------------------------------------------------------------------------

    public static boolean verificationCep(String cep) {
        if (cep.length() != 8) {
            System.out.println("Check your CEP again or check if is available in Brazil request ");
            return false;
        } else {
            return true;
        }
    }
}
