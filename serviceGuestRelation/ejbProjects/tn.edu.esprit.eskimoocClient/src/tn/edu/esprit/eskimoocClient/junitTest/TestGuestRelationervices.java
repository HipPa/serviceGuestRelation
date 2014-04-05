package tn.edu.esprit.eskimoocClient.junitTest;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.edu.esprit.eskimooc.services.interfaces.GuestRelationRemote;

public class TestGuestRelationervices {

	private Context context;

	private GuestRelationRemote guestRelationRemote;

	@Before
	public void init() {
		try {
			context = new InitialContext(); // situ� dans la racine du l'arbre
											// JNDI

			String jndiName = "ejb:/tn.edu.esprit.eskimooc/GesutRelation!"+ GuestRelationRemote.class.getCanonicalName;
			guestRelationRemote = (GuestRelationRemote) context
					.lookup(jndiName);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   @Test
   public void testSayAhla(){
   return Assert.assertEquals("ahla: haythem ");
   }
}
