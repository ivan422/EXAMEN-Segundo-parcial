package examenhash;


public class Hash {
    
    
    public int sumarDigitos(int numeros){
        
        String numero = String.valueOf(numeros);
        int suma=0;
        System.out.println(numero);
        
        char[] digitos = numero.toCharArray();

        for(int i = 0; i < digitos.length; i++) {
            System.out.println(digitos[i]);
            suma += Character.getNumericValue(digitos[i]);
        }
        return suma;
    }
    
    public int hashSimple(int matricula){
        int hash=sumarDigitos(matricula);
        int hashSimple =sumarDigitos(hash);
        return hashSimple;
    }
    
    public String calificacion(int matricula){
        int hash=sumarDigitos(matricula);
        int sumaCaracteres =sumarDigitos(hash);
        String estado="";
        
        if(sumaCaracteres>=0&&sumaCaracteres<=6){
            estado="Reprobado";
        }else if(sumaCaracteres>=7&&sumaCaracteres<=9){
            estado="Aprovado";
        }else if(sumaCaracteres>=10){
            estado="Excelente";
        }
        
        return estado;
    }
    
}
