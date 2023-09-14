package com.ottplatform.ottpricing;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//Interface Of Platform
interface Platform{
	
	String getPlatform();
}

//Implementing class of Platform Interface
class PlatformImpl implements Platform {

    private String platform;
    	
    public PlatformImpl( String platform) {
		
		this.platform = platform;
		
    }
    
	@Override
	public String getPlatform() {
		return platform;
	}
}

//For Type of Platform OTT
class OttPlatform extends PlatformImpl{

	private String name;
    private String description;
	
    public OttPlatform(String name, String description, String platform) {
		
    	super( platform);		
    	this.name=name;
    	this.description = description;
	}
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}

//For type of Platform TV
class TvPlatform extends PlatformImpl {

	private String name;
    private String description;
    
	public TvPlatform(String name, String description, String platform) {
	
		super(platform);
		this.name=name;
    	this.description = description;
	}
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}

//for all OttPlatformsPlans
class OttPlatformPlans extends OttPlatform{

	private String name;
    private String description;
    private String platform;
    private String plan;
    private String resolution;
    private int noScreens;
    private int subscriptionPrice;
    private String validity;
    private boolean ad;
	
    public OttPlatformPlans(String name, String description, String platform, String plan,String resolution,int noScreen,int subscriptionPrice, String validity, boolean ad) {
		super(name, description, platform);
		this.plan = plan;
		this.resolution = resolution;
		this.noScreens = noScreen;
		this.subscriptionPrice = subscriptionPrice;
		this.validity = validity;
		this.ad = ad;
		
	}
	public String getPlan() {
		return plan;
	}

	public String getResolution() {
		return resolution;
	}

	public int getNoScreens() {
		return noScreens;
	}

	public int getSubscriptionPrice() {
		return subscriptionPrice;
	}   
	public String getValidity() {
		return validity;
	}
	public boolean getISAd() {
		return ad;
	}
	
	@Override
	public String toString() {
		System.out.println("OttPlatform name: "+ getName());
		System.out.println("----------------------------------------");
		System.out.println("Description: "+ getDescription()); 
		System.out.println("----------------------------------------");
		System.out.println("Type Of Platform: "+getPlatform());
		System.out.println("----------------------------------------");
		System.out.println(" Plan name: "+getPlan());
		System.out.println("----------------------------------------");
		System.out.println(" Quality: "+getResolution());
		System.out.println("----------------------------------------");
		System.out.println("No. of screen: "+getNoScreens());
		System.out.println("----------------------------------------");
		System.out.println("Subscription: "+getSubscriptionPrice());
		System.out.println("----------------------------------------");
		System.out.println("Validity: "+getValidity());
		System.out.println("----------------------------------------");
		System.out.println("Without AD: "+getISAd());
		System.out.println("========================================");
		System.out.println("*");
		System.out.println();
		return "";
	}
}

//for all TvPlatformsPlans 
class TvPlatformPlans extends TvPlatform{

	private String name;
    private String description;
    private String platform;
    private String plan;
    private String resolution;
    private int noScreens;
    private int subscriptionPrice;
    private String validity;
    private boolean ad;
	public TvPlatformPlans(String name, String description, String platform, String plan, String resolution,int noScreens, int subscriptionPrice, String validity, boolean ad) {
		super(name, description, platform);
		this.plan = plan;
		this.resolution = resolution;
		this.noScreens = noScreens;
		this.subscriptionPrice = subscriptionPrice;
		this.validity = validity;
		this.ad = ad;
	}
	public String getPlan() {
		return plan;
	}

	public String getResolution() {
		return resolution;
	}

	public int getNoScreens() {
		return noScreens;
	}

	public int getSubscriptionPrice() {
		return subscriptionPrice;
	}   
	public String getValidity() {
		return validity;
	}
	public boolean getISAd() {
		return ad;
	}
	@Override
	public String toString() {
		System.out.println("OttPlatform name: "+ getName());
		System.out.println("----------------------------------------");
		System.out.println("Description: "+ getDescription()); 
		System.out.println("----------------------------------------");
		System.out.println("Type Of Platform: "+getPlatform());
		System.out.println("----------------------------------------");
		System.out.println(" Plan name: "+getPlan());
		System.out.println("----------------------------------------");
		System.out.println(" Quality: "+getResolution());
		System.out.println("----------------------------------------");
		System.out.println("No. of screen: "+getNoScreens());
		System.out.println("----------------------------------------");
		System.out.println("Subscription: "+getSubscriptionPrice());
		System.out.println("----------------------------------------");
		System.out.println("Validity: "+getValidity());
		System.out.println("----------------------------------------");
		System.out.println("Without AD: "+getISAd());
		System.out.println("========================================");
		System.out.println("*");
		System.out.println();
		return "";
	}
}

//ALL PROCESS
class MainWorking{
	//Creating LinkedList for Storing OttPlatformPlans
	//Using LinkedList to ease the Process Of insertion
	
	//List<OttPlatformPlans> ottPlans = new LinkedList();
	public List<OttPlatformPlans> generateNetflixPlans() {
		List<OttPlatformPlans> netflixPlans = new ArrayList<>();
		netflixPlans.add(new OttPlatformPlans("Netflix", "Popular streaming service", "Ottplatform", "Mobile  ","HD ",1,199,"1 Month",false));
		netflixPlans.add(new OttPlatformPlans("Netflix", "Popular streaming service", "Ottplatform", "Basic   ","HD ",1,299,"1 Month",false));
		netflixPlans.add(new OttPlatformPlans("Netflix", "Popular streaming service", "Ottplatform", "Standard","FHD",2,499,"1Month",false));
		netflixPlans.add(new OttPlatformPlans("Netflix", "Popular streaming service", "Ottplatform", "Premium ","UHD",4,699,"1 Month",false));
		return netflixPlans;
	}
	
	public List<OttPlatformPlans> generateAmazonePrimePlans(){
		List<OttPlatformPlans> primePlans = new ArrayList<>();
		primePlans.add(new OttPlatformPlans("AmazonePrime", "One membership, many benefits", "Ottplatform", "Mobile Prime","HD    ",1,599,"1 Year",false));
		primePlans.add(new OttPlatformPlans("AmazonePrime", "One membership, many benefits", "Ottplatform", "Prime       ","4K,UHD",5,1499,"1Year",false));
		primePlans.add(new OttPlatformPlans("AmazonePrime", "One membership, many benefits", "Ottplatform", "Prime       ","4K,UHD",5,299,"1Month",false));
		primePlans.add(new OttPlatformPlans("AmazonePrime", "One membership, many benefits", "Ottplatform", "Prime-Lite  ","HD    ",2,999,"1 Year",false));
		return primePlans;
	}
	
	public List<OttPlatformPlans> generateDisneyPlus(){
		List<OttPlatformPlans> disneyPlans = new ArrayList<>();
		disneyPlans.add(new OttPlatformPlans("Disney+", "Discover new worlds", "Ottplatform", "Mobile","HD ",1,199,"3 Months",true));
		disneyPlans.add(new OttPlatformPlans("Disney+", "Discover new worlds", "Ottplatform", "Mobile","HD ",1,499,"1 Year  ",true));
		disneyPlans.add(new OttPlatformPlans("Disney+", "Discover new worlds", "Ottplatform", "Super ","FHD",2,899,"1 Year  ",true));
		disneyPlans.add(new OttPlatformPlans("Disney+", "Discover new worlds", "Ottplatform", "Super ","UHD",2,1499,"1 Year ",false));
		return disneyPlans;
	}
	
	public List<OttPlatformPlans> generateAppleTvPlus(){
		List<OttPlatformPlans> applePlans = new ArrayList<>();
		applePlans.add(new OttPlatformPlans("AppleTv+", "Stories to believe in", "Ottplatform", "Premium","UHD",6,99," 1 Month",false));
		return applePlans;
	}
	
	public List<OttPlatformPlans> generateYoutube(){
		List<OttPlatformPlans> ytPlans = new ArrayList<>();
		ytPlans.add(new OttPlatformPlans("YouTube Premium", "Stories to believe in", "Ottplatform", "Premium","UHD",1,1290,"1 Year",false));
		ytPlans.add(new OttPlatformPlans("YouTube Premium", "Stories to believe in", "Ottplatform", "Premium","UHD",1,399,"3Months",false));
		ytPlans.add(new OttPlatformPlans("YouTube Premium", "Stories to believe in", "Ottplatform", "Premium","UHD",1,139,"1Months",false));
		return ytPlans;
	}
	
	public List<OttPlatformPlans> generateMXPlayer(){
		List<OttPlatformPlans> mxPlans = new ArrayList<>();
		mxPlans.add(new OttPlatformPlans("MXGOLD", "MX Player", "Ottplatform", "Premium","UHD",3,499,"  1 Year",true));
		mxPlans.add(new OttPlatformPlans("MXGOLD", "MX Player", "Ottplatform", "Premium","UHD",3,299,"6 months",true));
		return mxPlans;
	}
	
	public List<OttPlatformPlans> generateCrunchyroll(){
		List<OttPlatformPlans> crPlans = new ArrayList<>();
		crPlans.add(new OttPlatformPlans("Crunchyroll", "Watch all Anime", "Ottplatform", "FAN","UHD",1,79,"1 Month",false));
		crPlans.add(new OttPlatformPlans("Crunchyroll", "Watch all Anime", "Ottplatform", "MEGA FAN","UHD",4,99,"1 Month",false));
		crPlans.add(new OttPlatformPlans("Crunchyroll", "Watch all Anime", "Ottplatform", "MEGA FAN","UHD",4,999,"1 Year",false));
		return crPlans;
	}
	
	public List<OttPlatformPlans> generateDocubay(){
		List<OttPlatformPlans> dPlans = new ArrayList<>();
		dPlans.add(new OttPlatformPlans("Docubay", "One tribe, many races", "Ottplatform", "Premium","FHD",1,199,"1 Month",false));
		dPlans.add(new OttPlatformPlans("Docubay", "One tribe, many races", "Ottplatform", "Premium","FHD",1,499,"3Months",false));
		dPlans.add(new OttPlatformPlans("Docubay", "One tribe, many races", "Ottplatform", "Premium","FHD",1,999,"1 Year ",false));
		return dPlans;
	}
	
	public List<OttPlatformPlans> generateAltBalaji(){
		List<OttPlatformPlans> altPlans = new ArrayList<>();
		altPlans.add(new OttPlatformPlans("ALTBalaji", "Webseries", "Ottplatform", "12Month Plan","FHD",5,300,"1 Year ",false));
		altPlans.add(new OttPlatformPlans("ALTBalaji", "Webseries", "Ottplatform", "6 Month Plan","FHD",5,199,"6Months",false));
		altPlans.add(new OttPlatformPlans("ALTBalaji", "Webseries", "Ottplatform", "2 Month Plan","FHD",5,100,"2Months",false));
		return altPlans;
	}
	
	public List<OttPlatformPlans> generateErosNow(){
		List<OttPlatformPlans> enPlans = new ArrayList<>();
		enPlans.add(new OttPlatformPlans("ErosNow", "Entertainment and media platform", "Ottplatform", "12Months Plan","FHD",5,399,"1 Year",false));
		enPlans.add(new OttPlatformPlans("ErosNow", "Entertainment and media platform", "Ottplatform", "3 Months Plan","FHD",5,79,"3 Month",false));
		enPlans.add(new OttPlatformPlans("ErosNow", "Entertainment and media platform", "Ottplatform", "1 Month Plan ","FHD",5,79,"1 Month",false));
		return enPlans;
	}
	
	public List<OttPlatformPlans> generateHoichoi(){
		List<OttPlatformPlans> hPlans = new ArrayList<>();
		hPlans.add(new OttPlatformPlans("HoiChoi", "Bengali media platform", "Ottplatform", "12Months Plan","FHD",6,999,"1 Year",false));
		hPlans.add(new OttPlatformPlans("HoiChoi", "Bengali media platform", "Ottplatform", "3 Months Plan","FHD",4,499,"3Month",false));
		return hPlans;
	}
	//
	//Creating arrayList for Storing TvPlatformPlans
	public List<TvPlatformPlans> generateHotstar(){
		List<TvPlatformPlans> hotPlans = new ArrayList<>();
		hotPlans.add(new TvPlatformPlans("Disney+ Hotstar", "media platform", "Tvplatform", " Super ","FHD",2,899,"1 Year",true));
		hotPlans.add(new TvPlatformPlans("Disney+ Hotstar", "media platform", "Tvplatform", "Premium","UHD",4,1499,"1Year",false));
		hotPlans.add(new TvPlatformPlans("Disney+ Hotstar", "media platform", "Tvplatform", "Premium","UHD",4,299,"1 Month",false));
		return hotPlans;
	}
	
	public List<TvPlatformPlans> generateZee(){
		List<TvPlatformPlans> zPlans = new ArrayList<>();
		zPlans.add(new TvPlatformPlans("Zee5", "media platform", "Tvplatform", "  Mobile  ","FHD",2,499,"1 Year",false));
		zPlans.add(new TvPlatformPlans("Zee5", "media platform", "Tvplatform", "Premium HD","UHD",4,699,"1 Year",false));
		zPlans.add(new TvPlatformPlans("Zee5", "media platform", "Tvplatform", "Premium 4K","UHD",4,1499,"1Year",false));
		return zPlans;
	}
	
	public List<TvPlatformPlans> generateSony(){
		List<TvPlatformPlans> sPlans = new ArrayList<>();
		sPlans.add(new TvPlatformPlans("SonyLiv", "media platform", "Tvplatform", "     Mobile     ","HD ",1,599,"1 Year ",true));
		sPlans.add(new TvPlatformPlans("SonyLiv", "media platform", "Tvplatform", "Live Premium Yr ","UHD",2,999,"1 Year ",true));
		sPlans.add(new TvPlatformPlans("SonyLiv", "media platform", "Tvplatform", "Live Premium 6Mo","UHD",2,699,"6Months",true));
		sPlans.add(new TvPlatformPlans("SonyLiv", "media platform", "Tvplatform", "Live Premium Mo ","UHD",1,299,"1 Month",true));
		return sPlans;
	}
	
	public List<TvPlatformPlans> generateVoot(){
		List<TvPlatformPlans> vPlans = new ArrayList<>();
		vPlans.add(new TvPlatformPlans("Voot", "media platform", "Tvplatform", "Mobile  ","HD ",1,299,"1 Year",false));
		vPlans.add(new TvPlatformPlans("Voot", "media platform", "Tvplatform", "Gold    ","FHD",2,499,"1 Year",false));
		vPlans.add(new TvPlatformPlans("Voot", "media platform", "Tvplatform", "Platinum","FHD",4,599,"1 Year",false));
		return vPlans;
	}
	
	public List<TvPlatformPlans> generateSun(){
		List<TvPlatformPlans> suPlans = new ArrayList<>();
		suPlans.add(new TvPlatformPlans("Sun NXT", "media platform", "Tvplatform", " Basic ","HD ",1,480,"1 Year",true));
		suPlans.add(new TvPlatformPlans("Sun NXT", "media platform", "Tvplatform", "Premium","FHD",4,799,"1 Year",false));		
		return suPlans;
	}
	
	public List<TvPlatformPlans> generateDiscovery(){
		List<TvPlatformPlans> diPlans = new ArrayList<>();
		diPlans.add(new TvPlatformPlans("Discovery+", "media platform", "Tvplatform", "Monthly","FHD",4,199,"1Month",false));
		diPlans.add(new TvPlatformPlans("Discovery+", "media platform", "Tvplatform", "Annual ","FHD",4,399,"1 Year",false));		
		return diPlans;
	}
	
	public List<TvPlatformPlans> generateEpic(){
		List<TvPlatformPlans> epPlans = new ArrayList<>();
		epPlans.add(new TvPlatformPlans("Epic On", "media platform", "Tvplatform", " Monthly ","UHD",2,59,"1 Month",false));
		epPlans.add(new TvPlatformPlans("Epic On", "media platform", "Tvplatform", "3 Months","UHD",2,159,"3Months",false));
		epPlans.add(new TvPlatformPlans("Epic On", "media platform", "Tvplatform", "6 months","UHD",2,299,"6Months",false));
		epPlans.add(new TvPlatformPlans("Epic On", "media platform", "Tvplatform", "1 Yearly","UHD",2,499,"1 Year ",false));
		return epPlans;
	}
	
	public  void mainMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		//creating variables to store ottplans
		List<OttPlatformPlans> netflixPlans = generateNetflixPlans();
		List<OttPlatformPlans> primePlans = generateAmazonePrimePlans();
		List<OttPlatformPlans> disneyPlans = generateDisneyPlus();
		List<OttPlatformPlans> applePlans = generateAppleTvPlus();
		List<OttPlatformPlans> ytPlans = generateYoutube();
		List<OttPlatformPlans> mxPlans = generateMXPlayer();
		List<OttPlatformPlans> crPlans = generateCrunchyroll();
		List<OttPlatformPlans> dPlans = generateDocubay();
		List<OttPlatformPlans> altPlans = generateAltBalaji();
		List<OttPlatformPlans> enPlans = generateErosNow();
		List<OttPlatformPlans> hPlans = generateHoichoi();
		
		//creating variable to store tvplans
		List<TvPlatformPlans> hotPlans = generateHotstar();
		List<TvPlatformPlans> zPlans = generateZee();
		List<TvPlatformPlans> sPlans = generateSony();
		List<TvPlatformPlans> vPlans= generateVoot();
		List<TvPlatformPlans> suPlans = generateSun();
		List<TvPlatformPlans> diPlans = generateDiscovery();
		List<TvPlatformPlans> epPlans = generateEpic();
		
		try {
			while(true) {
				System.out.println();
				System.out.println("Select which type of platform you want:");
	            System.out.println("1. OTT Platforms");
	            System.out.println("2. TV Platforms");
	            System.out.println("3. Exit");
	            int platformChoice = sc.nextInt();
	            
	            if(platformChoice == 3) {
	            	break;
	            }
	            
	            else if(platformChoice == 1) {
	            	//Displaying All OTTPlatforms
	            	System.out.println("Select an OttPlatform:");
	                System.out.println("1. Netlix");
	                System.out.println("2. Amazone Prime Video");
	                System.out.println("3. Disney+");	     
	                System.out.println("4. Apple TV+");
	                System.out.println("5. YouTube Premium");
	                System.out.println("6. MX GOLD");
	                System.out.println("7. Crunchyroll");
	                System.out.println("8. Docubay");
	                System.out.println("9. Alt Balaji");
	                System.out.println("10. Eros Now");
	                System.out.println("11. Hoichoi");
	                int ottChoice = sc.nextInt();
	                
	                switch(ottChoice) {
	                case 1:{
	                	try {
	                		System.out.println("Following are the Netflix's Plans:");
	                		System.out.println();
	                		for(int i=0; i<netflixPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(netflixPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Netflix's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|======================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity| Plan Name |");
                				System.out.println("|======================================================|");
	                			for(int i=0; i<netflixPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+netflixPlans.get(i).getSubscriptionPrice()+"          "+netflixPlans.get(i).getNoScreens()+"          "+netflixPlans.get(i).getValidity()+"    "+netflixPlans.get(i).getPlan()+" |");
	                				System.out.println("|------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		
	                		System.out.println("Do yo want to Buy Netflix plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();
	                		
	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
		                			break;
		                		}
		                		else if(Choice == 1) {
		                			System.out.println("Which Netflix plan do you want to buy?");	                		
		                			System.out.println("Give input in numbers(1-4)");
		                			int planChoice = sc.nextInt();
		                			    if(planChoice >0 && planChoice < 5) {           			
		                		        System.out.println("You have Selected "+"'"+netflixPlans.get(planChoice-1).getPlan()+"'"+" plan");
		                		        System.out.println("This will cost you "+"'"+netflixPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
		                			    }
		                			    else {
		                			    	break;
		                			    }
		                		}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		
	                		
	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();
	                		
	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                            System.out.println("Payment successful. Thank you for shopping!");	
	                            return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}
	                		//
	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }	                
	                case 2:{
	                	try {
	                		System.out.println("Following are the Amazone Prime Videos's Plans:");
	                		System.out.println();
	                		for(int i=0; i<primePlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(primePlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare amazone Prime's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<primePlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+primePlans.get(i).getSubscriptionPrice()+"             "+primePlans.get(i).getNoScreens()+"          "+primePlans.get(i).getValidity()+"   "+primePlans.get(i).getPlan()+"|");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Amazone Prime plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();
	                		
	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
		                			break;
		                		}
		                		else if(Choice == 1) {
		                			System.out.println("Which Amazone Prime plan do you want to buy?");	                		
		                			System.out.println("Give input in numbers(1-4)");
		                			int planChoice = sc.nextInt();
		                			    if(planChoice >0 && planChoice < 5) {           			
		                		        System.out.println("You have Selected "+"'"+primePlans.get(planChoice-1).getPlan()+"'"+" plan");
		                		        System.out.println("This will cost you "+"'"+primePlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
		                			    }
		                			    else {
		                			    	break;
		                			    }
		                		}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		
	                		
	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();
	                		
	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                            System.out.println("Payment successful. Hope you get what you want!!");	
	                            return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}
	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}
	                	break;
	                }
	                case 3:{
	                	try {
	                		System.out.println("Following are the Disney+'s Plans:");
	                		System.out.println();
	                		for(int i=0; i<disneyPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(disneyPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Disney+'s price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<disneyPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+disneyPlans.get(i).getSubscriptionPrice()+"             "+disneyPlans.get(i).getNoScreens()+"       "+disneyPlans.get(i).getValidity()+"      "+disneyPlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		
	                		System.out.println("Do yo want to Buy Disney+ plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Disney+ plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-4)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 5) {           			
	                			        System.out.println("You have Selected "+"'"+disneyPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+disneyPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}
	                	break;
	                }
	                case 4:{
	                	try {
	                		System.out.println("Following are the Apple Tv+'s Plans:");
	                		System.out.println();
	                		for(int i=0; i<applePlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(applePlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Apple Tv+'s price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<applePlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+applePlans.get(i).getSubscriptionPrice()+"             "+applePlans.get(i).getNoScreens()+"       "+applePlans.get(i).getValidity()+"      "+applePlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Apple+ plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Apple+ plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 2) {           			
	                			        System.out.println("You have Selected "+"'"+applePlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+applePlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}
	                	break;
	                }
	                case 5:{
	                	try {
	                		System.out.println("Following are the YouTube Premium's Plans:");
	                		System.out.println();
	                		for(int i=0; i<ytPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(ytPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Youtube Premium's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<ytPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+ytPlans.get(i).getSubscriptionPrice()+"             "+ytPlans.get(i).getNoScreens()+"       "+ytPlans.get(i).getValidity()+"      "+ytPlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy YouTube Premium plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which YouTube Premium plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+ytPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+ytPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}
	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}
	                	break;
	                }
	                case 6:{
	                	try {
	                		System.out.println("Following are the MXPlayer's Plans:");
	                		System.out.println();
	                		for(int i=0; i<mxPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(mxPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare MXGold's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<mxPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+mxPlans.get(i).getSubscriptionPrice()+"             "+mxPlans.get(i).getNoScreens()+"       "+mxPlans.get(i).getValidity()+"      "+mxPlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy MXGold plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which MXGold plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-2)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 3) {           			
	                			        System.out.println("You have Selected "+"'"+mxPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+mxPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}
	                	break;
	                }
	                case 7:{
	                	try {
	                		System.out.println("Following are the Crunchyroll's Plans:");
	                		System.out.println();
	                		for(int i=0; i<crPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(crPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Crunchyroll's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<crPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+crPlans.get(i).getSubscriptionPrice()+"             "+crPlans.get(i).getNoScreens()+"       "+crPlans.get(i).getValidity()+"      "+crPlans.get(i).getPlan()+"   |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Crunchyroll plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Crunchyroll plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+crPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+crPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}
	                	break;
	                }
	                case 8:{
	                	try {
	                		System.out.println("Following are the Docubay's Plans:");
	                		System.out.println();
	                		for(int i=0; i<dPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(dPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Docubay's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<dPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+dPlans.get(i).getSubscriptionPrice()+"             "+dPlans.get(i).getNoScreens()+"       "+dPlans.get(i).getValidity()+"      "+dPlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Docubay plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Docuby plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+dPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+dPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 9:{
	                	try {
	                		System.out.println("Following are the Alt Balaji's Plans:");
	                		System.out.println();
	                		for(int i=0; i<altPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(altPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<altPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+altPlans.get(i).getSubscriptionPrice()+"             "+altPlans.get(i).getNoScreens()+"       "+altPlans.get(i).getValidity()+"     "+altPlans.get(i).getPlan()+"|");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Alt Balaji plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Alt Balaji plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+altPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+altPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 10:{
	                	try {
	                		System.out.println("Following are the Eros Now's Plans:");
	                		System.out.println();
	                		for(int i=0; i<enPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(enPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<enPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+enPlans.get(i).getSubscriptionPrice()+"             "+enPlans.get(i).getNoScreens()+"       "+enPlans.get(i).getValidity()+"     "+enPlans.get(i).getPlan()+"|");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Eros Now plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Eros Now plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+enPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+enPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 11:{
	                	try {
	                		System.out.println("Following are the Hoichoi's Plans:");
	                		System.out.println();
	                		for(int i=0; i<hPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(hPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<hPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+hPlans.get(i).getSubscriptionPrice()+"             "+hPlans.get(i).getNoScreens()+"       "+hPlans.get(i).getValidity()+"     "+hPlans.get(i).getPlan()+"|");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Hoichoi plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Hoichoi plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-2)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 3) {           			
	                			        System.out.println("You have Selected "+"'"+hPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+hPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                }
	            }
	            else if(platformChoice == 2) {
	            	//Displaying All TVPlatforms
	            	System.out.println("Select a TvPlatform:");
	                System.out.println("1. Disney+ Hotstar");
	                System.out.println("2. Zee5");
	                System.out.println("3. SonyLiv");	     
	                System.out.println("4. Voot");
	                System.out.println("5. Sun Nxt");
	                System.out.println("6. Discovery+");
	                System.out.println("7. Epic On");
	                int tvChoice = sc.nextInt();
	                
	                switch(tvChoice) {
	                case 1:{
	                	try {
	                		System.out.println("Following are the Disney+ Hotstar's Plans:");
	                		System.out.println();
	                		for(int i=0; i<hotPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(hotPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Disney+ Hotstar's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<hotPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+hotPlans.get(i).getSubscriptionPrice()+"             "+hotPlans.get(i).getNoScreens()+"       "+hotPlans.get(i).getValidity()+"     "+hotPlans.get(i).getPlan()+"     |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Hotstar plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Hotstar plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+hotPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+hotPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 2:{
	                	try {
	                		System.out.println("Following are the Zee5's Plans:");
	                		System.out.println();
	                		for(int i=0; i<zPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(zPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Zee5's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<zPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+zPlans.get(i).getSubscriptionPrice()+"             "+zPlans.get(i).getNoScreens()+"       "+zPlans.get(i).getValidity()+"     "+zPlans.get(i).getPlan()+"   |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Zee5 plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Zee5 plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+zPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+zPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 3:{
	                	try {
	                		System.out.println("Following are the SonyLiv's Plans:");
	                		System.out.println();
	                		for(int i=0; i<sPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(sPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare SonyLiv's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<sPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+sPlans.get(i).getSubscriptionPrice()+"             "+sPlans.get(i).getNoScreens()+"       "+sPlans.get(i).getValidity()+" "+sPlans.get(i).getPlan()+"|");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy SonyLiv plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which SonyLiv plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-4)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 5) {           			
	                			        System.out.println("You have Selected "+"'"+sPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+sPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 4:{
	                	try {
	                		System.out.println("Following are the Voot's Plans:");
	                		System.out.println();
	                		for(int i=0; i<vPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(vPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Voot's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<vPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+vPlans.get(i).getSubscriptionPrice()+"             "+vPlans.get(i).getNoScreens()+"       "+vPlans.get(i).getValidity()+"       "+vPlans.get(i).getPlan()+"   |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Voot plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Voot plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-3)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 4) {           			
	                			        System.out.println("You have Selected "+"'"+vPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+vPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 5:{
	                	try {
	                		System.out.println("Following are the Sun Nxt's Plans:");
	                		System.out.println();
	                		for(int i=0; i<suPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(suPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Sun Nxt's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<suPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+suPlans.get(i).getSubscriptionPrice()+"             "+suPlans.get(i).getNoScreens()+"       "+suPlans.get(i).getValidity()+"       "+suPlans.get(i).getPlan()+"     |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Sun Nxt plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Sun Nxt plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-2)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 3) {           			
	                			        System.out.println("You have Selected "+"'"+suPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+suPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 6:{
	                	try {
	                		System.out.println("Following are the Discovery+'s Plans:");
	                		System.out.println();
	                		for(int i=0; i<diPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(diPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Discovery+'s price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<diPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+diPlans.get(i).getSubscriptionPrice()+"             "+diPlans.get(i).getNoScreens()+"       "+diPlans.get(i).getValidity()+"       "+diPlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Discovery+ plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Discovery+ plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-2)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 3) {           			
	                			        System.out.println("You have Selected "+"'"+diPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+diPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                case 7:{
	                	try {
	                		System.out.println("Following are the Epic On's Plans:");
	                		System.out.println();
	                		for(int i=0; i<epPlans.size();i++) {
	                			System.out.print((i+1)+") ");
	                			System.out.println(epPlans.get(i));
	                		}
	                		System.out.println("Do yo want to compare Epic On's price and validity?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int compChoice = sc.nextInt();
	                		
	                		if(compChoice == 2) {
	                			break;
	                		}
	                		else if(compChoice == 1) {
	                			System.out.println();
                				System.out.println("|==========================================================|");
                				System.out.println("| Index | Price | No. of screens | Validity|   Plan Name   |");
                				System.out.println("|==========================================================|");
	                			for(int i=0; i<epPlans.size();i++ ) {	               
	                				System.out.println("|   "+(i+1)+"      "+epPlans.get(i).getSubscriptionPrice()+"             "+epPlans.get(i).getNoScreens()+"       "+epPlans.get(i).getValidity()+"     "+epPlans.get(i).getPlan()+"    |");
	                				System.out.println("|----------------------------------------------------------|");
	                			}
	                			//System.out.println("=======================================");
	                			System.out.println();
	                		}
	                		System.out.println("Do yo want to Buy Epic On plan?");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int Choice = sc.nextInt();

	                		if(Choice == 1 || Choice == 2 ){
	                			if(Choice == 2) {
	                				break;
	                			}
	                			else if(Choice == 1) {
	                				System.out.println("Which Epic On plan do you want to buy?");	                		
	                				System.out.println("Give input in numbers(1-4)");
	                				int planChoice = sc.nextInt();
	                				    if(planChoice >0 && planChoice < 5) {           			
	                			        System.out.println("You have Selected "+"'"+epPlans.get(planChoice-1).getPlan()+"'"+" plan");
	                			        System.out.println("This will cost you "+"'"+epPlans.get(planChoice-1).getSubscriptionPrice()+"'"+"Rs.");
	                				    }
	                				    else {
	                				    	break;
	                				    }
	                			}
	                		}
	                		else {
	                			System.out.println("enter valid input");
	                			break;
	                		}	                		

	                		System.out.println("Confirm payment: ");
	                		System.out.println("1. Yes");
	                		System.out.println("2. No");
	                		int payChoice = sc.nextInt();

	                		if(payChoice == 2) {
	                			break;
	                		}
	                		else if(payChoice == 1) {
	                			// Perform the payment (simulated here)
	                		    System.out.println("Payment successful. Hope you get what you want!!");	
	                		    return;
	                		}
	                		else {
	                			System.out.println("enter valid Input");
	                		}

	                	}
	                	catch(InputMismatchException ie){
	                		System.out.println("Please enter valid input");
	                		break;
	                	}	
	                	break;
	                }
	                }
			}
			}
		}
		catch(Exception e){
			System.out.println(e);
			mainMenu();
		}
		finally {
			System.out.println("Thank You");
		}
		
		
	}
}

//for login and signup
class User
{
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class UserMissMatchException extends InputMismatchException{
	
}
class PasswordMissMatchException extends InputMismatchException{
	
}
class Credential {
	

	private ArrayList<User> users;
    private User loggedInUser;

    public Credential() {
        users = new ArrayList<>();
        loggedInUser = null;
    }
    
	public void signup()
	{
	    Scanner scanner = new Scanner(System.in);
	    String username;
	    while (true)
		{
	        System.out.print("Enter username: ");
	        username = scanner.nextLine();
	        if (!username.isEmpty()) {
	            break;
	        } 
			else
			{
	            System.out.println("Username cannot be empty. Try again.");
	        }
	    }
	    String password;
	    while (true) 
		{
	        System.out.print("Enter password (at least 8 characters): ");
	        password = scanner.nextLine();
	        if (password.length() >= 8) {
	            break;
	        } else {
	            System.out.println("Password must be at least 8 characters long. Try again.");
	        }
	    }
	    User newUser = new User(username, password);
	    users.add(newUser);

	   
	    System.out.println("|***Signup Successful!**|");

	}
	public boolean login() 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

      for (User user : users)
		{	try {
			
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
			{
                loggedInUser = user; 
                return true;
            }
		}
		catch(UserMissMatchException ue) {
			
			if(user.getUsername()!= username){
				System.out.println("Username is wrong!!");
				return false;
			}
		}
		catch(PasswordMissMatchException pe) {
			
			if(user.getPassword()!= username){
				System.out.println("Password is wrong!!");
				return false;
			}
		}
        }
        return false;
    }

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);

       System.out.println("");
       System.out.println("===================================================");
        System.out.println("******************** SIGN UP: *********************");
        System.out.println("===================================================");
        System.out.println("vaibhav1");
        System.out.println();
        signup();

     
        while (true)
		{
            if (login())
			{
                

				System.out.println("|**Login Successful!***|");
		
                break;
            } 
			else
			{
                System.out.println("Login failed. Try again.");
            }
        }

        System.out.println("Welcome, " + loggedInUser.getUsername() + "!");
        System.out.println("===================================================");
        System.out.println("==================OttPlatform App==================");
        System.out.println("===================================================");
        MainWorking mw = new MainWorking();
		mw.mainMenu();
    }
}

public class OTTPlatformApp{
	
	public static void main(String[] args) {
		
		Credential c1 = new Credential();
		c1.mainMenu();

	}
}
