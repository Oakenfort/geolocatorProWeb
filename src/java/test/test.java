package test;

import bean.Position;
import bean.Smartphone;
import java.util.Date;
import bean.User;
import service.PositionService;
import service.SmartphoneService;
import service.UserService;

public class test {

    public static void main(String[] args) {
        /* UserService ss = new UserService();
         User[] users = new User[3];
         @SuppressWarnings("deprecation")
         Date d2 = new Date("09/01/2001");
         users[0] = new User("nom", "prenom", "telephone", "email", d2);
         users[1] = new User("nom", "prenom", "telephone", "email", d2);
         users[2] = new User("nom", "prenom", "telephone", "email", d2);
        
         SmartphoneService sm = new SmartphoneService();
         Smartphone[] smartphones = new Smartphone[3];
      
         smartphones[0] = new Smartphone("imei", 1);
         smartphones[1] = new Smartphone("imei", 2);
         smartphones[2] = new Smartphone("imei", 3);
         smartphones[3] = new Smartphone("imei", 1);
         //sm.create(smartphones[3]);
        
         System.out.println("================================ voila");
         for (Smartphone s : sm.utilisateurs(1)) {
         System.out.println(s);
         }
         */

        PositionService ps = new PositionService();
        Position[] positions = new Position[4];

        @SuppressWarnings("deprecation")
        Date d3 = new Date("09/01/2001");

        positions[0] = new Position("latitude", "latitude", d3, 1);
        positions[1] = new Position("latitude", "latitude", d3, 1);
        positions[2] = new Position("latitude", "latitude", d3, 1);
        positions[3] = new Position("latitude", "latitude", d3, 1);
        
        
        System.out.println("================================");
		@SuppressWarnings("deprecation")
		Date dd1=new Date("30/08/2001");
		@SuppressWarnings("deprecation")
		Date dd2=new Date("08/09/2001");

		 
		/* for(Position e : ps.firstBetween("nom",new java.sql.Date(dd1.getTime()),new java.sql.Date(dd2.getTime()))) {
		    	System.out.println(e);
		 }*/

         /* int nbr=ps.nbrPositionParSmart("imei");
         System.out.println(""+nbr);
       *//*  ps.create(positions[0]);
         ps.create(positions[1]);
         ps.create(positions[2]);*/
        /*   for (Position s : ps.findAll()) {
         System.out.println(s);
         }
      
         System.out.println("================================");
        
         Position p= ps.findById(2);
         System.out.println(p);
        
         /*ss.create(users[0]);
         ss.create(users[1]);
         ss.create(users[2]);/*
         */
        /*sm.create(smartphones[0]);
         sm.create(smartphones[1]);
         sm.create(smartphones[2]);*/
        /*System.out.println("================================cc");
        SmartphoneService sm = new SmartphoneService();

        for (Smartphone s : sm.utilisateurs("nommm")) {
            System.out.println(s);
        }
        System.out.println("================================cc");
        UserService ss = new UserService();

        User user = ss.findBynom("nommm");
        System.out.println(user);*/
        
        /*   System.out.println("================================");
         Smartphone s= sm.findById(2);
         System.out.println(s);

         System.out.println("================================");
         System.out.println("================================");
         System.out.println("================================");
         System.out.println("================================");
         /* for (User s : ss.findAll()) {
         System.out.println(s);
         }
         User s= ss.findById(2);
         System.out.println(s);
         */

        /* System.out.println("Modifier la Specialite avec id = 1");
         Specialite specialite = ss.findById(2);
         System.out.println("Specialite � modifier : " + specialite);		 
         Scanner sc = new Scanner(System.in);
         System.out.println("Donner le nouveau code :");
         specialite.setCode(sc.nextLine());
         System.out.println("Donner le nouveau libelle :");
         specialite.setLibelle(sc.nextLine());
         ss.update(specialite);
         System.out.println("================================");
         for(Specialite s: ss.findAll()) {
         System.out.println(s);
         }*/
        /* ProfesseurService ps = new ProfesseurService();
         Professeur []professeurs=new Professeur[3];
         @SuppressWarnings("deprecation")
         Date d1=new Date("08/04/2004");	
         @SuppressWarnings("deprecation")
         Date d2=new Date("09/01/2001");
         //machines[0]=new Machine("ref", "mar", 200, d1, 2) ;
         // public Professeur(String nom, String pernom, String telephone, String email, Date dateEmbauche, int specialite, String sexe)
         professeurs[0]=new Professeur("nom", "pernom", "telephone", "email", d1, 1,"male");
         professeurs[1]=new Professeur("nom", "pernom", "telephone", "email", d2, 2,"female");
		
         ps.create(professeurs[0]);
         ps.create(professeurs[1]);
         //ms.delete(ms.findById(4));
         for(Professeur p: ps.findAll()) {
         System.out.println(p);
         }*/

        /*System.out.println("================================");
		
         System.out.println("Modifier la machine avec id = 5");
         Machine machine = ms.findById(5);
         System.out.println("\tMachine � modifier : " + machine);		 
         Scanner sc = new Scanner(System.in);
         System.out.println("Donner le nouveau reference :");
         machine.setReference(sc.nextLine());
         System.out.println("Donner le nouveau prix :");
         machine.setPrix(sc.nextDouble());
         System.out.println("Donner le nouveau Date:");
         System.out.println("le jour");
         int jour=sc.nextInt();
         System.out.println("le mois");
         int mois=sc.nextInt();
         System.out.println("le annee");
         int annee=sc.nextInt();
         @SuppressWarnings("deprecation")
         Date d=new Date(annee-1900,mois-1,jour);
		
         machine.setDateAchat(d);	
         ms.update(machine);*/
        /*System.out.println("================================");
		
         for(Machine m: ms.findMachineByMarque("mar")) {
         System.out.println(m);
         }
         System.out.println("================================");
         for(Machine m: ms.findMachineBySalle(ss.findById(2))) {
         System.out.println(m);
         }*/
        /*System.out.println("================================");
         @SuppressWarnings("deprecation")
         Date dd1=new Date("09/01/2000");
         @SuppressWarnings("deprecation")
         Date dd2=new Date("08/08/2020");

		 
         for(Professeur e : ps.firstBetween(new java.sql.Date(dd1.getTime()),new java.sql.Date(dd2.getTime()))) {
         System.out.println(e);
         }
         System.out.println("par Spe===============================");
			
         for(Professeur p: ps.findProfParSp(1)) {
         System.out.println(p);
         }
         */
    }

}
