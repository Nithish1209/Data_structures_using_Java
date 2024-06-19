class A {
     public static void main(String args[])
     {
        System.out.println(" ***********************************");
        String nimmi = " this is  \"nithish jaligapu\"";
        System.out.println(nimmi);
        String a ="hello  all welcome \\ to java program";
        
         String[] b = a.split(" ");
         for(int i=0; i<b.length; i++)
         System.out.print(b[i]); 
         System.out.println();
         System.out.println(nimmi.toUpperCase());
         String nithu = " THIS IS CCONVERTING TO SAMLL CASE";
         System.out.println(nithu.toLowerCase());
         System.out.println(nimmi.indexOf("nit"));
       System.out.println(nimmi.concat(nithu));
     }
}