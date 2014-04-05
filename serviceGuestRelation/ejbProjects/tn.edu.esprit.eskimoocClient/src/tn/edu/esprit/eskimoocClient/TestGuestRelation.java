package tn.edu.esprit.eskimoocClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.eskimooc.services.interfaces.GuestRelationRemote;

public class TestGuestRelation {

	public static void main(String[] args) { 
		try {
			//esplacement memoire o� on peut abr�que le proxy
			Context context = new InitialContext();
			
/*service guest relation via interface romote */
			
			String JndiName = "ejb:/tn.edu.esprit.eskimooc/GuestRelation!"
					+ GuestRelationRemote.class.getCanonicalName();
	
			/*jndi:il va pointer sur la racine*/ 
			GuestRelationRemote guestRelationRemote = (GuestRelationRemote) context
					.lookup(JndiName);

					guestRelationRemote.SayAhla("haythem");			
		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
