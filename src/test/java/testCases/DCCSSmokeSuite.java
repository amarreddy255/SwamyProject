package testCases;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import businessFunctions.ReusableFunctions;
import drivers.WebActions;

public class DCCSSmokeSuite extends ReusableFunctions {
  
	public static String CCRID;
	public static String CCRID1;
	public static String BRRID;
	public static String ORID;
	public static String CCRID_MultipleEntities;
	
	
	@Test
 	public void CreateCCR1() throws Exception {
		CCRID = CreateCCR();
	}
	
	@Test
	public void CreateCCR2() throws Exception {
		CCRID1 = CreateCCR();
	}
	
	@Test
	public void CreateBRR() throws Exception {
		
		//********************************** BBR -Engagement Details
		loadUrl("DCCSURL");
		waitUntil("create", "exist");
		hover("create");
		click("create");
		waitUntil("createbusinessrelationshiprequestmenu","exist");
		click("createbusinessrelationshiprequestmenu");
		waitUntil("engagementdetailsoffice", "exist");
		click("engagementdetailsoffice");
		type("engagementdetailsoffice", "Office Name");
		waitUntil("arethereservicelinesparticipatinginthisbusinessrelationship","exist");
		click("arethereservicelinesparticipatinginthisbusinessrelationship");
		waitUntil("businessrelationtype","exist");
		hover("businessrelationtype");
		click("businessrelationtype");
		waitUntil("businessmarketplaceexpand", "exist");
		click("businessmarketplaceexpand");
		waitUntil("Alliance", "exist");
		click("Alliance");
		waitUntil("pleasedescribethenatureofthebusinessrelationship", "exist");
		type("pleasedescribethenatureofthebusinessrelationship", "providing a value for nature of business relationship ");	 
		type("otherinformationbusinessrelationshippage", "otherinformationbusinessrelationshippage");	 
		waitUntil("willthebusinessrelationshipprovide", "exist");
		click("willthebusinessrelationshipprovide");
		waitUntil("saveascomplete", "exist");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");
		
		//************************************** CCR - Engagement Team **********************************************************//
		waitUntil("businessrelationshipteam","exist");
		click("businessrelationshipteam"); 
		
		//String Request_Id = split(Requestsubmissionmessage"," "",1);
		waitUntil("requestingpartner_Searchicon", "exist");
		click("requestingpartner_Searchicon");
		waitUntil("requestingpartnerusername", "exist");
		type("requestingpartnerusername", "LEPName");
		Thread.sleep(2000);
		click("requestingpartnerfind");
		waitUntil("SelectUser", "exist");
		click("SelectUser");
		click("requestingpartnerAddselecteduser");
		sync();
		waitUntil("Requestingpartner_Popup","notexist");
		waitUntil("RequestingPartnerId","exist");
		waitUntil("requestingManager_Searchicon", "exist");
		click("requestingManager_Searchicon");
		waitUntil("requestingManagerusername", "exist");
		type("requestingManagerusername", "LEPName");
		click("requestingManagerfind");
		waitUntil("SelectUser", "exist");
		click("SelectUser");
		click("requestingManagerAddselecteduser");
		sync();
		waitUntil("RequestingManager_Popup","notexist");
		waitUntil("RequestingManager","exist");
		click("businessrelationshipreferralfees");
		BRRID = getText("CCR_ID");
		waitUntil("saveascomplete", "exist");
		click("saveascomplete");
		sync();
		waitUntil("DeleteRequestbutton","exist");
		
		//************************************************ CCR - Add Entity  *********************************************************// 
		waitUntil("BRR_addnewentity", "exist");
		click("BRR_addnewentity");
		waitUntil("entitytype", "exist");
		click("entitytype");
		sync();
		waitUntil("entityrole","exist");
		type("entityrole","Client");
		type("entityname", "entitynamedata");
		type("locallanguagename", "locallanguagenamedata");
		type("streetaddress", "streetaddressdata");
		type("city", "citydata");
		type("stateregion", "stateregiondata");
		type("zipcode", "zipcodedata");
		type("location", "Locationdata");
		click("IndividualBRPartner");
		waitUntil("addnewentitysaveascomplete", "exist");
		click("addnewentitysaveascomplete");
		sync();
		waitUntil("DeleteRequestbutton","exist");
		
		//********************************************* Business Relationship Request ************************************************//
		
		waitUntil("BusinessRelationship","exist");
		click("BusinessRelationship");
		sync();
		waitUntil("StartDateIcon","exist");
		click("StartDateIcon");
		waitUntil("StartDate","exist");
		click("StartDate");
		waitUntil("StartDateCalander_Popup","notexist");
		waitUntil("EndDateIcon","exist");
		click("EndDateIcon");
		waitUntil("EndDate","exist");
		click("EndDate");
		waitUntil("EndDateCalander_Popup","notexist");
		click("Question_InvestmentRelationship");
		click("Question_DeloitteLogo");
		click("Question_Shareholders");
		click("Question_Commitment");
		click("Question_Sponsorship");
		type("Question_AuditorInfo","BRR_AuditorInfo");
		click("BRPage_SaveasComplete");
		sync();
		waitUntil("DeleteRequestbutton","exist");
		
		//********************************************* CCR - Requestor Checklist ****************************************************// 
		waitUntil("requestorchecklist", "exist");
		click("requestorchecklist");
		waitUntil("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP","exist");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparent");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");
		waitUntil("Submitfinalrequest","exist");
		click("Submitfinalrequest");
		waitUntil("RequestSubmit_Okbutton","exist");
		//String Requestsubmissionmessage = getText(Request_Id);
		//String Request_Id = split(Requestsubmissionmessage"," "",1);
		click("RequestSubmit_Okbutton");
		//sync();
		waitUntil("Requestid_Window","notexist");
		waitUntil("Requests","exist");
		click("Requests");
		waitUntil("All_Requests","exist");
		click("All_Requests");
		waitUntil("Enter_RequestId","exist");
		System.out.println(BRRID);
		type("Enter_RequestId",BRRID);
		click("Search");
		sync();
		//waitUntil("MyRequestSort","notexist");
		waitUntil("Grid_RequestList","exist");
		waitUntil("MyRequestSort","exist");
		//waitUntil("Column_RequestId","Column_RequestId");
		//By CreatedBRRRequest = By.xpath("//a[text()='"+BRRID+"']");
		//By BRRRequestID_Status = By.xpath("//a[text()='"+BRRID+"']/following::td[13]/div/span");
		//waitUntil("CreatedBRRRequest","Requested ID Created");
		//String BRR_Status = getText(BRRRequestID_Status);
		//verify("Submitted"",BRR_Status);
		System.out.println(BRRID);
		//sync();
		/*
		waitUntil("Sort_RequestId","Sort_RequestId");
		click("Sort_RequestId","Sort_RequestId");
		//sync();
		waitUntil("Sort_Asc", "Ordered Ascending Image");
		waitUntil("Sort_RequestId","Sort_RequestId");
		click("Sort_RequestId","Sort_RequestId");
		//sync();
		waitUntil("Sort_Desc", "Ordered Descending Image");
		By id1 = By.xpath("//a[text()='"+Request_Id+"']");
		waitUntil("id1","Requested ID Created");
		*/  
	}
	
	@Test
	public void CreateOR() throws Exception {
		
		//********************************** CCR -Engagement Details
		
		loadUrl("DCCSURL");
		waitUntil("create", "exist");
		hover("create");
		//click("create");
		waitUntil("createotherrequestlink","exist");
		click("createotherrequestlink");
		waitUntil("engagementdetailsoffice", "exist");
		click("engagementdetailsoffice");
		type("engagementdetailsoffice", "Office Name");
		waitUntil("servicecentrejurisdiction","exist");
		type("servicecentrejurisdiction","Locationdata");
		type("othertype","OR_OtherType");
		waitUntil("contactpartnersearch", "exist");
		click("contactpartnersearch");
		waitUntil("contactpartner_UserName", "exist");
		type("contactpartner_UserName", "LEPName");
		click("contactpartnerpopfind");
		waitUntil("leadengagementpartnernameselect", "exist");
		click("leadengagementpartnernameselect");
		click("contactpartnerAddselecteduser");
		sync();
		waitUntil("ContractPartner_Popup","notexist");
		waitUntil("verifyContractPartnerid","exist");
		waitUntil("contactmanagersearch", "exist");
		click("contactmanagersearch");
		waitUntil("contactmanager_UserName", "exist");
		type("contactmanager_UserName", "LEPName");
		click("contactmanagerpopfind");
		waitUntil("leadengagementpartnernameselect", "exist");
		click("leadengagementpartnernameselect");
		click("contactmanagerAddselecteduser");
		sync();
		waitUntil("ContractManager_Popup","notexist");
		waitUntil("verifyContractManagerid","exist");
		waitUntil("saveascomplete", "exist");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");
		
		
		//************************************************ OR - Add Entity  *********************************************************// 
		ORID = getText("CCR_ID");
		waitUntil("OR_addnewentity", "exist");
		click("OR_addnewentity");
		waitUntil("entitytype", "exist");
		click("entitytype");
		sync();
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

		//********************************************* OR - Requestor Checklist ****************************************************// 
		waitUntil("requestorchecklist", "exist");
		click("requestorchecklist");
		waitUntil("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP","exist");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparent");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");

		//********************************************* Business Relationship Request ************************************************//
		waitUntil("Submitfinalrequest","exist");
		click("Submitfinalrequest");
		waitUntil("RequestSubmit_Okbutton","exist");
		//String Requestsubmissionmessage = getText(Request_Id);
		//String Request_Id = split(Requestsubmissionmessage"," "",1);
		click("RequestSubmit_Okbutton");
		//sync();
		waitUntil("Requestid_Window","notexist");
		System.out.println(ORID);
		waitUntil("Requests","exist");
		click("Requests");
		waitUntil("All_Requests","exist");
		click("All_Requests");
		waitUntil("Enter_RequestId","exist");
		//System.out.println(ORID);
		type("Enter_RequestId",ORID);
		click("Search");
		waitUntil("MyRequestSort","notexist");
		waitUntil("Grid_RequestList","exist");
		waitUntil("MyRequestSort","exist");
		//waitUntil("Column_RequestId","Column_RequestId");
		//By CreatedORRequest = By.xpath("//a[text()='"+ORID+"']");
		//By ORRequestID_Status = By.xpath("//a[text()='"+ORID+"']/following::td[13]/div/span");
		//waitUntil("CreatedORRequest","Requested ID Created");
		//String BRR_Status = getText(ORRequestID_Status);
		//verify("Submitted"",BRR_Status);
		System.out.println(ORID);

		//sync();
		/*
		waitUntil("Sort_RequestId","Sort_RequestId");
		click("Sort_RequestId","Sort_RequestId");
		//sync();
		waitUntil("Sort_Asc", "Ordered Ascending Image");
		waitUntil("Sort_RequestId","Sort_RequestId");
		click("Sort_RequestId","Sort_RequestId");
		//sync();
		waitUntil("Sort_Desc", "Ordered Descending Image");
		By id1 = By.xpath("//a[text()='"+Request_Id+"']");
		waitUntil("id1","Requested ID Created");
		*/  
	}
	
	@Test	
	public void SetopportunityLost() throws Exception {
		
		loadUrl("DCCSURL");
	    String SetopportunityLostid = CCRID;
		
	    //waitUntil("RootGroup","RootGroup");
		waitUntil("Requests", "exist");
		click("Requests");
		waitUntil("AllRequests", "exist");
		click("AllRequests");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", SetopportunityLostid);
		click("Search");
		//notwaitUntil("Grid_RequestList","Grid RequestList");
		//notwaitUntil("MyRequestSort","MyRequestSort");
		//waitUntil("Grid_RequestList","Grid RequestList");
		//waitUntil("MyRequestSort","MyRequestSort");
		//By SetopportunityLostelement = By.xpath("//a[text()='"+SetopportunityLostid+"']");
		//waitUntil("SetopportunityLostelement", "Request ID on Analyst page");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");
		waitUntil("Save_Request","exist");		
		waitUntil("cliconsubmittoopportunitylost", "exist");
		click("cliconsubmittoopportunitylost");		
		waitUntil("Confirmationpopupbox","exist");
		waitUntil("Confirmationpopupbox_OK","exist");
		click("Confirmationpopupbox_OK");
		waitUntil("Confirmationpopupbox","notexist");
		waitUntil("MyRequestSort","exist");
		//waitUntil("RootGroup","RootGroup");
		//waitUntil("AllRequests", "All Requests submenu");
		//click("AllRequests", "All Requests submenu");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", SetopportunityLostid);
		click("Search");
		//notwaitUntil("Grid_RequestList","Grid RequestList");
		waitUntil("MyRequestSort","notexist");
		waitUntil("Grid_RequestList","exist");
		waitUntil("MyRequestSort","exist");
		//waitUntil("SetopportunityLostelement", "Request ID on Analyst page");
		//By Request_Statuselement = By.xpath("//a[text()='"+SetopportunityLostid+"']/following::td[13]/div/span");
		//String Request_Status = getText(Request_Statuselement);
		//verify(Request_Status","Opportunity Lost");
		//click("SetopportunityLostelement", "Request ID on Analyst page");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");
		waitUntil("Revert_Request","exist");		
		click("Revert_Request");
		waitUntil("ReveretRequestConfirmation_OK","exist");
		click("ReveretRequestConfirmation_OK");
		waitUntil("MyRequestSort","notexist");
		waitUntil("SaveAs_Draft","exist");
		waitUntil("ExitnUnlock","exist");
		click("ExitnUnlock");
		waitUntil("ExitnUnlockOk","exist");
		click("ExitnUnlockOk");
		waitUntil("Confirmationpopupbox","notexist");
		waitUntil("MyRequestSort","exist");
		waitUntil("RootGroup","exist");
		//waitUntil("AllRequests", "All Requests submenu");
		//click("AllRequests", "All Requests submenu");
		//waitUntil("InputRequestID", "Analyst page Request ID");
		//click("InputRequestID", "Analyst page Request ID");
		//type("InputRequestID", SetopportunityLostid);
		//click("Search", "Search Requests page");
		//notwaitUntil("Grid_RequestList","Grid RequestList");
		//notwaitUntil("MyRequestSort","MyRequestSort");
		//waitUntil("Grid_RequestList","Grid RequestList");
		//waitUntil("MyRequestSort","MyRequestSort");
		//System.out.println(SetopportunityLostid);
		//waitUntil("SetopportunityLostelement", "Request ID on Analyst page");
		//Request_Status = getText(Request_Statuselement);
		//verify(Request_Status","Re-Submitted");
				
	}
	
	@Test
	public void DeterminationandReopen() throws Exception {
		loadUrl("DCCSURL");
		String Determination_RequestID = CCRID1;

//		waitUntil("RootGroup","RootGroup");
		waitUntil("Requests", "exist");
		click("Requests");
		waitUntil("AllRequests", "exist");
		click("AllRequests");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", Determination_RequestID);
		click("Search");
		//notwaitUntil("Grid_RequestList","Grid RequestList");
//		notwaitUntil("Confirmationpopupbox","Confirmationpopupbox");
//		notwaitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("Grid_RequestList","Grid RequestList");
//		waitUntil("MyRequestSort","MyRequestSort");
//		By DeterminateElement = By.xpath("//a[text()='"+Determination_RequestID+"']");
//		waitUntil("DeterminateElement", "Request ID on Analyst page");
		//waitUntil("ARequestID", "Request ID on Analyst page");
//		click("DeterminateElement", "Request ID on Analyst page");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");

		waitUntil("Save_Request","exist");		
		waitUntil("Review_Determination", "exist");
		click("Review_Determination");		
		waitUntil("NoConflicts_Identified","exist");
		click("NoConflicts_Identified");
		click("Continue");
		sync();
		waitUntil("Send","exist");
		click("Send");
		waitUntil("ApproveConfirmation_OK","exist");
		click("ApproveConfirmation_OK");
//		waitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("RootGroup","RootGroup");
		//waitUntil("AllRequests", "All Requests submenu");
		//hover(AllRequests", "All Requests submenu");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", Determination_RequestID);
		click("Search");
		//notwaitUntil("Grid_RequestList","Grid RequestList");
//		notwaitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("Grid_RequestList","Grid RequestList");
//		waitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("DeterminateElement", "Request ID on Analyst page");
//		By Request_Statuselement = By.xpath("//a[text()='"+Determination_RequestID+"']/following::td[13]/div/span");
//		String Request_Status = getText(Request_Statuselement);
//		verify("Approved"",Request_Status);
//		click("DeterminateElement", "Request ID on Analyst page");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");

		waitUntil("Reopen_Request","exist");		
		click("Reopen_Request");
		waitUntil("ReveretRequestConfirmation_OK","exist");
		click("ReveretRequestConfirmation_OK");
//		notwaitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("Save_Request","Save Request");
//		waitUntil("RequestStatus","RequestStatus");
//		Request_Status = getText(RequestStatus);
//		verify("Re-Submitted"",Request_Status);
		waitUntil("ExitnUnlock","exist");
		click("ExitnUnlock");
		waitUntil("ExitnUnlockOk","exist");
		click("ExitnUnlockOk");
		waitUntil("Confirmationpopupbox","notexist");
		waitUntil("MyRequestSort","exist");		
	}
	
	@Test
	public void PostSubmissionCBR() throws Exception {
		loadUrl("DCCSURL");
		waitUntil("create", "exist");
		click("create");
		waitUntil("menuconflictcheckrequest","exist");
		click("menuconflictcheckrequest");
		waitUntil("engagementdetailsoffice", "exist");
		click("engagementdetailsoffice");
		type("engagementdetailsoffice", "Office Name");
		click("serviceofferring");
		//iFrame(IframeObject);
		iFrameSwitch("IframeObject");
		waitUntil("duediligence", "exist");
		click("duediligence");
		click("serviceofferingselectionform");
		exitFrame();
		//sync();
		waitUntil("IframeObject","notexist");
		sync();
		waitUntil("willtheengagementinvolvedeloitte","exist");
		click("willtheengagementinvolvedeloitte");
		waitUntil("engagementprojectname", "exist");
		type("engagementprojectname", "EngagementName");
		type("engagementprojectdetails", "EngagementProjectDesc");
		click("isthisarecurringengagement");
		click("isthisengagementaninbound");
		click("willtheengagementteamhaveaccesstoinsideinformation");
		click("saveascomplete");
		sync();
		waitUntil("DeleteRequestbutton","exist");
		
		// ################################## CCR - Engagement Team ################################################################//
		click("engagementteam"); 
		String CCRID2 = getText("CCR_ID");
		//String Request_Id = split(Requestsubmissionmessage"," "",1);
		waitUntil("basisofengagementtypeistimebasis", "exist");
		click("basisofengagementtypeistimebasis");
		waitUntil("leadengagementpartnersearch", "exist");
		click("leadengagementpartnersearch");
		waitUntil("leadengagementpartnerusername", "exist");
		type("leadengagementpartnerusername", "LEPName");
		click("leadengagementmanagerpopupfind");
		waitUntil("leadengagementpartnernameselect", "exist");
		click("leadengagementpartnernameselect");
		click("leadengagementpartnerAddselecteduser");
		sync();
		waitUntil("LEP_Popup","notexist");
		waitUntil("verifyLEPid","exist");
		waitUntil("concurringpartnerorengagementqualityreviewersearchicon", "exist");
		click("concurringpartnerorengagementqualityreviewersearchicon");
		waitUntil("concurringpartnerusername", "exist");
		type("concurringpartnerusername", "LEPName");
		click("concurringpartnerorengagementqualityreviewerfind");
		waitUntil("concurringpartnernameselect", "exist");
		click("concurringpartnernameselect");
		click("concurringpartneraddselecteduser");
		sync();
		waitUntil("ConcurringPartner_Popup","notexist");
		waitUntil("verifyConcurringPartnerid","exist");
		waitUntil("leadengagementmanagerengagementqualityreviewersearchicon", "exist");
		click("leadengagementmanagerengagementqualityreviewersearchicon");
		waitUntil("leadengagementmanagerusername", "exist");
		type("leadengagementmanagerusername", "LEPName");
		click("leadengagementmanagerengagementqualityreviewerfind");
		waitUntil("leadengagementmanagernameselect", "exist");
		click("leadengagementmanagernameselect");
		click("Leadengagementmanageraddselecteduser");
		waitUntil("LEM_Popup","notexist");
		waitUntil("verifyLEMid","exist");
		waitUntil("otherengagementteammemberssearchicon", "exist");
		click("otherengagementteammemberssearchicon");
		waitUntil("otherengagementusername", "exist");
		type("otherengagementusername", "LEPName");
		click("otherengagementteammembersqualityreviewerfind");
		waitUntil("otherengagementteammembernameselect", "exist");
		click("otherengagementteammembernameselect");
		click("otherengagementteammemberaddselecteduser");
		sync();
		waitUntil("ETM_Popup","notexist");
		waitUntil("verifyETMid","exist");
		click("arethereotherservicelinesparticipatinginthisengagement");
		click("willyoubeprovidingservicesdirectly");
		click("willthisengagementrequirepersonnel");
		click("willthedeliverablebeintended");
		click("willpersonnelfromanotherlocationoutside");	  
		waitUntil("saveascomplete", "exist");
		click("saveascomplete");
		sync();
		waitUntil("DeleteRequestbutton","exist");
		
		//################################################### CCR - Add Entity  ##################################################// 
		waitUntil("addnewentity", "exist");
		click("addnewentity");
		waitUntil("entitytype", "exist");
		click("entitytype");
		sync();
		waitUntil("entityrole","exist");
		type("entityrole","Client");
		type("entityname", "entitynamedata1");
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
		waitUntil("DeleteRequestbutton","DeleteRequestbutton");
		
		waitUntil("addnewentity", "exist");
		click("addnewentity");
		waitUntil("entitytype", "exist");
		click("entitytype");
		sync();
		waitUntil("entityrole","exist");
		type("entityrole","Client");
		type("entityname", "entitynamedata2");
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

		//######################################## CCR - Requestor Checklist ########################################################// 
		waitUntil("requestorchecklist", "exist");
		click("requestorchecklist");
		waitUntil("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP","exist");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparent");
		click("saveascomplete");
		waitUntil("DeleteRequestbutton","exist");

		//####################################### Business Relationship Request ################################################################//
		waitUntil("Submitfinalrequest","exist");
		click("Submitfinalrequest");
		waitUntil("RequestSubmit_Okbutton","exist");
		//String Requestsubmissionmessage = getText(Request_Id);
		//String Request_Id = split(Requestsubmissionmessage"," "",1);
		click("RequestSubmit_Okbutton");
		//sync();
//		notwaitUntil("Requestid_Window","Requestid_Window");
//		sync();
//		System.out.println(CCRID2);
		//sync();
		/*
		waitUntil("Sort_RequestId","Sort_RequestId");
		click("Sort_RequestId","Sort_RequestId");
		//sync();
		waitUntil("Sort_Asc", "Ordered Ascending Image");
		waitUntil("Sort_RequestId","Sort_RequestId");
		click("Sort_RequestId","Sort_RequestId");
		//sync();
		waitUntil("Sort_Desc", "Ordered Descending Image");
		By id1 = By.xpath("//a[text()='"+Request_Id+"']");
		waitUntil("id1","Requested ID Created");
	  	*/
		
	  
	//########################################### Search Request and Submit CBR ##################################################//	  
//		waitUntil("RootGroup","RootGroup");
		waitUntil("Requests", "exist");
		click("Requests");
		waitUntil("AllRequests", "exist");
		click("AllRequests");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", CCRID2);
		click("Search");
		By CCRequestID = By.xpath("//a[text()='"+CCRID2+"']");
//		notwaitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("Grid_RequestList","Grid RequestList");
//		waitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("CCRequestID", "Request ID on Analyst page");
//		click("CCRequestID", "Request ID on Analyst page");		  
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");

		sync();
		waitUntil("CrossBorderRequest", "exist");
		click("CrossBorderRequest");
		waitUntil("SelectAll", "exist");
		click("SelectAll");
		Thread.sleep(5000);
		//waitUntil("Entity_SelectAllStatus","Entity SelectAll Status");
		waitUntil("AssignCBR", "exist");
		click("AssignCBR");
		waitUntil("SubmitCBR", "exist");
		click("SubmitCBR");
		waitUntil("SubmitCBRConfirm", "exist");
		click("SubmitCBRConfirm");
		sync();
		waitUntil("SelectAll", "exist");
		//Thread.sleep(3000);
		waitUntil("ExitnUnlock", "exist");
		click("ExitnUnlock");
		waitUntil("ExitnUnlockOk", "exist");
		click("ExitnUnlockOk");
		waitUntil("PopupNotwaitUntil","notexist");
	    //############################################## Capture CBR ID  #########################################################//	      
	  
		Thread.sleep(300000);	    
//		waitUntil("RootGroup","RootGroup");
		waitUntil("Requests", "exist");
		click("Requests");
		waitUntil("AllRequests", "exist");
		click("AllRequests");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", CCRID2);
		click("Search");
//		waitUntil("MyRequestSort", "RequestID sort");
//		waitUntil("CCRequestID", "Request ID on Analyst page");
//		click("CCRequestID", "Request ID on Analyst page");
//		waitUntil("CrossBorderRequest", "Cross Border Requests section");
//		click("CrossBorderRequest", "Cross Border Requests section");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");

		sync();
		waitUntil("CrossBorderRequest", "exist");
	    click("CrossBorderRequest");
		waitUntil("SenderRequestID", "exist");
		click("SenderRequestID");
		sync();
		waitUntil("RecRequestID", "exist");
		String RecRequestId = getText("RecRequestID");
		waitUntil("CBRSectionCancel", "exist");
		click("CBRSectionCancel");
		waitUntil("SelectAll", "exist");
		sync();
		waitUntil("SelectAll", "exist");
		waitUntil("ExitnUnlock", "exist");//
		click("ExitnUnlock");
		waitUntil("ExitnUnlockOk", "exist");
		click("ExitnUnlockOk");
		waitUntil("PopupNotwaitUntil","notexist");
		sync();
	 
	      
	//******************************************************** Make post submission entity changes as Requestor  *******************************************//  

//		waitUntil("RootGroup","RootGroup");
		waitUntil("Requests", "exist");
		click("Requests");
		waitUntil("MyRequests", "exist");
		click("MyRequests");
		sync();
		waitUntil("Sort_RequestId", "exist");//
		click("Sort_RequestId");
		waitUntil("Sort_Asc","exist");
		//waitUntil("MyRequestSort", "RequestID sort");
		click("Sort_RequestId");
		waitUntil("Sort_Desc", "exist");
		waitUntil("CCRequestID", "exist");
		click("CCRequestID");
		waitUntil("PostSubmission_addnewentity", "exist");
		click("PostSubmission_addnewentity");
		waitUntil("entitytype", "exist");
		click("entitytype");
		sync();
		waitUntil("entityrole","exist");
		type("entityrole","Client");
		type("entityname", "entitynamedata3");
		type("locallanguagename", "locallanguagenamedata");
		type("streetaddress", "streetaddressdata");
		type("city", "citydata");
		type("stateregion", "stateregiondata");
		type("zipcode", "zipcodedata");
		type("location", "Locationdata");
		click("willthisindividualbeaclientonthis");
		waitUntil("addnewentitysaveascomplete", "exist");
		click("addnewentitysaveascomplete");
		//sync();
		//waitUntil("DeleteRequestbutton","DeleteRequestbutton");		  
		waitUntil("AddOk", "exist");
		click("AddOk");
		sync();		  
		waitUntil("Entitytobedeleted", "exist");
		click("Entitytobedeleted");
		waitUntil("Delete", "exist");
		click("Delete");
		waitUntil("DeleteOk", "exist");
		click("DeleteOk");
		waitUntil("PopupNotwaitUntil","exist");
		waitUntil("SaveSubmitrequest","exist");
		waitUntil("requestorchecklist", "exist Checklist");
		click("requestorchecklist");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparentGUP");
		click("pleaseconfirmthatyouhaveaddedtheglobalultimateparent");
		click("saveascomplete");
		waitUntil("RequestorChecklistConfirmOk", "exist");
		click("RequestorChecklistConfirmOk");
		waitUntil("PopupNotwaitUntil","notexist");
		sync();
	  		  
		  
	//******************************************************** Submit the post submission entity changes to CBR  *******************************************//  
		waitUntil("SaveSubmitrequest", "exist");
		click("SaveSubmitrequest");
		waitUntil("SaveSubmitrequestOK", "exist");
		click("SaveSubmitrequestOK");
//		notwaitUntil("PopupNotwaitUntil","Popup Not waitUntil");
		sync();
		Thread.sleep(300000);
//		waitUntil("RootGroup","RootGroup");
		waitUntil("Requests", "exist");
		click("Requests");
		waitUntil("AllRequests", "exist");
		click("AllRequests");
		waitUntil("InputRequestID", "exist");
		click("InputRequestID");
		type("InputRequestID", CCRID2);
		click("Search");
//		waitUntil("MyRequestSort", "RequestID sort");
//		waitUntil("CCRequestID", "Request ID on Analyst page");
//		click("CCRequestID", "Request ID on Analyst page");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");
		
		waitUntil("CrossBorderRequest", "exist");
		click("CrossBorderRequest");
		waitUntil("SelectAll", "exist");
		click("SelectAll");
		sync();
		waitUntil("SelectAll", "exist");
		//waitUntil("Entity_SelectAllStatus","Entity SelectAll Status");
		waitUntil("AssignCBR", "exist");
		click("AssignCBR");
		sync();
		waitUntil("SubmitCBRPost","exist");
		click("SubmitCBRPost");
		waitUntil("SubmitCBRConfirm", "exist");
		click("SubmitCBRConfirm");
		waitUntil("PopupNotwaitUntil","notexist");
		sync();
		waitUntil("PopupNotwaitUntil","exist");
		waitUntil("SubmitCBRConfirm2", "exist");
		click("SubmitCBRConfirm2");
		waitUntil("PopupNotwaitUntil","notexist");   
		waitUntil("DeletedEntity", "exist");
		waitUntil("NewEntityAdded","exist");
		waitUntil("ExitnUnlock", "exist");
		click("ExitnUnlock");
		waitUntil("ExitnUnlockOk","exist");
		click("ExitnUnlockOk");
		Thread.sleep(300000);
	  
	//******************************************************** Verify CBR for post submission entity changes  *******************************************//
		waitUntil("InputRequestID", "exist");
		type("InputRequestID", RecRequestId);
		click("Search");
//		By RecRequestIdElement = By.xpath("//a[text()='"+CCRID2+"']");
//		notwaitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("Grid_RequestList","Grid RequestList");
//		waitUntil("MyRequestSort","MyRequestSort");
//		waitUntil("RecRequestIdElement", "Request ID on Analyst page");
//		click("RecRequestIdElement", "Request ID on Analyst page");
		waitUntil("InputRequestID", "exist");
		waitUntil("RequestIDLink", "exist");
		click("RequestIDLink");
		
		waitUntil("DeletedEntity", "exist");
		waitUntil("NewEntityAdded","exist");
		waitUntil("ExitnUnlock", "exist");
	    click("ExitnUnlock");
	    waitUntil("ExitnUnlockOk", "exist");
	    click("ExitnUnlockOk");
	}
	
	@Test
	public void Management_Reports() throws Exception {
	    loadUrl("DCCSURL");
	    waitUntil("ManagementReports", "exist");
	    click("ManagementReports");
	    // need to enter script for selecting value from Request Type dropdown.  RequestTypes = By.xpath("//select[contains(@name, 'RequestTypes')]");       
	    waitUntil("GenerateReport", "exist");
	    click("GenerateReport");
	    waitUntil("ReportLabel", "exist");	     
	 }

	@Test
	public void searchrequest() throws Exception {
		loadUrl("DCCSSearchURL");
		waitUntil("Requests", "exist");
		click("Requests");
	    click("SearchRequests");
	    waitUntil("EntityName","exist");
	    type("EntityName", "test");
	    click("EntitySearchbutton");
	    waitUntil("MyRequestSort", "exist");
	    
	}

	@Test
	public void CreateCCRWithMultipleEntities() throws IOException, Exception{
		loadUrl("DCCSURL");
		waitUntil("create", "waitUntil");
		hover("create");
		//click("create");
		waitUntil("menuconflictcheckrequest","exist");
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
		//sync();
		waitUntil("IframeObject","notexist");
		sync();
		//refreshPage();
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
		//sync();
		waitUntil("DeleteRequestbutton","exist");
		refreshPage();
		sync();
		
		//################################# CCR - Engagement Team 
		waitUntil("engagementteam", "exist");
		click("engagementteam"); 
		waitUntil("saveascomplete","exist");
		CCRID_MultipleEntities = getText("CCR_ID");
		//String Request_Id = split(Requestsubmissionmessage," ",1);
		waitUntil("leadengagementpartnersearch", "exist");
		waitUntil("basisofengagementtypeistimebasis", "exist");
		click("basisofengagementtypeistimebasis");
		waitUntil("leadengagementpartnersearch", "exist");
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
		Sheet RecursiveDatasheet = getExcelSheet("Sheet1");
        int rowCount = getRowCount(RecursiveDatasheet);
        for (int i=1;i<=rowCount;i++){
            String strEntityName = TestData(RecursiveDatasheet,i,"EntityName");
            String strLocalLanguageName = TestData(RecursiveDatasheet,i,"LocalLanguageName");
    		waitUntil("addnewentity", "exist");
    		click("addnewentity");
    		waitUntil("entitytype", "exist");
			click("entitytype");
			waitUntil("entityrole","exist");
			type("entityrole","Client");
			type("entityname", strEntityName);
			type("locallanguagename", strLocalLanguageName);
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
        }
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
		//refreshPage();
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
	}
	
}
