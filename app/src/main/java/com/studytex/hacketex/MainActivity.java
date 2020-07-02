package com.studytex.hacketex;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	
	private double number = 0;
	
	private LinearLayout linear5;
	private LinearLayout botton_navigation;
	private LinearLayout home_fragment;
	private LinearLayout search_fragment;
	private LinearLayout coming_soon;
	private LinearLayout favorites;
	private LinearLayout more;
	private LinearLayout about_us;
	private ScrollView vscroll3;
	private LinearLayout apps_background;
	private LinearLayout top_panel_bg;
	private LinearLayout row1;
	private LinearLayout row2;
	private LinearLayout row3;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear24;
	private ImageView imageview3;
	private ImageView imageview4;
	private LinearLayout book;
	private LinearLayout notes;
	private LinearLayout result;
	private ImageView image_book;
	private TextView text_books;
	private ImageView image_notes;
	private TextView text_notes;
	private ImageView image_result;
	private TextView text_result;
	private LinearLayout syllabus;
	private LinearLayout time_table;
	private LinearLayout pepr_set;
	private ImageView image_syllabus;
	private TextView text_syllabus;
	private ImageView image_time_table;
	private TextView text_time_table;
	private ImageView image_pepr_set;
	private TextView text_pepr_set;
	private LinearLayout shop;
	private LinearLayout project;
	private LinearLayout upload;
	private ImageView image_shop;
	private TextView text_shop;
	private ImageView image_project;
	private TextView text_project;
	private ImageView image_upload;
	private TextView text_upload;
	private EditText edittext2;
	private TextView textview3;
	private TextView textview5;
	private LinearLayout linear44;
	private WebView webview2;
	private LinearLayout linear45;
	private TextView textview6;
	private Button button1;
	private Button button2;
	private LinearLayout user_profile_cover;
	private LinearLayout linear30;
	private ScrollView vscroll7;
	private LinearLayout linear41;
	private LinearLayout contact;
	private LinearLayout share_app;
	private LinearLayout feedback;
	private LinearLayout about;
	private LinearLayout terms_condition;
	private LinearLayout privacy_policys;
	private LinearLayout rate;
	private LinearLayout setting;
	private LinearLayout logout;
	private TextView text_contact;
	private TextView text_share;
	private TextView text_feedback;
	private TextView text_about;
	private TextView text_terms;
	private TextView textview2;
	private TextView text_rate;
	private TextView text_settings;
	private TextView text_logout;
	private ImageView imageview5;
	private LinearLayout linear7;
	private ImageView image_home;
	private ImageView image_search;
	private ImageView image_upcoming;
	private ImageView image_favorites;
	private ImageView image_more;
	
	private AlertDialog.Builder privacy_policy;
	private Intent intent_feedback = new Intent();
	private Intent page_about = new Intent();
	private Intent webview = new Intent();
	private Intent intent_results = new Intent();
	private Intent contact_us = new Intent();
	private Intent page_syllabus = new Intent();
	private Intent page_books = new Intent();

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initialize(_savedInstanceState);
		initializeLogic();
		findViewById(R.id.book);
		book.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				openswitchtry();
			}
		});

	}

	public void openswitchtry() {
		Intent intent = new Intent(this, switchtry.class);
		startActivity(intent);
	}

	private void initialize(Bundle _savedInstanceState) {
		
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		botton_navigation = (LinearLayout) findViewById(R.id.botton_navigation);
		home_fragment = (LinearLayout) findViewById(R.id.home_fragment);
		search_fragment = (LinearLayout) findViewById(R.id.search_fragment);
		coming_soon = (LinearLayout) findViewById(R.id.coming_soon);
		favorites = (LinearLayout) findViewById(R.id.favorites);
		more = (LinearLayout) findViewById(R.id.more);
		about_us = (LinearLayout) findViewById(R.id.about_us);
		vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
		apps_background = (LinearLayout) findViewById(R.id.apps_background);
		top_panel_bg = (LinearLayout) findViewById(R.id.top_panel_bg);
		row1 = (LinearLayout) findViewById(R.id.row1);
		row2 = (LinearLayout) findViewById(R.id.row2);
		row3 = (LinearLayout) findViewById(R.id.row3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		book = (LinearLayout) findViewById(R.id.book);
		notes = (LinearLayout) findViewById(R.id.notes);
		result = (LinearLayout) findViewById(R.id.result);
		image_book = (ImageView) findViewById(R.id.image_book);
		text_books = (TextView) findViewById(R.id.text_books);
		image_notes = (ImageView) findViewById(R.id.image_notes);
		text_notes = (TextView) findViewById(R.id.text_notes);
		image_result = (ImageView) findViewById(R.id.image_result);
		text_result = (TextView) findViewById(R.id.text_result);
		syllabus = (LinearLayout) findViewById(R.id.syllabus);
		time_table = (LinearLayout) findViewById(R.id.time_table);
		pepr_set = (LinearLayout) findViewById(R.id.pepr_set);
		image_syllabus = (ImageView) findViewById(R.id.image_syllabus);
		text_syllabus = (TextView) findViewById(R.id.text_syllabus);
		image_time_table = (ImageView) findViewById(R.id.image_time_table);
		text_time_table = (TextView) findViewById(R.id.text_time_table);
		image_pepr_set = (ImageView) findViewById(R.id.image_pepr_set);
		text_pepr_set = (TextView) findViewById(R.id.text_pepr_set);
		shop = (LinearLayout) findViewById(R.id.shop);
		project = (LinearLayout) findViewById(R.id.project);
		upload = (LinearLayout) findViewById(R.id.upload);
		image_shop = (ImageView) findViewById(R.id.image_shop);
		text_shop = (TextView) findViewById(R.id.text_shop);
		image_project = (ImageView) findViewById(R.id.image_project);
		text_project = (TextView) findViewById(R.id.text_project);
		image_upload = (ImageView) findViewById(R.id.image_upload);
		text_upload = (TextView) findViewById(R.id.text_upload);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview5 = (TextView) findViewById(R.id.textview5);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		textview6 = (TextView) findViewById(R.id.textview6);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		user_profile_cover = (LinearLayout) findViewById(R.id.user_profile_cover);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		vscroll7 = (ScrollView) findViewById(R.id.vscroll7);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		contact = (LinearLayout) findViewById(R.id.contact);
		share_app = (LinearLayout) findViewById(R.id.share_app);
		feedback = (LinearLayout) findViewById(R.id.feedback);
		about = (LinearLayout) findViewById(R.id.about);
		terms_condition = (LinearLayout) findViewById(R.id.terms_condition);
		privacy_policys = (LinearLayout) findViewById(R.id.privacy_policys);
		rate = (LinearLayout) findViewById(R.id.rate);
		setting = (LinearLayout) findViewById(R.id.setting);
		logout = (LinearLayout) findViewById(R.id.logout);
		text_contact = (TextView) findViewById(R.id.text_contact);
		text_share = (TextView) findViewById(R.id.text_share);
		text_feedback = (TextView) findViewById(R.id.text_feedback);
		text_about = (TextView) findViewById(R.id.text_about);
		text_terms = (TextView) findViewById(R.id.text_terms);
		textview2 = (TextView) findViewById(R.id.textview2);
		text_rate = (TextView) findViewById(R.id.text_rate);
		text_settings = (TextView) findViewById(R.id.text_settings);
		text_logout = (TextView) findViewById(R.id.text_logout);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		image_home = (ImageView) findViewById(R.id.image_home);
		image_search = (ImageView) findViewById(R.id.image_search);
		image_upcoming = (ImageView) findViewById(R.id.image_upcoming);
		image_favorites = (ImageView) findViewById(R.id.image_favorites);
		image_more = (ImageView) findViewById(R.id.image_more);
		privacy_policy = new AlertDialog.Builder(this);
		
		coming_soon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {


			}
		});
		
		book.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {

			}
		});
		
		result.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				setTitle("Results");
				intent_results.setClass(getApplicationContext(), ResultActivity.class);
				startActivity(intent_results);
			}
		});
		
		image_notes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		text_notes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		syllabus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				page_syllabus.setClass(getApplicationContext(), SyllabusActivity.class);
				startActivity(page_syllabus);
			}
		});
		
		webview2.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		contact.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		share_app.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shareApplication();
			}
		});
		
		feedback.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		about.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				about_us.setVisibility(View.VISIBLE);
				home_fragment.setVisibility(View.GONE);
				search_fragment.setVisibility(View.GONE);
				coming_soon.setVisibility(View.GONE);
				favorites.setVisibility(View.GONE);
				more.setVisibility(View.GONE);
			}
		});
		
		privacy_policys.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				privacy_policy.setTitle("PRIVACY POLICY");
				privacy_policy.setMessage("Last updated June 14, 2020\n\n\nThank you for choosing to be part of our community at Studytex. We are committed to protecting your personal information and your right to privacy. If you have any questions or concerns about our notice, or our practices with regards to your personal information, please contact us at pratikdhole786@gmail.com.\n\nWhen you visit our mobile application, and use our services, you trust us with your personal information. We take your privacy very seriously. In this privacy notice, we seek to explain to you in the clearest way possible what information we collect, how we use it and what rights you have in relation to it. We hope you take some time to read through it carefully, as it is important. If there are any terms in this privacy notice that you do not agree with, please discontinue use of our Apps and our services.\n\nThis privacy notice applies to all information collected through our mobile application, (\"Apps\"), and/or any related services, sales, marketing or events (we refer to them collectively in this privacy notice as the \"Services\").\n\nPlease read this privacy notice carefully as it will help you make informed decisions about sharing your personal information with us.\n\n\nTABLE OF CONTENTS\n\n1. WHAT INFORMATION DO WE COLLECT?\n\n2. HOW DO WE USE YOUR INFORMATION?\n\n3. WILL YOUR INFORMATION BE SHARED WITH ANYONE?\n\n4. DO WE USE COOKIES AND OTHER TRACKING TECHNOLOGIES?\n\n5. WHAT IS OUR STANCE ON THIRD-PARTY WEBSITES?\n\n6. HOW LONG DO WE KEEP YOUR INFORMATION?\n\n7. DO WE COLLECT INFORMATION FROM MINORS?\n\n8. WHAT ARE YOUR PRIVACY RIGHTS?\n\n9. CONTROLS FOR DO-NOT-TRACK FEATURES\n\n10. DO CALIFORNIA RESIDENTS HAVE SPECIFIC PRIVACY RIGHTS?\n\n11. DO WE MAKE UPDATES TO THIS POLICY?\n\n12. HOW CAN YOU CONTACT US ABOUT THIS POLICY?\n\n___________________________________\n\n\n1. WHAT INFORMATION DO WE COLLECT?\n\n\nInformation collected through our Apps\n\nIn Short:   We may collect information regarding your mobile device, push notifications, when you use our apps.\n\nIf you use our Apps, we may also collect the following information:\n\nMobile Device Access. We may request access or permission to certain features from your mobile device, including your mobile device's storage, and other features. If you wish to change our access or permissions, you may do so in your device's settings.\n\nPush Notifications. We may request to send you push notifications regarding your account or the mobile application. If you wish to opt-out from receiving these types of communications, you may turn them off in your device's settings.\n\n\n2. HOW DO WE USE YOUR INFORMATION?\n\nIn Short:  We process your information for purposes based on legitimate business interests, the fulfillment of our contract with you, compliance with our legal obligations, and/or your consent.\n\nWe use personal information collected via our Apps for a variety of business purposes described below. We process your personal information for these purposes in reliance on our legitimate business interests, in order to enter into or perform a contract with you, with your consent, and/or for compliance with our legal obligations. We indicate the specific processing grounds we rely on next to each purpose listed below.\n\nWe use the information we collect or receive:\n\nTo facilitate account creation and logon process. If you choose to link your account with us to a third party account (such as your Google or Facebook account), we use the information you allowed us to collect from those third parties to facilitate account creation and logon process for the performance of the contract.\n\nRequest Feedback. We may use your information to request feedback and to contact you about your use of our Apps.\n\nTo enforce our terms, conditions and policies for Business Purposes, Legal Reasons and Contractual.\n\nTo respond to legal requests and prevent harm. If we receive a subpoena or other legal request, we may need to inspect the data we hold to determine how to respond.\n\nTo manage user accounts. We may use your information for the purposes of managing our account and keeping it in working order.\n                         \n\nTo deliver services to the user. We may use your information to provide you with the requested service.\n\nTo respond to user inquiries/offer support to users. We may use your information to respond to your inquiries and solve any potential issues you might have with the use of our Services.\n\nFor other Business Purposes. We may use your information for other Business Purposes, such as data analysis, identifying usage trends, determining the effectiveness of our promotional campaigns and to evaluate and improve our Apps, products, marketing and your experience. We may use and store this information in aggregated and anonymized form so that it is not associated with individual end users and does not include personal information. We will not use identifiable personal information without your consent.\n\n\n3. WILL YOUR INFORMATION BE SHARED WITH ANYONE?\n\nIn Short:  We only share information with your consent, to comply with laws, to provide you with services, to protect your rights, or to fulfill business obligations.\n\nWe may process or share data based on the following legal basis:\n\nConsent: We may process your data if you have given us specific consent to use your personal information in a specific purpose.\n\nLegitimate Interests: We may process your data when it is reasonably necessary to achieve our legitimate business interests.\n\nPerformance of a Contract: Where we have entered into a contract with you, we may process your personal information to fulfill the terms of our contract.\n\nLegal Obligations: We may disclose your information where we are legally required to do so in order to comply with applicable law, governmental requests, a judicial proceeding, court order, or legal process, such as in response to a court order or a subpoena (including in response to public authorities to meet national security or law enforcement requirements).\n\nVital Interests: We may disclose your information where we believe it is necessary to investigate, prevent, or take action regarding potential violations of our policies, suspected fraud, situations involving potential threats to the safety of any person and illegal activities, or as evidence in litigation in which we are involved.\n\nMore specifically, we may need to process your data or share your personal information in the following situations:\n\nVendors, Consultants and Other Third-Party Service Providers. We may share your data with third party vendors, service providers, contractors or agents who perform services for us or on our behalf and require access to such information to do that work. Examples include: payment processing, data analysis, email delivery, hosting services, customer service and marketing efforts. We may allow selected third parties to use tracking technology on the Apps, which will enable them to collect data about how you interact with the Apps over time. This information may be used to, among other things, analyze and track data, determine the popularity of certain content and better understand online activity. Unless described in this Policy, we do not share, sell, rent or trade any of your information with third parties for their promotional purposes.\n\nBusiness Transfers. We may share or transfer your information in connection with, or during negotiations of, any merger, sale of company assets, financing, or acquisition of all or a portion of our business to another company.\n\nThird-Party Advertisers. We may use third-party advertising companies to serve ads when you visit the Apps. These companies may use information about your visits to our Website(s) and other websites that are contained in web cookies and other tracking technologies in order to provide advertisements about goods and services of interest to you.\n\nBusiness Partners. We may share your information with our business partners to offer you certain products, services or promotions.\n\n\n4. DO WE USE COOKIES AND OTHER TRACKING TECHNOLOGIES?\n\nIn Short:  We may use cookies and other tracking technologies to collect and store your information.\n\nWe may use cookies and similar tracking technologies (like web beacons and pixels) to access or store information. Specific information about how we use such technologies and how you can refuse certain cookies is set out in our Cookie Policy.\n\n\n5. WHAT IS OUR STANCE ON THIRD-PARTY WEBSITES?\n\nIn Short:  We are not responsible for the safety of any information that you share with third-party providers who advertise, but are not affiliated with, our websites.\n\nThe Apps may contain advertisements from third parties that are not affiliated with us and which may link to other websites, online services or mobile applications. We cannot guarantee the safety and privacy of data you provide to any third parties. Any data collected by third parties is not covered by this privacy notice. We are not responsible for the content or privacy and security practices and policies of any third parties, including other websites, services or applications that may be linked to or from the Apps. You should review the policies of such third parties and contact them directly to respond to your questions.\n\n\n6. HOW LONG DO WE KEEP YOUR INFORMATION?\n\nIn Short:  We keep your information for as long as necessary to fulfill the purposes outlined in this privacy notice unless otherwise required by law.\n\nWe will only keep your personal information for as long as it is necessary for the purposes set out in this privacy notice, unless a longer retention period is required or permitted by law (such as tax, accounting or other legal requirements). No purpose in this policy will require us keeping your personal information for longer than the period of time in which users have an account with us.\n\nWhen we have no ongoing legitimate business need to process your personal information, we will either delete or anonymize it, or, if this is not possible (for example, because your personal information has been stored in backup archives), then we will securely store your personal information and isolate it from any further processing until deletion is possible.\n\n\n7. DO WE COLLECT INFORMATION FROM MINORS?\n\nIn Short:  We do not knowingly collect data from or market to children under 18 years of age.\n\nWe do not knowingly solicit data from or market to children under 18 years of age. By using the Apps, you represent that you are at least 18 or that you are the parent or guardian of such a minor and consent to such minor dependent’s use of the Apps. If we learn that personal information from users less than 18 years of age has been collected, we will deactivate the account and take reasonable measures to promptly delete such data from our records. If you become aware of any data we have collected from children under age 18, please contact us at pratikdhole786@gmail.com.\n\n\n8. WHAT ARE YOUR PRIVACY RIGHTS?\n\nIn Short:  You may review, change, or terminate your account at any time.\n\nIf you are resident in the European Economic Area and you believe we are unlawfully processing your personal information, you also have the right to complain to your local data protection supervisory authority. You can find their contact details here: http://ec.europa.eu/justice/data-protection/bodies/authorities/index_en.htm.\n\nIf you have questions or comments about your privacy rights, you may email us at pratikdhole786@gmail.com.\n\n\nAccount Information\n\nIf you would at any time like to review or change the information in your account or terminate your account, you can:\n\n    ■  Log into your account settings and update your user account.\n\n    ■  Contact us using the contact information provided.\n\nUpon your request to terminate your account, we will deactivate or delete your account and information from our active databases. However, some information may be retained in our files to prevent fraud, troubleshoot problems, assist with any investigations, enforce our Terms of Use and/or comply with legal requirements.\n\nCookies and similar technologies: Most Web browsers are set to accept cookies by default. If you prefer, you can usually choose to set your browser to remove cookies and to reject cookies. If you choose to remove cookies or reject cookies, this could affect certain features or services of our Apps. To opt-out of interest-based advertising by advertisers on our Apps visit http://www.aboutads.info/choices/.\n\nOpting out of email marketing: You can unsubscribe from our marketing email list at any time by clicking on the unsubscribe link in the emails that we send or by contacting us using the details provided below. You will then be removed from the marketing email list – however, we will still need to send you service-related emails that are necessary for the administration and use of your account. To otherwise opt-out, you may:\n\n    ■  Contact us using the contact information provided.\n\n    ■  Access your account settings and update preferences.\n\n\n9. CONTROLS FOR DO-NOT-TRACK FEATURES\n\nMost web browsers and some mobile operating systems and mobile applications include a Do-Not-Track (“DNT”) feature or setting you can activate to signal your privacy preference not to have data about your online browsing activities monitored and collected. No uniform technology standard for recognizing and implementing DNT signals has been finalized. As such, we do not currently respond to DNT browser signals or any other mechanism that automatically communicates your choice not to be tracked online. If a standard for online tracking is adopted that we must follow in the future, we will inform you about that practice in a revised version of this privacy notice.\n\n\n10. DO CALIFORNIA RESIDENTS HAVE SPECIFIC PRIVACY RIGHTS?\n\nIn Short:  Yes, if you are a resident of California, you are granted specific rights regarding access to your personal information.\n\nCalifornia Civil Code Section 1798.83, also known as the “Shine The Light” law, permits our users who are California residents to request and obtain from us, once a year and free of charge, information about categories of personal information (if any) we disclosed to third parties for direct marketing purposes and the names and addresses of all third parties with which we shared personal information in the immediately preceding calendar year. If you are a California resident and would like to make such a request, please submit your request in writing to us using the contact information provided below.\n\nIf you are under 18 years of age, reside in California, and have a registered account with the Apps, you have the right to request removal of unwanted data that you publicly post on the Apps. To request removal of such data, please contact us using the contact information provided below, and include the email address associated with your account and a statement that you reside in California. We will make sure the data is not publicly displayed on the Apps, but please be aware that the data may not be completely or comprehensively removed from our systems.\n\n\n11. DO WE MAKE UPDATES TO THIS POLICY?\n\nIn Short:  Yes, we will update this policy as necessary to stay compliant with relevant laws.\n\nWe may update this privacy notice from time to time. The updated version will be indicated by an updated “Revised” date and the updated version will be effective as soon as it is accessible. If we make material changes to this privacy notice, we may notify you either by prominently posting a notice of such changes or by directly sending you a notification. We encourage you to review this privacy notice frequently to be informed of how we are protecting your information.\n\n\n12. HOW CAN YOU CONTACT US ABOUT THIS POLICY?\n\nIf you have questions or comments about this policy, you may email us at pratikdhole786@gmail.com or by post to:\n\nStudytex \n\n__________\n\nNagpur, Maharastra 440009\n\nIndia\n\n\nHOW CAN YOU REVIEW, UPDATE, OR DELETE THE DATA WE COLLECT FROM YOU?\n\nBased on the laws of some countries, you may have the right to request access to the personal information we collect from you, change that information, or delete it in some circumstances. To request to review, update, or delete your personal information, please submit a request form by clicking here. We will respond to your request within 30 days.\n\n");
				privacy_policy.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				privacy_policy.create().show();
			}
		});
		
		rate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		image_home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				number = 0;
				home_fragment.setVisibility(View.VISIBLE);
				search_fragment.setVisibility(View.GONE);
				coming_soon.setVisibility(View.GONE);
				favorites.setVisibility(View.GONE);
				more.setVisibility(View.GONE);
			}
		});
		
		image_search.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				number = 1;
				home_fragment.setVisibility(View.GONE);
				search_fragment.setVisibility(View.VISIBLE);
				coming_soon.setVisibility(View.GONE);
				favorites.setVisibility(View.GONE);
				more.setVisibility(View.GONE);
			}
		});
		
		image_upcoming.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				number = 2;
				home_fragment.setVisibility(View.GONE);
				search_fragment.setVisibility(View.GONE);
				coming_soon.setVisibility(View.VISIBLE);
				favorites.setVisibility(View.GONE);
				more.setVisibility(View.GONE);
				webview2.loadUrl("https://www.theverge.com/platform/amp/2020/6/8/21284676/google-duo-invite-link-zoom-competitor-group-video-calling-new-feature");
			}
		});
		
		image_favorites.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				number = 3;
				home_fragment.setVisibility(View.GONE);
				search_fragment.setVisibility(View.GONE);
				coming_soon.setVisibility(View.GONE);
				favorites.setVisibility(View.VISIBLE);
				more.setVisibility(View.GONE);
			}
		});
		
		image_more.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				number = 4;
				home_fragment.setVisibility(View.GONE);
				search_fragment.setVisibility(View.GONE);
				coming_soon.setVisibility(View.GONE);
				favorites.setVisibility(View.GONE);
				more.setVisibility(View.VISIBLE);
			}
		});
	}
	private void initializeLogic() {
		_navigation_panel();
		number = 0;
		_ripple_effect(book, 10, 1, "#ffffff", true);
		_ripple_effect(notes, 10, 1, "#ffffff", true);
		_ripple_effect(result, 10, 1, "#ffffff", true);
		_ripple_effect(syllabus, 10, 1, "#ffffff", true);
		_ripple_effect(time_table, 10, 1, "#ffffff", true);
		_ripple_effect(pepr_set, 10, 1, "#ffffff", true);
		_ripple_effect(shop, 10, 1, "#ffffff", true);
		_ripple_effect(project, 10, 1, "#ffffff", true);
		_ripple_effect(upload, 10, 1, "#ffffff", true);
		_ripple_effect(contact, 15, 2, "#ffffff", true);
		_ripple_effect(share_app, 15, 2, "#ffffff", true);
		_ripple_effect(feedback, 15, 2, "#ffffff", true);
		_ripple_effect(about, 15, 2, "#ffffff", true);
		_ripple_effect(terms_condition, 15, 2, "#ffffff", true);
		_ripple_effect(rate, 15, 2, "#ffffff", true);
		_ripple_effect(setting, 15, 2, "#ffffff", true);
		_ripple_effect(logout, 15, 2, "#ffffff", true);
		_ripple_effect(privacy_policys, 15, 2, "#ffffff", true);
		StrictMode.VmPolicy.Builder builder = 
		    new StrictMode.VmPolicy.Builder(); 
		    StrictMode.setVmPolicy(builder.build());
		    if(Build.VERSION.SDK_INT>=24){ 
			         try{
				        java.lang.reflect.Method m = 
				              StrictMode.class.getMethod(
				        "disableDeathOnFileUriExposure"); 
				              m.invoke(null); 
				       }
			      catch(Exception e){ 
				        showMessage(e.toString()); 
				       } 
			    }
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _callHome () {
		number = 0;
		home_fragment.setVisibility(View.VISIBLE);
		search_fragment.setVisibility(View.GONE);
		coming_soon.setVisibility(View.GONE);
		favorites.setVisibility(View.GONE);
		more.setVisibility(View.GONE);
	}

	
	private void _callSearch () {
		number = 1;
		home_fragment.setVisibility(View.GONE);
		search_fragment.setVisibility(View.VISIBLE);
		coming_soon.setVisibility(View.GONE);
		favorites.setVisibility(View.GONE);
		more.setVisibility(View.GONE);
	}
	
	
	private void _callComing_soon () {
		number = 2;
		home_fragment.setVisibility(View.GONE);
		search_fragment.setVisibility(View.GONE);
		coming_soon.setVisibility(View.VISIBLE);
		favorites.setVisibility(View.GONE);
		more.setVisibility(View.GONE);
	}
	
	
	private void _callFavorite () {
		number = 3;
		home_fragment.setVisibility(View.GONE);
		search_fragment.setVisibility(View.GONE);
		coming_soon.setVisibility(View.GONE);
		favorites.setVisibility(View.VISIBLE);
		more.setVisibility(View.GONE);
	}
	
	
	private void _callMore () {
		number = 4;
		home_fragment.setVisibility(View.GONE);
		search_fragment.setVisibility(View.GONE);
		coming_soon.setVisibility(View.GONE);
		favorites.setVisibility(View.GONE);
		more.setVisibility(View.VISIBLE);
	}
	
	
	private void _navigation_panel () {
		number = 0;
	}
	
	
	private void _ripple_effect (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
	}
	
	
	private void _send (final Intent _intent, final String _subject) {
		
	}
	
	
	private void _search (final TextView _textview, final String _string) {
		if ("".toLowerCase().contains(_string.toLowerCase())) {
			_textview.setVisibility(View.VISIBLE);
		}
		else {
			_textview.setVisibility(View.GONE);
		}
	}
	
	
	private void _share () {
	}
	private void shareApplication() { 
		      android.content.pm.ApplicationInfo app = 
		      getApplicationContext().getApplicationInfo(); 
		      String filePath = app.sourceDir;
		      Intent intent = new Intent(Intent.ACTION_SEND); 
		      intent.setType("*/*"); 
		      java.io.File originalApk = new java.io.File(filePath); 
		      try {  
			        java.io.File tempFile = new java.io.File(getExternalCacheDir() + "/ExtractedApk"); 
			         if (!tempFile.isDirectory()) 
			         if (!tempFile.mkdirs()) 
			         return; 
			         tempFile = new java.io.File(tempFile.getPath() + "/" + 
			         "export.apk");
			         if (!tempFile.exists()) 
			          {
				           try{
					             if (!tempFile.createNewFile()) { 
						               return; }
					            }
				           catch (java.io.IOException e){} 
				          } 
			         java.io.InputStream in = new java.io.FileInputStream (originalApk);
			         java.io.OutputStream out = new java.io.FileOutputStream(tempFile);
			         byte[] buf = new byte[1024];
			         int len; 
			         while ((len = in.read(buf)) > 0) { 
				            out.write(buf, 0, len); 
				         } 
			         in.close(); 
			         out.close(); 
			         intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
			         startActivity(Intent.createChooser(intent, "Share app via"));
			      } 
		      catch (java.io.IOException e) 
		      { showMessage(e.toString()); 
			      } 
		   }
	{
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
