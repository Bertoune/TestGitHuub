import javafx.scene.shape.Circle;

public class Cellule {

	public boolean vivante;
	public boolean etatChange;
	int x, y; //coordonnes
	Cellule[][] grille;	
	Circle circle;
	
	public Cellule(Cellule [][]grille, int x, int y, boolean vivante) {
		  this.grille = grille;
		  this.vivante = etatChange = vivante; // on met a jour, pour savoir son etat d'avant.
		  this.x = x; //coords	
		  this.y = y; 
		  
	}
	
	void evoluer() {
		  int taille = grille.length;
		  
		  int CVA = 0; // compteur de Cellule vivante autour
		  
		   for(int i=-1; i<2; i++) 
		   {
			   int x2 = ((x+i)+taille); // si x+i=-1, xx=taille-1. si x+i=taille, xx=0
			   
			   for(int j=-1; j<2; j++) 
			   {
				   int y2 = ((y+j)+taille);
			   		
				   	if (i==0 && j==0) 
				   	{
				   		continue; 
				   	}
				   		
				   	if (grille[x2][y2].vivante) 
				   		{
				   			CVA++;
				   		}
			   }
		  }
		  etatChange = vivante;
		  
		  if (vivante && (CVA<2 || CVA>3)) 
			  {
			  	vivante = false;
			  }
		 else 
			 if (CVA ==3) vivante = true;
		
		}
		 
}
