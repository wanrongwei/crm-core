/**
 * AKSopenSoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.crm.util.BeanUtils;

public class AKSopenClient extends Stub  {
	
	private  static Log log = LogFactory.getLog(AKSopenClient.class);
	
    private static AKSopenSoap_PortType client = null;
    
    static{
    	try {
			client = new AKSopenLocator().getAKSopenSoap();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
    }

	public Map tilmeldPerson(Map map) throws Exception {
		String aksnoegle = (String)map.get("Aksnoegle");
		String akskode = (String)map.get("Akskode");
		String brugernavn = (String)map.get("Brugernavn");
		String password = (String)map.get("Password");
		String referenceNummer = (String)map.get("ReferenceNummer");
		String navn = (String)map.get("Navn");
		String adresse = (String)map.get("Adresse");
		String postnummer = (String)map.get("Postnummer");
		String koen = (String)map.get("Koen");
		String foedselsdato = (String)map.get("Foedselsdato");
		String cPRnummer = (String)map.get("CPRnummer");
		TilmeldData resp = client.tilmeldPerson(aksnoegle, akskode, brugernavn, password, referenceNummer, navn, adresse, postnummer, koen, foedselsdato, cPRnummer);
		Map outMap = BeanUtils.getProperties(resp);
		return outMap;
	}

	public Map tilmeldFirmaKob(Map map) throws Exception {
		
		String aksnoegle = (String)map.get("Aksnoegle");
		String akskode = (String)map.get("Akskode");
		String brugernavn = (String)map.get("Brugernavn");
		String password = (String)map.get("Password");
		String referenceNummer = (String)map.get("ReferenceNummer");
		String kOBnummer = (String)map.get("KOBnummer");
		TilmeldData resp = client.tilmeldFirmaKob(aksnoegle, akskode, brugernavn, password, referenceNummer, kOBnummer);
		Map outMap = BeanUtils.getProperties(resp);
		return outMap;
	}

    public Map tjek(Map map) throws Exception {
        
        String aksnoegle = (String)map.get("Aksnoegle");
		String akskode = (String)map.get("Akskode");
		String brugernavn = (String)map.get("Brugernavn");
		String password = (String)map.get("Password");
		TjekListe list = client.tjek(aksnoegle, akskode, brugernavn, password);
		Map outMap = BeanUtils.getProperties(list);
		return outMap;
    }


    public Map afmeld(Map map) throws Exception {
    	
        String aksnoegle = (String)map.get("Aksnoegle");
		String akskode = (String)map.get("Akskode");
		String brugernavn = (String)map.get("Brugernavn");
		String password = (String)map.get("Password");
		String referenceNummer = (String)map.get("ReferenceNummer");
		AfmeldData resp = client.afmeld(akskode, brugernavn, password, referenceNummer);
		Map outMap = BeanUtils.getProperties(resp);
		return outMap;
    }

	public Map effektueret(Map map) throws Exception {
		
		String aksnoegle = (String)map.get("Aksnoegle");
		String akskode = (String)map.get("Akskode");
		String brugernavn = (String)map.get("Brugernavn");
		String password = (String)map.get("Password");
		String beskedId = (String)map.get("BeskedId");
		String referenceNummer = (String)map.get("Referencenummer");
		EffektueretData resp = client.effektueret(aksnoegle, akskode, brugernavn, password, referenceNummer, beskedId);
		Map outMap = BeanUtils.getProperties(resp);
		return outMap;
	}
	
	
	public static void main(String[] args) throws Exception{
		AKSopenClient client = new AKSopenClient();
		Map map = client.tjek(new HashMap());
		
		ArrayList dataList=(ArrayList) map.get("TjekListe");
		for (Object object : dataList) {
			Map data = (Map)object;
			String type=(String) data.get("BeskedType");
			if("9".equals(type)){
				Map kredit = (Map)((Map)data.get("PersonData")).get("Kreditadvarsel");
				System.out.println(kredit.get("AendretDato"));
				System.out.println(kredit.get("_value"));
				break;
			}
		}
		
		AKSopenClient client2 = new AKSopenClient();
		Map map2 = client2.tjek(new HashMap());
//		System.out.println(map);
	}

}
