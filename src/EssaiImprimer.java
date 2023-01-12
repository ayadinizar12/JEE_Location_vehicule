import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;




class MonDessin extends JPanel
{
  public void paint(JPanel pan)
    {
       
    }
}

  class EssaiImprimer extends JFrame implements  ActionListener
  {  
  
	  private static Object marque, modele;
	   private static String etat,
		 kilometrage,  prix, nom,  prenom,  securite_social,
		 adresse,  telephone,  numero_permis, numero,statut;
	   
	   
    JButton imprimer = new JButton("imprimer");
    ButtonGroup choix = new ButtonGroup();
    JRadioButton choixTout = new JRadioButton("tout", false);
    JRadioButton choixDessin = new JRadioButton("dessin", true);
    JPanel pan = new JPanel();
    
    JPanel p = new JPanel();
    EssaiImprimer()
    {
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
    	setTitle("Contrat de Location");
    	Border[] listBorder = {	
				BorderFactory.createEtchedBorder(Color.black, Color.GRAY),
				
				
					
			};
    	Statement state;
        try {
  			state = Connect.getInstance().createStatement();
  			String requete = "INSERT INTO facture(nom,prenom,nss,adresse,tel,permis,etat,marque,modele,numero_meneralogique,kilometrage,prix,statut) VALUES ('"+nom+"', ' "+prenom+"', ' "+securite_social+"',' "+adresse+"',' "+telephone+"', ' "+numero_permis+"',' "+statut+"',' "+marque+"', ' "+modele+"', ' "+numero+"',' "+kilometrage+"', ' "+prix+"',' "+etat+"') ";
  			int resultat = state.executeUpdate(requete);
  			requete = "INSERT INTO client(nom,prenom,nss,adresse,tel,permis,etat) VALUES ('"+nom+"', ' "+prenom+"', ' "+securite_social+"',' "+adresse+"',' "+telephone+"', ' "+numero_permis+"',' "+statut+"') ";
  			resultat = state.executeUpdate(requete);
  			requete = "UPDATE vehicule SET statut = 'sortie'WHERE modele = '"+modele+"' ";
			resultat = state.executeUpdate(requete);
  			state.close();
  			/*
  			*/
  		} catch (SQLException e1) {
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		} catch (ClassNotFoundException ex) {
                  Logger.getLogger(EssaiImprimer.class.getName()).log(Level.SEVERE, null, ex);
              }
	
		JPanel info_societe = new JPanel();
		
		
		JLabel jlb = new JLabel(new ImageIcon("images/enfer.jpg"));
		jlb.setPreferredSize(new Dimension(300, 320));
		jlb.setBackground(Color.white);
	
		//info societe
		info_societe.add(jlb);
		info_societe.setBackground(Color.white);
		
		
		JPanel info_client = new JPanel();
		
		JLabel nom_prenom = new JLabel("Client : "+nom+ " "+prenom);
		JLabel adresse1 = new JLabel("Adresse : "+adresse);
		JLabel nss = new JLabel("Numero CIN : "+securite_social);
		JLabel tel = new JLabel("Telephone : "+telephone);
		JLabel permis = new JLabel("Numero du permis : "+numero_permis);
		
//info client
		info_client.add(nom_prenom);
		info_client.add(adresse1);
		info_client.add(nss);
		info_client.add(tel);
		info_client.add(permis);
	
		
		info_client.setBackground(Color.white);
		info_client.setBorder(listBorder[0]);
		info_client.setPreferredSize(new Dimension(200, 150));
		
		//info vehicule
		
		JPanel info_vehicule = new JPanel();
		
		Object[][] data = {	{"Location", marque, modele,  kilometrage,numero,prix}
			
		};

		String  title[] = {"Designation ", "Marque ", "Modele ",  "Kilometrage ", "Matricule ", "Prix "};
		JTable tableau = new JTable(data, title);
		
		
		JScrollPane pane = new JScrollPane(tableau);
		pane.setPreferredSize(new Dimension(580, 35));
		pane.setBackground(Color.white);
		info_vehicule.add(pane );
		info_client.setBackground(Color.white);
		info_vehicule.setBackground(Color.white);
		
		
		JPanel condition = new JPanel();
		String str = "Le prix de Location est  de : " +prix+ " Dinar par Jour";
		String str1 = "Tout Retard sera Facture par : 200 Dinar par jour";
		String str2 = " ";
		String str3 = "Tous retard Depassant 2  heures sera facture par un jour de retard ";
		String str4 = " ";
		String str5 ="Le locataire declare avoir recu la voiture en bon etat, et dans le ";
		String str6 = " ";
		String str7 ="cas d une eventuelle panne ou accedent, le locataire  promis d aviser la";
		String str8 =" ";
		String str9 ="de retourner a la societe.";
		String str10 =" ";

			
		JLabel bel = new JLabel(str);
		JLabel bel1 = new JLabel(str1);
		JLabel bel2 = new JLabel(str2);
		JLabel bel3 = new JLabel(str3);
		JLabel bel4 = new JLabel(str4);
		JLabel bel5 = new JLabel(str5);
		JLabel bel6 = new JLabel(str6);
		JLabel bel7 = new JLabel(str7);
		JLabel bel8 = new JLabel(str8);
		JLabel bel9 = new JLabel(str9);
		JLabel bel10 = new JLabel(str10);
		
		
		
		condition.setPreferredSize(new Dimension(500, 300));
		condition.add(bel);
		condition.add(bel1);
		condition.add(bel2);
		condition.add(bel3);
		condition.add(bel4);
		condition.add(bel5);
		condition.add(bel6);
		condition.add(bel7);
		condition.add(bel8);
		condition.add(bel9);
		condition.add(bel10);
		condition.setBackground(Color.white);
		
      pan.add(info_societe);
      pan.add(info_client);
      pan.add(info_vehicule);
      pan.add(condition);
      
      pan.setBackground(Color.white);
      Container interieur = getContentPane();
      
      choix.add(choixTout);
      choix.add(choixDessin);
    
      imprimer.setPreferredSize(new Dimension(100, 20));
      JPanel impr = new JPanel();
      impr.add(imprimer);
      pan.setPreferredSize(new Dimension(600, 800));
      interieur.add(pan, BorderLayout.CENTER);
      interieur.add(impr, BorderLayout.SOUTH);

      imprimer.addActionListener(this);
      addWindowListener(new WindowAdapter()
  	      {
  		public void windowClosing(WindowEvent evt)
  		  {
  		    setVisible(false);
  		  }
  	      });
    }

    public EssaiImprimer(String numero, Object marque, Object modele,
			String etat, String kilometrage, String prix, String nom,
			String prenom, String adresse, String tel, String permis, String nss) {
		// TODO Auto-generated constructor stub
    	this.numero = numero;
		this.marque = marque;
		this.modele = modele;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.etat = etat;
		this.statut ="servis";
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = tel;
		this.numero_permis = permis;
		this.securite_social = nss;
	}



	public EssaiImprimer(String nom, String prenom, String nss,
			String adresse, String tel, String permis, String etat,
			String marque, String modele, String numero, String kilometrage,
			String prix, String statut) {
		// TODO Auto-generated constructor stub
		
		this.numero = numero;
		this.marque = marque;
		this.modele = modele;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.etat = etat;
		this.statut =statut;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = tel;
		this.numero_permis = permis;
		this.securite_social = nss;
	}

	public void actionPerformed(ActionEvent e)
    {
      Properties props = new Properties();

      props.put("awt.print.paperSize", "a4");
      props.put("awt.print.destination", "printer");

      
      PrintJob pJob = getToolkit().getPrintJob(this,
  			  nom+prenom, props);
      if (pJob != null)
        {
          Graphics pg = pJob.getGraphics();
          if (choixTout.isSelected()) printAll(pg);
          else pan.printAll(pg);
          pg.dispose();
          pJob.end();
        }
	
    }

 
  }