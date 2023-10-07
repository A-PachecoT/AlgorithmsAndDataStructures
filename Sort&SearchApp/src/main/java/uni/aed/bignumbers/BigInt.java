/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.bignumbers;

/**
 *
 * @author AndreP
 */
public class BigInt {
    private static final char LESS = '-';
    
    private Node head;
    private byte sign;  // 1: Positive; -1: Negative
           
    
    // CONSTRUCTORS
    public BigInt(){
        this("");
    }   
    
    public BigInt(long value){
        this("" + value);
    }   
    
    public BigInt(String value){
    /*
        Consideramos que la cadena de entrada tiene uno o más dígitos opcionales,
        precedidos por el signo negativo
        FORMATO:
        [<signo menos>] <digito>+
        [ ] : Componente opcional
        + : Una o más repeticciones
        
        Nota: la cadena "0000345" es válida, pero el proceso de conversión
        ignorará los ceros precedentes. 
        Más detalles en la función extractPrecedentZeros
        */
    
        value.trim();
        // 1. Determinamos el signo, por defecto positivo (1)
        sign = +1;
        
        if (value.charAt(0) == LESS){
            sign = -1;
            value = value.substring(1); // Remueve el '-'
        }
        
        // 2. Extraemos los ceros precedentes
        value = extractPrecedentZeros(value);
        
        /*
        El número cero puede tener varias formas en la entrada de string 
        (Ej: "00000", "-000", "0")
        Internamente se representará como positivo, +0.
        `extractPrecedentZeros` ya returna la string nula, pero todavía no hemos
        anulado el negativo:
        */
        if(value.equals("0")){
            sign = +1;
        }
        
        // 3. Creamos la lista enlazada de grupos de tres dígitos
        head = new Node(); // Se crea un nodo temporal
        Node tail = head; 
        String digits;
        while(!value.equals("")){
            // Se calcula la localización del primer índice del substring
            // que consta de 3 dígitos o menos.
            int loc = Math.max(value.length() - Node.MAX_DIGITS, 0);
            
            digits = value.substring(loc); 
                                // Se extraen como máximo MAX_DIGITS dígitos (3)
                                // Si hay <3 dígitos, se corta todo

            // Actualizamos el número (sin el substring extraído previamente)
            value = value.substring(0,loc);
                                // En el caso de loc=0 se tiene una string ""
            
            
            Node block = new Node(digits);
            
            tail.next= block;
            tail = block;
        }
        head = head.next; // Remueve el nodo head ficticio inicial
            
    }   
    
    public BigInt (Node head){
        this.head = head;
        this.sign =  +1;
    }
   
    // ARITHMETIC OPERATIONS
    public BigInt sum(BigInt num){
        return this.sumPos(num);    // Suma sólo dos valores POSITIVOS
    }
    public BigInt sumPos(BigInt num){
        Node p, q, r, t;
        p = this.head;
        q = num.head;
        
        t = new Node(); //TEMP head
        r = t;
        short carry = 0;
        while(p != null && q != null){
            short sum = (short) (carry + p.value + q.value);
            
            r.next = new Node();
            r = r.next;
            
            r.value = (short) (sum % Node.MAX_VALUE);   //Calculo de la suma
            carry = (short) (sum / Node.MAX_VALUE);     //Calculo del acarreo
            
            // Siguientes 2 bloques a sumar
            p = p.next;
            q = q.next;
        }
        
        p = (p == null) ? q: p;  // Restablece p para apuntar 
                                 //a los bloques restantes
        
        while(p != null){
            r.next = new Node();
            r = r.next;
            
            r.value = (short) ((p.value + carry) % Node.MAX_VALUE);
            carry = (short) ((p.value + carry) / Node.MAX_VALUE);
            p = p.next;
        }
                       
        if(carry > 0){  //Desbordamiento
            r.next = new Node((short) carry);
        }
        return new BigInt(t.next);  //Quita el nodo cabeza ficticio
    }
    public BigInt subtraction(BigInt num){
        return new BigInt();
    }
    public BigInt mult(BigInt num){
        return new BigInt();
    }
    public BigInt div(BigInt num){
        return new BigInt();
    }
    
    public int compareTo(BigInt bi){
        return 0;
    }
    
    @Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("");
        
        /*
        Digamos que tenemos el bloque de value = 7,
        si hay un bloque que le sigue (next diferente de null),
        se tiene que rellenar los ceros precedentes, esto es
        insertar la string "007" en el buffer
        */
        String format = "%0" + Node.MAX_DIGITS + "d";
        Node p = head;
        while (p.next != null){
            strBuf.insert(0, String.format(format, p.value));
            p = p.next; // Se recorre el siguiente bloque 
        }
        strBuf.insert(0, p.value);  // Se agrega el bloque más significativo
                                           // No se requiere rellenar con ceros
                                           
        if(sign < 0){   // Agregamos el signo si es negativo
            strBuf.insert(0, "-");
        }
        
        return strBuf.toString();
    }
    
    
    private static String extractPrecedentZeros(String str){
        StringBuffer strBuf = new StringBuffer(str);
        int length = strBuf.length();
        for(int i = 0; i < length; i++){
            if (strBuf.charAt(0) == '0') // Eliminamos el primer cero
                strBuf.deleteCharAt(0);
        }
        if(strBuf.length() == 0)
            strBuf.append('0');
        return strBuf.toString();
    }
    
    
    public static void main(String[] args) {
        BigInt [] eg = new BigInt[7] ;
        eg[0] = new BigInt ("12345678") ;
        eg[1] = new BigInt ("-45");
        eg[2] = new BigInt ("419284312218947");
        eg[3] = new BigInt ("-000000000000000000000");
        eg[4] = new BigInt (123456789) ;
        eg[5] = new BigInt (-45);
        eg[6] = new BigInt (777);
        for (int i = 0; i < eg.length; i++) {
            System.out.println(i + ":\t" + eg[i].toString());
        }
        
        //Trying arithmetic operations:
        BigInt bsum = eg[0].sum(eg[6]);
        System.out.println(bsum.toString() + "\t" + (12345678 + 777));
        
    }
    
    
}
