package businessFunctions;

import java.io.IOException;

import drivers.WebActions;


public class ReusableFunctions extends WebActions {
	
	public String CreateCCR() throws Exception {
		
		//################################## CCR -Engagement Details
		
		loadUrl("DCCSURL");
		waitUntil("create", "waitUntil");
		hover("create");
		//click("create");
		waitUntil("menuconflictcheckrequest","exist");
		hover("menuconflictcheckrequest");
		click("menuconflictcheckrequest");
		waitUntil("engagementdetailsoffice", "exist");
		click("engagementdetailsoffice");
		type("engagementdetailsoffice", "Office Name");
		click("serviceofferring");
		iFrameSwitch("IframeObject");
		waitUntil("duediligence", "exist");
		click("duediligence");
		click("serviceofferingselectionform");
		exitFrame();
		refreshPage();
		//sync();
		waitUntil("IframeObject","notexist");
		sync();
		//waitUntil("engagementprojectname", "notexist");
		waitUntil("engagementprojectname", "exist");
		type("engagementprojectname", "EngagementName");
		type("engagementprojectdetails", "EngagementProjectDesc");
		waitUntil("willtheengagementinvolvedeloitte","exist");
		click("willtheengagementinvolvedeloitte");
		click("isthisarecurringengagement");
		click("isthisengagementaninbound");
		click("willtheengagementteamhaveaccesstoinsideinformation");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");
		refreshPage();
		sync();
		
		//################################# CCR - Engagement Team 
		waitUntil("engagementteam", "exist");
		click("engagementteam"); 
		waitUntil("saveascomplete","exist");
		String conflictRequestid = getText("CCR_ID");
		//String Request_Id = split(Requestsubmissionmessage," ",1);
		waitUntil("leadengagementpartnersearch", "exist");
		waitUntil("basisofengagementtypeistimebasis", "exist");
		click("basisofengagementtypeistimebasis");
//		waitUntil("leadengagementpartnersearch", "exist");
		click("leadengagementpartnersearch");
		waitUntil("leadengagementpartnerusername", "exist");
		type("leadengagementpartnerusername", "LEPName");
		click("leadengagementmanagerpopupfind");
		waitUntil("leadengagementpartnernameselect", "exist");
		click("leadengagementpartnernameselect");
		click("leadengagementpartnerAddselecteduser");
//		sync();
		waitUntil("LEP_Popup","notexist");
		waitUntil("verifyLEPid","exist");
		waitUntil("leadengagementmanagerengagementqualityreviewersearchicon", "exist");
		click("leadengagementmanagerengagementqualityreviewersearchicon");
		waitUntil("leadengagementmanagerusername", "exist");
		type("leadengagementmanagerusername", "LEPName");
		click("leadengagementmanagerengagementqualityreviewerfind");
		waitUntil("leadengagementpartnernameselect","exist");
		click("leadengagementpartnernameselect");
		click("Leadengagementmanageraddselecteduser");
		waitUntil("LEM_Popup","notexist");
		waitUntil("verifyLEMid","exist");
		click("arethereotherservicelinesparticipatinginthisengagement");
		click("willyoubeprovidingservicesdirectly");
		click("willthisengagementrequirepersonnel");
		click("willthedeliverablebeintended");
		click("willpersonnelfromanotherlocationoutside");
		waitUntil("saveascomplete","exist");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");
		refreshPage();
		sync();
		
		//################################# CCR - Add Entity  ################################# 
		waitUntil("addnewentity", "exist");
		click("addnewentity");
		waitUntil("entitytype", "exist");
		click("entitytype");
		waitUntil("entityrole","exist");
		type("entityrole","Client");
		type("entityname", "entitynamedata");
		type("locallanguagename", "locallanguagenamedata");
		type("streetaddress", "streetaddressdata");
		type("city", "citydata");
		type("stateregion", "stateregiondata");
		type("zipcode", "zipcodedata");
		type("location", "Locationdata");
		click("willthisindividualbeaclientonthis");
		waitUntil("addnewentitysaveascomplete", "exist");
		click("addnewentitysaveascomplete");
		sync();
		waitUntil("DeleteRequestbutton","exist");
		refreshPage();
        sync();
  
		//################################# CCR - Requestor Checklist #################################
		waitUntil("requestorchecklist", "exist");
		click("requestorchecklist");
		waitUntil("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP","exist");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparent");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");

		//################################# Business Relationship Request #################################
		waitUntil("Submitfinalrequest","exist");
		click("Submitfinalrequest");
		waitUntil("RequestSubmit_Okbutton","exist");
		//String Requestsubmissionmessage = getText(Request_Id);
		//String Request_Id = split(Requestsubmissionmessage," ",1);
		click("RequestSubmit_Okbutton");
		//sync();
		waitUntil("Requestid_Window","notexist");
		//System.out.println(CCRID);
		//zoom("100");
		//sync();
		/*
		waitUntil(Sort_RequestId,"Sort_RequestId");
		click(Sort_RequestId,"Sort_RequestId");
		//sync();
		waitUntil(Sort_Asc, "Ordered Ascending Image");
		waitUntil(Sort_RequestId,"Sort_RequestId");
		click(Sort_RequestId,"Sort_RequestId");
		//sync();
		waitUntil(Sort_Desc, "Ordered Descending Image");
		By id1 = By.xpath("//a[text()='"+Request_Id+"']");
		waitUntil(id1,"Requested ID Created");
		*/
		return conflictRequestid;  
	}
}
