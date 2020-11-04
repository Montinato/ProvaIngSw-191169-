package it.unical.ingsw2020.ProvaLabINGSW;


import java.util.List;

/**
 * Hello world!
 *
 */
public class MyListUtil 
{

	public int[] ordina(int[] numeri,int scelta,int dimensione)
	{
	   int ordine[] = new int [dimensione];
	   
	   if(scelta == 1)		// Ordine crescente
	   {
		   int aiuto;
	   
		   for(int x = 0; x < dimensione; x++){
			   ordine[x] = numeri[x];
		   }

		   for(int x = 0; x < dimensione; x++) {
			   for (int y = (x + 1); y < 3; y++) {
				   if (ordine[x] > ordine[y]) {
        		   		aiuto = ordine[x];
        		   		ordine[x] = ordine[y];
        		   		ordine[y] = aiuto;	
                              }	}
	   				}
	   }
	   else
	   {
		   int aiuto;
	   
		   for(int x = 0; x < dimensione; x++){
			   ordine[x] = numeri[x];
	   		}

		   for(int x = 0; x < dimensione; x++) {
			   for (int y = (x + 1); y < 3; y++) {
				   if (ordine[x] <= ordine[y]) {
        		   		aiuto = ordine[x];
        		   		ordine[x] = ordine[y];
        		   		ordine[y] = aiuto;	
                              }	}
	   				}
	   }
	return ordine;
   }
	
	
	
	public static void main(String[] args) {
		System.out.println("");
	}
   
}
   
   
   
   
   