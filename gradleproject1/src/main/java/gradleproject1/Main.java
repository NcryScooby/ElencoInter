package gradleproject1;

public class Main {

 
    public static void main(String[] args) {
        
        System.out.println("\t\tAtacantes");
        System.out.println("==========================================");
        System.out.println("");
        
        ElencoInter e1 = new ElencoInter("Guerrero", 37, 1.85f, 82f, "Centro-Avante", 9);
        e1.status();
              
        ElencoInter e8 = new ElencoInter("Yuri Alberto", 20, 1.83f, 78f, "Centro-Avante", 11);
        e8.status();
               
        System.out.println("\t\tMeio-Campistas");
        System.out.println("=============================================");
        System.out.println("");
        
        ElencoInter e3 = new ElencoInter("Edenilson", 31, 1.75f, 76f, "Meio-Campo", 8);
        e3.status();       
        
        ElencoInter e4 = new ElencoInter("Patrick", 29, 1.77f, 78f, "Meio-Campo", 88);
        e4.status();
               
        ElencoInter e6 = new ElencoInter("Taison", 33, 1.72f, 64f, "Meia-Atacante", 10);
        e6.status();
        
        System.out.println("\t\tVolantes");
        System.out.println("========================================");
        System.out.println("");
        
        ElencoInter e9 = new ElencoInter("Rodrigo Dourado", 27, 1.86f, 80f, "Volante", 13);
        e9.status();
        
        System.out.println("\t\tLaterais-Direitos");
        System.out.println("==================================================");
        System.out.println("");
        
        ElencoInter e5 = new ElencoInter("Saravia", 28, 1.78f, 63f, "Lateral-Direito", 26);
        e5.status();      
        
        ElencoInter e7 = new ElencoInter("Heitor", 20, 1.74f, 67f, "Leteral-Direito", 2);
        e7.status();    
        
        System.out.println("\t\tLaterais-Esquerdos");
        System.out.println("==================================================");
        System.out.println("");
        
        ElencoInter e10 = new ElencoInter("Moises", 26, 1.81f, 77f, "Leteral-Esquerdo", 20);
        e10.status(); 
            
        System.out.println("\t\tZagueiros");
        System.out.println("==========================================");
        System.out.println("");
        
        ElencoInter e2 = new ElencoInter ("Cuesta", 32, 1.87f, 84f, "Zagueiro", 15);
        e2.status(); 
        
        System.out.println("\t\tGoleiros");
        System.out.println("==========================================");
        System.out.println("");
        
        ElencoInter e11 = new ElencoInter ("Daniel", 27, 1.88f, 82f, "Goleiro", 42);
        e11.status();
        
    }
    
}

